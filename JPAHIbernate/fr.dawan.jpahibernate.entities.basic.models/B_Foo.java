package fr.dawan.jpahibernate.entities.basic.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

import fr.dawan.jpahibernate.entities.basic.models.relationship.B_Bar;
import fr.dawan.jpahibernate.entities.basic.models.relationship.MTM;
import fr.dawan.jpahibernate.entities.basic.models.relationship.MTO;
import fr.dawan.jpahibernate.entities.basic.models.relationship.OTM;
import fr.dawan.jpahibernate.entities.basic.models.relationship.OTO;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity // Initie le mapping relationnel en considérant cette classe comme une entity de BDD
@Table(name = "Basic_Foo") // @Table pour personnaliser les règles de création de la table
public class B_Foo {
	
	@Id // Clé primaire (PK)
	@GeneratedValue(strategy=GenerationType.IDENTITY) // Utilise l'auto-incrément pour gérer la clé primaire
	private long id;
	
	// L'implémentation Hibernate possède déjà des standars associés aux types
	// La précision du dialecte à utiliser dans l'application.properties lui permet de savoir quel standard utiliser selon le SGBD
	@Column(
		name = "string_value",
		nullable = false, // Refuse les valeurs nulles
		unique = true	, // Interdit les doublons sur ce champ
		updatable = false, // Interdit la mise à jour de la valeur apèrs sa création
		length = 50, // Limite la taille du champ
		columnDefinition = "TEXT" // Change le type associé à la colonne (TEXT est pratique pour les longues chaines de caractères)
	)
	private String str;
	
	@Column(
			name = "int_value",
			nullable = false,
			length = 6
	)
	private int anInt;
	
	@Column(
			columnDefinition = "DECIMAL(10,2)"
	)
	private double price;
	
	@Column(
			precision = 5, // digits avant scaling
			scale = 2 // unscaledValue x 10exp - scale
	)
	private BigDecimal percent; // 12345 -> 123.45
	
	
	@Column(
			columnDefinition = "BIT(1)" // default
	)
	private boolean aBoolean;
	
	@Temporal(TemporalType.DATE)
	private LocalDate date;
	
	@Temporal(TemporalType.TIMESTAMP)
	private LocalDateTime moment;
	
	/* Ne fonctionne pas sur MariaDB
	 * @Temporal(TemporalType.TIME)
	private LocalDateTime time;
	*/
	
	@Enumerated(EnumType.STRING)
	private Enumerations enumeration;
	
	@Embedded // Les champs de la classe en dessous sont inclus dans la table de cette classe
	private B_Bar bar;
	
	@OneToOne
	private OTO oneToOne;
	
	@ManyToOne
	private MTO manyToOne;
	
	@OneToMany
	private Set<OTM> oneToMany;
	
	@ManyToMany
	private List<MTM> manyToMany;
}

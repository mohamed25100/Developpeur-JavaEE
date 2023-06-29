package _05_Abstraction;


// Une classe abstraite a pour rôle principal de factoriser les attributs et méthodes communs aux classes filles
// Une classe abstraite est marquée avec le mot clé 'abstract'
// Une classe abstraite ne peut pas être instanciée
// Mais elle peut contenir des constructeurs qui serviront aux classes filles
// Une classe abstraite doit avoir au moins une méthode abstraite
// Une classe abstraite peut aussi contenir des méthodes implémentées (normales)

public abstract class Forme {
	
	
	public Forme() {
		System.out.println("Constructeur sans paramètre de la classe abstraite 'Forme'");
	}

	// Une méthode abstraite devra obligatoirement être implémentée dans les classes filles.
	public abstract double surface();
	
	public void methodeNonAbstraite() {
		System.out.println("Je suis une méthode non abstraite dans une classe abstraite.");
	}

}

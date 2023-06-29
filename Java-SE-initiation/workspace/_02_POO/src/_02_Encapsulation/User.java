package _02_Encapsulation;

// 2 types de méthodes
// - Assesseur (Guetters) : permettent d'accéder/de lire un attribut
// - Mutateurs (Setters) : permettent d'attribuer une valeur à l'attibut
public class User {
	
	// private int id;
	
	private String nom;
	private String prenom;

	private Object test;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		// Il est possible de valider le paramètre
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	private int age;

	// Guetters et Setters

	// méthode permettant de lire l'age depuis le moden extérieur (à la classe)
	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {

		if (age < 0) {
			// En vrai on lèverait une exception
			System.out.println("Erreur : un age doit être positif");
		} else {
			this.age = age;
		}
	}

	private static int nUsers;

	public static int getNusers() {
		return nUsers;
	}

	public User() {

		this.nom = "nom par defaut";
		nUsers++;
	}

	public User(String nom, String prenom) {
		this();
		this.nom = nom;
		this.prenom = prenom;
	}

	public User(String nom, String prenom, int age) {

		// En java, toutes les classes héritent implicitement de la classe 'Object'
		// super(); // appel au constructeur sans paramètre de la classe mère (à savoir
		// la classe 'Object')

		this(nom, prenom);
		// this.age = age;
		this.setAge(age); // appel au setter pour empécher de passer un age négatif depuis le constructeur
	}

	// Par défaut la méthode 'toString' de la classe 'Object' se contente de
	// retourner le nom (complet) de la classe et une haschode
	// Override : On redéfinit la méthode toString qui est déjà implémenter dans la
	// classe 'Object' pour lui faire retourner des informations qui nous
	// interessent
	// A savoir le nom, le prénom, et l'age du User

	@Override
	public String toString() {
		return "nom = " + nom + ", prenom = " + prenom + ", age = " + age;
	}
}

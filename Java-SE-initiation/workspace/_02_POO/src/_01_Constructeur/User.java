package _01_Constructeur;

public class User {

	// Variables d'instance : chaque instance de User aura son propre 'nom', 'prenom', 'age'
	public String nom;
	public String prenom;
	public int age;
	
	// Variable de classe :
	// - elle est commune à toutes les instances de la classe
	// - elle est caractérisée par le mot clé 'static'
	public static int nUsers;

	// constructeur : méthode particulière :
	// - elle porte le même nom que la classe
	// - elle ne spécifie pas de type de retour

	// constructeur sans paramètre
	// Créé implicitement en l'absence de tout autre constructeur
	// Mais il faudra au besoin le créer explicitement en présence de tout autre constructeur
	public User() {
		
		this.nom = "nom par defaut";
		System.out.println("Appel au constructeur sans paramètre de User");
		nUsers ++;
	}
	
	// surcharge constructeur à 2 paramètres 
	public User(String nom, String prenom) {
		// 'this' fait référence à l'objet courant (qui est une instance de la classe
		// user)
		this(); // appel du constructeur sans paramètre
		this.nom = nom;
		this.prenom = prenom;
		System.out.println("Appel au constructeur à 2 paramètres de User");
		// nUsers ++;
	}

	// surcharge constrcuteur à 3 paramètres 
	public User(String nom, String prenom, int age) {
		
//		this.nom = nom;
//		this.prenom = prenom;
		
		// appel au constructeur à 2 paramètres (évite de dupliquer les 2 lignes commentées ci-dessus)
		this(nom, prenom);

		this.age = age;
		
		System.out.println("Appel au constructeur à 3 paramètres de User");
		// nUsers ++;
	}
}

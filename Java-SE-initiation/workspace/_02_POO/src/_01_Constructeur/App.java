package _01_Constructeur;

public class App {

	public static void main(String[] args) {

		System.out.println("nUsers = " + User.nUsers);
		
		User user1 = new User();
		
		user1.nom = "duck";
		user1.prenom = "riri";
		user1.age = 12;
		
		System.out.println(user1.nom);
		System.out.println(user1.prenom);
		System.out.println(user1.age);
		
		System.out.println("nUsers = " + User.nUsers);
		
		System.out.println("------------------------");
		User user2 = new User("duck", "fifi", 12);
		
		System.out.println(user2.nom);
		System.out.println(user2.prenom);
		System.out.println(user2.age);
		
		System.out.println("nUsers = " + User.nUsers);
		
		System.out.println("------------------------");
		User user3 = new User("duck", "loulou");
		
		System.out.println(user3.nom);
		System.out.println(user3.prenom);
		
		// On accède à une variable de classe via le nom de la classe
		System.out.println("nUsers = " + User.nUsers);
		
		User.nUsers = 5; // On peut modifier nUsers depuis l'extérieur de la la classe User : C'est pas bon !!!
		
		System.out.println("nUsers = " + User.nUsers);
		
		user3.age = -12; // On peut mettre un age négatif !!! 
		System.out.println(user3.age);
	}
}

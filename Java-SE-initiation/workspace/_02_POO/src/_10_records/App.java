package _10_records;

public class App {

	public static void main(String[] args) {
		
		User user = new User("duck", "riri", 12);
		
		System.out.println(user/*.toString()*/);
		System.out.println(user.prenom());
		
		User user2 = new User("duck", "riri", 12);
		
		System.out.println(user.equals(user2));
		
		// user.nom() = "fifi"; // Les propriétés d'un record sont en leecture seule (immuable)
	}
}

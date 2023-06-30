package _01_User;

public class App {

	public static void main(String[] args) {
		
		try {
			User user = new User("Duck", "Riri", 12);
			
			System.out.println(user);
			
			user.setAge(13);
			
			System.out.println(user);
			
			user.setAge(-1);
			
			System.out.println(user);
			
		}
		catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Le bloc finally est exécuté dans tous les cas. Avec ou sans exception.");
			System.out.println("Le bloc finally est souvent utilisé pour libérer des ressources.");
			// exemple :
			// - fermer une connexion à une base de données
			// - fermer un fichier...
		}
	}
}

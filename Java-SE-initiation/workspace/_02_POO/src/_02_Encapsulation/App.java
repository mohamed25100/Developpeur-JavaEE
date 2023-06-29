package _02_Encapsulation;

public class App {

	public static void main(String[] args) {
		
		
		System.out.println("nUsers = " + User.getNusers());
		User u1 = new User("duck", "riri", 12);
		
		System.out.println("nUsers = " + User.getNusers());
		
		System.out.println("u1.getAge = " + u1.getAge());

		u1.setAge(14);
		
		u1.setAge(-14);
	
		System.out.println("u1.getAge = " + u1.getAge());
		
		System.out.println(u1/*.toString()*/); // toString est appelÃ© implicitement
		
		User u2 = new User("duck", "fifi", -12);
		
		System.out.println(u2);
	}
}

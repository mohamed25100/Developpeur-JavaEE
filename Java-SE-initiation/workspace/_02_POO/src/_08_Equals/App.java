package _08_Equals;

public class App {

	public static void main(String[] args) {
		
		CompteBancaire cb1 = new CompteBancaire("riri", "12aaaa541", 1000);
		CompteBancaire cb2 = new CompteBancaire("fifi", "12bbb541", 2000);
		CompteBancaire cb3 = new CompteBancaire("loulou", "12cccc541", 3000);
		CompteBancaire cb4 = new CompteBancaire("loulou", "12cccc541", 3000);
		
		System.out.println(cb1);
		System.out.println(cb2);
		System.out.println(cb3);
		System.out.println(cb4);
		
		System.out.println(cb1.equals(cb1)); // true
		System.out.println(cb1.equals(null)); // false
		System.out.println(cb2.equals("pas d'erreur")); // false
		
		System.out.println(cb2.equals(cb1)); // false
		System.out.println(cb3.equals(cb4)); // true
	}
}

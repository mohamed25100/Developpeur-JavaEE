package _05_References;

public class Strings {

	public static void main(String[] args) {
		/*
		 * Contrairement aux types pirimitifs, les types references (ou complexes, ou encore "objets")
		 * exposent des methodes
		 * ils se distinguent visuellemnt des types primififs en ce qu'ils commencent par une majuscule.
		 * 
		 * */

		String firstName = "riri";
		String lastName = "duck";
		
		String fullName = firstName + " " + lastName;
		
		System.out.println(fullName);
		String syllabe = "ri";
		
		String joined = syllabe + syllabe; // "riri";
		
		if (firstName == joined) {
			System.out.println("Les 2 varriables pointent vers la même adresse");
		}
		else {
			System.out.println("Les 2 variables ne pointent pas vers la même adresse");
			System.out.println("'firstName' et 'joined' sont deux objets différents");
		}
		if(firstName.equals(joined)) {
			System.out.println("Les 2 chaines 'firstname' et 'joined' ont la même valeur");
		}
		else {
			System.out.println("Les 2 chaines 'firstName' et 'Joined n'ont pas la même valeur'");
		}
	}

}

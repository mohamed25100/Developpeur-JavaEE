package _03_Types.References;

public class _01_Strings {

	public static void main(String[] args) {
		
		/*
		 * Contrairement aux types primitifs, les typés références(ou complexes, ou encore "objets")
		 * exposent des méthodes.
		 * Ils se distinguent visuellement des types primitifs en ce qu'ils commencent par une majuscule.
		 * 
		 */
		
		String firstName = "riri";
		String lastName = "duck";
		
		String fullName = firstName + " " + lastName;
		
		System.out.println(fullName);
		
		String syllabe = "ri";
		
		String joined = syllabe + syllabe; // "riri"
		
		if (firstName == joined) {
			System.out.println("Les 2 variables pointent vers la même adresse");
		}
		else
		{
			System.out.println("Les 2 variables ne pointent pas vers la même adresse");
			System.out.println("'firstName' et 'joined' sont 2 objets différents");
		}
		
		if (firstName.equals(joined)) { // equals teste l'égalité des valeurs
			System.out.println("Les 2 chaines 'firstName' et 'joined' ont la même valeur");
		}
		else
		{
			System.out.println("Les 2 chaines 'firstName' et 'joined' n'ont pas la même valeur");
		}
		
		String s1 = "Bonjour";
		String s2 = "Bonjour"; // Ne crée pas un aautre objet car un objet similaire existe déjà
		String s3 = new String("Bonjour"); // Force la création d'un nouvel objet via appel au mot clé 'new'
		
		System.out.println(s1 == s2); // true
		System.out.println(s1 == s3); // false
		
		s1 = "Salut";
		
		System.out.println(s1);
		System.out.println(s2);
		
		String str = "test";
		
		System.out.println(str.charAt(2)); // s
		
		String str2 = str.concat("e");
		
		System.out.println(str2);
		
		System.out.println(str.substring(0, 3)); // tes (sous chaine de l'indice 0 à 3 exclu)
		System.out.println(str.substring(2)); // st (sous chaine à partir de l'indice 2)
		
		String message = "Ceci est une chaine de caractères. Phrase 2";
		
		System.out.println(message.toUpperCase());
		System.out.println(message.toLowerCase());
		
		// Déclaration d'un tableau de chaine de caraactères : String[]
		String[] splitted = message.split(" "); // On splite la variable message en tableau de sous chaines (mots)
		// splitted = message.split("\\."); // '.' est un caractère spécial regex : il faut l'échapper avec '\\.'...
		System.out.println("-------------");
		for (String mot : splitted) {
			System.out.println(mot);
		}
		
		String replacement = message.replace("Ceci", "Ce truc");
		System.out.println(replacement);
		
		/*
		 * Conversion de types primtifs en chaines de caractères
		 * 
		 * 
		 */
		
		String myStr = "123";
		int myInt = Integer.parseInt(myStr);
		
		myStr = "3.1415";
		
		double myDouble = Double.parseDouble(myStr);
		
		System.out.println("myDouble = " + myDouble);
		
		System.out.println("6" + 4 + 5); // '645' concaténations
		System.out.println(4 + 5 + "7"); // '97' addition et contcaténation
		System.out.println("4" + 5 + "3"); // '453' concaténations
		
		int x = 5 + 'A';
		System.out.println(x); // 70
		
		char y = 5 + 'A';
		System.out.println(y); // F
		
		
		/*
		 * StringBuilder : 
		 * Contrairement à la classe String, la classe StringBuilder permet de créer des chaines de caractères modifiables.
		 * Il n'est donc pas nécessaire de réalouer de la mémoire et de faire des réaffectations
		 * à chaque fois qu'on effectue des modifications. 
		 * C'est donc plus efficace si on a beacoup de manipulation à faire avec une chaine de caractères.
		 */
		
		StringBuilder builder = new StringBuilder("Ceci est une chaine de caractères créée avec un StringBuilder.");
		
		System.out.println(builder);
		
		builder.append("Il est donc possible de la modifier."); // Pas besoin de réaffecter le résultat de .append à la variable builder
		
		System.out.println(builder);
 	}
}

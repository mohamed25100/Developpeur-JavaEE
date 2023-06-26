package _04_Primitifs;

public class Caracteres {

	public static void main(String[] args) {
		/*
		 * Type caractere : char
		 * Un caractere est stocke en memoire sous forme d'une valeur numerique codes sur 2 octets
		 * .
		 */
		char c = 'a';
		System.out.println(c);
		c = 98; // 98 correspond au caractere b dans la table ASCII : https://fr.wikipedia.org/wiki/American_Standard_Code_for_Information_Interchange
		System.out.println(c); // b
		// Caracteres speciaux :
		char c1 = '\n'; // retour à la ligne
		char c2 = '\t'; // tabulation
		char c3 = '\\'; // antislash
		char c4 = '\''; // apostrophe
		
		boolean isDigit = Character.isDigit('a'); // false
		System.out.println(isDigit);
		isDigit = Character.isDigit('l'); // true
		boolean isLetter = Character.isLetter('a');
		System.out.println(isLetter);
		boolean isUpperCaseLetter = Character.isUpperCase('a');
		System.out.println(isUpperCaseLetter);
	}

}

package _03_Types.Primitifs;

public class Caracteres {

	public static void main(String[] args) {
		
		/*
		 * Type caractère : char
		 * Un caractère est stocké en mémoire sous forme d'une valeur numérique codée sur 2 octets
		 */
		
		char c = 'a';
		
		System.out.println(c);
		
		c = 98; // 98 correspond au caractère b dans la table ASCII : https://fr.wikipedia.org/wiki/American_Standard_Code_for_Information_Interchange
		System.out.println(c); // b
		
		// Caractères spéciaux : 
		char c1 = '\n'; // retour à la ligne
		char c2 = '\t'; // tabulation
		char c3 = '\\'; // antislash
		char c4 = '\''; // apostrophe
		
		boolean isDigit = Character.isDigit('a'); // false
		System.out.println(isDigit);
		isDigit = Character.isDigit('1'); // true
		System.out.println(isDigit);
		
		boolean isLetter = Character.isLetter('a'); // true
		System.out.println(isLetter);
		
		boolean isUpperCaseLetter = Character.isUpperCase('a'); // false
		System.out.println(isUpperCaseLetter);
	}
}

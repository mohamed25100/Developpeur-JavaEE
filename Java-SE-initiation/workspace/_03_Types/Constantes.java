package _03_Types;

public class Constantes {

	public static void main(String[] args) {

		/*
		 * En java une constante est identifiée via le mot clé 'final'
		 * Par convetion les constantes sont déclarées en MAJUSCULES
		 */
		
		final String MA_CONSTANTE = "Cette chaine de caractères est une constante";

		System.out.println(MA_CONSTANTE);
		
		// ERREUR : Une constante ne peut pas être modifiée
		// MA_CONSTANTE = "Cette chaine de caractères est une constante modifiée";
		
		final int VIES_MAX = 15;
		
		System.out.println(VIES_MAX);
		
		//VIES_MAX = 16; // erreur...
	}
}

package _03_Types;

public class ReglesDeNommage {

	public static void main(String[] args) {


		/*
		 * Une variable peut commencer au choix par :
		 * - une lettre
		 * - un underscore
		 * - le caractère '$'
		 * - mais pas par un chiffre.
		 */
		
		/*
		 * Convension de nommage 
		 * 
		 * - camelCase : maVariable => en java on utilise le camlCase pour les nom de variables
		 * - PascalCase : MaVariable
		 * - snake_case : ma_variable
		 */
		
		int monEntier = 10;
		
		String _maChaineDeCaractères = "ma chaine de caractères";
		
		char $monCharactere0 = 'a';
		
		// double 0monDouble; // Erreur : interdit de commencer un chiffre
	}
}

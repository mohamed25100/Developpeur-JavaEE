package _02_Entrees_Sorties;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {

		// La classe Scanner permet de récupérer des informations depuis la console
		Scanner clavier = new Scanner(System.in);

//		int n = 0;
//
//		System.out.println("Entrez un nombre entier : ");
//		n = clavier.nextInt(); // la méthode nextInt permet de récupérer un nombre entier
//
//		System.out.println("Le carré de " + n + " vaut " + n * n);
		
//		double monDouble = 0.0;
//		
//		System.out.println("Entrez un nombre à virgule flottante : ");
//		monDouble = clavier.nextDouble(); // la méthode nextDouble permet de récupérer un nombre à virgule flottante
//
//		// ATTENTION  : il faut saisir les nombre à virgules flottantes avac de ',' et non pas de '.'
//		
//		System.out.println("Vous avez rentré : " + monDouble );
		
		System.out.println("Entre une phrase : ");
		
		String premierMot = clavier.next(); // La méthode 'next' permet de récupérer un mot
		
		String phraseComplete = premierMot + clavier.nextLine(); // nextLine permet de récupérer une ligne entière
		
		System.out.println("premierMot = " + premierMot);
		System.out.println("phraseComplete = " + phraseComplete);
		
		clavier.close();
	}
}

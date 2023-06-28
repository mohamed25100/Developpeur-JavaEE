package _07_Exercices;

import java.util.Random;
import java.util.Scanner;

public class _06_Devinette {
/*
 * L'utilisateur doit deviner un nombre secret (généré automatiquement) entre 1 et 1000.
 * On va donc demander à l'utilisateur de trouver ce nombre secret.
 * Tant qu'il n'a pas trouvé ce nombre on lui demandera encore et encore, jusqu'à ce qu'il le trouve.
 * Si l'utilisateur choisit un nombre trop petit, l'application lui dira que le nombre qu’il a rentré est trop petit
 * Si l'utilisateur choisit un nombre trop grand, l'application lui dira que le nombre qu’il a rentré est trop grand
 * Si l'utilisateur trouve le nombre recherché, l'application lui indiquera le nombre d'essais dont il a eu besoin
 * 
 * Exemple :
 * Entrée : Entrer un nombre entre 1 et 1000 (1 - 1000) : 500
 * Sorties possibles :
 * Votre nombre est trop grand !
 * Votre nombre est trop petit !
 * Trouvé en 8 essais ! Bien Joué !
 */

	public static void main(String[] args) {
	// La classe Scanner permet de récupérer des informations depuis la console
	Scanner clavier = new Scanner(System.in);
	
	Random random = new Random();
	
	int nombreSecret = random.nextInt(1000) + 1; // Génération du nombre secret entre 1 et 1000
	int tentative = 0;
	int essais = 0;
	
	System.out.println("Devinez le nombre entre 1 et 1000.");
	
	while (tentative != nombreSecret) {
	    System.out.print("Entrez votre tentative : ");
	    tentative = clavier.nextInt();
	    essais++;
	
	    if (tentative < nombreSecret) {
		System.out.println("Votre nombre est trop petit !");
	    } else if (tentative > nombreSecret) {
		System.out.println("Votre nombre est trop grand !");
	    }
	}
	
	System.out.println("Trouvé en " + essais + " essais ! Bien joué !");
	
	clavier.close();
	}

}

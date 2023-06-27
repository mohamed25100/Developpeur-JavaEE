package _03_Types.References;

import java.util.Arrays;
import java.util.Iterator;

public class _02_Arrays {

	public static void main(String[] args) {

	/*
	 * Un tableau est un objet de type référence pouvant stocker un ensemble de valeurs du même type.
	 * Une fois initialisé, il n'est plus possible de changer sa taille.
	 */

		int[] tab; // Déclaration d'un tableau d'entiers non initialisé
		
//		String[] names = new String[2]; // Déclaration d'un tableau de 2 chaines de caractères
//		
//		names[0] = "riri"; // Assignation de la valeur "riri" à l'indice 0 du tableau 'names'
//		names[1] = "fifi";
		
		String[] names = new String[] {"riri", "fifi"};
		
		// Parcours du tableau 'names' avec une boucle 'for' de type 'foreach'
		for (String prenom : names) {
			System.out.println(prenom);
		}
		
		// Parcours avec une boucle for 'normale"
		for(int i = 0; i < names.length; i++)
		{
			System.out.println(names[i]);
		}
		
		System.out.println("\n ----- Arrays : Classe utilitaire pour les tableaux");
		
		String[] tabStr = new String[5];
		
		Arrays.fill(tabStr, "Bonjour"); // => initialiser un tableau avec la valeur valeur "bonjour"
		
		System.out.println(Arrays.toString(tabStr)); // toString => permet d'afficher le contenu d'un tableau sans avoirà faire de boucle
	}
}

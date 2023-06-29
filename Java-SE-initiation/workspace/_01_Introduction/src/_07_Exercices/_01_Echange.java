package _07_Exercices;

import java.util.Scanner;

public class _01_Echange {

	// Permuter 2 variables

	/*
	 * Exemple : Données d'entrée : a = 5, b = 9 Sortie prévue : Avant l’échange : a
	 * = 5, b = 9 Après l’échange : a = 9, b = 5
	 */
	
	public static void echange(int v1, int v2) {
		// Permutation des variables
		int temp = v1;
		v1 = v2;
		v2 = temp;
	        System.out.println("Après l'échange :");
	        System.out.println("a = " + v1 + ", b = " + v2);
	}

	public static void main(String[] args) {
		int a = 5;
        	int b = 9;

        	System.out.println("Avant l'échange :");
        	System.out.println("a = " + a + ", b = " + b);

        	echange(a, b);
		
	}
}

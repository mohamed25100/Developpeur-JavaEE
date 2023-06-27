package _07_Exercices;

import java.util.Scanner;

public class _04_Divisible {

	/*
	 * Vérifier si un nombre est divisible par 3 et 13 ou non.
	 * Un nombre entier est divisible par un autre quand le résultat de la division euclidienne est un entier sans reste.
	 * On peut écrire b = k*a + R, avec R = 0.
	 */
	
	// La classe Scanner permet de récupérer des informations depuis la console
    
	public static boolean estDivisiblePar3Et13(int nombre) {
        return nombre % 3 == 0 && nombre % 13 == 0;
    }
    
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);


	    System.out.print("Saisir un nombre entier : ");
	    int nombre = clavier.nextInt();

	    if (estDivisiblePar3Et13(nombre)) {
	        System.out.println(nombre + " est divisible par 3 et 13.");
	    } else {
	        System.out.println(nombre + " n'est pas divisible par 3 et 13.");
	    }

	    clavier.close();
	}
}

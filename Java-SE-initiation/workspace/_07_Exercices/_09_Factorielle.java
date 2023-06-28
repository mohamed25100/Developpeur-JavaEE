package _07_Exercices;

import java.util.Scanner;

public class _09_Factorielle {
	/*
	 * Demander à l'utilisateur de choisir un nombre entier et retourner sa
	 * factorielle. Utiliser la récursivité.
	 * n! = n*(n-1)! si n!=1
	 * 1! = 1;
	 */
	
	public static long calculerFactorielle(int nombre) {
		if (nombre == 0 || nombre == 1) {
		    return 1;
		} else {
		    return nombre * calculerFactorielle(nombre - 1);
		}
	}

	public static void main(String[] args) {

		
	// La classe Scanner permet de récupérer des informations depuis la console
	Scanner clavier = new Scanner(System.in);

        System.out.print("Entrez un nombre entier : ");
        int nombre = clavier.nextInt();
        
        long factorielle = calculerFactorielle(nombre);

        System.out.println(nombre + "! = " + factorielle);

        clavier.close();
	}

}

package _07_Exercices;

import java.util.Scanner;

public class _11_Fibonacci {
	/*
	 * 
	 * En mathématiques, la suite de Fibonacci est une suite d'entiers dans laquelle chaque terme est la somme des deux termes qui le précèdent.
	 * Elle commence par les termes 0 et 1 si on part de l'indice 0, ou par 1 et 1 si on part de l'indice 1.
	 * Dans les exercices suivants, nous nous concentrerons sur des tableaux à une dimension. Nous vous montrerons comment implémenter et utiliser des tableaux.
	 * 
	 * Exemple : 1 1 2 3 5 8 13 21 34….
	 * 
	 * Notée (Fn), elle est donc définie par :
	 * 
	 * F0 = 0,
	 * F1 = 1 et
	 * Fn = Fn-1 + Fn-2 pour n >= 2
	 * 
	 * On peut définir cette suite par récurrence.
	 * 
	 * On initialise les formules avec deux conditions initiales : F0 = 0, F1 = 1
	 * Formule de récurrence : Fn = Fn-1 + Fn-2 pour n >= 2
	 */

	public static int fibonacci(int n) {
		if (n == 0) {
		    return 0;
		} else if (n == 1) {
		    return 1;
		} else {
		    return fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		// La classe Scanner permet de récupérer des informations depuis la console
		Scanner clavier = new Scanner(System.in);


		
		System.out.print("Entrez le nombre d'éléments de la suite de Fibonacci : ");
		int nombreElements = clavier.nextInt();
		
		System.out.println("Suite de Fibonacci :");
		for (int i = 0; i < nombreElements; i++) {
		    int element = fibonacci(i);
		    System.out.print(element + " ");
		}
		
		clavier.close();
	}

}

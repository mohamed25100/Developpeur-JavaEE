package _07_Exercices;

import java.util.Scanner;

public class _03_pair_impair {
/*
 * Vérifier si un nombre est pair ou impair
 * Un nombre pair est un multiple de 2. Il peut s’écrire sous la forme b = 2*k avec k un entier :
 * 21 est un nombre impair car 21 = 2 * 10 + 1 (Le reste vaut 1 : R = 1)
 * 30 est un nombre pair car 30 = 2 * 15 (R = 0)
 */
	
	public static boolean estPair(int nombre) {
	return nombre % 2 == 0;
	}

	public static void main(String[] args) {
		// La classe Scanner permet de récupérer des informations depuis la console
		Scanner clavier = new Scanner(System.in);
	
	
	System.out.print("Saisir un nombre entier : ");
	int nombre = clavier.nextInt();
	
	if (estPair(nombre)) {
	    System.out.println(nombre + " est un nombre pair.");
	} else {
	    System.out.println(nombre + " est un nombre impair.");
	}
	
	clavier.close();
	
	}

}

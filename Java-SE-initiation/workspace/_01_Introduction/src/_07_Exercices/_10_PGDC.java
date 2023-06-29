package _07_Exercices;

import java.util.Scanner;

public class _10_PGDC {
	/* PGCD : Plus Grand Dénominateur Commun
	 * Appliquer l’Algorithme d’Euclide qui dit :
	 * si b divise a alors pgcd(a,b) = b
	 * sinon pgcd(a,b) = pgcd(b, a mod b)
	 * 
	 * où a mod b est le reste de la division de a par b.
	 * Ecrivez un programme permettant de trouver le plus PGCD à partir cet algorithme.
	 */
	
	public static int pgcd(int a,  int b)
	{
		int modulo = a % b;
		
		if(modulo == 0) return b; else return pgcd(b, modulo);
	}
	
	public static void main(String[] args) {
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Veuillez entrer un nombre entier : ");
		int n1 = clavier.nextInt();
		
		System.out.print("Veuillez entrer un second nombre entier : ");
		int n2 = clavier.nextInt();
		
		System.out.println("Le pgdc de " + n1 + " et " + n2 + " vaut " + pgcd(n1, n2));
		
		clavier.close();
	}
}


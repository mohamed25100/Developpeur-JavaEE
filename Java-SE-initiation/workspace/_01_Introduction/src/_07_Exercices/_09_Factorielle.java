package _07_Exercices;

import java.util.Scanner;

public class _09_Factorielle {
	/*
	 * Demander à l'utilisateur de choisir un nombre entier et retourner sa
	 * factorielle. Utiliser la récursivité.
	 * n! = n*(n-1)! si n!=1
	 * 1! = 1;
	 */
	
	public static long factorielle(int nombre)
	{
		if(nombre == 0 || nombre == 1) return 1;
		
		return nombre * factorielle(nombre - 1);
	}
	
	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		System.out.print("Saisir un nombre entier (pas trop grand...) : ");
		
		// 0! = 1
		// 1! = 1 ON CONNAIT 1! => on peut calculer 2! => puis 3! => puis...
		// 2! = 1 X 2 = 1! X 2 => pour calcluer 2! il faut d'abord calculer 1 !
		// 3! = 1 X 2 X 3 = 2! X 3 => pour calcluer 3! il faut d'abord calculer 2 !
		// 4! = 1 X2 X 3 X 4 = 3! X 4 => pour calcluer 4! il faut d'abord calculer 3 !
		// n! = (n-1)! X n
		
		int nombre = clavier.nextInt();
		
		System.out.println(nombre + "! = " + factorielle(nombre));
		
		clavier.close();
	}
}

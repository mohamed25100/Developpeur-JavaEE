package _07_Exercices;//**Mohamed**

import java.util.Scanner;

public class _05_Bissextile {
	/*
	 * Vérifier si l'année donnée par l'utilisateur est bissextile (366 jours) ou non.
	 * Une année est considérée comme une année bissextile si :
	 * elle est divisible par 4 et non divisible par 100 ;
	 *  ou si elle est divisible par 400
	 * « divisible » signifie que la division donne un nombre entier, sans reste (c'est à dire le reste égale à zéro) : 21 est divisible par 3. 22 non.
	 */
	public static boolean estAnneeBissextile(int annee) {
	return (annee % 4 == 0 && annee % 100 != 0) || (annee % 400 == 0);
	}
	
	public static void main(String[] args) {
	
	// La classe Scanner permet de récupérer des informations depuis la console
	Scanner clavier = new Scanner(System.in);
	
	
	System.out.print("Saisir une année : ");
	int annee = clavier.nextInt();
	
	if (estAnneeBissextile(annee)) {
	    System.out.println(annee + " est une année bissextile.");
	} else {
	    System.out.println(annee + " n'est pas une année bissextile.");
	}
	
	clavier.close();
	}

}

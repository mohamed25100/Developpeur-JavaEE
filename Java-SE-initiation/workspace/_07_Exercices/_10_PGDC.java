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
	
    public static int calculerPGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return calculerPGCD(b, a % b);
        }
    }

    public static void main(String[] args) {
        // La classe Scanner permet de récupérer des informations depuis la console
        Scanner clavier = new Scanner(System.in);
    
        System.out.print("Entrez le premier nombre : ");
        int nombre1 = clavier.nextInt();
    
        System.out.print("Entrez le deuxième nombre : ");
        int nombre2 = clavier.nextInt();
    
        int pgcd = calculerPGCD(nombre1, nombre2);
    
        System.out.println("Le PGCD de " + nombre1 + " et " + nombre2 + " est : " + pgcd);
    
        clavier.close();
    }

}

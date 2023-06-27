package _07_Exercices;

import java.util.Scanner;

public class _02_Racine_carre {

	//Ecrire un programme qui demande à l'utilisateur de rentrer un nombre entier et qui retourne sa racine carrée.
	
	public static double racineCarree(int nombre) {
	return Math.sqrt(nombre);
	}
	
	public static void main(String[] args) {
		// La classe Scanner permet de récupérer des informations depuis la console
		Scanner clavier = new Scanner(System.in);

		System.out.print("Saisir un nombre entier : ");
        int nombre = clavier.nextInt();

        System.out.println("La racine carrée de " + nombre + " est : " + racineCarree(nombre));
        
        clavier.close();
	}
	
}

package _07_Exercices;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class _07_Tableaux {
	/* Insertion dans un tableau trié
	 * 
	 * Il faut insérer la nouvelle donnée directement à la bonne place. C’est le mécanisme de base du tri par insertion.
	 * L’insertion d’une donnée à une place précise libère la case qui doit recevoir la donnée,
	 * en décalant d’une case toute la partie droite du tableau à partir de cette position, puis copie la donnée dans la case libérée.
	 * Pour éviter toute perte de données, le décalage part de la fin pour remonter ver la position d’insertion.
	 * Le décalage débute à la dernière case qui contient une donnée, se poursuit sur l’avant-dernière case, et ainsi de suite.
	 * 
	 * Créer et initialiser un tableau, puis insérer un élément à la position spécifiée dans ce tableau (de 0 à N-1).
	 * Pour insérer un nouvel élément dans le tableau, déplacez les éléments de la position d'insertion donnée vers une position vers la droite.
	 * 
	 * Exemple
	 * Données d'entrée : Saisir le nombre de notes : 4
	 * Note 1 : 8.5
	 * Note 2 : 9.5
	 * Note 3 : 12.5
	 * Note 4 : 18.0
	 * Saisir la note 5 : 11.0
	 * Données de sortie : [8.5, 9.5, 11.0, 12.5, 18.0]
	 */

	public static void main(String[] args) {

		// La classe Scanner permet de récupérer des informations depuis la console
		Scanner clavier = new Scanner(System.in);
		
		Random random = new Random();
		
		System.out.print("Saisir le nombre de notes : ");
		int tailleTableau = clavier.nextInt();
		
		double[] tableau = new double[tailleTableau + 1];
		
		for (int i = 0; i < tailleTableau; i++) {
		    double note = Math.round(random.nextDouble() * 200) / 10.0; // Génère une note aléatoire avec deux décimales
		    tableau[i] = note;
		    System.out.printf("Note %d : %.2f%n", i + 1, note);
		}

	        System.out.print("Saisir la note à insérer : ");
	        double nouvelleNote = Math.round(clavier.nextDouble() * 100) / 100.0; // Limite la nouvelle note à deux décimales
	
	        System.out.print("Choisir l'emplacement d'insertion (de 0 à " + tailleTableau + ") : ");
	        int positionInsertion = clavier.nextInt();
	
	        deplacerElements(tableau, positionInsertion, tailleTableau);
	        tableau[positionInsertion] = nouvelleNote;
	
	        System.out.print("Données de sortie : [");
	        for (int i = 0; i < tailleTableau; i++) {
	            System.out.printf("%.2f, ", tableau[i]);
	        }
	        System.out.printf("%.2f]%n", tableau[tailleTableau]);
	
	        clavier.close();
	}

	public static void deplacerElements(double[] tableau, int positionInsertion, int tailleTableau) {
		for (int i = tailleTableau - 1; i >= positionInsertion; i--) {
		    tableau[i + 1] = tableau[i];
		}
	}
}

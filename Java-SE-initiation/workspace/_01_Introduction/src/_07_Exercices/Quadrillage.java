package _07_Exercices;

import java.util.Scanner;

public class Quadrillage {

	public static void main(String[] args) {
		// La classe Scanner permet de récupérer des informations depuis la console
		Scanner clavier = new Scanner(System.in);
		
		System.out.print("Saisir le nombre de colonnes : ");
        int colonnes = clavier.nextInt();

        System.out.print("Saisir le nombre de lignes : ");
        int lignes = clavier.nextInt();

        int i = 0;
        while (i < lignes) {
            int j = 0;
            while (j < colonnes) {
                System.out.print("[" + i + "," + j + "]");
                j++;
            }
            System.out.println();
            i++;
        }
        clavier.close();
	}

}

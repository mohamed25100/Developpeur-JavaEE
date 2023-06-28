package _07_Exercices;

import java.util.Scanner;

public class SerieHarmonique {

	public static void main(String[] args) {
		// La classe Scanner permet de récupérer des informations depuis la console
		Scanner clavier = new Scanner(System.in);

        System.out.print("Saisir un nombre entier n : ");
        int n = clavier.nextInt();

        double somme = 0.0;
        int i = 1;

        //System.out.print("S(" + n + ") = 1");
        while (i <= n) {
            somme += 1.0 / i;
            System.out.print("S(" + i + ") = 1" + " + 1/" + i + " = " + somme + "\n");
            i++;
        }
        //System.out.println(" = " + somme);
        clavier.close();
	}
}

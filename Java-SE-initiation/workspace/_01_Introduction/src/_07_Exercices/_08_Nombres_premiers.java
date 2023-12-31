package _07_Exercices;// **Mohamed**
import java.util.Scanner;
public class _08_Nombres_premiers {
	/*
	 * Le problème est de déterminer si un nombre entier est un nombre premier.
	 * Définition : Un nombre premier est un nombre :
	 * - strictement supérieur à 1
	 * - qui n’est divisible (au sens de la division entière) que par 1 et par lui-même.
	 * 
	 * Ainsi :
	 * 2 est un nombre premier (il est uniquement divisible par 1 et par lui-même)
	 * 3 aussi
	 * 4 n’est pas premier (il est divisible par 2)
	 * 5 est premier
	 * etc...
	 * 
	 * Le nombre 1 pourrait être considéré comme un nombre premier (il n’est pas divisible sauf par 1 et par lui-même).
	 * Il est exclu de la liste des nombres premiers par commodité, car il ne respecte pas certaines lois communes à tous les autres nombres premiers.
	 * La méthode de base consiste à prouver que le nombre à traiter n’est pas premier en recherchant un diviseur qui donne un reste égal à 0.
	 * Si on en trouve un, le nombre n’est pas premier.
	 * Si aucun diviseur n’est trouvé, il s’agit d’un nombre premier.
	 * 
	 * Ecrivez un premier programme qui effectue ce calcul. On utilisera une boucle FOR afin de tester tous les diviseurs de 2 au nombre – 1. Le programme demandera un nombre entier et indiquera s’il est premier ou non.
	 */
	public static boolean estPremier(int nombre) {
	if (nombre <= 1) {
	    return false;
	} else {
	    for (int i = 2; i < nombre; i++) {
		if (nombre % i == 0) {
		    return false;
		}
	    }
	}
	return true;
	}
	
	public static void main(String[] args) {
		// La classe Scanner permet de récupérer des informations depuis la console
		Scanner clavier = new Scanner(System.in);
	
	System.out.print("Entrez un nombre entier : ");
	int nombre = clavier.nextInt();
	
	if (estPremier(nombre)) {
	    System.out.println(nombre + " est un nombre premier.");
	} else {
	    System.out.println(nombre + " n'est pas un nombre premier.");
	}
	clavier.close();
	}
}

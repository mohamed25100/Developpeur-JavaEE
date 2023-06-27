package _05_Instructions;

import java.util.ArrayList;
import java.util.Scanner;

public class Boucles {

	/*
	 * Une boucle permet de répter (itérer) un certain nombre de fois une
	 * instruction ou un bloc d'instructions.
	 * 
	 * 3 mots permettent de définir des boucles : - for - while - do while
	 */
	public static void main(String[] args) {

		System.out.println("****************** for ******************\n");

		/*
		 * L boucle for permet de répéter un bloc d'instructions un nombre déterminé de
		 * fois.
		 * 
		 * Syntaxe : for(initExpr; testExpr; incExpr){Bloc d'instructione à répéter}
		 * 
		 * Avec : - initExpr : expression d'initialisation - testExpr : expression de
		 * test - incExpr : Expression d'incrémentation
		 */

		String[] months = { "Janvier", "Février", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre",
				"Octobre", "Novembre", "Décembre" };

		for (int i = 0; i < months.length; i++) {
			System.out.println(months[i]);
		}

		System.out.println("------ Avec break------");

		for (int i = 0; i < months.length; i++) {

			if (months[i] == "Avril") {
				System.out.println("Le mot clé 'break' permet de stopper, sous condition, l'exécution d'une boucle ");
				break;
			}
			System.out.println(months[i]);
		}

		for (int i = 0; i < months.length; i++) {

			if (months[i] == "Avril") {
				System.out.println("Le mot clé 'break' permet de stopper, sous condition, l'exécution d'une boucle ");
				break;
			}
			System.out.println(months[i]);
		}

		System.out.println("------ Avec continue------");

		for (int i = 0; i < months.length; i++) {

			if (months[i] == "Avril") {
				System.out.println("Le mot clé 'continue' permet de passer directement à l'itération suivante ");
				continue;
			}
			System.out.println(months[i]);
		}

		String[] names = { "riri", "fifi", "loulou" };

		for (int i = 0; i < names.length; i++) {

			if (names[i] == "fifi") {
				break;
			}
			System.out.println(names[i]);
		}

		System.out.println("\n*************** Boucle for each ****************\n");

		/*
		 * La boucle For Each permet de répéter un bloc d'instructions pour chaque
		 * élément d'un tableau ou d'une collection.
		 * 
		 * Java ne propose pas le mot clé 'forech'. L'instruction "For Each" est donc
		 * mise en oeuvre avec le mot clé "for"
		 * 
		 * Syntaxe : for(type element : Collection) {bloc d'instrucions à exécuter}
		 */

		int[] intArray = { 10, 20, 30, 40, 50 };

//		for (int item : intArray) {
//			System.out.println(item);
//		}

		// var : inférence de type : le compilateur peut déterminer le type de 'item' à
		// partir de celui de 'intArray'
		for (var item : intArray) {
			System.out.println(item);
		}

		System.out.println("\n*************** .forEach ****************\n");

		ArrayList<Integer> intArrayList = new ArrayList<Integer>();

		intArrayList.add(1);
		intArrayList.add(4);
		intArrayList.add(12);

		intArrayList.forEach(item -> System.out.println(item));
		System.out.println("---------------");
		intArrayList.forEach(System.out::println);

		System.out.println("\n******************** BOUCLE While ********************\n");

		/*
		 * La boucle 'while' permet de répéter un bloc d'instructions tant qu'une
		 * condition est vérifée.
		 * 
		 * Syntaxe : while(testExpr){Bloc d'instructions à itérer}
		 * 
		 * Avec testExpr : expression de test
		 */

		Scanner clavier = new Scanner(System.in);

		System.out.print("Merci de rentrer votre age : ");

		int age = clavier.nextInt();

		while (age <= 0) {
			System.out.print("Merci de saisir un age positif : ");
			age = clavier.nextInt();
		}

		System.out.println("Vous avez " + age + " ans.");

		System.out.println("\n******************** BOUCLE Do While ********************\n");

		/*
		 * La boucle Do While se différencie dela boucle while en ce que la condition
		 * d'arrêt est testée APRES l'exécution du bloc d'instructions. On est donc
		 * certain de passer au moins une fois dans la boucle, même si la condition
		 * était déjà fausse au départ.
		 */

		age = 10; // age <= 0 est faux, mais on passera quand même une fois dans la boucle

		do {
			System.out.print("Merci de saisir un age positif : ");
			age = clavier.nextInt();
		} while (age <= 0);

		System.out.println("Vous avez " + age + " ans.");

		clavier.close();

		// Série harmonique : Saisir un nombre entier n
		// Et calculer et afficher la somme des n premiers termes de la série harmonique
		// :
		// S(n) = 1 + 1 / 2 + 1 / 3 + 1 / 4 + ... +1 / n
		// S(1) = 1
		// S(2) = 1 + 1/2 = S(1) + 1/2 = 1.5
		// S(3) = 1 + 1/2 +1/3 = S(2) + 1/3...
		// ...

		// Afficher toutes les valeurs de la série harminique jusqu'à l'ordre 'n'

		double result = 0;
		
		for (int i = 1; i < 20; i++) {

			result += 1.0 / i;
			
			System.out.println("S(" + i + ") = " + Math.round((result *100)) / 100.0 );
		}

		// Quadrillage :Créer un quadrillage dynamiquement
		// Saisir le nombre de colonnes et de lignes
		// ex: pour 2 3
		// [0,0][0,1]
		// [1,0][1,1]
		// [2,0][2,1]
	}
}

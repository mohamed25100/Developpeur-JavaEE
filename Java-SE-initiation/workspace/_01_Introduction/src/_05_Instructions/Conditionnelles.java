package _05_Instructions;

import java.util.Scanner;

public class Conditionnelles {

	public static void main(String[] args) {

		System.out.println("************** Bloc if else if else **************\n");

		int n = -5;

		if (n > 0) {
			System.out.println("Le nombre est positif");
		} else if (n == 0) {
			System.out.println("Le nombre vaut 0");
		} else if (n * n == 25) {
			System.out.println("Le nombre vaut -5");
		} else {
			System.out.println("Le nombre est négatif");
		}

		System.out.println("\n************** switch **************\n");

		int jour = 4;

		switch (jour) {

		case 1:
			System.out.println("lundi");
			break;
		case 2:
			System.out.println("mardi");
			break;
		case 3:
			System.out.println("mercredi");
			break;
		case 4:
			System.out.println("jeudi");
			break;
		case 5:
			System.out.println("vendredi");
			break;
		case 6:
			System.out.println("samedi");
			break;
		case 7:
			System.out.println("dimanche");
			break;
		default:
			System.out.println("Entrée invalide");
		}

		switch (jour) {

		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			System.out.println("semaine");
			break;
		case 6:
		case 7:
			System.out.println("weekend");
			break;
		default:
			System.out.println("Entrée invalide");
		}

		// A partir Java 17

		switch (jour) {
		case 1, 2, 3, 4, 5 -> System.out.println("semaine");
		case 6, 7 -> System.out.println("weekend");
		default -> System.out.println("Entrée invalide");
		}
		;

		System.out.println(switch (jour) {
		case 1, 2, 3, 4, 5 -> "semaine";
		case 6, 7 -> "weekend";
		default -> "Entrée invalide";
		});

		System.out.println("\n************** Opérateur ternaire **************\n");

		String message = jour < 6 ? "Semaine" : "Weekend";

//		if (jour < 6) {
//			message = "Semaine";
//		}
//		else {
//			message = "Weekend";
//		}

		System.out.println(message);

		System.out.println("\n************** Calculatrice **************\n");

		// Exercice: Calculatrice
		// Saisir dans la console :
		// - un nombre à virgule flottante v1
		// - un caractère 'opérateur' qui a pour valeur valide: + - * /
		// - un nombre à virgule flottante v2
		// Afficher:
		// - Le résultat de l’opération
		// - Un message d’erreur si l’opérateur est incorrect
		// - Un message d’erreur si l’on fait une division par 0

		Scanner clavier = new Scanner(System.in);

		System.out.print("Saississez un double : ");
		double v1 = Double.parseDouble(clavier.next().replace(',', '.'));

		System.out.print("Saississez l'opérateur ( +, -, *, /): ");
		String op = clavier.next();

		System.out.print("Saississez un double : ");
		double v2 = Double.parseDouble(clavier.next().replace(',', '.'));

		switch (op) {
		case "+":
			System.out.println(v1 + " + " + v2 + " = " + (v1 + v2));
			break;
		case "-":
			System.out.println(v1 + " - " + v2 + " = " + (v1 - v2));
			break;
		case "*":
			System.out.println(v1 + " * " + v2 + " = " + (v1 * v2));
			break;
		case "/":
			if (v2 == 0) {
				System.out.println("Erreur : division par 0");
			} else {
				System.out.println(v1 + " / " + v2 + " = " + (v1 / v2));
			}

			break;
		default:
			System.out.println("L'opérateur '" + op + "' est invailide");
			break;
		}

		clavier.close();
	}
}

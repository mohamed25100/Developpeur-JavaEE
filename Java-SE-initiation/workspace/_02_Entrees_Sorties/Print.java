package _02_Entrees_Sorties;

public class Print {

	public static void main(String[] args) {
		
		System.out.println("La méthode 'println' permet d'écrire une ligne");
		
		System.out.print("La méthode 'print' permet d'écrire");
		System.out.print(" une chaine de caractères");
		System.out.print(" sans retour à la ligne.\n"); // \n : caractère de retour à la ligne
		
		String str = "printf"; // Déclaration d'une variable de type String nommée 'str'
		
		System.out.printf("La méthode %s permet d'écrire des chaines de caractères formatées.", str);
		
		int monEntier = 15;
		
		System.out.printf("\nmonEntier = %d", monEntier);
		
		/*
	     *  %s        Permet de formater une chaine de caractères
	     *  %c        Permet de formater un caractère
	     *  %d        Permet de formater un entier en base décimale.
	     *  %x        Permet de formater un entier sous forme hexadécimale
	     *  %e        Permet de formater un réel sous forme décimale en notation scientifique
	     *  %f        Permet de formater un réel sous forme décimale
	     *  %t        Utilisé pour formater les dates
	     *  %n ou \n  (retour à la ligne)
	     */
		
		System.out.printf("\nPI = %f", Math.PI);
		System.out.printf("\nPI = %.3f", Math.PI);
	}
}

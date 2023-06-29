package _06_Methodes;

public class Methodes {

	/*
	 * Une méthode représente un bloc d'instructions réutilisable. Elle permet d'éviter les répétitions de code.
	 * 
	 * Syntaxe : 
	 * Visibilité [mot-clés-optionnels] type-retour nomMethode(params) {instructions}
	 */
	
	/**
	 * Méthode afficher
	 */
	public static void afficher() {
		System.out.println("Méthode afficher");
	}
	
	/**
	 * Méthode afficher surchargée
	 * 
	 * @param text description du paramètre
	 */
	public static void afficher(String text) {
		System.out.println(text);
	}
	
	/**
	 * Méthode afficher doublement surchargée
	 * 
	 * @param tab tableau d'entiers
	 */
	public static void afficher(int[] tab) {

		for (int i = 0; i < tab.length; i++) {
			System.out.print(tab[i] + " ");
		}
	}
	
	/**
	 * Méthode afficher doublement triplement surchargée prenant en paramètre un nombre d'arguements variables
	 * 
	 * @param tab tableau de chaines de caractères
	 */
	public static void afficher(String... tab) {

		for (String item : tab) {
			System.out.print(item + " ");
		}
		System.out.println();
	}
	
	/**
	 * Méthode somme
	 * 
	 * @param val1 premier entier à sommer
	 * @param val2 second entier à sommer
	 * @return la somme des 2 entiers passés en paramètres
	 */
	public static int somme(int val1, int val2)
	{
		return val1 + val2;
	}
	
	/**
	 * Somme tableau
	 * @param tab tableau d'entiers à sommer
	 * @return la somme des éléments du tableau d'entiers
	 */
	public static int somme(int[] tab)
	{
		int result = 0;
		
//		for (int i = 0; i < tab.length; i++) {
//			result += tab[i];
//		}
		
		for (int item : tab) {
			result += item;
		}
		
		return result;
	}
	
	/*
	 * Une méthode récusrsive est une méthode qui s'appuie sur sa propre exécution.
	 * Elle s'appelle donc elle-même pour calculer un résultat.
	 * 
	 */
	
	// 2^0 = 1
	// 2^1 = 2 = 2 * 1 = 2 *(2^0)
	// 2^2 = 4 = 2 * 2 = 2 * (2^1) 
	// 2^3 = 8 = 2 * (2^2)
	// 2^n = 2 * (2^(n-1))
	
	/**
	 * Méthode power récursive
	 * 
	 * @param value valeur à élever à une puissance
	 * @param pow puissance à calculer
	 * @return value élevée à la puissance pow
	 */
	public static int power(int value, int pow) {
		
		if(pow == 0) return 1;
		
		return value * power(value, pow -1);
	}
	
	public static void main(String[] args) {
		
		afficher();
		
		afficher("Méthode afficher surchargée");
		
		int[] tab = {20,30,40};
		
		afficher(tab);
		
		System.out.println();
		
		afficher("somme(2, 3) = " + somme(2, 3));
		
		afficher("somme(tab) = " + somme(tab));
		
		System.out.println("power(2, 4) = " + power(2, 4));
			
		afficher("riri", "fifi");
		afficher("riri", "fifi", "loulou");
	}
}

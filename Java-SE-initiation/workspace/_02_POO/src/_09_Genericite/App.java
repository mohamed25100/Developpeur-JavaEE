package _09_Genericite;


/*
 * Le concept de généricité peut s'appliquer à des classes et des méthodes :
 * - identiques d'un point de vue algorithmique
 * - mais manipulant des types de données différents
 * 
 * Intérêt : 
 * - Optimisation du code (moins de répétition)
 * - Moins de transtypage (cast) à faire
 * - Moins de risque d'erreur à l'exécution
 */

public class App {

	public static void main(String[] args) {
		
		MyGeneric<String> myGenericStr = new MyGeneric<String>("Hello");
		MyGeneric<Integer> myGenericInt = new MyGeneric<Integer>(34);
		
		System.out.println(myGenericStr);
		System.out.println(myGenericInt);
	}
}

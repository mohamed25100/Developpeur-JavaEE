package _05_Instructions;

public class Generalites {

	public static void main(String[] args) {
		/*
		 * Une instruction simple doit se terminer par un ";"
		 * Un bloc d'instructions est contenu par des accolades
		 * les variables déclarées dans un bloc d'instrucions se sont accessibles
		 * que dans ledit bloc (et ses sous blocs)
		 */
		
		{
			System.out.println("Ceci est la première instruction d'un bloc d'instructions");
			
			int a = 10;
			
			System.out.println("a = " + a);
			
			System.out.println("Ceci est la dernière instruction d'un bloc d'instructions");
		}
		
		// System.out.println("a = " + a); // a n'existe plus ici...
	}
}

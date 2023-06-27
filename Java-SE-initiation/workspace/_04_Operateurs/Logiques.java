package _04_Operateurs;

public class Logiques {

	public static void main(String[] args) {
		
		/*
		 * Les opérateurs logiques s'appliquent sur des opérandes boolénes et produisent
		 * un résultat également bolléen.
		 * 
		 * Java comporte 3 opérateurs logiques : 
		 * - ET : A && B 
		 * - OU : A || B
		 * - NON : !A 
		 */
		
		boolean a = false;
		boolean b = true;
		
		if (a && b) { // Une seule vérification : A est faux, pas la peine de vérifier la suite
			System.out.println("a et b sont vrais");
		}
		
		// Résultat identique à la condtion précédente, mais moins efficace car on fait 2 vérifications
		if (b && a) {
			System.out.println("a et b sont vrais");
		}
		
		if (a || b) {
			System.out.println("a et/ou b est/sont vrai(s)");
		}
		
		if(!a)
		{
			System.out.println("a n'est pas vrai");
		}
	}
}


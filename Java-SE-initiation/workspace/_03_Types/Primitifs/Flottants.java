package _03_Types.Primitifs;

public class Flottants {

	public static void main(String[] args) {
		
		/*
		 * Types numériques flottants : 
		 * - float : stocké sur 32bits
		 * - double : stocké sur 64 bits
		 */
		
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
		
		System.out.printf("- %s (%d bits) from %e to %e\n", Float.TYPE, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.printf("- %s (%d bits) from %e to %e\n", Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
		
		System.out.println();
		
		float myFloat = 3.4f;
		double myDouble = 3.4;
		
		// Notation exponentielle
		
		double myDoubleExp = 3.4e10;
		double myFloatExp = 3.4e10f;
		
		System.out.println("myDoubleExp = " + myDoubleExp);
		
		// Valeurs particulières
		System.out.println();
		System.out.println(Double.POSITIVE_INFINITY); // + l'infini
		System.out.println(Double.NEGATIVE_INFINITY); // - l'infini
		System.out.println(Double.NaN); // - Nan : Not A Number
		
		// Quelques tests sur ces valeurs :
		
		System.out.println(Float.isFinite(Float.NEGATIVE_INFINITY)); // False
		System.out.println(Float.isInfinite(Float.NEGATIVE_INFINITY)); // True
		System.out.println(Float.isNaN(Float.NaN)); // True
		System.out.println(Float.isNaN(3.4F)); // False
		
		// System.out.println(2 / 0); // Exception : la division par 0 des nombres entiers est impossible
		System.out.println(2.2 / 0.0); // Infinity => limite d'une division quand le dénominateur tend vers 0 est l'infini
		System.out.println(0.0 / 0.0); // NaN
	}
}

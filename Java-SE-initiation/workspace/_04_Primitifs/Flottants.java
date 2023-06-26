package _04_Primitifs;

public class Flottants {

	public static void main(String[] args) {
		/*
		 * Types numériques flottants
		 * - float : stocké sur 32 bits
		 * - double : stocké sur 64 bits
		 */
		System.out.printf("- %s (%d bits) from %d to %e\n", Float.TYPE, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
		System.out.printf("- %s (%d bits) from %e to %e\n", Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
		System.out.println();
		
		float Myfloat = 3.4f;
		double myDouble = 3.4;
		
		// Notation exponentielle
		
		double myDoubleExp = 3.4e10;
		double myFloatExp = 3.4e10f;
		
		System.out.println("myDoubleExp = " + myDoubleExp);
		
		// Valeurs particuliéres
		System.out.println();
		System.out.println(Double.POSITIVE_INFINITY);
		System.out.println(Double.NEGATIVE_INFINITY);
		System.out.println(Double.NaN); // not a number
		
		// quelques tests sur ces valeurs :
		System.out.println(Float.isFinite(Float.NEGATIVE_INFINITY));// false
		System.out.println(Float.isInfinite(Float.NEGATIVE_INFINITY)); // True
		System.out.println(Float.isNaN(Float.NaN)); // True
		System.out.println(Float.isNaN(3.4F)); // True
		// System.out.println(2 / 0.0); // Exception : la division par 0 des nombres entiers est impossible.
		System.out.println(2.2 / 0.0); // Infinity
		System.out.println(0.0 / 0.0);
	}
}

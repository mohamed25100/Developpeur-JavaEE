package _04_Operateurs;

public class Affectation {

	public static void main(String[] args) {

		int c = 10;
		
		System.out.println("c = " + c); // 10
		System.out.println("Post incrémentation (c++) : " + c++); // 10 ( on affiche et APRES on incrémente)
		System.out.println("Pre incrémentation (++c) : " +  ++c); // 12 'on incrémente et APRES on affiche)
		System.out.println("Post incrémentation (c++) : " + c++); // 12
		System.out.println("c = " + c); // 13

		int a = 0;
		
		System.out.println("a = " + a);
		
		a += 5;
		System.out.println("a = " + a);
		
		a *= 5;
		System.out.println("a = " + a);
		
		a /= 5;
		System.out.println("a = " + a);
		
		a -= 5;
		System.out.println("a = " + a);
	}

}

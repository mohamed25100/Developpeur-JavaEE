package _04_Operateurs;

public class Transtypages {

	public static void main(String[] args) {
		
		// transtypage : changement de type
		
		
		// transtypages (cast) implicites : on convertit un type plus petit (en taille mamoire)
		// vers un type plus grand : pas de rique de perte de données/précision
		byte myByte = 111;
		
		short myShort = myByte;  // Conversion implicite de byte en short
		
		int myInt = myShort;    // Conversion implicite de short en int
		
		long myLong = myInt;    // Conversion implicite de int en long
		
		float myFloat = myLong; // Conversion implicite de long en float
		
		double myDouble = myLong;// Conversion implicite de long en double
		
		
		// cast explicites : conversion d'un type plus grand en type plus petit : 
		// pas la place : rissque de perte de précision
		
		myDouble = 12345678901.123456789;
		
		myFloat = (float)myDouble;
		myLong = (long) myDouble;
		myInt = (int) myLong;
		myShort = (short) myInt;
		myByte = (byte) myShort;
		
		System.out.println(myDouble + " (myDouble)");
		System.out.println(myFloat + " (myFloat)");
		System.out.println(myLong + " (myLong)");
		System.out.println(myInt + " (myInt)");
		System.out.println(myShort + " (myShort)");
		System.out.println(myByte + " (myByte)");
		
		System.out.println("-------------------");
		
		int i3 = 130;
		
		byte b = (byte) i3;
		
		System.out.println(b); // !!! -126 car byte compris entre -128 et 127. Donc 130 est trop grand
		
		// int vs byte
		// 127    127
		// 128    -128
		// 129    -127
		// 130    -126
	}
}


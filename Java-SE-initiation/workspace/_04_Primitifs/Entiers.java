package _04_Primitifs;

public class Entiers {

	public static void main(String[] args) {
		/*
		 * 
		 */
		byte b = 120;
		short s = 32767;
		int i = 2000000000;
		long l = 2_000_000_000_000L;
		
		System.out.println(Byte.MIN_VALUE);
		System.out.printf("- %s (%d bits) from %d to %d\n", Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
		System.out.printf("- %s (%d bits) from %d to %d\n", Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
		System.out.printf("- %s (%d bits) from %d to %d\n", Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
		System.out.printf("- %s (%d bits) from %d to %d\n", Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
		short myBinaryShort = 0b11;// Notation binaire
		short myHexaShort = 0x61; // Notation hexadecimale
	}
}

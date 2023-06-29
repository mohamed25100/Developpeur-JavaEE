package _05_Instructions;

public class PerfLoop {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		int[] tab = { 10, 20, 30, 40, 50 };

		int tot = 0;

		for (int i = 0; i < 100000000; i++) {
			
//			for (int j = 0; j < tab.length; j++) {
//				tot += tab[j];
//			}
			
			for (int item : tab) {
				tot += item;
			}
		}

		long end = System.currentTimeMillis();
		long result = end - start;

		System.out.println(result);
	}
}

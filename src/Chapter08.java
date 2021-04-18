
public class Chapter08 {
	public static void main(String[] args) {
		int num2 = 1;
		while (num2 < 5) {
			int num3 = num2 * num2;
			num2++;
			System.out.println("while01 = " + num3);
		}

		int[] array1 = { 2, 4, 6, 8 };
		for (int number = 1; number <= array1.length; number++) {
			System.out.println("For01 = " + array1[number - 1]);
		}

		int[] array2 = { 34, 65, 78, 89 };
		for (int number : array2) {
			if (number % 2 == 0) {
				continue;
			}
			System.out.println("For02 = " + number);
		}
	}
}

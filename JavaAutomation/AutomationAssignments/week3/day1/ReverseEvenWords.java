package week3.day1;

public class ReverseEvenWords {
	public static void main(String[] args) {
		String test = "I am a software tester";
		String testArray[] = test.split(" ");

		// reversing at even index
		for (int i = 0; i < testArray.length; i++) {
			if (i % 2 == 0) {
				for (int j = testArray[i].length() - 1; j >= 0; j--) {
					System.out.print(testArray[i].charAt(j));
				}
				System.out.print(" ");
			} else {
				System.out.print(testArray[i] + " ");
			}
		}

		// reversing at odd index
		System.out.println("");
		for (int i = 0; i < testArray.length; i++) {
			if (i % 2 != 0) {
				for (int j = testArray[i].length() - 1; j >= 0; j--) {
					System.out.print(testArray[i].charAt(j));
				}
				System.out.print(" ");
			} else {
				System.out.print(testArray[i] + " ");
			}
		}

	}
}

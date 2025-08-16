package week1.day2;

public class FibonacciSeries {
	public static void main(String[] args) {
		int numberOfTerms=8;
		int firstDigit=0;
		int secondDigit=1;
		System.out.println(firstDigit);
		System.out.println(secondDigit);
		
		int nextDigit=0;
		for(int i=1;i<numberOfTerms-1;i++) {
			nextDigit=secondDigit+firstDigit; //3digit is the addition of two preceedingDigits
			firstDigit=secondDigit; //assigning 2nd digit to 1st digit
			secondDigit=nextDigit; //assigning 3rd digit to 2nd digit
			System.out.println(nextDigit);
		}
	}

}

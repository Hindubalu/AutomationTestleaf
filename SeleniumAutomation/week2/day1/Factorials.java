package week2.day1;

public class Factorials {

	public static void main(String[] args) {
		int number=5;
		int fact=1;
		for(int i=number;i>=1;i--) {
			fact=fact*i;
		}
		System.out.println("Factorial of 5: "+ fact);
	}

}

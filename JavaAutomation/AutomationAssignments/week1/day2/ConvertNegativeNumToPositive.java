package week1.day2;

public class ConvertNegativeNumToPositive {
	public static void main(String[] args) {
		int number=-60;
		if(number<0) {
			//System.out.println(number*-1);
			System.out.println("The number "+number+" is converted to "+(number*-1));
		}
		else {
			System.out.println("The number "+number+" is already positive");
		}
	}

}

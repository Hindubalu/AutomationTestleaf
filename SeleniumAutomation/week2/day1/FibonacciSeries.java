package week2.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		int number=8;
		int d1=0;
		int d2=1;
		
		System.out.println(d1);
		System.out.println(d2);
		int d3=0;
		
		for(int i=1;i<number;i++) {
			// 0  1  1  2  3  5  8
			// d1 d2 d3 d4 d5 d6 d7
			d3=d2+d1;
			d1=d2;
			d2=d3;
			
			System.out.println(d3);
		}

	}

}

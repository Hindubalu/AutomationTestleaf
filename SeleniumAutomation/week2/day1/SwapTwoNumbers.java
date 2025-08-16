package week2.day1;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		
		System.out.println("\nWITHOUT USING TEMPORARY VARIABLE\n");
		
		int a=10;
		int b=25;		
		
		System.out.println("Before swapping A value: "+a);
		System.out.println("Before swapping B value: "+b);
		
		a=a+b;
		b=a-b;
		a=a-b;		
		
		System.out.println("\nAfter swapping A value: "+a);
		System.out.println("After swapping B value: "+b);
		
		System.out.println("\nWITH USING TEMPORARY VARIABLE\n");
		
		int a1=29;
		int b1=31;
		int temp=0;
		
		System.out.println("Before swapping A value: "+a1);
		System.out.println("Before swapping B value: "+b1);
		
		temp=a1;
		a1=b1;
		b1=temp;
		
		System.out.println("\nAfter swapping A value: "+a1);
		System.out.println("After swapping B value: "+b1);	
		
		System.out.println("\nAnother Method\n");
		int x=3;
		int y=6;
		System.out.println("Before swapping A value: "+x);
		System.out.println("Before swapping B value: "+y);
		
		x=x+y-(y=x);
		
		System.out.println("\nAfter swapping A value: "+x);
		System.out.println("After swapping B value: "+y);	

	}

}

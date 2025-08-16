package week1.day2;

public class CheckPalindrome {
	public static void main(String[] args) {
		int number=34343;
		int num1=number;
		int temp=0;
		
		while(number>0) {
			int rem=number%10;
			temp=temp*10+rem;
			number/=10;
			}		
		//System.out.println(temp);
			
		if(num1==temp) {
			System.out.println("Palindrome number");
		}
		else {
			System.out.println("Not Palindrome Number");
		}
			
		}
		
	}



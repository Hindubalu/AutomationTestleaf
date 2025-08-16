package week3.day2;

public class Palindrome {
	public static void main(String[] args) {
		String word="madam";
		String rev="";
		for(int i=word.length()-1;i>=0;i--) {
			//System.out.println(word.charAt(i));
			rev=rev+word.charAt(i);
		}
	//	System.out.println(rev);
		
		if(word.equals(rev)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a palindrome");
		}
	}

}

package week1.day2;

public class PrimeNumber {
	
	public static void main(String[] args) {
		int value=13;
		boolean flag=false;
		for(int i=2;i<=value/2;i++) {
			if(value%i==0) {
			    flag=true;
				break;
			}
		}
		if(flag==false) {
			System.out.println("Prime");
		}
		else {
			System.out.println("Not Prime");
		}
	}

}

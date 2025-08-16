package week1.day2;

public class Calculator {

	public static void main(String[] args) {
		Calculator cal=new Calculator();
		System.out.println("\tBASIC CALCULATIONS\n");
		System.out.println("Addition: "+cal.addition(125, 24));		
		System.out.println("Subtraction: "+subtraction(125,24));
		System.out.println("Multiplication: "+ cal.multiplication(125,24));
		System.out.println("Division: "+cal.division(125,24));
		System.out.println("Modulus: "+cal.modulus(125,24));
	}
	
	public int addition(int add1,int add2){
		int addValue=add1+add2;
		return addValue;
	}
	
	public static int subtraction(int sub1,int sub2){
		int subValue=sub1-sub2;
		return subValue;
		
	}
	
	public int multiplication(int mul1,int mul2){
		return mul1*mul2;
		
	}
	public float division(int div1,int div2){
		float divValue=div1/div2;
		return divValue;
	}
	
	public int modulus(int mod1,int mod2) {
		int modValue=mod1%mod2;
		return modValue;
	}

}

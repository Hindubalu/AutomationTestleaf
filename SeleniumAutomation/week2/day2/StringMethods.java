package week2.day2;

public class StringMethods {

	public static void main(String[] args) {
		String myName="Hindumathi";		
		String myName1="Hindu";
		String myName2="Hindumathi";
		
		//length method
		System.out.println("Length of my Name: "+ myName.length());
		
		//.equals() method
		if(myName.equals(myName1)) {
			System.out.println("Values of both variable are equal");
		}
		else {
			System.out.println("Values of both variables are not equal");
		}
		
		//== operator
		if(myName==myName2) {
			System.out.println("Address of both variable are equal");
		}
		else {
			System.out.println("Address of both variable are not equal");
		}
		
		//.toUpperCase
		String uName=myName2.toUpperCase();
		System.out.println("Converting to UpperCase: "+uName);
		
		//.toLowerCase
		String lName=uName.toLowerCase();
		System.out.println("Converting to LowerCase: "+lName);
		
		//.equalsIgnoreCase
		if(myName.equalsIgnoreCase(uName)) {
			System.out.println("Values of the both variables are same irrespective of case");
		}
		
		//.contains
		if(myName.contains(myName1)) {
			System.out.println(myName+" contains "+myName1);
		}
		else {
			System.out.println(myName+" does not contains "+myName1);
		}
		
		//.replace
		System.out.println("Replacing H to h in "+myName2+" : "+myName2.replace('H', 'h'));
		
		//.replaceAll
		System.out.println("Replacing the whole String: "+ myName.replaceAll("Hindumathi", "Harimathi"));
		
		// Reverse a string using charAt() method
		System.out.println("\nReversing(charAt) the String "+myName+" : " );
		for (int i=myName.length()-1; i >= 0; i--) {
			System.out.print(myName.charAt(i));
			
		}
		
		//Reverse a string using toCharArray method
		System.out.println("\nReversing(toCharArray) the String "+myName1+" : ");
		char[] array=myName1.toCharArray();
		for(int j=array.length-1;j>=0;j--) {
			System.out.print(array[j]);			
		}
		
		//Split method
		System.out.println("\nSplitting the Sentence word by word:");
		String stmt="Structured Query Language";
//		String sarr[]=stmt.split(stmt, 3);
//		for(int i=0;i<sarr.length;i++) {
//			System.out.println(sarr[i]);
//		}
		String stmtArray[]=stmt.split(" ");
		for(int i=0;i<stmtArray.length;i++) {
			System.out.println(stmtArray[i]);
			System.out.println(stmtArray[i].length());
		}
	}

}

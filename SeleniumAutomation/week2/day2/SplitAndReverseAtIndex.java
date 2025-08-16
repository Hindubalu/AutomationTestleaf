package week2.day2;

public class SplitAndReverseAtIndex {
	
	public static void main(String[] args) {
		String str="Java is my favourite programming language";
		String arr1[]=str.split(" ");
		System.out.println("Given Sentence: "+str);
		
		// reversing the word in odd index
		System.out.println("\nReversing at Odd index :");
		for(int i=0;i<arr1.length;i++) {
			if(i%2!=0) {
				//System.out.println(i+"th index word: "+arr1[i]);
				//System.out.println(i+"th index word length: "+arr1[i].length());
				for(int j=arr1[i].length()-1;j>=0;j--) {
					System.out.print(arr1[i].charAt(j));
				}
				System.out.print(" ");
			}
			else {
				System.out.print(arr1[i]+" ");
			}
			
		}
		
		// reversing the word in even index
		System.out.println("");
		System.out.println("\nReversing at Even index :");
		for(int i=0;i<arr1.length;i++) {
			if(i%2!=1) {
				for(int j=arr1[i].length()-1;j>=0;j--) {
					//System.out.println(arr1[i]);
					//System.out.println(arr1[i].length());
					System.out.print(arr1[i].charAt(j));
				}
				System.out.print(" ");
			}
			else {
				System.out.print(arr1[i]+" ");
			}
		}
		
		//reversing the whole sentence
		System.out.println("");
		System.out.println("\nReversing the whole sentence: ");
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i));
		}
	}

}

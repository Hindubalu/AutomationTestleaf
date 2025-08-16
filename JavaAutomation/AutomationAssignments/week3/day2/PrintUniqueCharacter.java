package week3.day2;

public class PrintUniqueCharacter {
	public static void main(String[] args) {
		String name="Hindumathi";
		for(int i=0;i<name.length();i++) {
			for(int j=i+1;j<name.length();j++) {
				if(name.charAt(i)==name.charAt(j)) {					
					System.out.println("");
				}
				System.out.print(name.charAt(i));
			}
			
			
		}
	}

}

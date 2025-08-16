package week4.day2;

public class VowelCharacters {
	
	public static void main(String[] args) {
		String name="Hindumathi";
		char array[]=name.toCharArray();
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]=='a' || array[i]=='e' || array[i]=='i' || array[i]=='o' || array[i]=='u') {
			//System.out.println(array[i]);
			count++;
			}
		}
		System.out.println(count);
	}

}

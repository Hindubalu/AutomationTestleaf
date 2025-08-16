package week4.day2;

public class CharaterOccurence {
	public static void main(String[] args) {
		String name="Harimathi";
//		String name1="Harimathi";
//		name1.toCharArray();
		char array[]=name.toCharArray();
		int count=0;
		for(int i=0;i<array.length;i++) {
			if(array[i]=='r') {
				//System.out.println();
				count++;
			}
		}
		System.out.println(count);
	}
}

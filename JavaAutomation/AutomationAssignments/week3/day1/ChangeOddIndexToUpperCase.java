package week3.day1;

import java.util.ArrayList;
import java.util.List;

public class ChangeOddIndexToUpperCase {
	public static void main(String[] args) {
		String test="Changeme";
		
		List<Character> lt=new ArrayList<Character>();			
		char testArray[]=test.toCharArray();			
		for(int i=0;i<testArray.length;i++) {
			lt.add(testArray[i]);			
		}
		System.out.println(lt);
		
		List<Object> ls=new ArrayList<Object>();
		for(int i=0;i<test.length();i++) {
			ls.add(test.charAt(i));
		}
		System.out.println(ls);
			
	}

}

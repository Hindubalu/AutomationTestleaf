package week3.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String text= "We learn java basics as part of java sessions in java week1";
		String textArray[]=text.split(" ");
		List<String> textList=new ArrayList<String>();
		for (int i=0;i<textArray.length;i++) {
			textList.add(textArray[i]);
		}
	    System.out.println(textList);	
	    
	    Set<String> textSet=new LinkedHashSet<String>(textList);
	    System.out.println(textSet);
	    String finalText=textSet.toString();
	    System.out.println(finalText);
	}

}

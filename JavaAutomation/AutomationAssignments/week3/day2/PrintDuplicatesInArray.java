package week3.day2;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		int arr[]= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++) {
			list.add(arr[i]);
		}
		System.out.println(list);
		
		Set<Integer> set=new LinkedHashSet<Integer>(list);
		System.out.println(set);
		
		List<Integer> list1=new ArrayList<Integer>(set);
		System.out.println(list1);
		
		for(int i=0;i<list.size();i++) {
		if(list.get(i)!=list1.get(i)) {
			System.out.println(list.get(i));
		}
}
		
		
	}	
		
	}

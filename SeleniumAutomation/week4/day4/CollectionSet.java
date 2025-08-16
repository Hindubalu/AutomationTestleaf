package week4.day4;

import java.util.HashSet;
import java.util.Set;

public class CollectionSet {
	public static void main(String[] args) {
		Set<Integer> set1=new HashSet<Integer>();
		set1.add(7);
		System.out.println(set1);
		set1.add(14);
		set1.add(7);
		System.out.println(set1);
	}

}

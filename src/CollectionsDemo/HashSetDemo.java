package CollectionsDemo;

import java.util.HashSet;

public class HashSetDemo {

	/*
	 * HashSet:
	 * it internally uses hashing
	 * insertion order is not maintained
	 * Duplicates are not allowed. 
	 */
	
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<>();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(30);
		System.out.println(set);
		
	}
}

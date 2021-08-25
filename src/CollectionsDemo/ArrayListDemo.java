package CollectionsDemo;

import java.util.ArrayList;

public class ArrayListDemo {

	/*
	 * ArrayList:
	 * it  is class implementing List Interface
	 * used to store elements
	 * internally it is same as Array
	 * but with dynamic size
	 * Rules:
	 * 1. Insertion Order is maintained
	 * 2. Duplicates are allowed
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer>  list = new ArrayList<>();
		//adding
		list.add(10);
		list.add(30);
		list.add(40);
		list.add(20);
		list.add(70);
		list.add(70);
		
		System.out.println(list);
		//adding at a specific index
		list.add(2, 101);
		
		//printing entire list
		System.out.println(list);
		
		//removing an element
		list.remove(2);
		System.out.println(list);
		
		//get specific value
		System.out.println(list.get(2));
		
		System.out.println("Size of the List is " +list.size());
		
		ArrayList<Integer> newList = new ArrayList<>();
		newList.add(101);
		newList.add(102);
		newList.add(103);
		
		list.addAll(1, newList);
		System.out.println(list);
		
		list.removeAll(newList);
		System.out.println("After removing the new List elements " + list);
		System.out.println(list.isEmpty());
		//list.clear();
		System.out.println(list.isEmpty());
		
		//Printing all the elements
		for(int i = 0 ; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
		
		ArrayList<String> names = new ArrayList<>();
		names.add("Ajay");
		names.add("Krish");
		names.add("Sujeeta");
		names.add("Anshul");
		System.out.println(names);
		
		//1. how to reverse a list?
		//ip: [2,6,8,1,5] op: [5,1,8,6,2]
		//2. a list contains many zeros, I want all zeros in the start
		//ip[2,0,4,0,0,6] OP [0,0,0,2,4,6]
		//how to sort a list?
		//convert array to arraylist
		//convert arraylist to array
		
	}
}

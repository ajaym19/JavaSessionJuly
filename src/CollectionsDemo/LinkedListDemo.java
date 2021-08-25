package CollectionsDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(103);

		System.out.println(list);
		list.addFirst(501);
		list.addLast(10001);
		
		System.out.println(list);
		list.removeFirst();
		list.removeLast();
		System.out.println(list);
		list.remove(2);
		System.out.println(list);
		//Iterator
		
		System.out.println("Learning Iterator");
		Iterator<Integer> it=  list.iterator();
		//hasnext, next
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Lerning for each");
		for(Integer abc : list) {
			//if 102 is prsent, yes, return
			System.out.println(abc);
		}
	}

}

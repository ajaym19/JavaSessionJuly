package CollectionsDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	/*
	 * We store combination
	 * is of key and value pair
	 * in HashMap we store a pair
	 * a pair consists of key and value
	 * a pair is also called as Bucket or Entry
	 * multiple bucket/entry together is called as EntrySet
	 * 
	 * If you add duplicate key, it will work as Update
	 * if you add duplicate value, it will allow you
	 * null key is allowed, but only once
	 * null value is allowed multiple times
	 */
	
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "Ajay");
		map.put(2, "Murali");
		map.put(3, "Abbas");
		System.out.println(map);
		map.put(3, "new");
		map.put(3, "new123");
		System.out.println(map);
		map.put(null, "Aish");
		System.out.println(map);
		map.put(null, "Aish123");
		System.out.println(map);
		map.put(5, null);
		System.out.println(map);
		map.put(6, null);
		System.out.println(map);
		System.out.println(map.get(2));
		System.out.println(map.keySet());
		map.putIfAbsent(4, "AjayUpdated");
		System.out.println(map);
		
		for(Entry<Integer, String> a : map.entrySet()) {
			System.out.println("Key is " +a.getKey() + " Value is " + a.getValue());
			
		}
		
	}
}

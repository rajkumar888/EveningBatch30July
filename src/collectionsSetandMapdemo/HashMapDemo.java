package collectionsSetandMapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating
																		// HashMap

		map.put(1, "Mango"); // Put elements in Map
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		map.put(4, "Grapes123");
		map.put(1, "Mango123");
		map.put(null, "nulldemo");
		map.put(66, null);
		map.put(77, null);
		map.put(45, "Apple");

		System.out.println(map);
		// System.out.println(map.get(3));
		// System.out.println(map.get(45));

		System.out.println("...................");
		//
		// map.remove(1,"Mango123");
		// map.remove(1111,"Mango123");
		// System.out.println(map);
		// System.out.println("...................");
		// map.replace(2, "Apple", "Ravi");
		// System.out.println(map);

//		for (Map.Entry<Integer, String> m : map.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
//		}
//		System.out.println(".........");
//		for (Map.Entry<Integer, String> m : map.entrySet()) {
//			System.out.println(m.getKey());
//		}
//		//
//		System.out.println(".........");
//		//
//		
//		for (Integer xyz : map.keySet()) {
//			System.out.println(xyz + "  " + map.get(xyz));
//		}
		//
		 System.out.println(".........");
		 map
		 .keySet()
		 .stream()
		 .forEach(el-> System.out.println(el + " "+map.get(el)));
		
		 System.out.println(".........");
		 map
		 .entrySet()
		 .forEach(System.out::println);

	}

}

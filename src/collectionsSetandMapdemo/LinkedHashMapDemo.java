package collectionsSetandMapdemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();// Creating

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
		
//		Map<String, List<String>> map1 = new HashMap<String, List<String>>();
		
	}

}

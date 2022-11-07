package collectionsSetandMapdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapCharCountDemo {

	public static void main(String[] args) {

		String str = "ramakoteswararao";

		Map<Character, Integer> charCounter = new HashMap<Character, Integer>();

		// for (char i : str.toCharArray()) {
		// charCounter.put(i, charCounter.get(i) == null ? 1 :
		// charCounter.get(i) + 1);
		// }

		// System.out.println(charCounter);

		// for(int i=0;i<str.length();i++)
		// {
		// if(charCounter.containsKey(str.charAt(i))){
		// charCounter.put(str.charAt(i), charCounter.get(str.charAt(i))+1);
		// }else{
		// charCounter.put(str.charAt(i), 1);
		// }
		// }
		//
		// System.out.println(charCounter);

		for (char ch : str.toCharArray()) {
			if (charCounter.containsKey(ch)) {
				charCounter.put(ch, charCounter.get(ch) + 1);
			} else {
				charCounter.put(ch, 1);
			}
		}
		System.out.println(charCounter);
	}

}

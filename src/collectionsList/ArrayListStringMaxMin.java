package collectionsList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListStringMaxMin {

	public static void main(String[] args) {
		ArrayList<String> arrString1 = new ArrayList<String>();

		arrString1.add("AAA");
		arrString1.add("TTT");
		arrString1.add("ZZZ");
		arrString1.add("ZAR");
		arrString1.add("PPP");
		
		
		System.out.println(Collections.max(arrString1));
		System.out.println(Collections.min(arrString1));

//		ArrayList<String> arrString2 = new ArrayList<String>();
//
//		arrString2.add("str1");
//		arrString2.add("str2");
//		arrString2.add("str3");
//		arrString2.add("str4");
//		arrString2.add("str5");
	}

}

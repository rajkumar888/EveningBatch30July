package comparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DeveloperNormalSorting {

	public static void main(String[] args) {

		
		
		ArrayList<Developer> result = new ArrayList<Developer>();

		result.add(new Developer("mkyong", 8000, 33));
		result.add(new Developer("alvin", 9000, 20));
		result.add(new Developer("jason", 1000, 10));
		result.add(new Developer("iris", 5000, 55));
		
		System.out.println("Before Sort");
		
		for (Developer developer : result) {
			 System.out.println(developer.getName() + " " + developer.getSalary()+ " " + developer.getAge());
		}
		
//		Collections.sort(result);
		
		
		
	}
	

}

package comparatordemo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReversedCompareing {

	
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(new Employee(101, "Vijay", 23));
		al.add(new Employee(106, "Ajay", 27));
		al.add(new Employee(105, "Jai", 21));
		al.add(new Employee(100, "Rai", 24));
		
		
		Collections.sort(al, Comparator.comparing(Employee::getName));

		for (Employee st : al) {
			System.out.println(st.empno + " " + st.name + " " + st.age);
		}
	    
		System.out.println(".....reversed..");
		
	    Collections.sort(al, Comparator.comparing(Employee::getName).reversed());
	    
	    for (Employee st : al) {
			System.out.println(st.empno + " " + st.name + " " + st.age);
		}
		
	}
	
	
}

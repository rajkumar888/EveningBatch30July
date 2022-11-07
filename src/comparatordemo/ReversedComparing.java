package comparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ReversedComparing {

	
	public static void main(String[] args) {
		
		ArrayList<Employee> al = new ArrayList<Employee>();

		al.add(new Employee(101, "Vijay", 23,1.1));
		al.add(new Employee(106, "Ajay", 27,1.2));
		al.add(new Employee(105, "Jai", 21,1.5));
		al.add(new Employee(100, "Rai", 24,1.3));
		
		System.out.println("Before sorting............");
		for (Employee st : al) {
			System.out.println(st.getEmpno() + " " + st.getName() + " " + st.getAge()+ " " + st.getRating());
		}
		
		Collections.sort(al, Comparator.comparing(Employee::getName));

		System.out.println("after sorting............on name");
		for (Employee st : al) {
			System.out.println(st.getEmpno() + " " + st.getName() + " " + st.getAge()+ " " + st.getRating());
		}
		
		Collections.sort(al, Comparator.comparing(Employee::getEmpno));

		System.out.println("after sorting............on Empno");
		for (Employee st : al) {
			System.out.println(st.getEmpno() + " " + st.getName() + " " + st.getAge()+ " " + st.getRating());
		}
		
		Collections.sort(al, Comparator.comparing(Employee::getAge));

		System.out.println("after sorting............on Age");
		for (Employee st : al) {
			System.out.println(st.getEmpno() + " " + st.getName() + " " + st.getAge()+ " " + st.getRating());
		}
		
		Collections.sort(al, Comparator.comparing(Employee::getRating));

		System.out.println("after sorting............on Rating");
		for (Employee st : al) {
			System.out.println(st.getEmpno() + " " + st.getName() + " " + st.getAge()+ " " + st.getRating());
		}
		
		
////	    
//		System.out.println("name wise .....reversed..");
////		
//	    Collections.sort(al, Comparator.comparing(Employee::getName).reversed());
////	    
//	    for (Employee st : al) {
//			System.out.println(st.getEmpno() + " " + st.getName() + " " + st.getAge());
//		}
//	    
//	    System.out.println("age wise .....reversed..");
//	    Collections.sort(al, Comparator.comparing(Employee::getAge).reversed());
//	    for (Employee st : al) {
//			System.out.println(st.getEmpno() + " " + st.getName() + " " + st.getAge());
//		}

		
//		Collections.sort(al, Comparator.comparing(Employee::getEmpno));
//		
//		System.out.println("after Sorting......");
//	    for (Employee st : al) {
//			System.out.println(st.getEmpno() + " " + st.getName() + " " + st.getAge());
//		}
//	    
//		System.out.println(".....reversed..");
//		
//	    Collections.sort(al, Comparator.comparing(Employee::getEmpno).reversed());
//	    
//	    for (Employee st : al) {
//			System.out.println(st.getEmpno() + " " + st.getName() + " " + st.getAge());
//		}
	    
	}
	
	
}

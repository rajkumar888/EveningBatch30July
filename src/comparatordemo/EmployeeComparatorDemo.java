package comparatordemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeComparatorDemo {

	public static void main(String[] args) {

		ArrayList<Employee> result = new ArrayList<Employee>();

		result.add(new Employee(1001, "Jac1", 35));
		result.add(new Employee(1012, "Jac4", 28));
		result.add(new Employee(1035, "Jac3", 40));
		result.add(new Employee(1021, "Jac2", 34));

		System.out.println("Before Sort");

		for (Employee emp : result) {
			System.out.println(emp.getName() + " " + emp.getEmpno() + " " + emp.getAge());
		}

//		Collections.sort(result, new Comparator<Employee>() {
//			public int compare(Employee o1, Employee o2) {
//				return o1.getAge() - o2.getAge();
//			}
//		});
//
//		System.out.println("After Sort");
//
//		for (Employee emp : result) {
//			System.out.println(emp.getName() + " " + emp.getEmpno() + " " + emp.getAge());
//		}
//
//		Collections.sort(result, new Comparator<Employee>() {
//			public int compare(Employee e1, Employee e2) {
//				return e1.getName().compareTo(e2.getName());
//			}
//		});
//		System.out.println("After Sort on name.............");
//
//		for (Employee emp : result) {
//			System.out.println(emp.getName() + " " + emp.getEmpno() + " " + emp.getAge());
//		}
//		
//		
//		Collections.sort(result, new Comparator<Employee>() {
//			public int compare(Employee e1, Employee e2) {
//				return e1.getEmpno() - e2.getEmpno();
//			}
//		});
//		
//		System.out.println("After Sort on emp number.............");
//
//		for (Employee emp : result) {
//			System.out.println(emp.getName() + " " + emp.getEmpno() + " " + emp.getAge());
//		}
		
		
		Collections.sort(result,new AgeComparator());  
		
		System.out.println("After Sort on emp age.............");

		for (Employee emp : result) {
			System.out.println(emp.getName() + " " + emp.getEmpno() + " " + emp.getAge());
		}
		
		
		Collections.sort(result,new NameComparator());  
		
		System.out.println("After Sort on emp name.............");

		for (Employee emp : result) {
			System.out.println(emp.getName() + " " + emp.getEmpno() + " " + emp.getAge());
		}

//		EmpNoComparator
		
		
		Collections.sort(result,new EmpNoComparator());  
		
		System.out.println("After Sort on emp number.............");

		for (Employee emp : result) {
			System.out.println(emp.getName() + " " + emp.getEmpno() + " " + emp.getAge());
		}
	}

}

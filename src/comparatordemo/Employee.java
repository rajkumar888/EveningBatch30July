package comparatordemo;

import java.util.Comparator;

public class Employee {
	private int empno;
	private String name;
	private int age;
	private double rating;
	

	public int getEmpno() {
		return empno;
	}
	
	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Employee(int empno, String name, int age) {
		this.empno = empno;
		this.name = name;
		this.age = age;
	}
	
	public Employee(int empno, String name, int age, double rating) {
		this.empno = empno;
		this.name = name;
		this.age = age;
		this.rating = rating;
	}

	public Employee() {

	}
}

class AgeComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		return e1.getAge() - e2.getAge();
	}
}

class NameComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		return e1.getName().compareTo(e2.getName());
	}
}

class EmpNoComparator implements Comparator<Employee> {

	public int compare(Employee e1, Employee e2) {
		return e1.getEmpno()- e2.getEmpno();
	}
}
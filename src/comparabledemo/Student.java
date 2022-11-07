package comparabledemo;

public class Student implements Comparable<Student> {
	int rollno;
	String name;
	int age;

	public Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	public Student(){
		
	}

	
//	public int compareTo(Student st) {
//		if (rollno == st.rollno)
//			return 0;
//		else if (rollno > st.rollno)
//			return 1;
//		else
//			return -1;
		
//		return this.rollno - st.rollno;
//	}
	
	
	

//	public int compareTo(Student st) {
//		return st.name.compareTo(this.name);
//	}
	
	
	public int compareTo(Student st) {
//		if (age == st.age)
//			return 0;
//		else if (age > st.age)
//			return 1;
//		else
//			return -1;
		
		return st.age - this.age;
	}
}
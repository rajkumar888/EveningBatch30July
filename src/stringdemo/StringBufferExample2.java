package stringdemo;

public class StringBufferExample2 {
	
	public static void main(String args[]) {
		
		StringBuffer sb = new StringBuffer("HelloWorld");
		
//		sb.insert(1, "Java");// now original string is changed
//		System.out.println(sb);// prints HJavaello
		
		System.out.println(sb);
		sb.replace(1,3,"tttttt");  
		System.out.println(sb);//prints 
		
		System.out.println(".............");
		sb.delete(1,8);  
		System.out.println(sb);//prints
	}
}
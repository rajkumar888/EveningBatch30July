package stringdemo;

public class StringDemoImp {

	public static void main(String[] args) {
		
		
		
		String str1=new String("Hello");	// two objects created
		
		String str2=new String("Hello");	// one objects created
		
		
		System.out.println(str1.equals(str2)); // value comparison
		
		System.out.println(str1==str2);  // address comparison heap
		System.out.println(str1.intern()==str2.intern());  // csp
		
		System.out.println(".........");
//		
//		
		String str5 = "Welcome"; //csp	
		String str6 = "Welcome";
		
		System.out.println(str5==str6); 
		System.out.println(str1==str2); 
			System.out.println(".........");
		System.out.println(str5.intern()==str6.intern());
		System.out.println(str1.intern()==str2.intern());
////		
		char[] ch = {'j','a','v','a','p','o','i','n','t'};
//				
		String s = new String(ch);
//		
		System.out.println(s);
		System.out.println(".........");
//		
		String str111 = "abc";
		System.out.println(str111);
//		
		str111="Hello";
		System.out.println(str111);
//		
		str111="Hello"+"World";
		System.out.println(str111);
		
		String str222=str111.concat("test");
		System.out.println(str111);
		System.out.println(str222);
		

	}

}

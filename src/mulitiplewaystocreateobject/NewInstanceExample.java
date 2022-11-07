package mulitiplewaystocreateobject;

public class NewInstanceExample {
	String str = "hello";
	
	public NewInstanceExample(){
		System.out.println("consturctor is called.....");
	}
	

	public static void main(String args[]) throws InstantiationException, IllegalAccessException {
		
		
		NewInstanceExample obj = NewInstanceExample.class.newInstance();
		System.out.println(obj.str);
		
		
//		try {
//			NewInstanceExample obj = NewInstanceExample.class.newInstance();
//			System.out.println(obj.str);
//			
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
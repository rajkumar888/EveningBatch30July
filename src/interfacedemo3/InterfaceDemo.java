package interfacedemo3;

public interface InterfaceDemo{
	
	public static final int x=102;			// public final static
	
	


	public abstract void display();
	
	public abstract void show();
	
	
//	public static void main(String[] args) {
//	System.out.println("inside interface main method");
//}
	
	
	public static void statictest(){
		System.out.println("inside interface static method");
	}
	
	public default void defaultdemo(){
		System.out.println("inside interface default method");
	}
	
	
	
}

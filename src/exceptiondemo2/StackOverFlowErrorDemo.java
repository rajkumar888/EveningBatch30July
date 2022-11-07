package exceptiondemo2;

public class StackOverFlowErrorDemo {
	
	StackOverFlowErrorDemo(){
		System.out.println("constructor is called....");
	}

	static int i=1;
	
	void show(){
		System.out.println(i++);
		show();
	}
	
	
	public static void main(String[] args) throws InterruptedException  {
		
//		StackOverFlowErrorDemo obj = new StackOverFlowErrorDemo();
		
//		obj.show();
		
		int i=1;
		while(true){
			new StackOverFlowErrorDemo();
			System.out.println(i++);
		}
	}

}

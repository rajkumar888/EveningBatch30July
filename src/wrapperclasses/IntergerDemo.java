package wrapperclasses;

import java.util.Random;

public class IntergerDemo {

//	static int i = Integer.intValue();
	
	public static void main(String[] args) {

		Integer i = new Integer(100);
		
//		int i1 = i.intValue();
		
//		int i1 = i;  // unboxing
//		
//		
//		System.out.println(i1);
//		
//		System.out.println(i);
//		
//		Integer i2=105;		// autoboxing
//		
//		int abc=555;
//		
//		Integer i3=abc; // autoboxing
//		
//		System.out.println(i3);
//		
////	
//		System.out.println((int)(Math.random()*10)); 
		
//		for(i=1;i<100;i++)
//		System.out.println(new Random().nextInt(100));
		
//		
		int min = 1;  
		int max = 100;  
//		double a = Math.random()*(max-min+1)+min;   
//		System.out.println(a); 
//		
		
//		int b = (int)(Math.random()*(max-min+1)+min);  
//		System.out.println(b);  
//		
		System.out.println("......................");
		
		for(int x=1;x<=10;x++){
			
			System.out.println(new Random().nextInt(100));
			System.out.println(new Random().nextDouble());
		}
//		
		
	}

}

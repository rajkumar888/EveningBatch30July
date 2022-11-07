package collectionsList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Vector;

public class CollectionsListMethodDemo {

	public static void main(String[] args) {
		  
        Vector<Integer> v = new Vector<Integer>();  
        v.add(5); 
        v.add(1);         
        v.add(2);  
        v.add(3);  
        v.add(4);  
      
//        Enumeration<Integer> en = v.elements();  
        
//        while(en.hasMoreElements()){
//        	System.out.println(en.nextElement());
//        }
        
        
//        ArrayList<Integer> arrlist = Collections.list(v.elements());  
        
        
//        System.out.println("Value of returned list: "+arrlist); 
        
        System.out.println(Collections.list(v.elements()));

	}
	
	

}

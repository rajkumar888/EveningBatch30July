package collectionsList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinListDemo2 {

	public static void main(String[] args) {
		 LinkedList<String> ll=new LinkedList<String>();  
         ll.add("Ravi");  
         ll.add("Vijay");  
         ll.add("Ajay");  
         ll.add("Anuj");  
         ll.add("Gaurav");  
         ll.add("Harsh");  
         ll.add("Virat");  
         ll.add("Gaurav");  
         ll.add("Harsh");  
         ll.add("Amit");  
         System.out.println(ll);
         
         LinkedList<String> ll2=new LinkedList<String>(ll);  
         System.out.println(ll2);
         
         LinkedList<String> ll3=new LinkedList<String>(); 
         ll3.add("AAAAAA");
         
         ll3.addAll(ll2);
         
         System.out.println(ll3);
         
         Iterator<String>i=ll3.descendingIterator();  
         while(i.hasNext())  
         {  
             System.out.print(i.next()+" ");  
         }  
         
         
	}

}

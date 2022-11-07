package comparatordemo;

import java.util.Collections;
import java.util.LinkedList;

public class CollectionsReverseOrderExample1 {  
    public static void main(String[] args) {  
    	
    	
        //Create linked list object  
          LinkedList<Integer> list = new LinkedList<Integer>();  
          //Add values in the list  
          list.add(10);  
          list.add(-20);  
          list.add(50);  
          list.add(90);  
          list.add(-15);  
          //Sort the list and return comparator for reverse order
          System.out.println(list);
          
          Collections.sort(list);
          System.out.println(list);
          
          Collections.reverse(list);
          
//          Collections.sort(list, Collections.reverseOrder());    
          
          System.out.println(list);  
          }  
}  

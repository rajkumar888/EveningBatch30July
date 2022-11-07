package collectionsSetandMapdemo;

import java.util.Hashtable;
import java.util.Map;

public class Hashtable1{  
	 public static void main(String args[]){  
		 
	  Hashtable<Integer,String> hm=new Hashtable<Integer,String>();  
	  
	  hm.put(100,"Amit");  
	  hm.put(102,"Ravi");  
	  hm.put(101,"Vijay");  
	  hm.put(103,"Rahul"); 
	  hm.put(99,"Rahul111"); 
//	  hm.put(null,"Rahul111"); 
//	  hm.put(9999,null); 
	  
//	  System.out.println(hm);
	  
//	  for(Map.Entry<Integer,String> m :hm.entrySet()){  
//	   System.out.println(m.getKey()+" "+m.getValue());  
//	  }  
	  
	  
	  for(Integer m :hm.keySet()){
//		   System.out.println(m + " "+hm.get(m)); 
		  System.out.println(m);
		  } 
	  
//	  System.out.println(hm);
	//	  hm.remove(99);
	//	  System.out.println("................");
	////	  System.out.println(hm);
	////	  System.out.println("................");
	//	  hm.remove(103,"Rahul");
	//	  System.out.println(hm);
//	  
//	  hm.remove(102,"Rahu4r543354l");
//	  System.out.println(hm);
	  
	  
//	  for(Map.Entry<Integer,String> m :hm.entrySet()){  
//	   System.out.println(m.getKey()+" "+m.getValue());  
//	  }  
	  
	  System.out.println("End of the program.....");
	  
	 }  
	}  
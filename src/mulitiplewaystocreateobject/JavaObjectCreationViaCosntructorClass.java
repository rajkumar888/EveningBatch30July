package mulitiplewaystocreateobject;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class JavaObjectCreationViaCosntructorClass  
{  
String str="hello";  

public JavaObjectCreationViaCosntructorClass(){
	System.out.println("consturctor is called.....");
}



public static void main(String args[]) throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException  
{ 


Constructor <JavaObjectCreationViaCosntructorClass> obj =JavaObjectCreationViaCosntructorClass.class.getConstructor();  
JavaObjectCreationViaCosntructorClass obj1 = obj.newInstance();  
System.out.println(obj1.str); 
	
//try  
//{  
//Constructor<NewInstanceExample1> obj =NewInstanceExample1.class.getConstructor();  
//NewInstanceExample1 obj1 = obj.newInstance();  
//System.out.println(obj1.str);  
//}  
//catch(Exception e)  
//{  
//e.printStackTrace();  
//}  
}  
} 
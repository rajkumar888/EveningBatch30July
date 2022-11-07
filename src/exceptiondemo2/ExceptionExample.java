package exceptiondemo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ExceptionExample {

    public FileInputStream testMethod1() throws IOException{
    	
        File file = new File("test.txt");
        
        FileInputStream fileInputStream = null;
        
        
            fileInputStream = new FileInputStream(file);
            fileInputStream.read();
       
        
        
        return fileInputStream;
    }

    public static void main(String[] args) throws IOException{
        ExceptionExample instance1 = new ExceptionExample();
        instance1.testMethod1();
    }
}

package exceptiondemo2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ThrowsDemo
{
    public static void main(String[] args) throws InterruptedException, FileNotFoundException,IOException,NullPointerException, RuntimeException
    {
        Thread.sleep(2000);
        System.out.println("Hello Geeks");
        
        File newFile = new File("test.txt");
		FileInputStream stream = new FileInputStream(newFile);
		
		String s11 = "EDUCBA EDUCBA!!!";
		Scanner scanner11 = new Scanner(s11);
		
		
		
		System.out.println("end of program....");
    }
//throws InterruptedException, IOException, FileNotFoundException,  NullPointerException, RuntimeException
}


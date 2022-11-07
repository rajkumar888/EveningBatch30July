package exceptiondemo2;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Child extends Parent {

	public void m1()  throws RuntimeException{

		System.out.println("inside child m1");
	}

	public void m2() throws NullPointerException{

		System.out.println("inside child m2");
	}
}

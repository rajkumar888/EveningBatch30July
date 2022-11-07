package exceptiondemo2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ParseExecptionHandleDemo {

	public static void main(String[] args) throws ParseException, InterruptedException {

//		String date="Sat Jun 01 12:53:10 IST 2013";
//		
//	    SimpleDateFormat sdf=new SimpleDateFormat("MMM d, yyyy HH:mm:ss");
//	     Date currentdate=sdf.parse(date);
//	    System.out.println(currentdate);
		
		
		String inputdate = "03/09/2022";

		Date output = new SimpleDateFormat("dd/MM/yyyy").parse(inputdate);
//		
		System.out.println(output);

		String resultdate = new SimpleDateFormat("yyyy/MM/dd").format(new Date());

		System.out.println(resultdate);
		
//		Thread.sleep(1000);
//		
//		
		System.out.println("............................");

//		SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
//
//		System.out.println(formatter.format(new Date()));
		
		System.out.println(new SimpleDateFormat("MMM/dd/yyyy").format(new Date()));
		
		System.out.println("End of the program");
	}

}

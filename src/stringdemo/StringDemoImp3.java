package stringdemo;

public class StringDemoImp3 {

	public static void main(String[] args) {
		
		
		
		String str1=new String("Hello World Java Learning");
		
		String str2=str1.toUpperCase();
		System.out.println(str1);
		System.out.println(str2);
		
//		
		System.out.println(str1.length());
//		
		System.out.println(str1.charAt(str1.length()-1));
		System.out.println(str1.charAt(str1.length()-str1.length()));
		System.out.println(str1.charAt(str1.length()/2));
//		
		for(int i=0; i<str1.length(); i++){
			System.out.print(str1.charAt(i));
		}
//		
		System.out.println("\n...............");
		for(int i=str1.length()-1; i>=0 ; i--){
			System.out.print(str1.charAt(i));
		}
//		
		System.out.println("\n......................");

		System.out.println(str1.substring(str1.length()/2,str1.length()));
//		
		System.out.println(str1.substring(10,11));
//		
		System.out.println(str1.indexOf('o'));
		System.out.println(str1.indexOf('o',5));
		System.out.println(str1.indexOf("World"));
		System.out.println(str1.indexOf("1111111"));
//		
//		
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
//		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
//		
		System.out.println(str1.contains("World"));
		System.out.println(str1.contains("WOrld".toLowerCase()));
//		
		String str888="           ***** H              ";
		String str999="I";
		System.out.println("...................");
		System.out.println(str888.compareTo(str888));
		System.out.println(str999.compareTo(str888));
		System.out.println(str888.compareTo(str999));
		
		System.out.println("...................");
		System.out.println(str888.length());
//		
		String str000=str888.trim();
		System.out.println("...................");
		System.out.println(str888.length());
		System.out.println(str000.length());
		System.out.println(str000);
		System.out.println(str888);
//		
//		
		System.out.println("He    llo    Wo   rld".replace(' ','*'));
//		
//		
		String replacedemo="Hello world Java Hello world Java 1234$%";
//		
		
		System.out.println(".....\n..dADF\tDFF............");
		System.out.println(replacedemo.replaceAll("\\d", ""));
		System.out.println(replacedemo.replaceAll("\\D", ""));
		System.out.println(replacedemo.replaceAll("\\W", ""));
		System.out.println(replacedemo.replaceAll("Hello", ""));
//
		System.out.println(str888.replaceAll("\\s", ""));
		System.out.println(replacedemo.replaceAll("\\S", ""));
//		
		System.out.println("..................");
//		
		String xyz="";
		String xyz1=null;
//		
		System.out.println(xyz.isEmpty());
		System.out.println(xyz.length());
//		System.out.println(xyz1.length());
		
		Object obj=null;
		System.out.println(obj.toString());
		
		
		
	}

}

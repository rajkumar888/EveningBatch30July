package finalclassdemo;

public final class FinalClassA {
	
	
	int x=100;
	
	final static int y;
	
	final int z;
	
	static {
		y=500;
	}
	
//	{
//		z=400;
//	}
	
	
	
	FinalClassA(){
		System.out.println("Constructor called....");
		z=400;
	}


	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}
	
	
 public static void main(String[] args) {
		System.out.println(y);
		
//		y=500;
		
		final int abc=100;
		System.out.println(abc);
		final FinalClassA fca = new FinalClassA();
		System.out.println(fca.z);
		fca.x=777;
		
//		fca = new FinalClassA();		// not allowed due to final object reference
		
		
		
		
		
		
	}

}

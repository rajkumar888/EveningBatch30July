package comparatordemo;

public class AnonymousThreadClass {
	public static void main(String[] args) {
		
		// Anonymous Inner class that extends Thread class
		
		Thread t = new Thread() {
			public void run() {
				System.out.println("Child!");
			}
		};
		
		t.start();
		System.out.println("Parent!");
	}
}
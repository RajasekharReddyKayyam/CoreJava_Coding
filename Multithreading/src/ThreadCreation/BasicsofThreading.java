package ThreadCreation;

public class BasicsofThreading {
	public static void main(String[] args) {
		Thread t= new Thread (new Runnable() {
			public void run() {
				System.out.println(" we are in first thread ");
				
			}
		});
		System.out.println(Thread.currentThread().getName()+"Before Starting the Thread");
		
		System.out.println(Thread.currentThread().getName()+"After Starting the thread ");
		t.start();
	}

}

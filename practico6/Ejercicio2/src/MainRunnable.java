
public class MainRunnable {

	public static void main(String[] args) {
		IncrementarRunnable iR =new IncrementarRunnable();
		
		Thread t1= new Thread(iR);
		Thread t2= new Thread(iR);
		Thread t3= new Thread(iR);
		Thread t4= new Thread(iR);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}

}

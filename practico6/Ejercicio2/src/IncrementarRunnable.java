
public class IncrementarRunnable implements Runnable {

	private Integer num=0;
	
	@Override
	public synchronized void run() {
		while (num<5000) {
			num++;
			System.out.println("numero "+num);
		}
		
	}

}


public class Main2 {

	public static void main(String[] args) {
new Thread(new HolaMundoRunnable("thread-1")).start();
new Thread(new HolaMundoRunnable("thread-2")).start();
new Thread(new HolaMundoRunnable("thread-3")).start();
new Thread(new HolaMundoRunnable("thread-4")).start();
new Thread(new HolaMundoRunnable("thread-5")).start();


	}

}

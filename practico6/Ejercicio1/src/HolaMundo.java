public class HolaMundo extends Thread{

	@Override
	public  void run() {

		try {
			//Se duerme 2 segundos	
			
			String[] dato= getName().split("-");
			Integer tiempo = Integer.valueOf(dato[1])*1000;
			Thread.sleep(tiempo);

			System.out.println("hola mundo"+ this.getName());
		} catch (InterruptedException e) {
		}
	}
}

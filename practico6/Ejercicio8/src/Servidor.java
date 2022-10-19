import java.util.LinkedList;

public class Servidor {
	private LinkedList<PaqueteDatos> colaPaquetes;

	public synchronized void almacenar(PaqueteDatos unPaquete) {
		while(colaPaquetes.size()>3) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		if(unPaquete != null) {
			System.out.println("Almaceno: "+ unPaquete.toString());
		}
			colaPaquetes.add(unPaquete);
			notifyAll();				
	}
	
	
	public synchronized PaqueteDatos consultar() {
		
		while(colaPaquetes.size()==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			PaqueteDatos unPaquete= colaPaquetes.removeFirst();
			if(unPaquete != null) {
				System.out.println("remuevo: "+ unPaquete.toString());
			}
			notifyAll();
		
		
		return unPaquete;
	}
}

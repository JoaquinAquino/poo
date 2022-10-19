import java.util.LinkedList;

public class Servidor {
	private LinkedList<PaqueteDatos> colaPaquetes= new LinkedList<PaqueteDatos>();

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
			colaPaquetes.add(unPaquete);// se manda un null para q se corte
			notifyAll();				
	}
	
	
	public synchronized PaqueteDatos consultar() {
		
		while(colaPaquetes.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
			PaqueteDatos Paquete= colaPaquetes.removeFirst();
			if(Paquete != null) {
				System.out.println("remuevo: "+ Paquete.toString());
			}
			notifyAll();
		
		
		return Paquete;
	}
}

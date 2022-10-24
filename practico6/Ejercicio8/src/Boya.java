import java.util.Iterator;
import java.util.Random;

public class Boya implements Runnable {
	
private String nombre;
private Servidor servidor;
private Termometro termometro;
private Anemometro anemometro;


public Boya(String nombre, Servidor servidor) {
	super();
	this.nombre = nombre;
	this.servidor = servidor;
	this.termometro = new Termometro();
	this.anemometro = new Anemometro();
}


public void run() {
	for (int i = 0; i < 5; i++) {
			try {
				enviar(generarPaquete());
			} catch (ErrorComunicacion e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
				
	}
	this.servidor.almacenar(null);
	System.out.println("finaliza boya");
}


	public void enviar(PaqueteDatos paquete)  {
    try {
		Thread.sleep(2000);
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    servidor.almacenar(paquete);
 //ver si funciona
}



public PaqueteDatos generarPaquete() throws ErrorComunicacion  {	
	if( new Random().nextInt(10)<=4) {
		throw new ErrorComunicacion("ERROR:"+ nombre +"Hubo una falla en la comunicación, se perdió el paquete");
	
	}
	return new PaqueteDatos(nombre,termometro.sensar(),anemometro.sensar(),System.currentTimeMillis());
}
}

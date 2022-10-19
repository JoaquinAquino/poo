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

@Override
public void run() {
	for (int i = 0; i < 5; i++) {
		try {
			enviar(generarPaquete());
		}catch(ErrorComunicacion e ){
			System.out.println("ERROR:"+ nombre +"Hubo una falla en la comunicación, se perdió el paquete");	
		}

	}

}

public void enviar(PaqueteDatos paquete) throws ErrorComunicacion {
	if( new Random().nextInt(100)<40) {
		throw new ErrorComunicacion();
	}
	servidor.almacenar(paquete);
}

public PaqueteDatos generarPaquete() {
	return new PaqueteDatos(nombre,termometro.sensar(),anemometro.sensar(),System.currentTimeMillis());
	}

}

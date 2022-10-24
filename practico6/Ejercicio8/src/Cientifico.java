import java.util.LinkedList;
//buffer
public class Cientifico implements Runnable {
private Servidor servidor;
private LinkedList<PaqueteDatos> colaPaquetes=new LinkedList<PaqueteDatos>();

public Cientifico(Servidor servidor) {
	super();
	this.servidor = servidor;
}

private void promediar (String nombreBoya, String tipoDato) {
	
}
//para q un hilo espere a otro join


public void run() {
	Integer cont=0;
	while(cont<2) {//menor a dos xq hay dos boyas
		PaqueteDatos paquete= servidor.consultar();
		if (paquete== null){
			cont++;
		}else {
			colaPaquetes.add(paquete);
		}
	}

}


}


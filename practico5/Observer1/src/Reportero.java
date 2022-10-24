// subscriptor

public class Reportero implements Observer {


	@Override
	public void actualizar() {
	System.out.println("el clima se cambio ");
	//al cambiarse el clima al decir el clima cambio tambien debe decir cual es el clima con el que se cambio?
	// o esta bien que se imprima el nuevo estado del clima en la clase sistemameteorologico.	
	}


}

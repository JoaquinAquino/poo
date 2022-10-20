package ejercicioConsumior;

import java.util.LinkedList;

public class Pedidos {

	private LinkedList<Plato> platos = new LinkedList<Plato>();

	public synchronized void ingresar(Plato plato) {
		while(this.platos.size()>3) { 
          try {//si tiene mas de 3 platos espera, buffer de 3 platos
    
			wait();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
          
		}
		if(plato!= null) {
			System.out.println("se cocino "+ plato);
			}
		this.platos.add(plato);
		notifyAll();// le avisa al de abajo q tiene platos
	}
	
	public synchronized Plato Servir() {
		while(platos.isEmpty()) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		Plato plato= platos.removeFirst();
		if(plato!= null) {
			System.out.println("se sirvio "+ plato);
			}	
		notifyAll();//le avisa al de arriba q tiene espacio
		return plato;
		
	}
}

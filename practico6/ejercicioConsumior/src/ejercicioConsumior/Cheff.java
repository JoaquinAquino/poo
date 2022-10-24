package ejercicioConsumior;

import java.util.Random;

public class Cheff implements Runnable{

	private Pedidos pedidos;

	public Cheff(Pedidos pedidos) {// se manda como parametro ya que todos comparten el mismo servidor
		super();
		this.pedidos = pedidos;
	}

	@Override
	public void run(){

		for(int i=0;i<5;i++) {//el cheff hace 5 platos
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Plato plato= new Plato(new Random().nextInt(95)+5,"plato"+i);
//			if(new Random().nextInt(10)<=4) {
//				throw new CaerPlatos("se ha caido un plato");
//			}			
			this.pedidos.ingresar(plato);
			
		}
		pedidos.ingresar(null); // ser 
	}
	
	

}

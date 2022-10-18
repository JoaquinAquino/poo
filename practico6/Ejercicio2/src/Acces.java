
public class Acces extends Thread{
	
	private Incrementar incrementar;
	
	public Acces(Incrementar incrementar) {
		super();
		this.incrementar = incrementar;
	}

	public synchronized  void  run(){	
		while(incrementar.getNumero()<5000) {
	    incrementar.incrementar();
		System.out.println("numero es "+incrementar.getNumero());}
	}
}

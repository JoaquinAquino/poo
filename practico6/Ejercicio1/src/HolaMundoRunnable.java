
public class HolaMundoRunnable implements Runnable{
private String nombre;

	public HolaMundoRunnable(String nombre) {
	super();
	this.nombre = nombre;
}

	@Override
	public void run() {

	
	try {
		String[] dato= this.nombre.split("-");
		Integer tiempo = Integer.valueOf(dato[1])*1000;
		Thread.sleep(tiempo);
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
		
    System.out.println("hola mundo"+this.nombre);		
	}

}

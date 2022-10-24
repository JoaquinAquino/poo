
public class SistemaMeteorologico  extends Observable{

	private String clima;
	
	
	public void cambioClima(String clima) {
		this.clima = clima;
		this.notificar();
		System.out.println("clima actual: "+ this.getClima());
		
	}

	public String getClima() {
		return clima;
	}
	



}


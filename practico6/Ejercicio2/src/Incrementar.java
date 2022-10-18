
public class Incrementar {
	private Integer numero=0;
	
	public synchronized void incrementar() {
		numero++;
	}

	public synchronized Integer getNumero() {
		return numero;
	}
	
	
}


public class SistemaMetereologico extends Observable{
private String estadoClima;

public void cambioClima(String estadoClima) {
	this.estadoClima= estadoClima;
	this.notificarSubscriptor();
	System.out.println("Clima actua: "+ this.getEstadoClima());
}

public String getEstadoClima() {
	return estadoClima;
}

}

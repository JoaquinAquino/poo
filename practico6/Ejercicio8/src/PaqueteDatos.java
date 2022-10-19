
public class PaqueteDatos {
private String nombreBoya;
private Double temperatura;
private Double velocidadViento;
private Long tiempo;


public PaqueteDatos(String nombreBoya, Double temperatura, Double velocidadViento, Long tiempo) {
	super();
	this.nombreBoya = nombreBoya;
	this.temperatura = temperatura;
	this.velocidadViento = velocidadViento;
	this.tiempo = tiempo;
}

@Override
public String toString() {
	return "PaqueteDatos [nombreBoya=" + nombreBoya + ", temperatura=" + temperatura + ", velocidadViento="
			+ velocidadViento + ", tiempo=" + tiempo + "]";
}


}

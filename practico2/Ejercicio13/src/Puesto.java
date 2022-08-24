
public class Puesto {
private String nombrePuesto;

public Puesto(String nombre) {
	super();
	this.nombrePuesto = nombre;
}

public String getNombre() {
	return nombrePuesto;
}

public void setNombre(String nombre) {
	this.nombrePuesto = nombre;
}

@Override
public String toString() {
	return "Puesto [puesto=" + nombrePuesto + "]";
}

}

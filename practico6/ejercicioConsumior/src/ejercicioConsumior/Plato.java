package ejercicioConsumior;

public class Plato {
private Integer precio;
private String nombre;

public Plato(Integer precio, String nombre) {
	super();
	this.precio = precio;
	this.nombre = nombre;
}

@Override
public String toString() {
	return "precio=" + precio + ", nombre=" + nombre + "]";
}



}

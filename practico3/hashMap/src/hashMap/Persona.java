package hashMap;

public class Persona {
private String nombre;
private int edad;


public Persona(String nombre, int edad) {
	super();
	this.nombre = nombre;
	this.edad = edad;
}


public String getNombre() {
	return nombre;
}


public Integer getEdad() {
	return edad;
}


@Override
public String toString() {
	return "nombre=" + nombre + ", edad=" + edad ;
}



}

import java.time.LocalDate;

public class Persona {

private String nombre;
private String apellido;
private LocalDate nacimiento;
private Puesto puesto;

public Persona(String nombre, String apellido, LocalDate nacimiento) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.nacimiento = nacimiento;
}
public Persona(String nombre, String apellido, LocalDate nacimiento, Puesto puesto) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	this.nacimiento = nacimiento;
	this.puesto = puesto;
}

public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public LocalDate getNacimiento() {
	return nacimiento;
}
public void setNacimiento(LocalDate nacimiento) {
	this.nacimiento = nacimiento;
}

@Override
public String toString() {
	return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", nacimiento=" + nacimiento + ", puesto=" + puesto
			+ "]";
}

public int getEdad(LocalDate nacimiento) {
return 2022- nacimiento.getYear();
}
}

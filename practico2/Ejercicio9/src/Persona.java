
public class Persona {
private String nombre;
private int edad ;
private String sexo;
private boolean estudia;
private boolean trabaja;

public Persona() {
	super();
}

public Persona(String nombre, int edad, String sexo) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.sexo = sexo;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public String getSexo() {
	return sexo;
}

public void setSexo(String sexo) {
	this.sexo = sexo;
}

public boolean isEstudia() {
	return estudia;
}

public void setEstudia(boolean estudia) {
	this.estudia = estudia;
}

public boolean isTrabaja() {
	return trabaja;
}

public void setTrabaja(boolean trabaja) {
	this.trabaja = trabaja;
}




}

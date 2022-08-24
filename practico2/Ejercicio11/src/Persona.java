
public class Persona {
private String nombre;
private int edad ;
private String sexo;
private boolean estudia;
private boolean trabaja;
private boolean permitidoTrabajar;
private boolean permitidoManejar;

public Persona() {
	super();
}

public Persona(String nombre, int edad, String sexo, boolean estudia, boolean trabaja, boolean permitidoTrabajar,
		boolean permitidoManejar) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.sexo = sexo;
	this.estudia = estudia;
	this.trabaja = trabaja;
	this.permitidoTrabajar = permitidoTrabajar;
	this.permitidoManejar = permitidoManejar;
}

public String getNombre() {
	return nombre;
}

public boolean isPermitidoTrabajar() {
	return permitidoTrabajar;
}

public void setPermitidoTrabajar(boolean permitidoTrabajar) {
	this.permitidoTrabajar = permitidoTrabajar;
}

public boolean isPermitidoManejar() {
	return permitidoManejar;
}

public void setPermitidoManejar(boolean permitidoManejar) {
	this.permitidoManejar = permitidoManejar;
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

public String devolverTrabaja() {
	if (trabaja) { return "si";}
	else {return "no";
		
	}
}
public String devolverPermitidoTrabajar( ) {
	if (permitidoTrabajar) { return "si";}
	else {return "no";
		
	}
}
public String devolverPermitidoManejar() {
	if (permitidoManejar) { return "si";}
	else {return "no";
		
	}
}

@Override
public String toString() {
	return "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", estudia=" + estudia + ", trabaja="
			+ devolverTrabaja() + ", permitidoTrabajar=" + devolverPermitidoTrabajar() + ", permitidoManejar=" + devolverPermitidoManejar() ;
}





}

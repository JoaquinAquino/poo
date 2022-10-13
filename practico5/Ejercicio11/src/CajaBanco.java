import java.util.ArrayList;

public class CajaBanco  {
	
private String nombre;
private Estados estado;

public CajaBanco(String nombre) {

	this.nombre = nombre;
	this.setEstado(new Abrir());
}

public Estados getEstado() {
	return estado;
}

public void setEstado(Estados estado) {
	this.estado = estado;
	this.estado.setCaja(this);
}


public void atender(Cliente cliente) {
	
	this.estado.atender(cliente);
}
public void suspender() {
	this.estado.suspender();
}
public void cerrar() {
	this.estado.cerrar();
}
public void abrir() {
	this.estado.abrir();
}


}

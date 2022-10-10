

public abstract class ElementoBase implements Elemento{
protected String nombre;
protected String acumulador="";
//private boolean selected = false;


public ElementoBase(String nombre) {
	super();
	this.nombre = nombre;

}

@Override
public String getNombre() {	
	return nombre;
}
public abstract boolean isCompuesto();
public abstract void imprimir();//esta bien poner abstracto?

}

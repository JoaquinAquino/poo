import java.text.DecimalFormat;

public abstract class Producto {
private String precio;
private DecimalFormat formato1 = new DecimalFormat("#.00");


public Producto(String precio) {
	super();
	this.precio =formato1.format(precio);
}

public String getPrecio() {	
	return precio;
}


}

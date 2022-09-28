
public class Electrodomestico {

String modelo;
int precio;
String marca;
String color;

public Electrodomestico(String modelo, int precio, String marca, String color) {
	super();
	this.modelo = modelo;
	this.precio = precio;
	this.marca = marca;
	this.color = color;
}

public String  datosEspecificos() {	
	return "modelo= "+ modelo;
}

@Override
public String toString() {
	return "modelo=" + modelo + ", precio=" + precio + ", marca=" + marca + ", color=" + color ;
}


}

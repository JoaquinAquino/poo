
public class Heladera extends Electrodomestico {

int capacidadTotal;
int capacidadFreezer;

public Heladera(String modelo, int precio, String marca, String color, int capacidadTotal,int capacidadFreezer ) {
	super(modelo, precio, marca, color);
	this.capacidadTotal= capacidadTotal;
	this.capacidadFreezer= capacidadFreezer;
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Heladera "+ super.toString() +" capacidadTotal=" + capacidadTotal + ", capacidadFreezer=" + capacidadFreezer ;
}


public String  datosEspecificos() {		
	return super.datosEspecificos()+ " precio="+precio+" marca="+marca+ " capacidadTotal="+ capacidadTotal;
	
}



}

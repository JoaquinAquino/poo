

public class Lavarropa extends Electrodomestico{
	boolean cargaFrontal;
	int capacidad;
	
	public Lavarropa(String modelo, int precio, String marca, String color,boolean cargaFrontal,int capacidad) {
		super(modelo, precio, marca, color);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Lavarropa "+ super.toString() +" cargaFrontal=" + cargaFrontal +"capacidad="+ capacidad;
	}



	public String  datosEspecificos() {	
		return super.datosEspecificos()+ " precio="+precio+" marca="+marca+ " capacidad="+ capacidad;
		
	}	
}

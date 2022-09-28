
public class Cocina  extends Electrodomestico{
	boolean electrica;
	
	public Cocina(String modelo, int precio, String marca, String color, boolean electrica) {
		super(modelo, precio, marca, color);
		this.electrica= electrica;
	}

	@Override
	public String toString() {
		return "Cocina "+ super.toString() +" electrica=" + electrica ;
	}

	
	public String  datosEspecificos() {		
		return  super.datosEspecificos()+ " precio="+precio+" marca="+marca+ " electrica="+ electrica;
		
	}	
	

}
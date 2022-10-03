
public class TortaCoco extends TortaBuilder{
	//BUILDER CONCRETO

	@Override
	public void buildMasa() {
		torta.setMasa("vanilla con coco");		
	}

	@Override
	public void buildRelleno() {
		torta.setRelleno("dulce de leche");
		
	}



}

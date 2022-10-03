
public class TortaChocolate extends TortaBuilder{
	//BUILDER CONCRETO

	@Override
	public void buildMasa() {
		torta.setMasa("chocolate");
	}

	@Override
	public void buildRelleno() {
		torta.setRelleno("chocolate");
	}


}

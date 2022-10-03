
public class TortaVainilla extends TortaBuilder{
//BUILDER CONCRETO
	@Override
	public void buildMasa() {
		torta.setMasa("vainilla");
		
	}

	@Override
	public void buildRelleno() {
		torta.setRelleno("crema");
	}


}

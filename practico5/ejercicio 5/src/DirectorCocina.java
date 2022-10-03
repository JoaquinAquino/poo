
public class DirectorCocina {
// se encarga de gestionar la creacion del producto
	private TortaBuilder tortaBuilder;
	
	//se usa polimorfismo ya q se trabaja con tortaBuilder, puede tomar cualquier torta q herede tortaBuilder
	public void setTortaBuilder(TortaBuilder tortaBuilder) {
		this.tortaBuilder= tortaBuilder;
	}

	public Torta getTorta() {
		return this.tortaBuilder.getTorta();
	}
	
	public void construirTorta() {
		this.tortaBuilder.CrearNuevaTorta();
		this.tortaBuilder.buildMasa();
		this.tortaBuilder.buildRelleno();
	
	}

}



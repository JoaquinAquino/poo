
public abstract class TortaBuilder {
//debe tener como atributo a un objeto de la clase Producto
	protected Torta torta;

	
	//se utiliza luego para devolver la torta creada
	public Torta getTorta() {
		return torta;
	} 
	
	//metodo para instanciar al producto
	public void CrearNuevaTorta() {
		torta= new Torta();
	}
		
	public abstract void buildMasa();
	public abstract void buildRelleno();
	
}

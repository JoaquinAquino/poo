
public abstract class Juego implements Venta {
	private Integer id;
	protected int importe;
	private String nombre;
	
	public Juego(Integer id,String nombre) {
		this.id =id;
		this.nombre=nombre;
	}
	
	public int getImporte() {
		return importe;
	}
	

}

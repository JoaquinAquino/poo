
public class JuegoDigital extends Juego {
	private int precioTraslado=20;
	
	public JuegoDigital(Integer id,int importe, String nombre) {
		super(id, nombre);
		super.importe=venta(importe);
	}
	

	public int venta(int importe) {		
		return importe+precioTraslado;
	}

	
	
}


public class JuegoFisico extends Juego {
	private int precioTraslado=10;
	
	public JuegoFisico(Integer id,int importe, String nombre) {
		super(id, nombre);
		super.importe=venta(importe);
	}
	

	public int venta(int importe) {		
		return importe+precioTraslado;
	}
	
}

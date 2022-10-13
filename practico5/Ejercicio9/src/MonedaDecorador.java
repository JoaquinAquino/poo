
public abstract class MonedaDecorador implements Imoneda{

	protected Imoneda imoneda;

	public MonedaDecorador(Imoneda imoneda) {
		this.imoneda = imoneda;
	}

	@Override
	public void getPrecio(Producto p) {
		 imoneda.getPrecio(p);	
		}
	
	public abstract void getLineDescription(); 
	
}

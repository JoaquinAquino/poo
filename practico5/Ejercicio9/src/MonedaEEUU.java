
public class MonedaEEUU extends MonedaDecorador{

	public MonedaEEUU(Imoneda imoneda) {
		super(imoneda);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getPrecio(Producto p) {
		getLineDescription();	
		imoneda.getPrecio(p);//
					
	}

	@Override
	public void getLineDescription() {
		// TODO Auto-generated method stub
		System.out.println("$USD"); 
	}

}

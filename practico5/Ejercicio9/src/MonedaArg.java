
public class MonedaArg extends MonedaDecorador{

	public MonedaArg(Imoneda imoneda) {
		super(imoneda);
		// TODO Auto-generated constructor stub
	}

	@Override
	public  void getPrecio(Producto p) {
		imoneda.getPrecio(p);
		getLineDescription();
				
	}

	@Override
	public void getLineDescription(){
        System.out.println("$ARS");		
	}

}

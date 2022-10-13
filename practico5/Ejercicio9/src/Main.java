
public class Main {

	public static void main(String[] args) {
       
		Producto p = new Producto("23.943");
		
	Imoneda moneda= new MonedaArg(p);
	moneda.getPrecio(p);
//	Imoneda moneda2= new MonedaEEUU(p);
//	moneda2.getPrecio(p);
	}
}


public class Argentina implements Formateo {

	@Override
	public String formatearMoneda(Double cantidad) {
		return cantidad*290+ " ARS";
	}
	

	@Override
	public String formaterFecha(String dia, String mes, String año) {
		// TODO Auto-generated method stub
		return dia+"/"+mes+"/"+año;
	}

}


public class EEUU implements Formateo{

	@Override
	public String formatearMoneda(Double cantidad) {
		// TODO Auto-generated method stub
		return  (double)(Math.round((cantidad/290)*10000d)/10000)+" USD";
	}

	@Override
	public String formaterFecha(String dia, String mes, String año) {
		// TODO Auto-generated method stub
		return mes+"/"+dia+"/"+año;
	}

}

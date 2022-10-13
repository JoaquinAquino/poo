
public class Archivo extends ElementoBase{

	public Archivo(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public boolean isCompuesto() {
//		return false;
//	}

	@Override
	public void imprimir() {
		System.out.println(acumulador+ super.getNombre());		
	}

}

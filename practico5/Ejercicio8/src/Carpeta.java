import java.util.ArrayList;
import java.util.Arrays;


public class Carpeta extends ElementoBase{
	
protected ArrayList<Elemento> hijos = new ArrayList<Elemento>();

	public Carpeta(String nombre,Elemento... elemento) {
		super(nombre);
		this.add(elemento);
		// TODO Auto-generated constructor stub
	}

//	@Override
//	public boolean isCompuesto() {
//		return true;
//	}
//	
	public void add(Elemento... e) {
		hijos.addAll(Arrays.asList(e));
//		hijos.add(e);		
	}

	@Override
	public void imprimir() {
		System.out.println(super.acumulador+super.getNombre());	
		 super.acumulador+=" ";
		for (Elemento elemento : hijos) {
			elemento.imprimir();			
		}
	}

}

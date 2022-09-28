
public class Pelicula extends Obra {
	int recaudacion;
	String pais;
	public Pelicula(String titulo, int duracion, int calificacion,int recaudacion, String pais) {
		
		super(titulo,duracion,calificacion);
		this.recaudacion = recaudacion;
		this.pais = pais;
	}
	@Override
	public String toString() {
		return "Pelicula "+super.toString() +" recaudacion="+ recaudacion + ", pais=" + pais ;
	}
	
	
}

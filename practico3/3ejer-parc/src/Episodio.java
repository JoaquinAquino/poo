
public class Episodio extends Obra {
	
int fecha;
	
public Episodio(String titulo, int duracion, int calificacion,int fecha) {
		super(titulo, duracion, calificacion);
		this.fecha=fecha;
	}

@Override
public String toString() {
	return  super.toString() +" fecha= "+ fecha ;
}



}

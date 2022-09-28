
public class Obra {

String titulo;
int Duracion ;
int Calificacion;

public Obra(String titulo, int duracion, int calificacion) {
	super();
	this.titulo = titulo;
	Duracion = duracion;
	Calificacion = calificacion;
}

@Override
public String toString() {
	return "titulo=" + titulo + ", Duracion=" + Duracion + ", Calificacion=" + Calificacion ;
}

public int getCalificacion() {
	return Calificacion;
}

public int getDuracion() {
	return Duracion;
}



}

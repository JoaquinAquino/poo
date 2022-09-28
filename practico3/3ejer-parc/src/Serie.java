import java.util.ArrayList;

public class Serie {
String Titulo;
ArrayList<Temporada> temporadas= new ArrayList<Temporada>();

public Serie(String Titulo) {	
	this.Titulo = Titulo;
}

public void agregarTemporada(Temporada temporada) {
	this.temporadas.add(temporada);
}

public String imprimirTemporadas() {
	String acumulador="";
	for (Temporada temporada : temporadas) {
		acumulador+= temporada.toString()+"\n";
	}
	return acumulador;
}

@Override
public String toString() {
	return "Titulo de la serie =" + Titulo+"\n"+ imprimirTemporadas();
}

public ArrayList<Temporada> getTemporadas() {
	return temporadas;
}


}

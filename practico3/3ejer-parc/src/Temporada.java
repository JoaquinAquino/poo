import java.util.ArrayList;

public class Temporada {
int numero;
ArrayList<Episodio> episodios= new ArrayList<Episodio>();


public Temporada(int numero  ) {
	super();
	this.numero = numero;
}	

public String imprimirEpisodios() {
	String acumulador="";
	for (Episodio episodio : episodios) {
		acumulador += episodio.toString()+"\n";	
	}
	return acumulador;
	
}
public void ingresoEpisodio(Episodio episodio) {
	this.episodios.add(episodio);
}
@Override
public String toString() {
	return "Temporada numero: " + numero +"\n"+"episodios:"+"\n"+ imprimirEpisodios();
}

public ArrayList<Episodio> getEpisodios() {
	return episodios;
}



}

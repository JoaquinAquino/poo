import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Random;

public class Main {

	public static void main(String[] args) {

		ArrayList<Pelicula> peliculas= new ArrayList<Pelicula>();
		Serie serie=new Serie("serie"+1);
		ArrayList<Obra> obras= new ArrayList<Obra>();


		//---------------------------------------------------------------	
		for (int i = 0; i < 2; i++) {
			Temporada temporada= new Temporada(i);
			for (int j = 0; j <10; j++) {
				temporada.ingresoEpisodio(new Episodio("tituloSerie"+j,new Random().nextInt(20,60),new Random().nextInt(1,11),new Random().nextInt(1,30)));				
			}
			serie.agregarTemporada(temporada);

		}

		System.out.println(serie.toString());


		//--------------------------------------------------------------------	
		for (int i = 0; i < new Random().nextInt(3,7); i++) {
			peliculas.add( new Pelicula("titulo"+i, new Random().nextInt(60,180), new Random().nextInt(1,11),new Random().nextInt(10000,30000), "pais"+1));
		}
		peliculas.sort(Comparator.comparing(x -> x.getCalificacion()));
		Collections.reverse(peliculas);

		for(Pelicula pelicula : peliculas) {
			System.out.println(pelicula.toString());
		}
		//-------------------------------------------------------------------- 	

		for (int i = 0; i < 2; i++) {

			obras.addAll(serie.getTemporadas().get(i).getEpisodios());
		}
		
		obras.addAll(peliculas);
		
		obras.sort(Comparator.comparing(x -> x.getCalificacion()));
		Collections.reverse(obras);
		System.out.println("");
		System.out.println("obras con mejores calificaciones");
		for (int i = 0; i < 5; i++) {
			System.out.println(obras.get(i).toString());

		}

		//-----------------------------------------------------------------
		
		obras.sort(Comparator.comparing(x -> x.getDuracion()));
		Collections.reverse(obras);
		System.out.println("");
		System.out.println("obras con mayor duracion");
		for (int i = 0; i < 5; i++) {
			System.out.println(obras.get(i).toString());

		}


	}

}


public class Main {
// Utiliza el patrón Strategy cuando quieras utiliza distintas variantes de un algoritmo
//	dentro de un objeto y poder cambiar de un algoritmo a otro durante el tiempo de ejecución.
	
	
//	Utiliza el patrón Strategy cuando tengas muchas clases similares que
//	sólo se diferencien en la forma en que ejecutan cierto comportamiento.
	
//	 Utiliza el patrón cuando tu clase tenga un enorme
//	 operador condicional que cambie entre distintas variantes del mismo algoritmo	
	
	
	public static void main(String[] args) {

		Contexto contexto = new Contexto(new CatalogoCompleto());
		contexto.ejecutar();
		Contexto contexto1= new Contexto(new CatalagoMenores());
		contexto1.ejecutar();
		
	}

}


public class Main {

	public static void main(String[] args) {

		Contexto contexto = new Contexto(new CatalogoCompleto());
		contexto.ejecutar();
		Contexto contexto1= new Contexto(new CatalagoMenores());
		contexto1.ejecutar();
		
	}

}

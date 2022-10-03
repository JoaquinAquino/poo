
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DirectorCocina cocina= new DirectorCocina(); //director
		TortaBuilder tortaCoco= new TortaCoco();
		TortaBuilder tortaChocolate= new TortaChocolate();
		TortaBuilder tortaVainilla= new TortaVainilla();
		
		cocina.setTortaBuilder(tortaChocolate);
		cocina.construirTorta();
		System.out.println(cocina.getTorta());
		
		cocina.setTortaBuilder(tortaCoco);
		cocina.construirTorta();
		System.out.println(cocina.getTorta());
		
		cocina.setTortaBuilder(tortaVainilla);
		cocina.construirTorta();
		System.out.println(cocina.getTorta());



	}

}

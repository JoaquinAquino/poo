
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carpeta carpeta1= new Carpeta("carpeta1",new Carpeta("carpeta2", new Archivo("archivo1"),new Archivo("archivo2")),new Archivo("archivo3"));
		Carpeta carpeta2= new Carpeta("carpeta3",new Archivo("archivo4"));
	    carpeta1.imprimir();
		System.out.println("-----------------------------------------");
		
		carpeta2.imprimir();
	}

}

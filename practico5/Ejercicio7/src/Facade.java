
public class Facade {

	private Traductor traductor;
	private CambiadorPalabras camP;
	
	public Facade(){
		this.traductor=new Traductor();	
	    this.camP=new CambiadorPalabras();
	}
	
	
	
	public void Accionar(String palabra) {
		traductor.Traducir(palabra);
		camP.Mayuscula(palabra);
		camP.Minuscula(palabra);
			
	}
	
	
}

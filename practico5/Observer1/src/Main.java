

// Utiliza el patrón Observer cuando los cambios en el estado de un objeto puedan necesitar
//  cambiar otros objetos y el grupo de objetos sea desconocido de antemano o cambie dinámicamente.


public class Main {

	public static void main(String[] args) {

	SistemaMeteorologico sistema = new SistemaMeteorologico();
		Reportero reportero = new Reportero();
		Reportero reportero2 = new Reportero();
		sistema.suscribir(reportero2);
		sistema.suscribir(reportero);
		sistema.desuscribir(reportero2);
		
		sistema.cambioClima("nublado");
		sistema.cambioClima("lluvioso");
		sistema.cambioClima("soleado");
		
	}

}

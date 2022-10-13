package ejercicio10;

public class Reportero implements Observador{
	private SistemaMeteorologico sm;
	public Reportero(SistemaMeteorologico sm) {
		this.sm=sm;
		this.sm.setReportero(this);
	}
	
	
@Override
public void actualizarObservador() {
		
System.out.println("el clima del dia de hoy se encuentra "+sm.getClima());		
	}

}

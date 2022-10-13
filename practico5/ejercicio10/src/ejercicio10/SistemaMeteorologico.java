package ejercicio10;

import java.util.ArrayList;
import java.util.List;

public class SistemaMeteorologico implements Observador{

//	private List<Observador> observadores = new ArrayList<Observador>();
	private Observador reportero;
	private String clima;
	
	
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
		actualizarObservador();
	}
	
	@Override
	public void actualizarObservador() {
		reportero.actualizarObservador();
		// TODO Auto-generated method stub
		
	}
	public void setReportero(Observador reportero) {
		this.reportero = reportero;
	}
	
//	
//	public void agregar(Observador observador) {
//		observador.add(observador);
//	}
//	public void notificarObservadores() {
//		reportero.actualizar();
//		observadores.forEach(x -> x.actualizar());
//	}
	
	
	
	
}

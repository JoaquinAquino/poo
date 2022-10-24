import java.util.ArrayList;
import java.util.List;

//CLASE NOTIFICADORA

public abstract class Observable {
	
	protected List <Observer> observadores = new ArrayList<>();
	
	public void suscribir(Observer obs) {
		this.observadores.add(obs);
		}

	public void desuscribir(Observer obs) {
		this.observadores.remove(obs);
	}
	
	public void notificar () {
		for (Observer observer : observadores) {
			observer.actualizar();
		}
	}

}

import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

public abstract class Observable {

	protected List<Observer> subscriptores= new ArrayList<>();

	public void subscribir(Observer obs) {
		this.subscriptores.add(obs);
	}
	public void desSubscribir(Observer obs) {
		this.subscriptores.remove(obs);
	}
	public void notificarSubscriptor() {
		for (Observer subcriptor : subscriptores) {
			subcriptor.actualizar();
		}	
	}


}

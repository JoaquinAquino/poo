import java.util.Observable;
import java.util.Observer;

public class Reportero implements Observer{

	@Override
	public void update() {
		System.out.println("se ha cambiado el clima!!");		
	}

}

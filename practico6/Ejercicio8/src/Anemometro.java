import java.util.Random;

public class Anemometro implements Sensor{

	
	public Double sensar() {
		return  new Random().nextDouble()*60;
	}

}

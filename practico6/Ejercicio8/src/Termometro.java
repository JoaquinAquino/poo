import java.util.Random;

public class Termometro implements Sensor{

	@Override
	public Double sensar() {
		
		return new Random().nextDouble()*25+5;
	}

}

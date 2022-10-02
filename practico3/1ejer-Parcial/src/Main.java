import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		ArrayList<String> apellidos= new ArrayList<String>();
		for (int i = 0; i < 20; i++) {
			apellidos.add("apellido"+i);			
		}

		ArrayList<String> nombres= new ArrayList<String>();
		for (int i = 0; i < 20; i++) {
			nombres.add("nombre"+i);			
		}
	
		for (int i = 0; i <new Random().nextInt(1,10); i++) {	
        Familia familia= new Familia(apellidos.get(new Random().nextInt(20))); 
			for (int j = 0; j < new Random().nextInt(1,5); j++) {			
            Persona persona= new Persona(nombres.get(new Random().nextInt(20)), new Random().nextInt(1,80));
            familia.agregarPersona(persona);
            
			}		
			System.out.println(familia.toString());
			
		}
		
	}

}

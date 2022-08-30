import java.util.ArrayList;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
Random ran=new Random();
		Paladin pala1 = new Paladin (70,40,"paladin1");
		Paladin pala2 = new Paladin (65,45,"paladin2");
		Paladin pala3 = new Paladin (87,30,"paladin3");

		Barbaro bar1 = new Barbaro(20,60,"barbaro1");
		Barbaro bar2 = new Barbaro(30,70,"barbaro2");
		Barbaro bar3 = new Barbaro(25,75,"barbaro3");

		ArrayList<Personaje>luchadores=new ArrayList<>();

		luchadores.add(pala1);
		luchadores.add(bar1);
		luchadores.add(pala2);
		luchadores.add(bar2);
		luchadores.add(pala3);
		luchadores.add(bar3);

		for (int i = 0; i < luchadores.size(); i=i+2) {
			System.out.println("                   combate "+i+ ":");
		Combate combate= new Combate(luchadores.get(i), luchadores.get(i+1));
		combate.peleas();

			
			
			
			
			
		}
	}
}

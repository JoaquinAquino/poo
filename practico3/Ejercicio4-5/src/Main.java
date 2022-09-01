import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		Paladin pala1 = new Paladin (20,50,"paladin1");
		Paladin pala2 = new Paladin (15,45,"paladin2");
		Paladin pala3 = new Paladin (27,30,"paladin3");

		Barbaro bar1 = new Barbaro(40,20,"barbaro1");
		Barbaro bar2 = new Barbaro(30,20,"barbaro2");
		Barbaro bar3 = new Barbaro(25,15,"barbaro3");

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

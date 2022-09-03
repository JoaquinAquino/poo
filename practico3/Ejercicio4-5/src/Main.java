import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		Paladin pala1 = new Paladin (20,30,"paladin1");
		Paladin pala2 = new Paladin (15,35,"paladin2");
		Paladin pala3 = new Paladin (27,24,"paladin3");

		Barbaro bar1 = new Barbaro(40,10,"barbaro1");
		Barbaro bar2 = new Barbaro(33,3,"barbaro2");
		Barbaro bar3 = new Barbaro(32,5,"barbaro3");

		ArrayList<Personaje>luchadores=new ArrayList<>();
		
		luchadores.add(pala1);
		luchadores.add(bar1);
		luchadores.add(pala2);
		luchadores.add(bar2);
		luchadores.add(pala3);
		luchadores.add(bar3);

		for (int i = 0; i < luchadores.size(); i=i+2) {
			System.out.println("                   combate "+i+ ":");
		System.out.println(luchadores.get(i).getNombre()+" vs "+luchadores.get(i+1).getNombre());
		Combate combate= new Combate(luchadores.get(i), luchadores.get(i+1));
		System.out.println("");
		combate.peleas();

			
			
			
			
			
		}
	}
}

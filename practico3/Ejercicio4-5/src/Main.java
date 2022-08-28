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
			System.out.println("                   lucha "+i+ ":");

			for (int j = 0; j < 3; j++) {			
				try {
					if(luchadores.get(i).getVida()==0 || luchadores.get(i+1).getVida()==0 ) {
						throw new Exception();	 
					} 

					System.out.println("pelea "+ j);
					System.out.println("");

					if (ran.nextBoolean()) {
						System.out.println("ataca primero el barbaro");
						luchadores.get(i).defender(luchadores.get(i+1).atacar());

						if(luchadores.get(i).getVida()==0) {
							throw new Exception();	 
						}

						luchadores.get(i+1).defender(luchadores.get(i).atacar());						
					}
					else {
						System.out.println("ataca primero el paladin");
						luchadores.get(i+1).defender(luchadores.get(i).atacar());

						if(luchadores.get(i+1).getVida()==0) {
							throw new Exception();	 
						}

						luchadores.get(i).defender(luchadores.get(i+1).atacar());

					}
					System.out.println("vida del paladin "+luchadores.get(i).getVida());
					System.out.println("vida del barbaro "+luchadores.get(i+1).getVida());	
					System.out.println("");
				}


				catch(Exception e){
					System.out.println("vida del paladin "+luchadores.get(i).getVida());
					System.out.println("vida del barbaro "+luchadores.get(i+1).getVida());	
					System.out.println("");

				}
				
			}
		}




	}
}

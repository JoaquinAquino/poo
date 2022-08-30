import java.util.Random;

public class Combate {

private Personaje guerrero1;
private Personaje guerrero2;


public Combate() {
	super();
}

public Combate(Personaje guerrero1, Personaje guerrero2) {
	super();
	this.guerrero1 = guerrero1;
	this.guerrero2 = guerrero2;
}

public void peleas() {
	Random ran= new Random();
	while (guerrero1.getVida()!=0 || guerrero2.getVida()!=0) {
			
		if (ran.nextBoolean()) {
			System.out.println("ataca  "+ guerrero2.getNombre());
			ataca(guerrero1,guerrero2);
			
			//ataca(guerrero2,guerrero1);

		}
		else {
			System.out.println("ataca  "+ guerrero1.getNombre());
			ataca(guerrero2,guerrero1);
			//ataca(guerrero1,guerrero2);				
		}		
	}
}


private void ataca(Personaje guerrero1, Personaje guerrero2) {
		guerrero1.defender(guerrero2.atacar());					 
		}	
	}







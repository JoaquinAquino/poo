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
	while (guerrero1.getVida()>0 || guerrero2.getVida()>0) {
			
		if (ran.nextBoolean()) {
			ataca(guerrero1,guerrero2);
			System.out.println("la vida de "+guerrero1.getNombre()+" es "+guerrero1.getVida());
			System.out.println("la defensa es "+guerrero1.getNombre()+ " es"+guerrero1.getNivelDefensa());

		}
		else {
			ataca(guerrero2,guerrero1);	
			System.out.println("la vida de "+guerrero2.getNombre()+" es "+guerrero2.getVida());
			System.out.println("la defensa es "+guerrero2.getNombre()+ " es"+guerrero2.getNivelDefensa());

		}		
	}
}


private void ataca(Personaje guerrero1, Personaje guerrero2) {
		guerrero1.defender(guerrero2.atacar());					 
		}	
	}







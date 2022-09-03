

public class Paladin extends Personaje {

	public Paladin(Integer ataque, Integer defensa, String nombre) {
		super();
		this.setNivelAtaque( ataque);
		this.setNivelDefensa( defensa);
		this.setNombre(nombre);
	}

	//String punto= "el ataque"
	@Override

	public void defender(Integer ptos) {
		// TODO Auto-generated method stub	
		
		if(this.getNivelDefensa()<=ptos ) {
			
			this.setVida(this.getVida()- ((ptos-this.getNivelDefensa())/2));	
		}      
	}
}


public class Barbaro extends Personaje {
	
	public Barbaro(Integer ataque, Integer defensa, String nombre) {
		super();
		this.setNivelAtaque( ataque);
		this.setNivelDefensa( defensa);
		this.setNombre( nombre);
	}
	@Override
	public void defender(Integer ptos) {
		ptos=ptos+20;
		if(this.getNivelDefensa()<=ptos ) {
        
			this.setVida(this.getVida()- ((ptos)-this.getNivelDefensa()));
		
			
		}

		else { this.setNivelDefensa(this.getNivelDefensa()-(ptos));}
	}


	public Integer atacar() {
		System.out.println(this.nombre+" ha atacado con "+super.atacar()*3+" de daño" );
		return super.atacar()*3;

	}
}
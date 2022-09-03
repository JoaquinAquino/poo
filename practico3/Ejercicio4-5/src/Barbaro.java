
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
			this.setVida(this.getVida()- (ptos-this.getNivelDefensa()));	
	}



	public Integer atacar() {
		System.out.println(this.nombre+" ha atacado con "+this.nivelAtaque*2+" de daño" );
		return this.nivelAtaque*2;

	}
}
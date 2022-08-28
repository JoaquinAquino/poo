
public class Barbaro extends Personaje {
	
	public Barbaro(Integer ataque, Integer defensa, String nombre) {
		super();
		this.setNivelAtaque( ataque);
		this.setNivelDefensa( defensa);
		this.setNombre( nombre);
	}
	@Override
	public void defender(Integer ptos) {
		if(this.getNivelDefensa()<ptos ) {
            
			this.setVida(this.getVida()- ((ptos+20)-this.getNivelDefensa()));
			this.setNivelDefensa(0);
			try {
				if (this.getVida()<=0) {
					throw new Exception();	
				}
			}
			catch(Exception e) {
				System.out.println("el barbaro "+ this.getNombre()+" ha muerto");
				this.setVida(0);
			}

		}
		else { this.setNivelDefensa(this.getNivelDefensa()-(ptos+20));}
		if (this.getNivelDefensa()<0) {
			this.setNivelDefensa(0);			
		}
		System.out.println("el nivel de defensa de "+this.getNombre()+ " ha bajado "+ (ptos+20)+ " puntos"+"-------"+" defensa restante="+this.getNivelDefensa());
	}


	public Integer atacar() {
		return super.atacar()*3;

	}
}
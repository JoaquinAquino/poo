

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
		if(this.getNivelDefensa()<ptos ) {
			this.setVida(this.getVida()- ((ptos)-this.getNivelDefensa()));
			this.setNivelDefensa(0);
			try {
				if (this.getVida()<=0) {
					throw new Exception();	
				}
			}
			catch(Exception e) {
				System.out.println("el paladin "+ this.getNombre()+" ha muerto");
				this.setVida(0);
				//				this.setNivelAtaque(0);
			}
			System.out.println("la vida "+this.getNombre()+" es "+this.getVida());
		}
		else { this.setNivelDefensa(this.getNivelDefensa()-(ptos+20));
		if (this.getNivelDefensa()<0) {
			this.setNivelDefensa(0);			
		}
		System.out.println("el nivel de defensa de "+this.getNombre()+ " ha bajado "+ ptos+ " puntos "+ "-------"+" defensa restante="+this.getNivelDefensa());
}       
	}
}

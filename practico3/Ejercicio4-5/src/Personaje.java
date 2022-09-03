//import java.util.Random;

public abstract class  Personaje {


	protected Integer vida=100;
	protected Integer nivelAtaque;
	protected Integer nivelDefensa;
	protected String nombre;


	public Integer atacar() {
		System.out.println(this.nombre+" ha atacado con "+this.getNivelAtaque()+" de  daño");
		return this.nivelAtaque;}

	public abstract void defender(Integer ptos);

	public Integer getVida() {

		return vida;
	}
	public void setVida(Integer vida) {
		try {
			if (vida<=0) {
				throw new Exception();
			}else {			
				this.vida=vida;
			}
		}
		
		catch(Exception e) {
			this.vida=0;
			System.out.println("");
			System.out.println("el personaje "+ this.nombre+ " ha muerto.");
		}	
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Integer getNivelAtaque() {
		return nivelAtaque;
	}
	public void setNivelAtaque(Integer nivelAtaque) {
		this.nivelAtaque = nivelAtaque;
	}
	public Integer getNivelDefensa() {
		return nivelDefensa;
	}
	public void setNivelDefensa(Integer nivelDefensa) {
		this.nivelDefensa = nivelDefensa;
	}
}
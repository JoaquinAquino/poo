//import java.util.Random;

public abstract class  Personaje {

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	protected Integer vida=100;
	protected Integer nivelAtaque;
	protected Integer nivelDefensa;
    protected String nombre;
    
    
	public Integer atacar() {
		return this.nivelAtaque;}

	public abstract void defender(Integer ptos);

	public Integer getVida() {
		return vida;
	}
	public void setVida(Integer vida) {
		this.vida = vida;
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
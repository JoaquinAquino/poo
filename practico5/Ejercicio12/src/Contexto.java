
public class Contexto {

	private Iestrategia estrategia;

	public Contexto(Iestrategia estrategia) {
		this.estrategia= estrategia;
	}
	public void ejecutar() {
		this.estrategia.mostrar();
	}

}
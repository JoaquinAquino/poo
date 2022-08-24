
public class Controlador {
	private Vista vista;
	private Modelo modelo;
	public Controlador(Modelo modelo, Vista vista) {
		this.modelo = modelo;
		this.vista = vista;
		
		this.inicializarVista();
	}
	private void inicializarVista() {
		this.vista.getBotonGenerar().addActionListener( e -> this.generarContraseña() );
		this.vista.mostrar();
		this.vista.getBontonBorrar().addActionListener(e -> this.borrarContraseña());
	}
	private void borrarContraseña() {
		this.modelo.borrarContraseña();
		this.vista.getInputContraseña().setText( this.modelo.getContraseña() );
	}
	private void generarContraseña() {
		this.modelo.generarContraseña();
		this.vista.getInputContraseña().setText( this.modelo.getContraseña() );
	}
}



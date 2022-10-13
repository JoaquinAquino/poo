
public class Conexion {

	private static Conexion instancia;
	// para evitar q se instancie, ya que se busca q todos trabajen con la misma instancia
	private Conexion() {};

	public static Conexion getInstancia() {
		if(instancia == null) {
			instancia = new Conexion();
		}
		return instancia;	
	}

	//metodo de prueba
	public void conectar() {
		System.out.println("Me conecte a la BD");
	}
	public void desconectar() {
		System.out.println("Me desconecte a la BD");
	}


}


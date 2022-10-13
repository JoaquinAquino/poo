
public class App {

	public static void main(String[] args) {
		Conexion c= Conexion.getInstancia();
		c.conectar();
		c.desconectar();
		
	}

}

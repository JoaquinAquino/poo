
public class FabricaJuego {
//private Juego juego;


public Juego crearJuego(String nombre, Integer id, int importe) {
	
	if(nombre.equals("digital")) {	
		
		return new JuegoDigital(id,importe,nombre);
	}
	
	if(nombre.equals("fisico")) {		
		return new JuegoFisico(id,importe,nombre);
	}
	return null;
}

}

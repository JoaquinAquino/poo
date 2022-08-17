
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cancion cancion = new Cancion();
		
		/* Definimos los valores de cada atributo */
		cancion.setNombre("Un velero llamado libertad") ;
		cancion.setAutor("José Luis Perales") ;
		cancion.setDuracion(222);
		/* Imprimimos cada atributo */
		
		System.out.println(cancion.getNombre());
		System.out.println(cancion.getAutor());
		System.out.println(cancion.getDuracion());
	}

}

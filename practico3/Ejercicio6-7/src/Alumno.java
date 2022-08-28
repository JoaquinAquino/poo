
import java.util.ArrayList;

public class Alumno extends Persona{
	private Integer dni; 
	ArrayList<String> materias = new ArrayList<>();
	
	public Alumno(String nombre, String apellido) {
		super(nombre, apellido);
	}
	public Alumno(String nombre, String apellido, Integer dni) {
		super(nombre, apellido);
		this.dni = dni;
	}
	public ArrayList<String> getMaterias() {
		return materias;
	}
	public void setMaterias(ArrayList<String> materias) {
		this.materias = materias;
	}
	public void agregarMateria(String materia) {
		this.materias.add(materia);
	}
	
	public String materia(String materia) {
	return "El alumno se encuentra cursando "+ materia;
	}
	
	public String materia(String materia, String comida) {
		return "El alumno se encuentra cursando "+ materia+" y su comida favorita es la "+ comida;
		}
	
	public String materia() {
		String msg = "El Alumno se encuentra cursando las siguientes materias \n";
		for (String materia : materias) {
			msg = msg + materia + "\n";
		}
		return msg;
	}
}
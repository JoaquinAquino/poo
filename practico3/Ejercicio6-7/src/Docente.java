
import java.util.ArrayList;

public class Docente extends Persona{
	private String materia;
	public Docente(String nombre, String apellido, String materia) {
		super(nombre, apellido);
		this.materia = materia;
	}
	public String getMateria() {
		return materia;
	}
	public void setMateria(String materia) {
		this.materia = materia;
	}
	public String materia() {
		return "El docente dicta la siguiente clase " + this.materia +"\n";
	}
}

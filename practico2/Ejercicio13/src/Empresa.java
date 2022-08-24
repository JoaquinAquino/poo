import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private String direccion;
	private ArrayList<Persona> personas= new ArrayList <Persona>();

	public Empresa() {
		super();
	}

	public Empresa(String nombre, String direccion) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public ArrayList<Persona> getPersonas() {
		return personas;
	}
	public void setPersonas(ArrayList<Persona> personas) {
		this.personas = personas;
	}

	public void nuevoEmpleado(Persona persona) {
		this.personas.add(persona);
	}
	public int totalEmpleados() {
		return personas.size();
	}
	
}


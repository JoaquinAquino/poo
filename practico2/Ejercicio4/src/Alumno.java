
public class Alumno {
	
	private String nombre;
	private String apellido;
	private int dni;
	
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}

	public Alumno(String nombre, String apellido) {
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}
	public String getNombreYApellido() {
		return nombre + apellido;
	}
	
	
}

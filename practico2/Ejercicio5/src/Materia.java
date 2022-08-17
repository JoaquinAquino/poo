
public class Materia {
	
	private String codigo;
	private String nombre;
	
	public Materia(String nombre) {
		super();
		this.nombre = nombre;
	}

	public Materia(String nombre, String codigo) {
	this.nombre= nombre;
	this.codigo= codigo;
	}
	


	public String getCodigo() {
		return codigo;
	}

	public String getNombre() {
	return nombre;
	}
	
	public void setNombre(String nombre) {
	this.nombre = nombre;
	}
	
	public void setCodigo(String codigo) {
	this.codigo = codigo;
	}
}

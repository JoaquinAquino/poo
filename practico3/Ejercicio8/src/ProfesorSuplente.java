
public class ProfesorSuplente extends Profesor {
	private final Double valorHora = 200.0;
	public ProfesorSuplente(String nombre, String apellido, Integer edad, Integer horasTrabajadas) {
		super();
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEdad(edad);
		this.setHorasTrabajadas(horasTrabajadas);
	}




	
	
	
	public Double getRemuneracionMensual() {
		return this.valorHora * this.getHorasTrabajadas();
	}
}


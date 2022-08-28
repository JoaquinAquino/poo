
public class ProfesorTitular extends Profesor {
	private Integer antiguedad;
	private final Double valorAntiguedad = 1000.0;
	private final Double valorHora = 300.0;
	public ProfesorTitular(String nombre, String apellido, Integer edad, Integer horasTrabajadas,Integer antiguedad){
		super();
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEdad(edad);
		this.setHorasTrabajadas(horasTrabajadas);
		this.setAntiguedad(antiguedad);
	}
	
	public Double getRemuneracionPorAntiguedad() {
		return this.valorAntiguedad * this.getAntiguedad();
	}
	public Integer getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(Integer antiguedad) {
		this.antiguedad = antiguedad;
	}

	public Double getRemuneracionMensual() {
		return (this.valorHora * this.getHorasTrabajadas()) +
				this.getRemuneracionPorAntiguedad();
	}
}

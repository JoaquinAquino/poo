import java.util.ArrayList;

public class Familia {
private String apellido;
private ArrayList<Persona> personas = new ArrayList<Persona>();


public Familia(String apellido) {
	super();
	this.apellido = apellido;
}

public void agregarPersona(Persona persona) {
	this.personas.add(persona);
}

public Double edadPromedio() {
	Double sumatoria = 0.00;
	for (Persona persona : personas) {
		sumatoria += persona.getEdad();
	}	
	return sumatoria/personas.size();	
}

public String integrantesFamilia(){	
	String acumulador= "";
	for (Persona persona : personas) {
		acumulador += persona.getNombre()+"\n" ;		
	}
return acumulador;
}

@Override
public String toString() {
		return "Familia " + this.apellido + "\n" + "promedio de edad: " + this.edadPromedio()+ "\n Integrantes \n"+integrantesFamilia();
}

}

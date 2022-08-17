import java.util.ArrayList;

public class Familia {

private ArrayList <Persona> personas=new ArrayList <Persona>();

public Familia() {
	super();
}

public ArrayList<Persona> getPersonas() {
	return personas;
}

public void setPersonas(ArrayList<Persona> personas) {
	this.personas = personas;
}
public int  totalEdad() {
	int acumulador=0;
	for (int i = 0; i < personas.size(); i++) {
	acumulador=acumulador+ personas.get(i).getEdad();
			
			 
	}
return acumulador;
}

public void añadirPersona(Persona persona) {
this.personas.add(persona);
}

public  int totalPersonas() {
	int acumulador=0;
	for (int i = 0; i < personas.size(); i++) {
		 
			acumulador=acumulador+1;
	}
return acumulador;		
}

public int cantidadTrabajando() {
int acumulador=0;
for (int i = 0; i < personas.size(); i++) {
	if (personas.get(i).isTrabaja() == true) {
		acumulador=acumulador+1;
		} 
}
return  acumulador;
}




}


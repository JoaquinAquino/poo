package hashMap;

import java.util.HashMap;
import java.util.Map.Entry;

public class Familia {
	
private HashMap<String,Persona> personas= new HashMap<String,Persona>();
private String apellido;


public Familia(String apellido) {
	this.apellido = apellido;
}


public void agregarPersonas(String clave ,Persona persona) {
	personas.put(clave, persona);
}


public String escribirPersonas() {	
	String acumulador="";
	
	for (Entry<String,Persona> persona : personas.entrySet()) {
		acumulador+="clave: "+persona.getKey()+", "+ persona.getValue().toString()+"\n";	
	}
	
	return acumulador;
}

public Integer promedioEdad() {
	Integer acumulador=0;
	for (Entry<String,Persona> persona : personas.entrySet()) {
		acumulador+= persona.getValue().getEdad();
	}
	return acumulador/personas.size();
}


@Override
public String toString() {
	return "Familia apellido=" + apellido +" promedio de Edad: "+promedioEdad()+ "\n Integrantes: \n"+ escribirPersonas()+"\n";
}







}

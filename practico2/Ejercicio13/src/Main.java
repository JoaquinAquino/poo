import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Empresa empresa1= new Empresa();
Puesto adminsistrativo= new Puesto("administrativo");
Puesto gerente= new Puesto("gerente");
Puesto tesorero= new Puesto("Tesorero");

	Persona persona1= new Persona("Joaquin","Aquino" , LocalDate.of(2003, 3, 25),adminsistrativo );
//	System.out.println(persona1.toString());
//	System.out.println("edad: "+ persona1.getEdad(LocalDate.of(2003, 3, 25)));
	
	Persona persona2= new Persona("Juan","Villalva",LocalDate.of(2001, 2, 10),adminsistrativo );
//    System.out.println(persona2.toString());
//    System.out.println("edad: "+ persona1.getEdad(LocalDate.of(2001, 3, 25)));
    
	Persona persona3= new Persona("Ludmila","Espinola",LocalDate.of(2000, 7, 9),adminsistrativo);
//    System.out.println(persona3.toString());
//    System.out.println("edad: "+ persona1.getEdad(LocalDate.of(2000, 3, 25)));
	
	Persona persona4= new Persona("leonel","messi",LocalDate.of(1999, 12, 8),gerente);
	Persona persona5= new Persona("ricardo","vivar",LocalDate.of(2001, 1, 2),tesorero);
empresa1.nuevoEmpleado(persona1);
empresa1.nuevoEmpleado(persona2);
empresa1.nuevoEmpleado(persona3);
empresa1.nuevoEmpleado(persona4);
empresa1.nuevoEmpleado(persona5);
System.out.println("total empleados: "+ empresa1.totalEmpleados());
for (Persona persona : empresa1.getPersonas()) {
	System.out.println(persona.toString());
}
double resultado= Math.PI;
	}

}
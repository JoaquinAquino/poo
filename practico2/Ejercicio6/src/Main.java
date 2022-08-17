import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    
	Persona persona1= new Persona("Joaquin","Aquino" , LocalDate.of(2003, 3, 25) );
	System.out.println(persona1.toString());
//	System.out.println("edad: "+ persona1.getEdad(LocalDate.of(2003, 3, 25)));
	
	Persona persona2= new Persona("Juan","Villalva",LocalDate.of(2001, 2, 10) );
    System.out.println(persona2.toString());
//    System.out.println("edad: "+ persona1.getEdad(LocalDate.of(2001, 3, 25)));
    
	Persona persona3= new Persona("Ludmila","Espinola",LocalDate.of(2000, 7, 9));
    System.out.println(persona3.toString());
//    System.out.println("edad: "+ persona1.getEdad(LocalDate.of(2000, 3, 25)));
	}

}

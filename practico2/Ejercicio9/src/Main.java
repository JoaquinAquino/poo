import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
ArrayList<Familia> familias = new ArrayList<Familia>();
Familia familia = new Familia();
Scanner in = new Scanner(System.in);
String rta,rta1;
Persona persona= new Persona();
int o=1,p=1;
do {
	System.out.println("FAMILIA "+o);
	o=o+1;
	do {
		System.out.println("              PERSONA "+p);
		System.out.println("");
		p=p+1;

				System.out.println("ingrese el nombre");	
				String nombre= in.nextLine();
				persona.setNombre(nombre)	;
				
				System.out.println("ingrese la edad");	
				int edad= in.nextInt();
				persona.setEdad(edad)	;
				
				in.nextLine();
				System.out.println("ingrese el sexo");	
			    String sexo= in.nextLine();
				persona.setSexo(sexo);
				
				int condicion;			
//				  do { 
//					 
//					 System.out.println("ingrese el sexo <M/F>");	
//					 int siono= in.nextInt();
//					 
//				     condicion=1;
//				
//				     switch (siono) {
//					 case 'M': {persona.setEstudia(true);break;}
//					 case 'F': {persona.setEstudia(false);break;}
//					 default:
//					         System.out.println("incorrecto");condicion=2;break;}
//				
//				}while(condicion != 1);
//				
							
				  do { 
					 
					 System.out.println("¿Estudia? 1 para si/2 para no");	
					 int siono= in.nextInt();
					 
				     condicion=1;
				
				     switch (siono) {
					 case 1: {persona.setEstudia(true);break;}
					 case 2: {persona.setEstudia(false);break;}
					 default:
					         System.out.println("incorrecto");condicion=2;break;}
				
				}while(condicion != 1);
				
				
				
				do {
					 System.out.println("¿trabaja? 1 para si/2 para no");	
					 int siono= in.nextInt();
					 
				     condicion=1;
				
				     switch (siono) {
					 case 1: {persona.setTrabaja(true);break;}
					 case 2: {persona.setTrabaja(false);break;}
					 default:
					         System.out.println("incorrecto");condicion=2;break;}
				
				}while(condicion != 1);
				
	familia.añadirPersona(persona);

    System.out.println("ingrese si si desea ingresar otra persona o cualquier otra cosa si no");	
	in.nextLine();
	rta = in.nextLine();
	}while(rta.equalsIgnoreCase("si"));
	
	familias.add(familia);
	familia.limpiar();
 
System.out.println("ingrese si si desea ingresar otra familia o cualquier otra cosa si no");	
//in.nextLine();
 rta1 = in.nextLine();
p=1;
}while (rta1.equalsIgnoreCase("si"));

int acumuladorFamilias =0;
int acumuladorPersonas =0;
int acumuladorEdades= 0;
int acumuladorTrabajadores=0;

//for (int i = 0; i < familias.size(); i++) {
//	acumuladorFamilias=acumuladorFamilias+1 ;
//	acumuladorPersonas=acumuladorPersonas+ familias.get(i).totalPersonas();
//	acumuladorEdades=acumuladorEdades+ familias.get(i).totalEdad();
//	acumuladorTrabajadores= acumuladorTrabajadores+ familias.get(i).cantidadTrabajando();
//	
//
//   }

for (int i = 0; i < familias.size(); i++) {
	acumuladorFamilias=acumuladorFamilias+1 ;
	
	for (int j = 0; j < familias.get(i).getPersonas().size(); j++) {
		acumuladorPersonas= acumuladorPersonas+1;
		
		acumuladorEdades=acumuladorEdades+familias.get(i).getPersonas().get(j).getEdad();
		if (familias.get(i).getPersonas().get(j).isTrabaja()==true) {
			acumuladorTrabajadores=acumuladorTrabajadores+1;
		}
		
	}
}
System.out.println("Cantidad de familias censadas= "+acumuladorFamilias);
System.out.println("cantidad de personas= "+acumuladorPersonas);
System.out.println(("promedio de edad= "+ acumuladorEdades/acumuladorPersonas));
System.out.println("Cantidad de personas que trabajas= "+ acumuladorTrabajadores);


}

	}



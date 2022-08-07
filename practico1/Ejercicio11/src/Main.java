import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
Scanner in= new Scanner(System.in);
Random ran= new Random(); 
 int [] arreglo1 = new int [6];
 int [] arregloRan = new int [6];
 String rta;

 
 
do { 


 


System.out.println("Ingresa 6 números entre el 1 y 50: ");
for (int i = 0; i < arreglo1.length; i++) {
	System.out.println("ingrese un valor");
	int val= in.nextInt();
	arreglo1[i]= val;
	arregloRan[i]= ran.nextInt(51);
}
for (int i = 0; i < arreglo1.length; i++) {
	for (int j = 0; j < arreglo1.length; j++) {
		if (i!=j) { 
		      if (arreglo1[i]==arreglo1[j]) {
		    	  
		    	int valor;
				do { System.out.println("vuelva a ingresar el valor ya que "+ arreglo1[i]+" esta repetido ");
		    	  valor= in.nextInt();
					
				} while(valor == arreglo1[i]);
				arreglo1[i]= valor;		    	  
		         }			
		}		
	}	
}
Arrays.sort(arreglo1);
System.out.println("numeros elegidos:");
for (int i = 0; i < arreglo1.length; i++) {
	System.out.print(arreglo1[i]+" ");
	
}
System.out.println("");

System.out.println("numeros ganadores:");
for (int i = 0; i < arreglo1.length; i++) {
	System.out.print(arregloRan[i]+" ");	
}

int valor=0;
for (int i = 0; i < arreglo1.length; i++) {		
		      if (arreglo1[i]==arregloRan[i])  		    	
		    	  valor=valor+1;												
}
System.out.println("hubieron "+valor+" numeros repetidos");

System.out.println("¿Quieres jugar de nuevo? s/n: ");
rta= in.next();
rta=rta.toUpperCase();
System.out.println("respuesta "+rta);
while (!rta.equals("S") || !rta.equals("N")) {
	System.out.println("incorrecto,vuelva a ingresar");
	rta=in.next();
	rta.toUpperCase();
}
}while(rta.equals("S"));
}	
}		
	
		
		
	



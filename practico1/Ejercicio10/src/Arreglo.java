import java.util.Random;
import java.util.Scanner;

public class Arreglo {
	Scanner in= new Scanner(System.in);
	Random ran= new Random(); 

private int [] array;

public Arreglo (){
	super();	
}

public void ingreso (int [] array) {

	for (int i = 0; i < 6; i++) {
		System.out.println("ingrese el primer valor");
		int rta= in.nextInt();
		array[i]= rta;		
	;}
}


public void ingresoAleatorio (int [] array) {
	for (int i = 0; i < 6; i++) {
		array[i]= ran.nextInt(51);		
	;}
}

public void muestra (int [] array) {
	for (int i = 0; i < 6; i++) {
		System.out.println(array[i])
		;}
	
	;}




}
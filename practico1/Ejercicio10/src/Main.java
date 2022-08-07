import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Random ran = new Random();
Scanner in = new Scanner(System.in);

int n1 = ran.nextInt(5);
int n2 = ran.nextInt(5);
int rta;
int val;
int ganadas=0;
int perdidas=0;


do {
	
System.out.println("ingrese 1 si desea jugar o cualquier otro numero caso contrario");
	rta = in.nextInt();
	
	switch (rta) {	
 case 1: 
	 
	 while (n1==n2) {
		 n1 = ran.nextInt(5);
		 n2 = ran.nextInt(5);}
 
	 
	 
	 do
	 {System.out.println("ingrese 1 si va a apostar por el valor1 o 2 si va a apostar por el valor2");
	 val= in.nextInt();	

	switch (val) {
	
	case 1: 
		
			if (n1>n2) { ganadas++;
			 System.out.println("has ganado, porque el valor elegido "+n1+ " es mayor que "+ n2+" ganadas="+ ganadas);
			}else { 
				perdidas++; 
			System.out.println(" has perdido, porque el valor elegido "+n1+ " es menor que "+ n2+ " perdidas="+ perdidas);
			}				
	
	System.out.println(val);
	break;
	case 2:
	 
		if (n2>n1) { ganadas++;
		 System.out.println("has ganado, porque el valor elegido "+n2+ " es mayor que "+ n1+" ganadas="+ ganadas);
		}else { 
			perdidas++; 
		System.out.println(" has perdido, porque el valor elegido "+n2+ " es menor que "+ n1+ " perdidas="+ perdidas);
		}		 
	
	break;
	
	default:
		System.out.println("numero incorrecto");		
		break;
		}
	
	 }while(val!=1 || val!=2 );	   
	 
	 
	 
	
	 
	 
	 
	 
	 break;	
	 
default:
	 System.out.println("partidas ganadas= "+ganadas);
	 System.out.println("partidas perdidas= "+perdidas);
 break;
}

}while (rta==1);




	}

}

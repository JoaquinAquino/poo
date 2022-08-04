import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner in = new Scanner(System.in)	;	
Random ran = new Random();	
int n = ran.nextInt(1, 11);

System.out.println("Ingrese el numero");
int num = in.nextInt();

		

if (n == num) { System.out.println(num+" es igual a "+ n);	
System.out.println(num+" es menor o igual a "+ n);
System.out.println(num+" es mayor o igual a "+ n);
}
       else { System.out.println(num+" es distinto de "+ n);	 

if (n>=num) { System.out.println(num+" es menor a "+ n);
      System.out.println(num+" es menor o igual a "+ n);
       			}
else { System.out.println(num+" es mayor a "+ n);
     System.out.println(num+" es mayor o igual a "+ n);
	}
 		
       }

	}

}

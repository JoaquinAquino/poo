import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);		
String palabra1;
String palabra2;


System.out.println("ingrese una palabra");
palabra1 = in.nextLine();
System.out.println("ingrese otra palabra");
palabra2 = in.nextLine();
 
System.out.println("sin equals"+palabra1 == palabra2? "iguales":"distintos");
System.out.println("con equals");
if (palabra1.equals(palabra2))
{ System.out.println("iguales") ;}
else {System.out.println("distintos");}


	}

}

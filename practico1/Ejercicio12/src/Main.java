import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner in = new Scanner(System.in);
String [] vec = new String [5];

for (int i =0; i<vec.length; i++) {
System.out.println("ingrese la cadena :");
vec[i] = in.next();}

for (String i :vec){
    System.out.println(i);
      }


	}

}

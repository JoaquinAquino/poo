import java.util.ArrayList;

public class Banco {

	//proposito:State es un patrón de diseño de comportamiento que permite a 
	//un objeto alterar su comportamiento cuando su estado interno cambia. Parece como si el objeto cambiara su clase.
	
	//utilidad: Utiliza el patrón State cuando tengas un objeto que se comporta de forma diferente dependiendo de su estado 
	//actual, el número de estados sea enorme y el código específico del estado cambie con frecuencia.
	
	public static void main(String[] args) {

		
		CajaBanco cBanco= new CajaBanco("joaquin");;
		
		cBanco.atender(new Cliente(32,"juan"));
		cBanco.abrir();
		cBanco.suspender();
		cBanco.atender(new Cliente(40,"roberto"));
		cBanco.atender(new Cliente(61,"romina"));
		cBanco.suspender();
		cBanco.cerrar();
		cBanco.suspender();
		cBanco.atender(new Cliente(32,"juan"));



	}

}

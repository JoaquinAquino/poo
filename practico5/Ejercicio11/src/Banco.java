import java.util.ArrayList;

public class Banco {

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

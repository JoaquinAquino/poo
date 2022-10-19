
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Incrementar i= new Incrementar();
		
Acces h1=new Acces(i);


Acces h2=new Acces(i);


Acces h3=new Acces(i);


Acces h4=new Acces(i);

h1.start();
h2.start();
h3.start();
h4.start();
//join espera a q los otros hilos terminen
try {
	h1.join();
	h2.join();
	h3.join();
	h4.join();

} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

//System.out.println(i.getNumero());
	}
}

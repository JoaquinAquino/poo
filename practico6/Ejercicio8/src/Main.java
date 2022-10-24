
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Servidor servidor=new Servidor();
new Thread(new Boya("CIDMAR-1",servidor)).start();
new Thread(new Boya("CIDMAR-2",servidor)).start();
new Thread(new Cientifico(servidor)).start();


	}

}

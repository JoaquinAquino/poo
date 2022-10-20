package ejercicioConsumior;

public class Main {

	public static void main(String[] args) {
		Pedidos pedidos= new Pedidos();
		new Thread(new Cheff(pedidos)).start();// q sea runnable no significa q sea un hilo
		new Thread(new Cheff(pedidos)).start();
		new Thread(new Cheff(pedidos)).start();
		new Thread(new Cliente(pedidos)).start();
	}

}

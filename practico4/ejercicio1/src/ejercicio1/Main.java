package ejercicio1;

import java.awt.EventQueue;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new Controlador();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

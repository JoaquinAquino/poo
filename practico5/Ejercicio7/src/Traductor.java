
public class Traductor {
	
	public void Traducir(String palabra) {
		switch (palabra) {
		case "Perro": 
			System.out.println("dog");
			break;
		case "gato": 
			System.out.println("cat");
			break;
		case "azul": 
			System.out.println("blue");
			break;
		case "rojo": 
			System.out.println("red");
			break;
		case "casa": 
			System.out.println("house");
			break;
		default:
			System.out.println("la palabra no se encuentra incluida");
		}
		
	}

}

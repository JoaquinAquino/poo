package hashMap;

import java.util.HashMap;
import java.util.Random;
import java.util.Map.Entry;

public class Main {

	
	public static void main(String[] args) {
		
		
	
		HashMap <String, Familia> familias= new HashMap<String, Familia>();
//		
//		hm.put("1", "joaquin");
//		hm.put("2", "lorenzo");
//		hm.put("3", "juan");
//		hm.put("4", "pedro");
//
//		System.out.println(hm); //imprime todo con clave
//		
//		hm.remove("4"); //se elimina por la clave
//		
//		System.out.println(hm.containsValue("juan")); //se utiliza para verificar si hay o no datos
//		System.out.println(hm.containsKey("3"));	// se para contraseñas
//		
//		hm.size();//tamaño
//		hm.replace("3", "juancito"); //remplaza por contraseña
//		
//		System.out.println(hm.keySet());//imprime todas las claves
//		hm.entrySet();//sirve para los dos;
//		System.out.println(hm.entrySet());
//		
//		for (String string : hm.keySet()) {
//			System.out.println(hm.get(string));
//			
//		}

for (int i = 0; i < new Random().nextInt(3, 5); i++) {
	Familia familia= new Familia("apellido"+i);
	
	for (int j = 0; j < new Random().nextInt(1, 4); j++) {
		
		Persona persona= new Persona("nombre"+j,new Random().nextInt(1,49)) ;
		familia.agregarPersonas(""+j, persona);		
	}
	familias.put(""+i, familia);	
}

for (Entry<String,Familia> fam : familias.entrySet()) {
//	System.out.println("clave: "+fam.getKey());
//	System.out.println(fam.getValue());	//sin claves
}

for (int i = 0; i < 2; i++) {
	System.out.println(familias.get(""+i).toString());
}

//https://www.delftstack.com/es/howto/java/sort-a-hashmap-java/#:~:text=Usando%20las%20teclas%2C%20podemos%20ordenar,los%20traducimos%20en%20una%20lista. ordenar
// System.out.println(familias);	

	
	}

}

import java.util.ArrayList;

import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Heladera> heladeras= new ArrayList<Heladera>();
		ArrayList<Cocina> cocinas= new ArrayList<Cocina>();
		ArrayList<Lavarropa> lavarropas= new ArrayList<Lavarropa>();
		ArrayList<Electrodomestico> electrodomesticos= new ArrayList<Electrodomestico>();

for (int i = 0; i < 10; i++) {
	heladeras.add(new Heladera( "modeloHela" +i, new Random().nextInt(200,1000),  "marca" +i, "color"+ i, new Random().nextInt(50,200), new Random().nextInt(20,50)));
	cocinas.add(new Cocina("modeloCoci" +i, new Random().nextInt(200,1000),  "marca" +i, "color"+ i,new Random().nextBoolean()));
	lavarropas.add(new Lavarropa("modeloLava" +i, new Random().nextInt(200,1000),  "marca" +i, "color"+ i,new Random().nextBoolean(),new Random().nextInt(50,200)));
}

electrodomesticos.addAll(cocinas);
electrodomesticos.addAll(lavarropas);
electrodomesticos.addAll(heladeras);
Collections.shuffle(electrodomesticos);

System.out.println("-----------cocinas-----------------");
for (int i = 0; i < 3; i++) {
	System.out.println(cocinas.remove(new Random().nextInt(cocinas.size())).datosEspecificos()+"\n");
}

System.out.println("-------------lavarropas-----------");
for (int i = 0; i < 3; i++) {
	System.out.println(lavarropas.remove(new Random().nextInt(lavarropas.size())).datosEspecificos()+"\n");
}

System.out.println("---------heladeras------");
for (int i = 0; i < 3; i++) {
	System.out.println(heladeras.remove(new Random().nextInt(heladeras.size())).datosEspecificos()+"\n");
}

System.out.println("---------eletrodomesticos------");
for (int i = 0; i < 3; i++) {
	System.out.println(electrodomesticos.remove(new Random().nextInt(electrodomesticos.size())).toString()+"\n");
}

	}
}

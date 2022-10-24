/*
 Un bloqueo o abrazo mortal es cuando 2 o más hilos 
 están esperando por el otro. Acá tenemos un ejemplo 
 en donde dos amigos tienen por costumbre,
  que si tienen una llamada perdida del otro,
   esperar a que llame nuevamente. 
   Qué pasa si se llaman al mismo tiempo?*/

public class Deadlock {
	static class Amigo {
		private final String nombre;

	

		public synchronized void recibirLlamada(Amigo unAmigo) {
			System.out.format("%s: %s" + "  Me llamó!%n", this.nombre,unAmigo.getNombre());
			unAmigo.devolverLLamada(this);
		}

		public synchronized void devolverLLamada(Amigo unAmigo) {
			System.out.format("%s: %s" + " Me devuelve la llamada!%n", this.nombre, unAmigo.getNombre());
		}	
		public Amigo(String nombre) {
			this.nombre = nombre;
		}

		public String getNombre() {
			return this.nombre;
		}
	}

	public static void main(String[] args) {
		final Amigo pepe = new Amigo("Pepe");
		final Amigo juan = new Amigo("Juan");
		
		new Thread(new Runnable() {
			public void run() {
				pepe.recibirLlamada(juan);
				
			}
		}).start();
		
		new Thread(new Runnable() {
			public void run() {
				juan.recibirLlamada(pepe);
			}
		}).start();
	}
}
/* Otros posibles problemas:
   Inanición:
  	es cuando un hilo no puede tener acceso a los recursos compartidos y eso imposibilita el el progreso de su ejecución.
    Esto pasa cuando otros hilos utilizan constantemente el recurso y no dejan que este sea accedido. 
    Por ejemplo, supongan que un objeto tiene un método sincronizado que toma mucho tiempo en devolver 
    el control y es frecuentemente utilizado, si otro hilo necesita ejecutar el mismo método con la misma frecuencia, 
    este será frecuentemente bloqueado. 
 
   Livelock:
    Puede pasar que un hilo actúe dependiendo de lo que hace otro hilo, si la acción del otro hilo
 	también depende de la respuesta del otro hilo, tenemos un livelock. No están bloqueados, 
 	simplemente están ocupados respondiendo al otro para terminar el trabajo. 
  	Una simple analogía sería la de dos personas tratando de pasarse entre sí en un pasillo,
   	ambos ven que se están bloqueando entre sí, Pepe se mueve a la derecha y Juan a la izquierda, 
   	Se siguen bloqueando entre sí, y así continúan…
*/
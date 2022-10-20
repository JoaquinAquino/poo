package ejercicioConsumior;

public class Cliente implements Runnable{

	private Pedidos pedidos;

	public Cliente(Pedidos pedidos) {// se manda como parametro ya que todos comparten el mismo servidor
		super();
		this.pedidos = pedidos;
	}

	@Override
	public void run() {
		//tiene q encontrar 3 nulos xq hay 3 cheffs
		Integer con= 0;
		while(con<3) {
			Plato plato= pedidos.Servir();
			if (plato==null) {
				con++;
			}

	}

	}
}

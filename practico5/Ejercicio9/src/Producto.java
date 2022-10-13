

public  class Producto implements Imoneda {
	private String precio;


	public Producto(String precio) {
		super();
		this.precio =precio;
	}

	@Override
	public void getPrecio(Producto p) {
      System.out.println(p.precio);		
	}

	public String getPrecio() {
		return precio;
	}



}


public class Suspender implements Estados {

	private CajaBanco cBanco;
	
	
	@Override
	public void suspender() {
		System.out.println("La caja ya está suspendida");		
	}
	
	@Override
	public void atender(Cliente cliente) {
		if(cliente.getEdad()>60) {
			System.out.println(cliente.getNombre()+" va a ser atentido ya que tiene mas de 60 años");			
		}else System.out.println(cliente.getNombre()+" no se puede atender, ya que tiene menos de 60 años");	
	}

	@Override
	public void cerrar() {
     cBanco.setEstado(new Cerrar());
	}

	@Override
	public void abrir() {
	     cBanco.setEstado(new Abrir());

	}

	@Override
	public void setCaja(CajaBanco cajaBanco) {
		this.cBanco=cajaBanco;		
	}


}

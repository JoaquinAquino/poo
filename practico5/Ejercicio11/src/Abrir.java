
public class Abrir implements Estados{
private CajaBanco cBanco;
	@Override
	public void atender(Cliente cliente) {
		System.out.println(cliente.getNombre()+" va a ser atentido");
	}

	@Override
	public void suspender() {
		cBanco.setEstado(new Suspender());		
	}

	@Override
	public void cerrar() {
		cBanco.setEstado(new Cerrar());		
		
	}

	@Override
	public void abrir() {
		System.out.println("Ya esta abierto");		
		
	}

	@Override
	public void setCaja(CajaBanco cajaBanco) {
		this.cBanco=cajaBanco;		
	}

}

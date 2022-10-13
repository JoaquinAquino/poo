
public class Cerrar implements Estados {

private CajaBanco cBanco;
	
	
	@Override
	public void suspender() {
		System.out.println("No se puede suspender, la caja está cerrada");		
	}
	
	@Override
	public void atender(Cliente cliente) {
		System.out.println("No se puede atender, la caja está cerrada");		
	}

	@Override
	public void cerrar() {
		System.out.println("La caja ya está cerrada");		
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

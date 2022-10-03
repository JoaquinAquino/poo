
public class Torta {

//clase producto
	
	private String masa= "";
	private String relleno="";
		
	
	
//Contructores concretos
	public void setMasa(String masa) {
		this.masa = masa;
	}
	public void setRelleno(String relleno) {
		this.relleno = relleno;
	}
	@Override
	public String toString() {
		return "Torta masa=" + masa + ", relleno=" + relleno ;
	}
	
	
	
}



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;


public class Controlador implements ActionListener {
	private Vista vista;
	private Argentina arg= new Argentina();
	private EEUU eeuu= new EEUU();
	private  Double monto;
	
	public Controlador() {

		this.vista=new Vista(this);
		this.vista.setVisible(true);
		this.vista.grupoBotones.add(vista.getRadioArg());
		this.vista.grupoBotones.add(vista.getRadioEEUU());
		}




	@Override
	public void actionPerformed(ActionEvent e) {

		try{

			if(vista.getRadioArg().isSelected()) {			
				getVista().setLabelMes("Dia");
				getVista().setLabelDia("Mes");
				if(e.getSource().equals(getVista().getBtnTransformar())) { 
					if(Integer.parseInt(getVista().getTextDia().getText())>31||Integer.parseInt(getVista().getTextDia().getText())<=0||
							Integer.parseInt(getVista().getTextMes().getText())>12||Integer.parseInt(getVista().getTextMes().getText())<=0){
						throw new excepcionNumeroIncorrecto();
					}else {
						System.out.println("dsadsa");

						monto= (Double.parseDouble(getVista().getTextMonto().getText()));
						getVista().setTextMontoResultado(arg.formatearMoneda(monto));	

						getVista().setTextFechaResultado((arg.formaterFecha(getVista().getTextDia().getText(), getVista().getTextMes().getText(), getVista().getTextAño().getText())));
					}
				}						
			}	

			if(getVista().getRadioEEUU().isSelected()) {
				getVista().setLabelMes("Mes");
				getVista().setLabelDia("Dia");			
				if(e.getSource().equals(getVista().getBtnTransformar())) { 
					if(Integer.parseInt(getVista().getTextDia().getText())>31||Integer.parseInt(getVista().getTextDia().getText())<=0||
							Integer.parseInt(getVista().getTextMes().getText())>12||Integer.parseInt(getVista().getTextMes().getText())<=0){
						throw new excepcionNumeroIncorrecto();
					}else {
						System.out.println("dsadsa");
						monto= (Double.parseDouble(getVista().getTextMonto().getText())); 
						getVista().setTextMontoResultado(eeuu.formatearMoneda(monto));				
						getVista().setTextFechaResultado((eeuu.formaterFecha(getVista().getTextDia().getText(), getVista().getTextMes().getText(), getVista().getTextAño().getText())));
					}
				}
			}
		}catch(NumberFormatException nfe){
			monto=0.00;
		}
		catch(excepcionNumeroIncorrecto er) {
			//			getVista().setTextDia();
			//			getVista().setTextMes();
			JOptionPane.showMessageDialog(vista,"numero incorrecto");
		}
	}


	public Vista getVista() {
		return vista;
	}

	public void setVista(Vista vista) {
		this.vista = vista;
	}

}





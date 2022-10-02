

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Controlador implements ListSelectionListener,ActionListener,KeyListener {
	private Vista vista;
	private Modelo modelo;
	public Controlador() {
		this.modelo=new Modelo();
		
		this.vista=new Vista(this);
		
        this.vista.getCuerpo().addRow(modelo.getDatosFila1());
        this.vista.getCuerpo().addRow(modelo.getDatosfila2());
        this.vista.getCuerpo().addRow(modelo.getDatosFila3());
        this.vista.getCuerpo().addRow(modelo.getDatosFila4());
        this.vista.getCuerpo().addRow(modelo.getDatosFila5());

        this.getVista().setVisible(true);
	}



	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		this.getVista().getBoton().setEnabled(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(getVista().getBoton())) {
			this.getVista().getTable().getSelectedRow();// se obtiene la fila
			this.getVista().getTable().getSelectedColumn();// se obtiene la columna
//			System.out.println(this.getVista().getTable().getValueAt(this.getVista().getTable().getSelectedRow(),this.getVista().getTable().getSelectedColumn()));// se lee lo q selecciono
//			System.out.println(this.getVista().getTable().getValueAt(this.getVista().getTable().getSelectedRow(),0));// se lee los id
//			this.getVista().getCuerpo().setValueAt("pepe", this.getVista().getTable().getSelectedRow(), this.getVista().getTable().getSelectedColumn()); //permite modificar cualquiera
//			this.getVista().getCuerpo().removeRow(this.getVista().getTable().getSelectedRow());//elimino filas
			//***************************modificacion y cambion de datos es al modelo o cuerpo 
		}
	}

/* forma para agregar filas de uno en uno
  
 for ( inti=0;i<4;i++){
 mascota= new Mascota((i+1), "mascota+(i+1), "especie"+ (i+1), new Random().nextInt(10)+1)
Object [] fila = {String.valueOf(mascota.getId()),mascota.getNombre(),mascota.getEspecie(),String.valueOf(mascota.getEdad())};
this.getVista().getCuerpo().addRow(fila);
}
this.getVista().setVisible(true);

*/
	public void buscar() {
		TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(this.getVista().getCuerpo());
		this.getVista().getTable().setRowSorter(tr);
		tr.setRowFilter(RowFilter.regexFilter(this.getVista().getTextField().getText()));//se le manda el texto
	}
	
	
	
	public Vista getVista() {
		return vista;
	}

	public void setVista(Vista vista) {
		this.vista = vista;
	}



	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		this.buscar();
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		this.buscar();
		
	}












}


public class Modelo {
	
private  Object [] datosfila2;
private Object [] datosFila1;
private Object [] datosFila3;
private Object [] datosFila4;
private Object [] datosFila5;

public Modelo() {
	super();
	this.datosfila2 = new Object []{2,"venus",6400.0,6,false};
	this.datosFila1 = new Object[] {1,"venus",6400.0,6,false};
	this.datosFila3 = new Object[] {3,"tierra",5400.0,2,false};
	this.datosFila4 = new Object[] {4,"marte",3701.0,0,false};
	this.datosFila5 = new Object[] {5,"saturno",22502.0,0,true};

//		{},
//		{},
//		{},
//		{},

}

public Object[] getDatosFila1() {
	return datosFila1;
}

public Object[] getDatosfila2() {
	return datosfila2;
}

public Object[] getDatosFila3() {
	return datosFila3;
}

public Object[] getDatosFila4() {
	return datosFila4;
}

public Object[] getDatosFila5() {
	return datosFila5;
}



}


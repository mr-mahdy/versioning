package org.ifunpas.kpl.kode;

public class MainApp {
	
	public static void main(String[] args) {
		
		C c = new C();
		D d = new D();
		E e = new E();
		
		c.add();
		c.div();
		c.mod(5, 2);
		c.mul();
		d.pow(5.0, 3.0);
		e.contains("");
	}
}
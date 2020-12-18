package org.ifunpas.kpl.kode;

public class C extends Math {
	private double n1, n2;
	private A a;
	private B b;
	
	
	public C() {
		System.out.println("Ctor di kelas C");
		a = new A();
		b = new B();
	}
	
	public int add() {
		return a.add((int) n1, (int) n2);
	}
	
	public int sub() {
		return a.sub((int) n1, (int) n2);
	}
	
	public double mul() {
		return b.mul(n1, n2);
	}
	
	public double div() {
		return b.div(n1, n2);
	}
	
	public String toString() {
		return "toString di kelas C";
	}
}

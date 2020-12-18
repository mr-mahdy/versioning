package org.ifunpas.kpl.kode;

public class C extends Math {
	private double n1, n2;
	private A a;
	
	public C() {
		System.out.println("Ctor di kelas C");
		a = new A();
	}
	
	public int add() {
		return a.add((int) n1, (int) n2);
	}
	
	public int sub() {
		return a.sub((int) n1, (int) n2);
	}
	
	public double mul() {
		return n1*n2;
	}
	
	public double div() {
		return n1/n2;
	}
	
	public String toString() {
		return "toString di kelas C";
	}
}

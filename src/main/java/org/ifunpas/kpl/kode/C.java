package org.ifunpas.kpl.kode;

public class C extends Math {
	private double n1, n2;
	
	public C() {
		System.out.println("Ctor di kelas C");
	}
	
	public int add() {
		return (int) (n1+n2);
	}
	
	public int sub() {
		return (int) (n1-n2);
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

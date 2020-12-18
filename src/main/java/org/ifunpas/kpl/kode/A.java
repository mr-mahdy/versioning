package org.ifunpas.kpl.kode;

public class A implements AddAndSubInterface {
	public A() {
		System.out.println("Ctor di kelas A");
	}
	
	public String toString() {
		return "toString di kelas A";
	}

	public int add(int n1, int n2) {
		return (int) (n1+n2);
	}

	public int sub(int n1, int n2) {
		return (int) (n1-n2);
	}
}

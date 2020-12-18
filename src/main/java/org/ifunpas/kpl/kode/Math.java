package org.ifunpas.kpl.kode;

public class Math {
	public Math () {
		System.out.println("Ctor di kelas Math");
	}
	
	public int mod(int n1, int n2) {
		return n1%n2;
	}
	
	public double sqrt(double n) {
	    return StrictMath.sqrt(n);
	}
}

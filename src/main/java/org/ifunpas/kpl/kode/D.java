package org.ifunpas.kpl.kode;

import java.lang.Math;

public class D implements PowInterface {
	
	public D() {
		System.out.println("Ctor di kelas D");
	}
	
	public String toString() {
		return " toString di kelas D";
	}

	@Override
	public double pow(double n1, double n2) {
		return Math.pow(n1, n2);
	}

}
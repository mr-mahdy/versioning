package org.ifunpas.kpl.kode;

import java.util.ArrayList;
import java.util.List;

public class E {

	private List<String> dataList = new ArrayList<String>();
	
	public E() {
		System.out.println("Ctor di kelas E");
	}
	
	public boolean contains(String n) {
		boolean contains = false;
		for(int i = 0; i < dataList.size(); i++) {
			contains = dataList.get(i).contains(n);
		}
		
		if (contains) {
			return contains;
		}
		return contains;
	}
	
	public List<String> getDataList() {
		return dataList;
	}

	public void setDataList(List<String> dataList) {
		this.dataList = dataList;
	}
	
	public String toString() {
		return " toString di kelas E";
	}
	
}

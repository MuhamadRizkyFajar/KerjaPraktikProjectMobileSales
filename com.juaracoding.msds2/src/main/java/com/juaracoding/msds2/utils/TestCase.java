package com.juaracoding.msds2.utils;

public enum TestCase {
	
	T1("Modul Upload File MS"),
	T2("Modul Distribusi Data");
	
	private String Testname;
	
	TestCase(String Value) {
		this.Testname=Value;
	}

	public String getTestname() {
		return Testname;
	}
	
}

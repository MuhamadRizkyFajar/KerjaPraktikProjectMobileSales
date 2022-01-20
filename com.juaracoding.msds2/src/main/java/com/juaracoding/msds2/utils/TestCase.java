package com.juaracoding.msds2.utils;

public enum TestCase {
	
	T1("Modul Upload File MS"),
	T2("Modul Distribusi Data"),
	T3("Modul Worklist"),
	T4("Modul Completedlist");
	
	private String Testname;
	
	TestCase(String Value) {
		this.Testname=Value;
	}

	public String getTestname() {
		return Testname;
	}
	
}

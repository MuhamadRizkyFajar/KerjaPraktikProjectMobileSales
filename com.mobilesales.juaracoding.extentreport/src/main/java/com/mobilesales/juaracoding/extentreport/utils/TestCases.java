package com.mobilesales.juaracoding.extentreport.utils;

public enum TestCases {
	
	T1("Testing Fungsi Login"),
	T2("Testing Fungsi Master User"),
	T3("Testing Fungsi Master Parameter Upload"),
	T4("Testing Fungsi Master Poster");
	
	private String testName;
	
	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}

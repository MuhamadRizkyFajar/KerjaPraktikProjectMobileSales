package com.mobilesales.juaracoding.extentreport.utils;

public enum TestCases {
	
	T1("Testing Fungsi Login"),
	T2("Testing Fungsi New Master User"),
	T3("Testing Fungsi Edit Master User"),
	T4("Testing Fungsi Delete Master User"),
	T5("Testing fungsi Master Parameter Upload"),
	T6("Testing fungsi Edit Master Parameter Upload"),
	T7("Testing fungsi Master Poster"),
	T8("Testing Fungsi Edit Master Poster"),
	T9("Testing Fungsi Delete Master Poster");
	
	private String testName;
	
	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}

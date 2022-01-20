package com.mobilesales.juaracoding.extentreport.utils;

public enum TestCases {
	
	T1("Testing Fungsi Login User Super Admin"),
	T2("Testing Fungsi Login User Supervisor"),
	T3("Testing Fungsi Login User Mobile Sales"),
	T4("Testing Fungsi New Master User"),
	T5("Testing Fungsi Edit Master User"),
	T6("Testing Fungsi Delete Master User"),
	T7("Testing Fungsi Master Parameter Upload"),
	T8("Testing Fungsi Edit Master Parameter Upload"),
	T9("Testing Fungsi Master Poster"),
	T10("Testing Fungsi Edit Master Poster"),
	T11("Testing Fungsi Delete Master Poster"),
	T12("Testing Fungsi Summary MS"),
	T13("Testing Fungsi Summary MS Supervisor"),
	T14("Testing Fungsi Download APK user Supervisor"),
	T15("Testing Fungsi Download APK user Super Admin"),
	T16("Testing Fungsi Download APK user Mobile Sales");
	
	private String testName;
	
	TestCases(String value){
		this.testName = value;
	}
	
	public String getTestName() {
		return testName;
	}

}

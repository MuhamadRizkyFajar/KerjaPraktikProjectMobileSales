package com.juaracoding.msds2.driver.strategies;

import com.juaracoding.msds2.utils.Constants;

public class DriverStrategyImplemantor {
	
	public static DriverStrategy chooseStrategy(String strategy) {
		switch (strategy) {
		case Constants.CHROME:
			
			return new Chrome();
			
		case Constants.FIREFOX:
			
			return new Firefox();

		default:
			return null;
		}
	}
	
}

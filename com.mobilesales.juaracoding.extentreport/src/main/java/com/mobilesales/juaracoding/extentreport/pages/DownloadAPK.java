package com.mobilesales.juaracoding.extentreport.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobilesales.juaracoding.extentreport.driver.DriverSingleton;



public class DownloadAPK {
	
	private WebDriver driver;
	
	public DownloadAPK() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#left-panel > nav > ul > li")
	private List<WebElement> listmainmenu;
	
	public void toDownloadAPK() {
		listmainmenu.get(18).click();
	}
	
}

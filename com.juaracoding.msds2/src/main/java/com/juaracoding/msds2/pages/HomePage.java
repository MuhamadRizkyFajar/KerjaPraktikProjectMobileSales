package com.juaracoding.msds2.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.msds2.driver.DriverSingleton;

public class HomePage {
	
	private WebDriver driver;
	
	public HomePage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#left-panel > nav > ul > li")
	private List<WebElement> listmainmenu;
	
	@FindBy(css = "#left-panel > nav > ul > li:nth-child(9) > a:nth-child(1)")
	private WebElement btnmenusummaryms;
	
	public void toMaster() {
		listmainmenu.get(2).click();
	}
	
	public void toUploadFileMS() {
		listmainmenu.get(3).click();
	}
	
	public void toDistribusiData() {
		listmainmenu.get(6).click();
	}
	
	public void toWorklist() {
		listmainmenu.get(11).click();
	}
	
	public void toCompletedList() {
		listmainmenu.get(12).click();
	}
	
	public void toSummaryMS() {
		btnmenusummaryms.click();
	}
	
	public void toDownloadAPK() {
		listmainmenu.get(18).click();
	}
	
}

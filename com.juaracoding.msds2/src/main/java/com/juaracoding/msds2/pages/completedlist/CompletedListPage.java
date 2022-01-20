package com.juaracoding.msds2.pages.completedlist;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.msds2.driver.DriverSingleton;

public class CompletedListPage {
	
	private WebDriver driver;
	
	public CompletedListPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@name='start_date']")
	private WebElement inputstartdate;
	
	@FindBy(id = "btn-filter")
	private WebElement btnFilter;
	
	@FindBy(css = "#data-completed > tbody > tr:nth-child(1) > td:nth-child(4) > a.btn.btn-primary.btn-xs")
	private WebElement btndetail;
	
	public void detailCompletedList(String stardate) {
		inputstartdate.sendKeys(Keys.CONTROL+"a",stardate);
		inputstartdate.sendKeys(stardate);
		btnFilter.click();
		btndetail.click();
	}
	
	@FindBy(css = "#content > div.well > table > tbody > tr:nth-child(1) > td:nth-child(3)")
	private WebElement textAfterCompletedlist;
	
	public String getTextafterCompletedlist() {
		return textAfterCompletedlist.getText();
	}
}

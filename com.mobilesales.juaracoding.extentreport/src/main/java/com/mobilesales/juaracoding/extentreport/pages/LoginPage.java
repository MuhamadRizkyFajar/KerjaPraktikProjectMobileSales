package com.mobilesales.juaracoding.extentreport.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobilesales.juaracoding.extentreport.driver.DriverSingleton;

public class LoginPage {
private WebDriver driver;
	
	public LoginPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "username")
	private WebElement txtusernameLogin;
	
	@FindBy(id = "password")
	private WebElement txtpasswordLogin;
	
	@FindBy(css = "body > div.top-content > div > div:nth-child(3) > div > div.form-bottom > form > input")
	private WebElement buttonLogin;
	
	@FindBy(css = "#exampleModal > div > div > div.modal-footer > button")
	private WebElement btnDisplayAlert;
	
	@FindBy(css = "#wid-id-0 > div > div.widget-body > div > div > div > center > b")
	private WebElement TeksLogin;
	
	
	
	public void Login(String username, String password) {	
		txtusernameLogin.sendKeys(username);
		txtpasswordLogin.sendKeys(password);
		buttonLogin.submit();
	}
	
	public void DisplayAlert() {	
		btnDisplayAlert.click();
	}
	
	public String getDisplayLogin() {
		return TeksLogin.getText();
	}	
}

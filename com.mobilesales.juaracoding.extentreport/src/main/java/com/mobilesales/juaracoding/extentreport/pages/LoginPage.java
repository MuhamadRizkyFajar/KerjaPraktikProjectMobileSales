package com.mobilesales.juaracoding.extentreport.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	public void fillFormLogin(String username, String password) {
		txtusernameLogin.sendKeys(username);
		txtpasswordLogin.sendKeys(password);
		buttonLogin.click();
	}

	@FindBy(css = "#exampleModal > div > div > div.modal-footer > button")
	private WebElement btnDisplayAlert;
	
	public void closeDisplayAlert() {
		btnDisplayAlert.click();
	}
	
	@FindBy(css = "#header > div.pull-right > ul:nth-child(4) > li > span > b")
	private WebElement textUserLogin;

	public String getTextUserLogin() {
		return textUserLogin.getText();
	}
	
	@FindBy(css = "#logout > span > a")
	private WebElement btnlogout;
	
	@FindBy(id = "bot2-Msg1")
	private WebElement btnconfirmlogout;
	
	public void Logout() {
		btnlogout.click();
		btnconfirmlogout.click();
	}
}

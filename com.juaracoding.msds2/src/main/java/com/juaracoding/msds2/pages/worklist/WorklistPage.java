package com.juaracoding.msds2.pages.worklist;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.juaracoding.msds2.driver.DriverSingleton;

public class WorklistPage {
	
	private WebDriver driver;
	
	public WorklistPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@id='data-worklist']//address//a[1]")
	private List<WebElement> listcustomer;
	
	public void chooseCustomer() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.elementToBeClickable(listcustomer.get(0)));
		listcustomer.get(0).click();
	}
	
	@FindBy(css = "#div_bukti_sukses > section:nth-child(1) > label.input > a:nth-child(1) > span")
	private WebElement btnktp;
	
	@FindBy(id = "file")
	private WebElement input;
	
	@FindBy(id = "btnSave")
	private WebElement btnsave;
	
	public void uploadKTP(String lokasiktp) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		btnktp.click();
		input.sendKeys(lokasiktp);
		btnsave.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FindBy(css = "#div_bukti_sukses > section:nth-child(2) > label.input > a:nth-child(1) > span")
	private WebElement btnnpwp;
	
	public void uploadNPWP(String lokasinpwp) {
		btnnpwp.click();
		input.sendKeys(lokasinpwp);
		btnsave.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FindBy(css = "#div_bukti > section > label.input > a:nth-child(1)")
	private WebElement btnbukti;
	
	public void uploadBukti(String lokasibukti) {
		btnbukti.click();
		input.sendKeys(lokasibukti);
		btnsave.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FindBy(css = "#s2id_kode_pick_up > a > span.select2-arrow > b")
	private WebElement btnstatusPU;
	
	@FindBy(id = "notes")
	private WebElement inputnote;
	
	public void fillWroklistSurveySuksesPU(String note) {
		StatusPickUp(1);
		inputnote.sendKeys(note);
	}
	
	public void StatusPickUp (int selection) {
		btnstatusPU.click();
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	@FindBy(css = "#checkout-form > fieldset:nth-child(3) > footer > button")
	private WebElement btnsubmit;
	
	public void submit() {
		btnsubmit.click();
	}
	
	@FindBy(css = "#ribbon > ol > span > b > h4")
	private WebElement textafterworklist;
	
	public String getTextafterWorklist() {
		return textafterworklist.getText();
	}
}

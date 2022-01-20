package com.juaracoding.msds2.pages.distribusidata;

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

public class DistribusiDataPage {

	private WebDriver driver;

	public DistribusiDataPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "#no_status_alert > div > div > div.modal-header > button")
	private WebElement closealert;
	
	@FindBy(css = "#widget-grid > div.row > div > a:nth-child(5)")
	private WebElement kategoridatabaru;
	
	@FindBy(css = "#widget-grid > div.row > div > a:nth-child(6)")
	private WebElement kategorijadwalulang;
	
	@FindBy(css = "#widget-grid > div.row > div > a:nth-child(7)")
	private WebElement kategorigagalpickup;
	
	@FindBy(css = "#widget-grid > div.row > div > a:nth-child(8)")
	private WebElement kategoribatal;
	
	@FindBy(css = "#widget-grid > div.row > div > a:nth-child(9)")
	private WebElement kategorirts;
	
	@FindBy(css = "#widget-grid > div.row > div > a:nth-child(10)")
	private WebElement kategoriuncoverage;
	
	@FindBy(css = "#widget-grid > div.row > div > a:nth-child(11)")
	private WebElement kategorinorespon;
	
	@FindBy(css = "#widget-grid > div.row > div > a:nth-child(12)")
	private WebElement kategorinostatus;
	
	@FindBy(css = "#widget-grid > div.row > div > a:nth-child(13)")
	private WebElement kategoriresignatauterminate;

	@FindBy(css = "#s2id_distribution_to > a")
	private WebElement selectMobileSales;

	@FindBy(css = "#s2id_is_reupload > a")
	private WebElement selectFilterData;

	@FindBy(xpath = "//label[@class='checkbox']//i")
	private List<WebElement> listcustomer;

	public void KategoriPilihan() {
//		closealert.click();
		kategorijadwalulang.click();
//		closealert.click();
		kategorigagalpickup.click();
//		closealert.click();
		kategoribatal.click();
//		closealert.click();
		kategorirts.click();
//		closealert.click();
		kategoriuncoverage.click();
//		closealert.click();
		kategorinorespon.click();
//		closealert.click();
		kategorinostatus.click();
//		closealert.click();
		kategoriresignatauterminate.click();
//		closealert.click();
	}

	public void PickKategori() {
		kategoridatabaru.click();
//		closealert.click();
		MobileSales(1);
	}

	public void MobileSales(int selection) {
		selectMobileSales.click();
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}

	public void SelectFilter() {
		FilterData(1);
	}

	public void pickCustomer() {
		listcustomer.get(0).click();
	}

	public void FilterData(int selection) {
		selectFilterData.click();
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	@FindBy(css = "#data-distribusi_length > label > select")
	private WebElement jumlahDataTabel;

	public void pilihJumlahData(int pilih) {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JumlahData(pilih);
	}
	
	public void JumlahData(int selection) {
		WebDriverWait wait = new WebDriverWait(driver, 25);
		wait.until(ExpectedConditions.elementToBeClickable(jumlahDataTabel));
		jumlahDataTabel.click();
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	@FindBy(css = "#data-distribusi_previous > a")
	private WebElement pagePrevious;

	@FindBy(css = "#data-distribusi_next > a")
	private WebElement pageNext;

	public void buttonPage() {
		pagePrevious.click();
		pageNext.click();
	}
	
	@FindBy(css = "#data-distribusi_filter > label > input")
	private WebElement inputsearch;
	
	@FindBy(css = "#btnSearch")
	private WebElement btnsearch;
	
	public void Searching(String search) {
		inputsearch.sendKeys(search);
		btnsearch.click();
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@FindBy(css = "#div_submit > button")
	private WebElement btnsubmit;

	public void SubmitData() {
		btnsubmit.click();
//		closealert.click();
	}
	
	@FindBy(css = "#in_proses")
	private WebElement textinproses;
	
	@FindBy(css = "#belum_pick_up")
	private WebElement textbelumpickup;
	
	@FindBy(css = "#jadwal_ulang")
	private WebElement textjadwalulang;
	
	public String getTextinproses() {
		return textinproses.getAttribute("value");
	}
	
	public String getTextbelumpickup() {
		return textbelumpickup.getAttribute("value");
	}
	
	public String getTextjadwalulang() {
		return textjadwalulang.getAttribute("value");
	}
}

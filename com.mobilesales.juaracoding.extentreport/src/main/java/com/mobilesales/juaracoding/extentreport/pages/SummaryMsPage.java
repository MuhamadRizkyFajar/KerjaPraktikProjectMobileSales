package com.mobilesales.juaracoding.extentreport.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mobilesales.juaracoding.extentreport.driver.DriverSingleton;



public class SummaryMsPage {
	
	private WebDriver driver;
	
	public SummaryMsPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	INPUT SUMMARY MS
	
	@FindBy(css = "#s2id_cbo_kategori > a > span.select2-arrow > b")
	private WebElement kategori;
	
	@FindBy(xpath = "//input[@name='tanggal_dari']")
	private WebElement inputTanggalAwal;
	
	@FindBy(xpath = "//input[@name='tanggal_sampai']")
	private WebElement inputTanggalAkhir;
	
	@FindBy(css = "#checkout-form > table > tbody > tr:nth-child(3) > td > button")
	private WebElement btnGo;
	
//	HALAMAN DEPAN SUMMARY MS
	
	@FindBy(css = "#left-panel > nav > ul > li:nth-child(9) > a:nth-child(1) > span")
	private WebElement menuSUmmaryMS;
	
	@FindBy(css = "#dt_basic_length > label > select")
	private WebElement jumlahDataTabel;
	
	@FindBy(css = "#myTab1 > li:nth-child(2) > a")
	private WebElement unconverageTabel;
	
	@FindBy(css = "#dt_basic5 > thead > tr > th.sorting_asc")
	private WebElement sortNo;
	
	@FindBy(css = "#dt_basic5 > thead > tr > th:nth-child(2)")
	private WebElement sortKeterangan;
	
	@FindBy(css = "#myTab1 > li:nth-child(1) > a")
	private WebElement listTabel;
	
	@FindBy(css = "#dt_basic > thead > tr > th.sorting_asc")
	private WebElement sortNoList;
	
	@FindBy(css = "#dt_basic > thead > tr > th:nth-child(2)")
	private WebElement sortPeruntukan;
	
	@FindBy(css = "#dt_basic > thead > tr > th:nth-child(3)")
	private WebElement sortTotal;
	
	@FindBy(css = "#dt_basic > thead > tr > th:nth-child(4)")
	private WebElement sortSuksesPU;
	
	@FindBy(css = "#dt_basic > thead > tr > th:nth-child(5)")
	private WebElement sortGagalPU;
	
	@FindBy(css = "#dt_basic > thead > tr > th:nth-child(6)")
	private WebElement sortCancelCS;
	
	@FindBy(css = "#dt_basic > thead > tr > th:nth-child(7)")
	private WebElement sortJadwalUlang;
	
	@FindBy(css = "#dt_basic > thead > tr > th:nth-child(8)")
	private WebElement sortNoStatus;
	
	@FindBy(css = "#dt_basic > thead > tr > th:nth-child(9)")
	private WebElement sortPURate;
	
	@FindBy(css = "#dt_basic_filter > label > input")
	private WebElement txtSearch;
	
	@FindBy(css = "#content > div.row > div.col-xs-12.col-sm-3.col-md-3.col-lg-3.full-right > h1 > span > a")
	private WebElement btnBack;
	
	@FindBy(css = "#dt_basic > tbody > tr > td")
	private WebElement tabel;
	
	@FindBy(css = "#no_status_alert > div > div > div.modal-header > button > span")
	private WebElement alert;
	
//	HALAMAN DETAIL MS
	
	@FindBy(css = "#dt_basic > tbody > tr > td:nth-child(10) > a")
	private WebElement btnDetailTabel;
	
	
	@FindBy(css = "#dt_basic_length > label > select")
	private WebElement jumlahDataTabelDetail1;
	
	@FindBy(css = "#dt_basic_filter > label > input")
	private WebElement txtSearchDetail1;
	
	@FindBy(css = "#dt_basic > thead > tr > th.sorting_asc")
	private WebElement sortNoDetail1;
	
	@FindBy(css = "#dt_basic > thead > tr > th:nth-child(2)")
	private WebElement sortNoDetail2;
	
	@FindBy(css = "#dt_basic > thead > tr > th:nth-child(3)")
	private WebElement sortNoDetail3;
	
	@FindBy(css = "#dt_basic > thead > tr > th:nth-child(4)")
	private WebElement sortNoDetail4;
	
	@FindBy(css = "#dt_basic > thead > tr > th:nth-child(5)")
	private WebElement sortNoDetail5;
	
	@FindBy(css = "#dt_basic > thead > tr > th:nth-child(6)")
	private WebElement sortNoDetail6;
	
	@FindBy(css = "#dt_basic > thead > tr > th:nth-child(7)")
	private WebElement sortNoDetail7;
	
	@FindBy(css = "#dt_basic > thead > tr > th:nth-child(8)")
	private WebElement sortNoDetail8;
	
	
	@FindBy(css = "#myTab1 > li:nth-child(2) > a")
	private WebElement tabelDetail;

	@FindBy(css = "#dt_basic2_length > label > select")
	private WebElement jumlahDataTabelDetail2;
	
	@FindBy(css = "#dt_basic2_filter > label > input")
	private WebElement txtSearchDetail2;
	
	@FindBy(css = "#dt_basic2 > thead > tr > th:nth-child(1)")
	private WebElement sortNoDetail21;
	
	@FindBy(css = "#dt_basic2 > thead > tr > th:nth-child(2)")
	private WebElement sortNoDetail22;
	
	@FindBy(css = "#dt_basic2 > thead > tr > th:nth-child(3)")
	private WebElement sortNoDetail23;
	
	@FindBy(css = "#dt_basic2 > thead > tr > th:nth-child(4)")
	private WebElement sortNoDetail24;
	
	@FindBy(css = "#dt_basic2 > thead > tr > th:nth-child(5)")
	private WebElement sortNoDetail25;
	
	@FindBy(css = "#dt_basic2 > thead > tr > th:nth-child(6)")
	private WebElement sortNoDetail26;
	
	@FindBy(css = "#dt_basic2 > thead > tr > th:nth-child(7)")
	private WebElement sortNoDetail27;
	
	@FindBy(css = "#dt_basic2 > thead > tr > th:nth-child(8)")
	private WebElement sortNoDetail28;
	
	@FindBy(css = "#dt_basic2 > thead > tr > th:nth-child(9)")
	private WebElement sortNoDetail29;
	
	@FindBy(css = "#dt_basic2 > thead > tr > th:nth-child(10)")
	private WebElement sortNoDetail30;
	
	
	@FindBy(css = "#myTab1 > li:nth-child(3) > a")
	private WebElement tabelDetail2;
	
	@FindBy(css = "#myTab1 > li:nth-child(4) > a")
	private WebElement tabelDetail3;
	
	@FindBy(css = "#myTab1 > li:nth-child(5) > a")
	private WebElement tabelDetail4;
	
	@FindBy(css = "#myTab1 > li:nth-child(6) > a")
	private WebElement tabelDetail5;

	@FindBy(css = "#wid-id-12 > div > div.row > div.col-xs-12.col-sm-3.col-md-3.col-lg-3.full-right > h1 > span > a")
	private WebElement btnBackDetail;
	
	
	
	
	public void inputSummaryMSadmin(String tanggalawalsummaryms, String tanggalakhirsummaryms) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		menuSUmmaryMS.click();
		Kategori(0);
		
		inputTanggalAwal.sendKeys(Keys.CONTROL+"a",tanggalawalsummaryms);
		inputTanggalAwal.sendKeys(tanggalawalsummaryms);
		
		inputTanggalAkhir.sendKeys(Keys.CONTROL+"a",tanggalakhirsummaryms);
		inputTanggalAkhir.sendKeys(tanggalakhirsummaryms);
		
		btnGo.click();
		js.executeScript("window.scrollBy(0,500)");
	}
	
	public void inputSummaryMSspv(String tanggalawalsummaryms, String tanggalakhirsummaryms) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		menuSUmmaryMS.click();
//		alert.click();
		Kategori(0);
		
		inputTanggalAwal.sendKeys(Keys.CONTROL+"a",tanggalawalsummaryms);
		inputTanggalAwal.sendKeys(tanggalawalsummaryms);
		
		inputTanggalAkhir.sendKeys(Keys.CONTROL+"a",tanggalakhirsummaryms);
		inputTanggalAkhir.sendKeys(tanggalakhirsummaryms);
		
		btnBack.click();
//		alert.click();
		
		inputTanggalAwal.sendKeys(Keys.CONTROL+"a",tanggalawalsummaryms);
		inputTanggalAwal.sendKeys(tanggalawalsummaryms);
		
		inputTanggalAkhir.sendKeys(Keys.CONTROL+"a",tanggalakhirsummaryms);
		inputTanggalAkhir.sendKeys(tanggalakhirsummaryms);
		
		btnGo.click();
//		alert.click();
		
		js.executeScript("window.scrollBy(0,500)");
	}
	
	public void viewSummaryMS(String searchsummaryms) {
		JumlahData(2);
		unconverageTabel.click();
		sortNo.click();
		sortKeterangan.click();
		listTabel.click();
		sortNoList.click();
		sortPeruntukan.click();
		sortTotal.click();
		sortSuksesPU.click();
		sortGagalPU.click();
		sortCancelCS.click();
		sortJadwalUlang.click();
		sortNoStatus.click();
		sortPURate.click();
		txtSearch.sendKeys(searchsummaryms);
		btnDetailTabel.click();
	}
	
	public void viewSummaryMSDetail(String searchsummarymsdetail, String searchsummarymsdetail2) {
		sortNoDetail1.click();
		sortNoDetail2.click();
		sortNoDetail3.click();
		sortNoDetail4.click();
		sortNoDetail5.click();
		sortNoDetail6.click();
		sortNoDetail7.click();
		sortNoDetail8.click();
		JumlahDataDetail(2);
		txtSearchDetail1.sendKeys(searchsummarymsdetail);
		
		tabelDetail.click();
		sortNoDetail21.click();
		sortNoDetail22.click();
		sortNoDetail23.click();
		sortNoDetail24.click();
		sortNoDetail25.click();
		sortNoDetail26.click();
		sortNoDetail27.click();
		sortNoDetail28.click();
		sortNoDetail29.click();
		sortNoDetail30.click();
		JumlahDataDetail2(2);
		txtSearchDetail2.sendKeys(searchsummarymsdetail2);
		
		tabelDetail2.click();
		tabelDetail3.click();
		tabelDetail4.click();
		tabelDetail5.click();
		btnBackDetail.click();
//		alert.click();
	}
	
	public void alertSpv() {
		alert.click();
	}
	
	public WebElement getDisplayTabel() {
		return tabel;
	}
	
	
	@FindBy(css = "#dt_basic > tbody > tr.gradeX.odd > td:nth-child(2)")
	private WebElement textAfterSummarMS;
	
	public String getTextSummaryMS() {
		return textAfterSummarMS.getText();
	}
	
	@FindBy(css = "#dt_basic > tbody > tr > td")
	private WebElement textAfterSummarMSSuperAdmin;
	
	public String getTextSummaryMSSuperAdmin() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", textAfterSummarMSSuperAdmin);
		return textAfterSummarMSSuperAdmin.getText();
	}
	
	public void Kategori (int selection) {			
		kategori.click();	
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void JumlahData (int selection) {			
		jumlahDataTabel.click();	
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void JumlahDataDetail (int selection) {			
		jumlahDataTabelDetail1.click();	
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
	public void JumlahDataDetail2 (int selection) {			
		jumlahDataTabelDetail2.click();	
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
}

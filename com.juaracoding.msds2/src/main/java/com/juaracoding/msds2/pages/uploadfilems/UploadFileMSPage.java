package com.juaracoding.msds2.pages.uploadfilems;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.juaracoding.msds2.driver.DriverSingleton;

public class UploadFileMSPage {

	private WebDriver driver;

	public UploadFileMSPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}

	// Tombol Utama Upload File MS

	@FindBy(css = "#content > div > div.col-xs-12.col-sm-5.col-md-5.col-lg-8 > a.btn.btn-success")
	private WebElement btnDownloadTemplateMS;

	public void DownloadTemplateMS() {
		btnDownloadTemplateMS.click();
	}

	@FindBy(css = "#content > div > div.col-xs-12.col-sm-5.col-md-5.col-lg-8 > a.btn.btn-header.btn-labeled.btn-primary")
	private WebElement btnUploadMS;

	@FindBy(css = "#s2id_product > a > span.select2-arrow")
	private WebElement product;

	@FindBy(id = "file_upload")
	private WebElement txtFile;

	@FindBy(id = "keterangan")
	private WebElement txtKeterangan;

	public void fillFormUploadFileMS(String filepath, String keterangan) {
		btnUploadMS.click();
		Product(3);
		txtFile.sendKeys(filepath);
		txtKeterangan.sendKeys(keterangan);
	}

	public void Product(int selection) {
		product.click();
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}

	@FindBy(css = "#widget-grid > div > article > form > footer > button")
	private WebElement btnSubmit;

	public void Submit() {
		btnSubmit.click();
	}

	@FindBy(css = "#widget-grid > div > article > form > footer > a")
	private WebElement btnBackFromUpload;

	public void backFromUpload() {
		btnBackFromUpload.click();
	}

	@FindBy(xpath = "//input[@name='tanggal_dari']")
	private WebElement inputstartdate;

	@FindBy(xpath = "//input[@name='tanggal_sampai']")
	private WebElement inputendtdate;

	@FindBy(css = "#checkout-form > table > tbody > tr:nth-child(2) > td:nth-child(5) > label > input")
	private WebElement btnGo;

	public void startDate(String tanggalawal, String tanggalakhir) {
		inputstartdate.sendKeys(Keys.CONTROL + "a", tanggalawal);
		inputstartdate.sendKeys(tanggalawal);
		inputendtdate.sendKeys(Keys.CONTROL + "a", tanggalakhir);
		inputendtdate.sendKeys(tanggalakhir);
		btnGo.click();
	}

	@FindBy(css = "#dt_basic_length > label > select")
	private WebElement jumlahDataTabel;

	public void pilihJumlahData(int pilih) {
		JumlahData(pilih);
	}

	public void JumlahData(int selection) {
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

	@FindBy(css = "#dt_basic > thead > tr > th")
	private List<WebElement> btnSorting;

	public void sorting() {
		for (int i = 0; i < btnSorting.size() - 1; i++) {
			btnSorting.get(i).click();
		}
	}

	@FindBy(css = "#dt_basic_paginate > ul > li > a")
	private WebElement page;

	@FindBy(css = "#dt_basic_previous > a")
	private WebElement pagePrevious;

	@FindBy(css = "#dt_basic_next > a")
	private WebElement pageNext;

	public void buttonPage() {
		pagePrevious.click();
		pageNext.click();
		page.click();
	}

	@FindBy(id = "myBtn")
	private WebElement btnUP;

	public void goUp() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", pagePrevious);
		btnUP.click();
	}

	@FindBy(css = "#dt_basic_filter > label > input")
	private WebElement inputsearch;

	public void Searching(String search) {
		inputsearch.sendKeys(search);
	}

	@FindBy(css = "#dt_basic > tbody > tr > td")
	private List<WebElement> textbuktiupload;

	public String buktiUpload(int viewselection) {
		return textbuktiupload.get(viewselection).getText();
	}

	// Tombol di kolom Action

	@FindBy(css = "#dt_basic > tbody > tr > td:nth-child(7) > a:nth-child(1)")
	private WebElement btnEdit;

	public void EditFile() {
		btnEdit.click();
	}

	// Form Edit

	@FindBy(id = "peruntukan")
	private WebElement inputnikperuntukan;

	@FindBy(id = "peruntukan_nama")
	private WebElement inputnamaperuntukan;

	@FindBy(css = "#s2id_product > a")
	private WebElement btnproduct;

	@FindBy(css = "#s2id_source_code > a")
	private WebElement btnsourcecode;

	@FindBy(css = "#keterangan")
	private WebElement editketerangan;

	public void editUploadFile(String NIK, String Nama, String Keterangan) {
		inputnikperuntukan.sendKeys(Keys.CONTROL + "a", NIK);
		inputnikperuntukan.sendKeys(NIK);
		inputnamaperuntukan.sendKeys(Keys.CONTROL + "a", Nama);
		inputnamaperuntukan.sendKeys(Nama);
		ProductEdit(0);
		SourceEdit(0);
		editketerangan.sendKeys(Keys.CONTROL + "a");
		editketerangan.sendKeys(Keterangan);
	}

	public void ProductEdit(int selection) {
		btnproduct.click();
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}

	public void SourceEdit(int selection) {
		btnsourcecode.click();
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver);
		keyDown.sendKeys(Keys.chord(cs)).perform();
	}

	@FindBy(css = "#widget-grid > div > article > form > footer > button")
	private WebElement btnsubmitedit;

	public void SubmitEdit() {
		btnsubmitedit.click();
	}

	@FindBy(css = "#widget-grid > div > article > form > footer > a")
	private WebElement btnbackfromedit;

	public void BackFromEdit() {
		btnbackfromedit.click();
	}

	@FindBy(css = "#dt_basic > tbody > tr > td:nth-child(7) > a.btn.btn-danger.btn-xs")
	private WebElement btndeletefile;

	public void DeletFile() {
		btndeletefile.click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}

	@FindBy(css = "#dt_basic > tbody > tr > td:nth-child(7) > a:nth-child(3)")
	private WebElement btnviewfile;

	public void ViewFile() {
		btnviewfile.click();
	}

	@FindBy(css = "#content > div.row > div.col-xs-12.col-sm-3.col-md-3.col-lg-3.full-right > h1 > span > a")
	private WebElement btnbackfromview;

	public void BackfromView() {
		btnbackfromview.click();
	}

	@FindBy(css = "#content > div > div.col-xs-12.col-sm-7.col-md-7.col-lg-4 > span > h1 > b")
	private WebElement headerdatauploadms;

	public WebElement TitlePage() {
		return headerdatauploadms;
	}
}

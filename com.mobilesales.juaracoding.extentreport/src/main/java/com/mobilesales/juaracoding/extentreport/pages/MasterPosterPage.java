package com.mobilesales.juaracoding.extentreport.pages;

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

import com.mobilesales.juaracoding.extentreport.driver.DriverSingleton;

public class MasterPosterPage {
private WebDriver driver;
	
	public MasterPosterPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	
//	HALAMAN DEPAN MASTER POSTER

	@FindBy(css = "#left-panel > nav > ul > li:nth-child(3) > a > span")
	private WebElement menuMaster;
	
	@FindBy(css = "#left-panel > nav > ul > li.open > ul > li:nth-child(3) > a")
	private WebElement masterPoster;
	
	@FindBy(css = "#content > div.row > div.col-xs-12.col-sm-5.col-md-5.col-lg-8 > button")
	private WebElement btnUploadPoster;
	
	@FindBy(css = "#dt_basic > tbody > tr:nth-child(1) > td:nth-child(4) > button")
	private WebElement editPadaTabel;
	
	@FindBy(css = "#dt_basic > tbody > tr:nth-child(1) > td:nth-child(4) > a")
	private WebElement hapusPadaTabel;
	
	@FindBy(css = "#dt_basic_length > label > select")
	private WebElement jumlahDataTabel;
	
	@FindBy(css = "#dt_basic_filter > label > input")
	private WebElement txtSearchTabel;
	
	@FindBy(css = "#dt_basic_paginate > ul > li:nth-child(3) > a")
	private WebElement pageDua;
	
	@FindBy(css = "#dt_basic_previous > a")
	private WebElement pagePrevious;
	
	@FindBy(css = "#dt_basic_next > a")
	private WebElement pageNext;
	
	@FindBy(css = "#dt_basic > thead > tr > th.sorting_asc")
	private WebElement sortProgramName;
	
	@FindBy(css = "#dt_basic > thead > tr > th:nth-child(2)")
	private WebElement sortPoster;
	
	@FindBy(css = "#dt_basic > thead > tr > th:nth-child(3)")
	private WebElement sortStatus;
	
//	FORM NEW POSTER
	
	@FindBy(css = "#uploadimage > div.modal-body > div:nth-child(2) > input")
	private WebElement txtProgramName;
	
	@FindBy(id = "file")
	private WebElement BtnUploadPicture;
	
	@FindBy(css = "#uploadimage > div.modal-footer > input")
	private WebElement btnSubmit;
	
	@FindBy(css = "#uploadimage > div.modal-footer > button")
	private WebElement btnCancel;
	
	@FindBy(css = "#content > div.row > div.col-xs-12.col-sm-7.col-md-7.col-lg-4 > span > h1")
	private WebElement getTextMasterPoster;
	
//	FORM EDIT
	
	@FindBy(css = "#modalEdit > div > div > div.modal-body > div > select")
	private WebElement statusActiveEdit;
	
	@FindBy(css = "#modalEdit > div > div > div.modal-footer > button")
	private WebElement btnCancelEdit;
	
	@FindBy(css = "#modalEdit > div > div > div.modal-footer > input")
	private WebElement btnSubmitEdit;
	

	public void MasterPoster() {
		menuMaster.click();	
		masterPoster.click();
		btnUploadPoster.click();
	}
	
	public void formMasterPoster(String programNamePoster, String pictureMasterPoster, String searchposter) {
		JavascriptExecutor js = (JavascriptExecutor)driver;	
		
		txtProgramName.sendKeys(programNamePoster);
		BtnUploadPicture.sendKeys(pictureMasterPoster);
		btnSubmit.submit();
		
		btnUploadPoster.click();
		btnCancel.click();
		
		editPadaTabel.click();
		StatusActive(1);
		btnSubmitEdit.click();
		
		editPadaTabel.click();
		btnCancelEdit.click();
		
		JumlahData(1);
		
		sortProgramName.click();
		sortPoster.click();
		sortStatus.click();
	
		txtSearchTabel.sendKeys(searchposter);
		hapusPadaTabel.click();
		Alert alerthapus = this.driver.switchTo().alert();
		alerthapus.accept();
		
		js.executeScript("window.scrollBy(0,3000)");
		pageDua.click();
		pagePrevious.click();
		pageNext.click();

	}
	
	public String getDisplayMasterPoster() {
		return getTextMasterPoster.getText();
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
	
	public void StatusActive (int selection) {			
		statusActiveEdit.click();	
		List<Keys> lstSequence = new ArrayList<Keys>();
		for (int i = 0; i < selection; i++) {
			lstSequence.add(Keys.DOWN);
		}
		lstSequence.add(Keys.ENTER);
		CharSequence[] cs = lstSequence.toArray(new CharSequence[lstSequence.size()]);
		Actions keyDown = new Actions(driver); keyDown.sendKeys(Keys.chord(cs)).perform();
	}
	
}

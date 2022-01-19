package com.mobilesales.juaracoding.extentreport.extents.glue;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.mobilesales.juaracoding.extentreport.driver.DriverSingleton;
import com.mobilesales.juaracoding.extentreport.driver.config.AutomationFrameworkConfig;
import com.mobilesales.juaracoding.extentreport.pages.LoginPage;
import com.mobilesales.juaracoding.extentreport.pages.MasterParameterUploadPage;
import com.mobilesales.juaracoding.extentreport.pages.MasterPosterPage;
import com.mobilesales.juaracoding.extentreport.pages.MasterUserPage;
import com.mobilesales.juaracoding.extentreport.utils.ConfigurationProperties;
import com.mobilesales.juaracoding.extentreport.utils.Constants;
import com.mobilesales.juaracoding.extentreport.utils.TestCases;
import com.mobilesales.juaracoding.extentreport.utils.Utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfig.class)
public class StepDefinition {

	private static WebDriver driver;
	private LoginPage loginPage;
	private MasterUserPage masteruserPage;
	private MasterParameterUploadPage masterparameterPage;
	private MasterPosterPage masterposterPage;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports();
	static ExtentSparkReporter htmlreporter = new ExtentSparkReporter("src/test/resources/reporttest.html");
		
	@Autowired
	ConfigurationProperties configurationProperties;
	
	@Before
	public void initializeObjects() {
		
		report.attachReporter(htmlreporter);
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		loginPage = new LoginPage();
		masteruserPage = new MasterUserPage();
		masterparameterPage = new MasterParameterUploadPage();
		masterposterPage = new MasterPosterPage();
		TestCases[] tests = TestCases.values();
		extentTest = report.createTest(tests[Utils.testCount].getTestName());
		Utils.testCount++;
	}
	
	@Given("^User buka halaman website")
	public void user_buka_halaman_website() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(Status.PASS, "User buka halaman website " + Constants.URL);
	}
	
	
//	LOGIN
//	User Super Admin
	@When("^User memasukan username dan password dan klik Log In")
	public void user_memasukan_username_dan_password_dan_klik_log_in() {
		loginPage.Login(configurationProperties.getUsername(), configurationProperties.getPassword());
		extentTest.log(Status.PASS, "User memasukan username dan password dan klik Log In");
	}	
	
	@Then("^User dapat login ke Website")
	public void user_dapat_login_ke_Website() {
		loginPage.DisplayAlert();
		assertEquals(configurationProperties.getGetaccount(), loginPage.getDisplayLogin());
		extentTest.log(Status.PASS, "User dapat login ke Website");
	}
	
//	MASTER AKUN	
//	User Super Admin
	@When("^User klik menu Master User lalu klik Add New User")
	public void user_klik_menu_master_user_lalu_klik_add_new_user() {
		masteruserPage.MasterUser();
		extentTest.log(Status.PASS, "User klik menu Master User lalu klik Add New User");
	}
	
	@When("^User memasukan data di form add user dan klik Submit")
	public void user_memasukan_data_di_form_add_user_dan_klik_submit() {
		masteruserPage.formMasterUser(configurationProperties.getNikmasteruser(), configurationProperties.getNamemasteruser(), 
				configurationProperties.getUsernamemasteruser(), configurationProperties.getPasswordmasteruser(), 
				configurationProperties.getEmailmasteruser(), configurationProperties.getPicturemasteruser());
		extentTest.log(Status.PASS, "User memasukan data di form add user dan klik Submit");
	}
	
	@Then("^User berhasil membuat akun")
	public void user_berhasil_membuat_akun() {
		masteruserPage.getDisplayMasterAkun();
		assertEquals(configurationProperties.getGetaccountmasteruser(), masteruserPage.getDisplayMasterAkun());
		extentTest.log(Status.PASS, "User berhasil membuat akun");
	}
	
	@When("^User klik ikon edit pada tabel")
	public void user_klik_ikon_edit_pada_tabel() {
		masteruserPage.editUser(configurationProperties.getUsernamedituser(), configurationProperties.getNamaedituser(),
				configurationProperties.getEmailedituser(), configurationProperties.getPictureedituser());
		extentTest.log(Status.PASS, "User klik ikon edit pada tabel");
	}
	
	@When("^User melakukan edit data lalu klik Submit")
	public void user_melakukan_edit_data_lalu_klik_submit() {
		masteruserPage.editUserBug();
		extentTest.pass("User melakukan edit data lalu klik Submit");
	}
	
	@Then("^User berhasil melakukan edit akun")
	public void user_berhasil_melakukan_edit_akun() {
	
		if(masteruserPage.getDisplayEdit().isDisplayed()) {
			
			try {
				Thread.sleep(1000);
				extentTest.fail("User gagal melakukan edit data setelah tombol Submit dengan screenshot dibawah", 
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			extentTest.log(Status.PASS, "User berhasil melakukan edit akun");	
		}	
	}
	
	@When("^User klik ikon delete pada tabel")
	public void user_klik_ikon_delete_pada_tabel() {
		masteruserPage.lanjuteditUser();
		masteruserPage.deleteUser(configurationProperties.getSearchuser());
		extentTest.log(Status.PASS, "User klik ikon delete pada tabel");
	}
	
	@Then("^User berhasil melakukan delete akun")
	public void user_berhasil_melakukan_delete_akun() {
		masteruserPage.getDisplayMasterAkun();
		assertEquals(configurationProperties.getGetaccountmasteruser(), masteruserPage.getDisplayMasterAkun());
		extentTest.log(Status.PASS, "User berhasil melakukan delete akun");
	}
	
//	MASTER PARAMETER UPLOAD
	@When("^User klik menu Master Parameter Upload lalu klik Add New")
	public void user_klik_menu_master_parameter_upload_lalu_klik_add_new() {
		masterparameterPage.MasterParameter();
		extentTest.log(Status.PASS, "User klik menu Master Parameter Upload lalu klik Add New");
	}
	
	@When("^User memasukan data di form parameter dan klik Submit")
	public void user_memasukan_data_di_form_parameter_dan_klik_submit() {
		masterparameterPage.formMasterParameter(configurationProperties.getNikmasterparameter(), configurationProperties.getNamemasterparameter(), 
				configurationProperties.getPositionmasterparameter(), configurationProperties.getBranchmasterparameter(), 
				configurationProperties.getAreamasterparameter(), configurationProperties.getSearchparameter());
		extentTest.log(Status.PASS, "User memasukan data di form parameter dan klik Submit");
	}
	
	@Then("^User berhasil membuat Data Pamameter Upload")
	public void user_berhasil_membuat_data_pamameter_upload() {
		masteruserPage.getDisplayMasterAkun();
		assertEquals(configurationProperties.getGetaccountmasterparameter(), masterparameterPage.getDisplayMasterAkun());
		extentTest.log(Status.PASS, "User berhasil membuat Data Pamameter Upload");
	}
	
//	MASTER POSTER
	@When("^User klik menu Master Poster lalu klik Upload Poster")
	public void user_klik_menu_master_poster_lalu_klik_upload_poster() {
//		masterposterPage.MasterPoster();
		extentTest.log(Status.PASS, "User klik menu Master Poster lalu klik Upload Poster");
	}
	
	@When("^User memasukan data di form upload poster dan klik Submit")
	public void user_memasukan_data_di_form_upload_dan_klik_submit() {
//		masterposterPage.formMasterPoster(configurationProperties.getGetaccountmasterposter(), 
//				configurationProperties.getPicturemasteruser(), configurationProperties.getSearchposter());
		extentTest.log(Status.PASS, "User memasukan data di form upload poster dan klik Submit");
	}
	
	@Then("^User berhasil membuat Poster")
	public void user_berhasil_membuat_poster() {
//		masterposterPage.getDisplayMasterPoster();
//		assertEquals(configurationProperties.getGetaccountmasterposter(), masterposterPage.getDisplayMasterPoster());
		extentTest.log(Status.PASS, "User berhasil membuat Data Pamameter Upload");
	}
	

	
	@After
	public void closeObject() {
		report.flush();
		
	}
	
	public static String captureScreen() throws IOException {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String dest ="D:\\SQA\\com.mobilesales.juaracoding.extentreport\\src\\test\\resources\\foto\\"
		+getcurrentdateandtime()+".png";
		File target = new File(dest);
		FileUtils.copyFile(src, target);
		return dest;
		}
	
	public static String getcurrentdateandtime(){
		String str = null;
		try{
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
			Date date = new Date();
			str= dateFormat.format(date);
			str = str.replace(" ", "-").replaceAll("/", "_").replaceAll(":", "_");
		} catch (Exception e){
			e.printStackTrace(); 
		}
		return str;
	}
}

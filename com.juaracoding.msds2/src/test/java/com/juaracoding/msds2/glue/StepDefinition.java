package com.juaracoding.msds2.glue;

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
import com.juaracoding.msds2.config.AutomationFrameworkConfiguration;
import com.juaracoding.msds2.driver.DriverSingleton;
import com.juaracoding.msds2.pages.HomePage;
import com.juaracoding.msds2.pages.LoginPage;
import com.juaracoding.msds2.pages.distribusidata.DistribusiDataPage;
import com.juaracoding.msds2.pages.uploadfilems.UploadFileMSPage;
import com.juaracoding.msds2.utils.ConfigurationProperties;
import com.juaracoding.msds2.utils.Constants;
import com.juaracoding.msds2.utils.TestCase;
import com.juaracoding.msds2.utils.Utils;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.spring.CucumberContextConfiguration;

@CucumberContextConfiguration
@ContextConfiguration(classes = AutomationFrameworkConfiguration.class)
public class StepDefinition {

	private static WebDriver driver;
	private LoginPage login;
	private HomePage homepage;
	private UploadFileMSPage uploadfilems;
	private DistribusiDataPage distribusidata;
	ExtentTest extentTest;
	static ExtentReports report = new ExtentReports();
	static ExtentSparkReporter htmlreporter = new ExtentSparkReporter("src/test/resources/reporttest.html");

	@Autowired
	ConfigurationProperties configurationProperties;

	@Before
	public void InitializeObject() {

		report.attachReporter(htmlreporter);
		DriverSingleton.getInstance(configurationProperties.getBrowser());
		login = new LoginPage();
		homepage = new HomePage();
		uploadfilems = new UploadFileMSPage();
		distribusidata = new DistribusiDataPage();
		TestCase[] tests = TestCase.values();
		extentTest = report.createTest(tests[Utils.testcount].getTestname());
		Utils.testcount++;

	}

	/* Upload File MS */

	@Given("User membuka url")
	public void openUrl() {
		driver = DriverSingleton.getDriver();
		driver.get(Constants.URL);
		extentTest.log(Status.PASS, "Url yang dibuka :" + Constants.URL);
	}

	@Given("Mengisi username dan password login lalu login")
	public void sendkeysUsernameAndPasswordSuperAdmin() {
		login.fillFormLogin(configurationProperties.getUsername1(), configurationProperties.getPassword1());
		login.clickBtnLogin();
		login.closeDisplayAlert();
		extentTest.log(Status.PASS, "Berhasil mengisi username dan password login lalu login");
	}

	@When("Klik menu Upload File MS")
	public void intoUploadFileMS() {
		homepage.toUploadFileMS();
		extentTest.log(Status.PASS, "User berhasil klik menu Upload File MS");
	}

	@When("Klik download template MS")
	public void Downloded() {
		uploadfilems.DownloadTemplateMS();
		extentTest.log(Status.PASS, "Berhasil klik download template MS");
	}

	@When("Klik Upload MS dan memasukan data di form upload file")
	public void fillTheUploadFileMSForm() {
		uploadfilems.fillFormUploadFileMS(configurationProperties.getFilepath(),
				configurationProperties.getTextKeterangan());
		extentTest.log(Status.PASS, "Berhasil Upload MS dan memasukan data di form upload file");
	}

	@When("Klik Submit")
	public void SubmitedUploadFileMS() {
		uploadfilems.Submit();
		extentTest.log(Status.PASS, "Berhasil klik submit");
	}

	@When("Klik Back dari upload file")
	public void BackFromUploadFile() {
		uploadfilems.fillFormUploadFileMS(configurationProperties.getFilepath(),
				configurationProperties.getTextKeterangan());
		uploadfilems.backFromUpload();
		extentTest.pass("Berhasil Klik Back");
	}

	@When("Sorting data customer")
	public void Sort() {
		uploadfilems.sorting();
		extentTest.pass("Berhasil sorting data customer");
	}

	@When("Pilih Jumlah Data")
	public void JumlahDataPilihan() {
		uploadfilems.pilihJumlahData(2);
		extentTest.pass("Berhasil pilih Jumlah Data");
	}

	@When("Klik Pindah Page")
	public void TestPindahPage() {
		uploadfilems.buttonPage();
		extentTest.pass("Berhasil klik Pindah Page");
	}

	@When("Scroll Page ke atas dengan button up")
	public void UpPage() {
		uploadfilems.goUp();
		extentTest.pass("Berhasil Scroll Page ke atas dengan button up");
	}

	@When("Mencari Data Upload File MS")
	public void searchingFile() {
		uploadfilems.Searching(configurationProperties.getTextUploader());
		extentTest.pass("Berhasil mencari Data Upload File MS");
	}

	@When("Klik Edit")
	public void ClickedEdit() {
		uploadfilems.EditFile();
		extentTest.pass("Berhasil Klik Edit");
	}

	@When("Isi form edit file")
	public void Edit() {
		uploadfilems.editUploadFile(configurationProperties.getTextNikPeruntukan(),
				configurationProperties.getTextNamaPeruntukan(), "File Telah Di Edit");
		extentTest.pass("Berhasil Edit file");
	}

	@When("Klik Submit Edit")
	public void SubmitEditFile() {
		uploadfilems.SubmitEdit();
		extentTest.pass("Berhasil Klik Submit Edit");
	}

	@When("Klik Back dari edit")
	public void BackFromEdit() {
		uploadfilems.EditFile();
		uploadfilems.BackFromEdit();
		extentTest.pass("Berhasil Klik Back dari edit");
	}

	@When("Klik Hapus File")
	public void Delete() {
		uploadfilems.DeletFile();
		extentTest.pass("Berhasil Klik Hapus File");
	}

	@When("Klik View")
	public void View() {
		uploadfilems.fillFormUploadFileMS(configurationProperties.getFilepath(),
				configurationProperties.getTextKeterangan());
		uploadfilems.Submit();
		uploadfilems.Searching(configurationProperties.getTextUploader());
		uploadfilems.ViewFile();
		extentTest.pass("Berhasil Klik View");
	}

	@When("Sorting data customer di view")
	public void SortView() {
		uploadfilems.sorting();
		extentTest.pass("Berhasil sorting data customer di view");
	}

	@When("Pilih Jumlah Data di view")
	public void JumlahPilihan() {
		uploadfilems.pilihJumlahData(2);
		extentTest.pass("Berhasil pilih Jumlah Data di view");
	}

	@When("Klik Pindah Page di view")
	public void TestPindahPageView() {
		uploadfilems.buttonPage();
		extentTest.pass("Berhasil klik Pindah Page di view");
	}

	@When("Mencari Data Customer")
	public void searchingCustomer() {
		uploadfilems.Searching(configurationProperties.getTextNamaCustomer());
		extentTest.pass("Berhasil mencari Data Data Customer");
	}

	@When("Klik back dari view")
	public void finnishuploadfilems() {
		uploadfilems.BackfromView();
	}

	@Then("User berhasil melakukan upload data MS dengan bukti yang mengupload sesuai")
	public void finnishedUploadFileMS() {
		uploadfilems.startDate(configurationProperties.getTextStartDate(), configurationProperties.getTextEndDate());
		if (uploadfilems.buktiUpload(1).equals(configurationProperties.getTextUploader())) {
			extentTest.log(Status.PASS, "User berhasil melakukan upload data MS dengan bukti yang mengupload sesuai");
		} else {
			try {
				Thread.sleep(1000);
				extentTest.fail(
						"User berhasil melakukan upload data MS dengan bukti yang mengupload sesuai"
								+ " tetapi ada kesalahan teknis dan screenshot terlampir di bawah",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		assertEquals(configurationProperties.getTextUploader(), uploadfilems.buktiUpload(1));
	}

	@Then("Tanggal Sesuai")
	public void cekTanggalUpload() {
		if (uploadfilems.buktiUpload(2).equals(configurationProperties.getTextEndDate())) {
			extentTest.log(Status.PASS, "User berhasil melakukan upload data MS dengan bukti tanggal sesuai");
		} else {
			try {
				Thread.sleep(1000);
				extentTest.fail(
						"User berhasil melakukan upload data MS dengan bukti tanggal sesuai"
								+ " tetapi ada kesalahan teknis dan screenshot terlampir di bawah",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		assertEquals(configurationProperties.getTextEndDate(), uploadfilems.buktiUpload(2));
	}

	@Then("Product Sesuai")
	public void cekProductUpload() {
		if (uploadfilems.buktiUpload(3).equals(configurationProperties.getTextProduct())) {
			extentTest.pass("User berhasil melakukan upload data MS dengan Product Sesuai");
		} else {
			try {
				Thread.sleep(1000);
				extentTest.fail(
						"User berhasil melakukan upload data MS dengan bukti Product Sesuai"
								+ " tetapi ada kesalahan teknis dan screenshot terlampir di bawah",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		assertEquals(configurationProperties.getTextProduct(), uploadfilems.buktiUpload(3));
	}

	@Then("Keterangan Sesuai")
	public void cekketeranganUpload() {
		if (uploadfilems.buktiUpload(4).equals(configurationProperties.getTextKeterangan())) {
			extentTest.pass("User berhasil melakukan upload data MS dengan bukti Keterangan Sesuai");
		} else {
			try {
				Thread.sleep(1000);
				extentTest.fail(
						"User berhasil melakukan upload data MS dengan bukti Keterangan Sesuai"
								+ " tetapi ada kesalahan teknis dan screenshot terlampir di bawah",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		assertEquals(configurationProperties.getTextKeterangan(), uploadfilems.buktiUpload(4));
	}

	@Then("TotalMS Sesuai")
	public void cekTotalMSUpload() {
		if (uploadfilems.buktiUpload(5).equals(configurationProperties.getTextTotalms())) {
			extentTest.pass("User berhasil melakukan upload data MS dengan bukti upload");
		} else {
			try {
				Thread.sleep(1000);
				extentTest.fail(
						"User berhasil melakukan upload data MS dengan bukti Product Sesuai"
								+ " tetapi ada kesalahan teknis dan screenshot terlampir di bawah",
						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		assertEquals(configurationProperties.getTextTotalms(), uploadfilems.buktiUpload(4));
	}

	/* Distribusi Data */

	@Given("User login ke user Supervisor")
	public void loginSupervisor() {
		login.Logout();
		login.fillFormLogin(configurationProperties.getUsername2(), configurationProperties.getPassword2());
		login.clickBtnLogin();
		login.closeDisplayAlert();
		extentTest.log(Status.PASS, "User berhasil login ke user Supervisor");
	}

	@When("Klik menu Distribusi")
	public void intoDistribusi() {
		homepage.toDistribusiData();
		extentTest.log(Status.PASS, "Berhasil klik menu Distribusi");
	}
	
	@When("Cek Kategori")
	public void CheckingKategori() {
		distribusidata.KategoriPilihan();
		extentTest.log(Status.PASS, "Berhasil klik kategori yang dipilih dan pilih "
				+ "mobile salesnya lalu pilih data customer yang ingin di distribusi");
	}

	@When("Klik kategori yang dipilih dan pilih Sales yang akan di distribusi")
	public void fillFormDistribusiData() {
		distribusidata.PickKategori();
		extentTest.log(Status.PASS, "Berhasil Klik kategori yang dipilih dan pilih Sales yang akan di distribusi");
	}
	
	@When("Pilih Filter data")
	public void chooseFilterdata() {
		distribusidata.SelectFilter();
		extentTest.log(Status.PASS, "Berhasil Pilih Filter data");
	}
	
	@When("Pilih Tampilan Jumlah Data")
	public void PilihTampilanJumlahData() {
		distribusidata.pilihJumlahData(2);
		extentTest.log(Status.PASS, "Berhasil Pilih Tampilan Jumlah Data");
	}
	
	@When("Pindah halaman tabel customer")
	public void PindahHalamanTabel() {
		distribusidata.buttonPage();
		extentTest.log(Status.PASS, "Berhasil Pindah halaman tabel customer");
	}
	
	@When("Mencari Data Customer yang ingin di pilih")
	public void SearchingDataCustomer() {
		distribusidata.Searching(configurationProperties.getTextNamaCustomer());
		extentTest.log(Status.PASS, "Berhasil Mencari Data Customer yang ingin di pilih");
	}
	
	@When("Pilih Customer")
	public void PickCustomer() {
		distribusidata.pickCustomer();
		extentTest.log(Status.PASS, "Berhasil Pilih Customer");
	}

	@When("Klik submit untuk distribusi data")
	public void submitedDistribusiData() {
		distribusidata.SubmitData();
		extentTest.log(Status.PASS, "Berhasil Klik submit untuk distribusi data");
	}

	@Then("User berhasil mendistribusi data ke mobile sales dengan tampilan total in proses")
	public void ViewInProses() {
//		if(distribusidata.getTextinproses().equals
//				(configurationProperties.getTextinproses())) {
//			extentTest.log(Status.PASS, "User berhasil mendistribusi data ke mobile sales dengan tampilan total in proses");
//		} else {
//			try {
//				Thread.sleep(1000);
//				extentTest.fail("User berhasil mendistribusi data ke mobile sales dengan tampilan total in proses tetapi ada kesalahan teknis dengan screenshot dibawah", 
//						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		assertEquals(configurationProperties.getTextinproses(), distribusidata.getTextinproses());
	}
	
	@Then("Tampilan Belum di pick up")
	public void ViewTampilanBelumPickUp() {
//		if(distribusidata.getTextbelumpickup().equals
//				(configurationProperties.getTextbelumdipickup())) {
//			extentTest.log(Status.PASS, "User berhasil mendistribusi data ke mobile sales dengan tampilan Belum di pick up");
//		} else {
//			try {
//				Thread.sleep(1000);
//				extentTest.fail("User berhasil mendistribusi data ke mobile sales dengan tampilan Belum di pick up tetapi ada kesalahan teknis dengan screenshot dibawah", 
//						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		assertEquals(configurationProperties.getTextbelumdipickup(), distribusidata.getTextbelumpickup());
	}
	
	@Then("Tampilan Jadwal Ulang")
	public void finnishedDistribusiData() {
//		if(distribusidata.getTextjadwalulang().equals
//				(configurationProperties.getTextjadwalulang())) {
//			extentTest.log(Status.PASS, "User berhasil mendistribusi data ke mobile sales dengan tampilan Jadwal Ulang");
//		} else {
//			try {
//				Thread.sleep(1000);
//				extentTest.fail("User berhasil mendistribusi data ke mobile sales dengan tampilan Jadwal Ulang tetapi ada kesalahan teknis dengan screenshot dibawah", 
//						MediaEntityBuilder.createScreenCaptureFromPath(captureScreen()).build());
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		assertEquals(configurationProperties.getTextjadwalulang(), distribusidata.getTextjadwalulang());
	}

	@After
	public void closeObject() {
		report.flush();

	}

	public static String captureScreen() throws IOException {
		TakesScreenshot screen = (TakesScreenshot) driver;
		File src = screen.getScreenshotAs(OutputType.FILE);
		String dest = "D:\\Latihan_Dika\\SQA\\KERJAPRAKTIK\\com.juaracoding.msds2\\src\\test\\resources\\foto\\"
				+ getcurrentdateandtime() + ".png";
		File target = new File(dest);
		FileUtils.copyFile(src, target);
		return dest;
	}

	public static String getcurrentdateandtime() {
		String str = null;
		try {
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
			Date date = new Date();
			str = dateFormat.format(date);
			str = str.replace(" ", "-").replaceAll("/", "_").replaceAll(":", "_");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return str;
	}

}

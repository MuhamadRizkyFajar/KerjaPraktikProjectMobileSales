package com.mobilesales.juaracoding.extentreport.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {
	
	@Value("${browser}")
	private String browser;
	
	@Value("${name1}")
	private String name1;
	
	@Value("${password1}")
	private String password1;
	
	@Value("${textafterlogin1}")
	private String textafterlogin1;
	
	@Value("${name2}")
	private String name2;
	
	@Value("${password2}")
	private String password2;
	
	@Value("${textafterlogin2}")
	private String textafterlogin2;
	
	@Value("${name3}")
	private String name3;
	
	@Value("${password3}")
	private String password3;
	
	@Value("${textafterlogin3}")
	private String textafterlogin3;
	
	@Value("${searchsummarymsdetail}")
	private String searchsummarymsdetail;
	
	@Value("${searchsummarymsdetail2}")
	private String searchsummarymsdetail2;
	
	@Value("${nikmasteruser}")
	private String nikmasteruser;
	
	@Value("${namemasteruser}")
	private String namemasteruser;
	
	@Value("${usernamemasteruser}")
	private String usernamemasteruser;
	
	@Value("${passwordmasteruser}")
	private String passwordmasteruser;
	
	@Value("${emailmasteruser}")
	private String emailmasteruser;
	
	@Value("${picturemasteruser}")
	private String picturemasteruser;
	
	@Value("${getaccountmasteruser}")
	private String getaccountmasteruser;
	
	@Value("${usernamedituser}")
	private String usernamedituser;

	@Value("${namaedituser}")
	private String namaedituser;
	
	@Value("${emailedituser}")
	private String emailedituser;
	
	@Value("${pictureedituser}")
	private String pictureedituser;
	
	@Value("${searchuser}")
	private String searchuser;
	
	@Value("${nikmasterparameter}")
	private String nikmasterparameter;
	
	@Value("${namemasterparameter}")
	private String namemasterparameter;
	
	@Value("${positionmasterparameter}")
	private String positionmasterparameter;
	
	@Value("${branchmasterparameter}")
	private String branchmasterparameter;
	
	@Value("${areamasterparameter}")
	private String areamasterparameter;
	
	@Value("${getaccountmasterparameter}")
	private String getaccountmasterparameter;
	
	@Value("${searchparameter}")
	private String searchparameter;
	
	@Value("${programnameposter}")
	private String programnameposter;
	
	@Value("${getaccountmasterposter}")
	private String getaccountmasterposter;
	
	@Value("${searchposter}")
	private String searchposter;
	
	@Value("${editusersucces}")
	private String editusersucces;
	
	@Value("${picturemasterposter}")
	private String picturemasterposter;
	
	@Value("${tanggalawalsummaryms}")
	private String tanggalawalsummaryms;
	
	@Value("${tanggalakhirsummaryms}")
	private String tanggalakhirsummaryms;
	
	@Value("${searchsummaryms}")
	private String searchsummaryms;

	public String getSearchsummaryms() {
		return searchsummaryms;
	}

	public String getTanggalawalsummaryms() {
		return tanggalawalsummaryms;
	}

	public String getTanggalakhirsummaryms() {
		return tanggalakhirsummaryms;
	}

	public String getPicturemasterposter() {
		return picturemasterposter;
	}

	public String getEditusersucces() {
		return editusersucces;
	}

	public String getBrowser() {
		return browser;
	}

	public String getNikmasteruser() {
		return nikmasteruser;
	}

	public String getNamemasteruser() {
		return namemasteruser;
	}

	public String getUsernamemasteruser() {
		return usernamemasteruser;
	}

	public String getPasswordmasteruser() {
		return passwordmasteruser;
	}

	public String getEmailmasteruser() {
		return emailmasteruser;
	}

	public String getPicturemasteruser() {
		return picturemasteruser;
	}

	public String getGetaccountmasteruser() {
		return getaccountmasteruser;
	}

	public String getUsernamedituser() {
		return usernamedituser;
	}

	public String getNamaedituser() {
		return namaedituser;
	}

	public String getEmailedituser() {
		return emailedituser;
	}

	public String getPictureedituser() {
		return pictureedituser;
	}

	public String getSearchuser() {
		return searchuser;
	}

	public String getNikmasterparameter() {
		return nikmasterparameter;
	}

	public String getNamemasterparameter() {
		return namemasterparameter;
	}

	public String getPositionmasterparameter() {
		return positionmasterparameter;
	}

	public String getBranchmasterparameter() {
		return branchmasterparameter;
	}

	public String getAreamasterparameter() {
		return areamasterparameter;
	}

	public String getGetaccountmasterparameter() {
		return getaccountmasterparameter;
	}

	public String getSearchparameter() {
		return searchparameter;
	}

	public String getProgramnameposter() {
		return programnameposter;
	}

	public String getGetaccountmasterposter() {
		return getaccountmasterposter;
	}

	public String getSearchposter() {
		return searchposter;
	}
	
	public String getSearchsummarymsdetail() {
		return searchsummarymsdetail;
	}

	public String getSearchsummarymsdetail2() {
		return searchsummarymsdetail2;
	}

	public String getName1() {
		return name1;
	}

	public String getPassword1() {
		return password1;
	}

	public String getTextafterlogin1() {
		return textafterlogin1;
	}

	public String getName2() {
		return name2;
	}

	public String getPassword2() {
		return password2;
	}

	public String getTextafterlogin2() {
		return textafterlogin2;
	}

	public String getName3() {
		return name3;
	}

	public String getPassword3() {
		return password3;
	}

	public String getTextafterlogin3() {
		return textafterlogin3;
	}


}

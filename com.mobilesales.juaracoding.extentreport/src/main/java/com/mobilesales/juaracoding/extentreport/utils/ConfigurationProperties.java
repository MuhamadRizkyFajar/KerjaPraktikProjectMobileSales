package com.mobilesales.juaracoding.extentreport.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {
	
	@Value("${browser}")
	private String browser;
	
	@Value("${usernamelogin}")
	private String username;
	
	@Value("${passwordlogin}")
	private String password;
	
	@Value("${getaccount}")
	private String getaccount;
	
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

	public String getBrowser() {
		return browser;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getGetaccount() {
		return getaccount;
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
	
	
	
	

	
	
	
}

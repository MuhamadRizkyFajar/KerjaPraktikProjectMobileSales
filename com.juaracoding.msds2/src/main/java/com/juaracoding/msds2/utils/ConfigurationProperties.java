package com.juaracoding.msds2.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Getter;

@Getter

@Component
@PropertySource("framework.properties")
public class ConfigurationProperties {
	
	@Value("${browser}")
	private String browser;
	
	@Value("${name1}")
	private String username1;
	
	@Value("${password1}")
	private String password1;
	
	@Value("${textafterlogin1}")
	private String textafterlogin1;
	
	@Value("${name2}")
	private String username2;
	
	@Value("${password2}")
	private String password2;
	
	@Value("${textafterlogin2}")
	private String textafterlogin2;
	
	@Value("${name3}")
	private String username3;
	
	@Value("${password3}")
	private String password3;
	
	@Value("${textafterlogin3}")
	private String textafterlogin3;
	
	@Value("${NIK}")
	private String NIK;
	
	@Value("${nama}")
	private String nama;
	
	@Value("${akun}")
	private String akun;
	
	@Value("${katasandi}")
	private String katasandi;
	
	@Value("${email}")
	private String email;
	
	@Value("${lokasifoto}")
	private String pathphoto;
	
	@Value("${textaftercreateuser}")
	private String textaftercreateuser;
	
	@Value("${posisi}")
	private String position;
	
	@Value("${branch}")
	private String branch;
	
	@Value("${area}")
	private String area;
	
	@Value("${namaprogram}")
	private String programname;
	
	@Value("${lokasiposter}")
	private String posterpath;
	
	@Value("${lokasifile}")
	private String filepath;
	
	@Value("${keterangan}")
	private String textKeterangan;
	
	@Value("${tanggalmulai}")
	private String textStartDate;
	
	@Value("${tanggalakhir}")
	private String textEndDate;
	
	@Value("${totalms}")
	private String textTotalms;
	
	@Value("${uploader}")
	private String textUploader;
	
	@Value("${productcard}")
	private String textProduct;
	
	@Value("${NIKPeruntukan}")
	private String textNikPeruntukan;
	
	@Value("${NamaPeruntukan}")
	private String textNamaPeruntukan;
	
	@Value("${NamaCustomer}")
	private String textNamaCustomer;
	
	@Value("${productcard2}")
	private String textProductView;
	
	@Value("${inproses}")
	private String textinproses;
	
	@Value("${belumdipickup}")
	private String textbelumdipickup;
	
	@Value("${jadwalulang}")
	private String textjadwalulang;
	
	@Value("${fotoktp}")
	private String textFotoKTP;
	
	@Value("${fotonpwp}")
	private String textFotoNPWP;
	
	@Value("${fotobukti}")
	private String textFotoBUKTI;
	
	@Value("${notes}")
	private String textnotes;
	
	@Value("${textafterworklist}")
	private String textafterworklist;
	
	@Value("${textaftercompletedlist}")
	private String textaftercompletedlist;
	
//	@Value("${textaftersummarms}")
//	private String textaftersummaryms;
}

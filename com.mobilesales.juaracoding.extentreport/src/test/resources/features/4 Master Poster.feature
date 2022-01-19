Feature: MobileSales Master Poster

	Scenario: Testing fungsi Master Poster
		When User klik menu Master Poster lalu klik Upload Poster
		And User memasukan data di form upload poster dan klik Submit
		Then User berhasil membuat Poster
		
	Scenario: Testing Fungsi Edit Master Poster	
		When User klik ikon edit pada tabel poster
		And User melakukan edit status lalu klik Submit
		Then User berhasil melakukan edit poster
		
	Scenario: Testing Fungsi Delete Master Poster	
		When User klik ikon delete pada tabel poster
		Then User berhasil melakukan delete poster
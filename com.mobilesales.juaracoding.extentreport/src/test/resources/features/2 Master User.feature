Feature: MobileSales Master User

	Scenario: Testing fungsi New Master User
		When User klik menu Master User lalu klik Add New User
		And User memasukan data di form add user dan klik Submit
		Then User berhasil membuat akun
		
	Scenario: Testing fungsi Edit Master User	
		When User klik ikon edit pada tabel
		And User melakukan edit data lalu klik Submit
		Then User berhasil melakukan edit akun
		
	Scenario: Testing fungsi Delete Master User	
		When User klik ikon delete pada tabel
		Then User berhasil melakukan delete akun
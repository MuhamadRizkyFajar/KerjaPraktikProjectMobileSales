Feature: MobileSales Master User

	Scenario: Testing Fungsi New Master User
		When User klik menu Master User lalu klik Add New User
		And User memasukan data di form add user dan klik Submit
		Then User berhasil membuat akun
		
	Scenario: Testing Fungsi Edit Master User	
		When User klik ikon edit pada tabel user
		And User melakukan edit data user lalu klik Submit
		Then User berhasil melakukan edit akun user
		
	Scenario: Testing Fungsi Delete Master User	
		When User klik ikon delete pada tabel user
		Then User berhasil melakukan delete akun
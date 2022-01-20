Feature: Modul Worklist

  @tag1
  Scenario: Test Modul Worklist
    Given User masuk ke user Mobile Sales
    When Klik menu Worklist
    And Klik customer yang ingin di survey dan isi form survey worklist
    And Klik submit modul Worklist
    Then User berhasil survey worklist

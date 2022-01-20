Feature: Modul Completed list

  Scenario: Test Modul Completed List Mobile Sales
    When User klik completedlist di user Mobile Sales
    And Mengisi tanggal mulai dan memfilter pilih salah satu data customer untuk melihat detailnya di user Mobile Sales
    Then User dapat melihat detail data customer yang dipilih di user Mobile Sales
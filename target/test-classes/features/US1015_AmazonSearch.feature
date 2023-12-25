Feature: US1015 Kullanici amazon anasayfada arama yapar


  Scenario: TC18 Kullanici amazonda Nutella aratir

    Given kullanici "amazonUrl" anasayfaya gider
    And arama kutusuna Nutella yazip aratir
    Then arama sonuclarinin Nutella icerdigini test eder



  Scenario: TC19 Kullanici amazonda Java aratir
    Given kullanici "amazonUrl" anasayfaya gider
    And arama kutusuna Java yazip aratir
    Then arama sonuclarinin Java icerdigini test eder
    And 2 saniye bekler
    And sayfayi kapatir


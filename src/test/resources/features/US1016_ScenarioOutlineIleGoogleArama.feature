Feature: US1016 verilen listedeki urunleri google'da arama

  # verilen listedeki her urunu google'da aratip
  # arama sonuclarinin aranan urun ismini icerdigini test edin
  @wip
  Scenario Outline: TC20 google'da listedeki urunler aratilabilmeli

    Given kullanici "googleUrl" anasayfaya gider
    Then google da "<istenenKelime>" icin arama yapar
    And google arama sonuclarinin "<istenenKelime>" icerdigini test eder
    And sayfayi kapatir

    Examples:
      | istenenKelime |
      | Mars           |
      | BBC         |
      | Apple         |
      | Youtube       |
      | ISTQB         |

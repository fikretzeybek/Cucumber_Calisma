Feature: US1011_DemoGuru WebTable hucre bilgisini yazdirabilmeli


  Scenario: Kullanici istedigi satir ve sutundaki bilgiyi yazdirir

    Given kullanici "Demo_Guru_Url" anasayfaya gider
    And kullanici satir nosu "Demo_SatirNo" ve sutun nosu "Demo_SutunNo" olan hucredeki yaziyi yazdirir
    And sayfayi kapatir
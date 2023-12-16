Feature:US1009 Kullanici kayit olusturabilmeli


  Scenario Outline: TC15 farkli kayitlar olusturulabilmeli

    When kullanici "editorUrl" anasayfaya gider
    Then new butonuna basar
    And 1 saniye bekler
    And "<isim>" "<soyisim>" "<position>" "<office>" "<extension>" "<startDate>" "<salary>" bilgilerini girer
    And 1 saniye bekler
    And Create tusuna basar
    And 1 saniye bekler
    When kullanici "<isim>" ve "<soyisim>" ile arama yapar
    And 2 saniye bekler
    Then isim bolumunde "<isim>" oldugunu test eder
    And 1 saniye bekler
    And sayfayi kapatir

    Examples:
      |isim |soyisim|position|office  |extension |startDate|salary|
      |Ali  |Can    |Junior  |Ankara  |-         |2023-11-10|20000|
      |Veli |Cem    |Junior  |Ankara  |-         |2023-11-20|25000|
      |Ayse |Bir    |Senior  |Istanbul|teamLead  |2023-11-20|40000|
      |Elif |Tok    |Junior  |Istanbul|manuel    |2023-12-10|19000|
      |Gul  |Bak    |Senior  |Istanbul|manuel    |2023-12-11|30000|
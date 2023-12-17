Feature:


  @wip
  Scenario:The user goes to the homepage and verifies the number of links

    Given kullanici "bestBuyUrl" anasayfaya gider
    Then The user clicks on the Canada link
    Then The user clicks on the Shop link
    Then The user selects Computers, Tablets, & Accessories from the shop by category dropdown menu
    Then The user clicks on the shop all button
    Then The user verifies that the number of cells in the table is "cellSayisi"
    And the user scroll to bottom of page
    Then The user enter a valid mail in mail box and clicks signup button
    And the user closes the page
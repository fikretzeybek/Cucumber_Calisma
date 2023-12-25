package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepdefinitions {

    AmazonPage amazonPage=new AmazonPage();


    @And("arama kutusuna Nutella yazip aratir")
    public void arama_kutusuna_nutella_yazip_aratir() {

        amazonPage.aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
    }
    @Then("arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {

        String expectedIcerik = "Nutella";
        String actualAramaSonucu = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));
    }

    @And("arama kutusuna Java yazip aratir")
    public void arama_kutusuna_java_yazip_aratir() {

        amazonPage.aramaKutusu.sendKeys("Java" + Keys.ENTER);
    }
    @Then("arama sonuclarinin Java icerdigini test eder")
    public void arama_sonuclarinin_java_icerdigini_test_eder() {

        String expectedIcerik = "Java";
        String actualAramaSonucu = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualAramaSonucu.contains(expectedIcerik));
    }



    @Then("arama kutusuna {string} yazip aratir")
    public void arama_kutusuna_yazip_aratir(String arananUrun) {
        amazonPage.aramaKutusu.sendKeys(arananUrun + Keys.ENTER);
    }
    @Then("arama sonuclarinin {string} icerdigini test eder")
    public void arama_sonuclarinin_icerdigini_test_eder(String arananUrun) {

        String actualSonucYazisi = amazonPage.sonucYaziElementi.getText();
        Assert.assertTrue(actualSonucYazisi.contains(arananUrun));
    }

    @Then("ilk urunu tiklar")
    public void ilk_urunu_tiklar() {
        amazonPage.ilkUrunElementi.click();
    }
    @Then("urun isminin {string} icerdigini test eder")
    public void urun_isminin_icerdigini_test_eder(String arananUrun) {

        String actualIlkUrunIsmi = amazonPage.ilkUrunIsimElementi.getText();

        Assert.assertTrue(actualIlkUrunIsmi.contains(arananUrun));
    }
    @And("cookies kabul eder")
    public void cookiesKabulEder() {
        amazonPage.cookiesKabulButonu.click();
    }
}

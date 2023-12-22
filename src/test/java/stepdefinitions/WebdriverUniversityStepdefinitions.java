package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.WebUniPage;
import utilities.ConfigReader;
import utilities.Driver;

public class WebdriverUniversityStepdefinitions {

    WebUniPage page = new WebUniPage();

    @Given("ourProduct linkine tiklamak icin iFrame'e gecis yapar")
    public void our_product_linkine_tiklamak_icin_i_frame_e_gecis_yapar() {
        Driver.getDriver().switchTo().frame(page.iFrameElementi);
    }
    @Given("Our Products butonuna basar")
    public void our_products_butonuna_basar() {
    page.ourProductLinki.click();
    }
    @Then("acilan sayfada Cameras'i tiklar")
    public void acilan_sayfada_cameras_i_tiklar() {
    page.camerasElementi.click();
    }
    @Then("Popup mesajini yazdirir")
    public void popup_mesajini_yazdirir() {
        System.out.println(page.alertYaziElementi.getText());
    }
    @Then("close butonuna basar")
    public void close_butonuna_basar() {
    page.alertKapatButonu.click();
    }
    @Then("iFrame'den cikis yapar")
    public void i_frame_den_cikis_yapar() {
    Driver.getDriver().switchTo().defaultContent();
    }
    @Then("WebdriverUniversity.com \\(IFrame) linkini tiklar")
    public void webdriver_university_com_i_frame_linkini_tiklar() {
    page.webDriverLinki.click();
    }
    @Then("acilan sayfa url'inin {string} oldugunu test eder")
    public void acilan_sayfa_url_inin_oldugunu_test_eder(String expectedUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }

}

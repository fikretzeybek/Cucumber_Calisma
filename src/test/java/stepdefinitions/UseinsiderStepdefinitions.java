package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.UseinsiderPage;
import utilities.ReusableMethods;

public class UseinsiderStepdefinitions {
    UseinsiderPage useinsiderPage = new UseinsiderPage();

    @Then("kullanici cookies kabul eder")
    public void kullanici_cookies_kabul_eder() {
        useinsiderPage.cookiesElementi.click();
    }

    @Then("Campany butonuna tiklar")
    public void campany_butonuna_tiklar() {
        ReusableMethods.istenenWebelementScreenshot(useinsiderPage.cookiesElementi);
        useinsiderPage.campanyElementi.click();

    }

    @Then("Careers secer")
    public void careers_secer() {

    }

}

package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HerokuupPage;

public class HerokuupStepdefinitions {

    HerokuupPage herokuupPage = new HerokuupPage();

    @When("kullanici Add Element butonuna basar")
    public void kullanici_add_element_butonuna_basar() {
herokuupPage.addElementButonu.click();
    }
    @When("Delete butonu’nun gorunur oldugunu test eder")
    public void delete_butonu_nun_gorunur_oldugunu_test_eder() {

    }
    @Then("Delete tusuna basar")
    public void delete_tusuna_basar() {

    }
    @Then("Add Remove Elements yazisinin gorunur oldugunu test eder")
    public void add_remove_elements_yazisinin_gorunur_oldugunu_test_eder() {

    }
}

package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.BestBuyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class BestBuyStepdefinitions {

    BestBuyPage bestBuyPage = new BestBuyPage();

    @Then("The user clicks on the Canada link")
    public void the_user_clicks_on_the_canada_link() {
        ReusableMethods.bekle(3);
        bestBuyPage.canadaElementi.click();
    }

    @Then("The user clicks on the Shop link")
    public void the_user_clicks_on_the_shop_link() {

        bestBuyPage.shopButonElementi.click();
    }

    @Then("The user selects Computers, Tablets, & Accessories from the shop by category dropdown menu")
    public void the_user_selects_computers_tablets_accessories_from_the_shop_by_category_dropdown_menu() {
        bestBuyPage.compTabAccWebelementi.click();
    }

    @Then("The user clicks on the shop all button")
    public void the_user_clicks_on_the_shop_all_button() {
        ReusableMethods.bekle(1);
        bestBuyPage.shopAllElementi.click();
        ReusableMethods.bekle(2);

    }

    /*


     */
    @Then("The user verifies that the number of cells in the table is {int}")
    public void the_user_verifies_that_the_number_of_cells_in_the_table_is(int cellSayisi) {
       ReusableMethods.bekle(3);
        List<String> kategoriElementleriList = ReusableMethods.stringListeDonustur(bestBuyPage.pElementi);
        int actualCellDataSayisi = kategoriElementleriList.size();
        int expectedCellDataSayisi = 12;
        Assert.assertEquals(expectedCellDataSayisi, actualCellDataSayisi);


    }

    @Then("the user scroll to bottom of page")
    public void the_user_scroll_to_bottom_of_page() {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    @Then("The user enter a valid mail in mail box and clicks signup button")
    public void the_user_enter_a_valid_mail_in_mail_box_and_clicks_signup_button() {
        Actions actions = new Actions(Driver.getDriver());
        actions.click(bestBuyPage.emailKutusu)
                .sendKeys("ali@ali.com")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ENTER)
                .perform();

    }

    @Then("the user closes the page")
    public void the_user_closes_the_page() {
        Driver.quitDriver();
    }


}

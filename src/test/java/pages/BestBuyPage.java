package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BestBuyPage {

    public BestBuyPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='canada-link'])[1]")
    public WebElement canadaElementi;

    @FindBy(xpath = "//*[@data-automation='x-shop']")
    public WebElement shopButonElementi;

    @FindBy(xpath = "//*[@href='/en-ca/category/computers-tablets/20001']")
    public WebElement compTabAccWebelementi;

}

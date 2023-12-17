package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class UseinsiderPage {

    public void Useinsider(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//*[@id='wt-cli-accept-btn']")
    public WebElement cookiesElementi;

    @FindBy(xpath = "(//*[@class='nav-link dropdown-toggle'])[5]")
    public WebElement campanyElementi;
}



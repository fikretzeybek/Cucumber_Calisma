package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class BestBuyPage {

    public BestBuyPage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@class='canada-link'])[1]")
    public WebElement canadaElementi;

    @FindBy(xpath = "//*[@data-automation='x-shop']")
    public WebElement shopButonElementi;

    @FindBy(xpath = "(//*[@tabindex='-1'])[4]")
    public WebElement shopAllElementi;


    @FindBy(partialLinkText = "Accessories")
    public WebElement compTabAccWebelementi;

    @FindBy(xpath = "(//*[@class='col-xs-4_1EA1G col-sm-2_ZxGIs category_LRby8'])[1]")
    public WebElement pcElementi;



/*
    @FindBy(partialLinkText = "MacBooks")
    public WebElement macBookWebelementi;

 @FindBy(className = "col-xs-4_1EA1G col-sm-2_ZxGIs category_LRby8")
    public List<WebElement> categoryElementleri;


    @FindBy(className = "menuLink_Py2IM menuLinkActive_If8sy")
    public WebElement compAccTabElementi;


     */


}

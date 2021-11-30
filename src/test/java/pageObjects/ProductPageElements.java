package pageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductPageElements extends DriverHolder {
    public ProductPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement checkoutBtn() {
        return getElementByXpath("//a[@href='/checkout']");
    }

    public WebElement optionTransferExistingFiberLine() {
        return getElementsByXpath("//*[contains(@class, 'mat-radio-container')]").get(1);
    }

    public WebElement addRecommendedToOrderBtn(){
        return getElementByXpath("//span[contains(@class, 'recommended')]");
    }

    public WebElement voipOptionInSummary(){
        return getElementByXpath("//td[contains(text(), ' MWEB VoIP Lite - 250 Minutes ')]");
    }

    public WebElement microsoftOfficeInSummary(){
        return getElementByXpath("//td[contains(text(), ' Office 365 (Home - 12 Month Plan) ')]");

    }

    public WebElement removeVoIpFromOrder(){
        return getElementsByXpath("//span[contains(@class, 'remove-item')]").get(0);
    }

    public WebElement microsoftOfficeTooltip(){
        return getElementByXpath("//div[@product-code='MS-OFFICE-365-HOME-12MONTH-APR20']");
    }

    public WebElement addOfficeFromTooltipBtn(){
        return getElementByXpath("//a[@href='/add-microsoft-365-6-users-to-cart']");
    }

    public WebElement vOIPTooltip(){
        return getElementByXpath("//div[@product-code='VOIP-LITE']");
    }

    public WebElement addOVoIPFromTooltipBtn(){
        return getElementByXpath("//a[@href='/add-voip-250-minutes-to-cart']");
    }

    public WebElement upsizeDealTooltip(){
        return getElementByXpath("//*[contains(@class, 'upsizedeal')]");
    }

    public WebElement  upsizeDealBtn(){
        return getElementsByXpath("//button[contains(@id, '10')]").get(0);
    }

    public WebElement headingOfProduct(){
        return getElementsByXpath("//h1").get(0);
    }
    //input[@id='name']
}

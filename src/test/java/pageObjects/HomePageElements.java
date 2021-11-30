package pageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageElements extends DriverHolder {
    public HomePageElements(WebDriver driver) {
        super(driver);
    }

    public String fibreIsReadyXpath =  "//*[contains(text(), 'Fibre is ready for installation!')]";

    public WebElement enterAddressField() {
        return getElementsByXpath("//input[contains(@class, 'coverage')]").get(0);
    }

    public WebElement checkCoverageButton() {
        return getElementByXpath("//button[contains(@class, 'coverage')]");
    }

    public WebElement searchResult() {
        return getElementByXpath("//*[contains(@class, 'focus-visible')]");
    }

    public WebElement fibreIsReadyBanner() {
        return getElementByXpath(fibreIsReadyXpath);
    }

    public WebElement lteIsReadyBanner() {
        return getElementByXpath("//*[contains(text(), 'You can get LTE!')]");
    }

    public WebElement changeAddressBtn() {
        return getElementsByXpath("//input[contains(@class, 'coverage')]").get(0);
    }

    public WebElement fibreViewProductsBtn() {
        return getElementsByXpath("//a[@href='/fibre']").get(1);
    }

    public WebElement lteViewProductsBtn() {
        return getElementsByXpath("//a[contains(@class, 'btn-view-products')]").get(1);
        //        return getElementsByXpath("//a[@href='/lte']").get(1);
    }

    public WebElement firstSearchResultFromList() {
        return getElementByXpath("//div[@class='pac-item']");
    }

    public WebElement oneMonthFreeModalCloseBtn() {
        return getElementByXpath("//*[contains(@class, 'mat-dialog-content')]");
    }
    public WebElement confirmSearch() {
        return getElementByXpath("//div[@class='pac-container pac-logo hdpi']");
    }
    public WebElement noEle() {
        return getElementByXpath("//mat-radio-button[@id='mat-radio-11']");
    }
    public WebElement noElem() {
        return getElementByXpath("//mat-radio-button[@id='mat-radio-18']");
    }
    public WebElement absa() {
        return getElementByXpath("//mat-radio-button[@id='mat-radio-21']");
    }

    public WebElement savings() {
        return getElementByXpath("//mat-radio-button[@id='mat-radio-25']");
    }
    public WebElement terms() {
        return getElementByXpath("//mat-checkbox[@id='terms']");
    }
    public WebElement creditcheck() {
        return getElementByXpath("//mat-checkbox[@id='creditcheck']");
    }
    public WebElement confirmOrder() {
        return getElementByXpath("//div[@class='customer-info-submit-container']");
    }
    public WebElement loginBTN() {
        return getElementByXpath("//a[text()='Login']");
    }
    public WebElement loginBTNSubmit() {
        return getElementByXpath("//button[@id='btn-login']");
    }
    public WebElement fullaccess() {
        return getElementByXpath("//button[text()='Full Access ']");
    }
    public WebElement VerifyPin() {
        return getElementByXpath("//button[text()='Verify PIN ']");
    }
    public WebElement addProduct() {
        return getElementByXpath("//button[@id='btn-restricted'][1]");
    }
    public WebElement homeBTN() {
        return getElementByXpath("//img[contains(@alt, 'MWEB')][1]");
    }

    //button[@id='btn-restricted']
    public WebElement freestanding() {
        return getElementByXpath("//mat-radio-button[@id='mat-radio-13']");
    }
    public WebElement suburd1() {
        return getElementByXpath("//div[@id='mat-select-value-3']");
    }
    public WebElement suburd2() {
        return getElementByXpath("//mat-option[@id='mat-option-15']");
    }
    public WebElement trackorderBTN() {
        return getElementByXpath("//a[@class='btn button-primary order-confirmation-button-track-order ng-star-inserted']");
    }
    public WebElement ordernumber() {
        return getElementByXpath("//span[@class='ml-3']");
    }


    public WebElement xBtn() {
        return getElementByXpath("//button[@class='close-x-btn']");
    }

    public WebElement closeBtn() {
        return getElementByXpath("//button[contains(@class, 'close-btn')]");
    }

    public WebElement moreBtn() {
        return getElementByXpath("//li[contains(@class, 'main-more-products show')]");
    }

    public WebElement adslBtn() {
        return getElementsByXpath("//a[contains(@href, 'adsl')]").get(1);
    }

    public WebElement voPiBtn() {
        return getElementsByXpath("//a[contains(@href, 'voip')]").get(1);
    }
}

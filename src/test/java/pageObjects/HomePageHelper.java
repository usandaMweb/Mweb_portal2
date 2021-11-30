package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class HomePageHelper extends HomePageElements {
    public HomePageHelper(WebDriver driver) {
        super(driver);
    }

    public boolean isFibreDisplayed() {
        waitForElementAppears(3, fibreIsReadyXpath);
        return isElementDisplayed(fibreIsReadyBanner());
    }

    public boolean isLTeDisplayed() {
        return isElementDisplayed(lteIsReadyBanner());
    }

    @Step("Search address")
    public HomePageHelper searchAddress(String address) {
        waitMileSeconds(2000);
        enterAddressField().sendKeys(address);
        enterAddressField().click();
        waitForElementToBeClickable(firstSearchResultFromList());
        firstSearchResultFromList().click();
        return new HomePageHelper(driver);
    }

    public void closeModalIfExist() {
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        if (isModalExist()) {
            closeModal();
        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public boolean isModalExist() {
        String bannerXpath = "//*[contains(@class, 'mat-dialog-content')]";
        boolean isModalDisplayed =
                false;
        try {
            isModalDisplayed = ((WebElement) driver.findElements(By.xpath(bannerXpath))).isDisplayed();
        } catch (Exception e) {

        }
        return checkIsModalPresent(bannerXpath) && isModalDisplayed;
    }

    @Step("Check if modal displayed")
    public boolean checkIsModalPresent(String xpath) {
        try {
            return driver.findElements(By.xpath(xpath)).size() > 0;
        } catch (Exception e) {
            return false;
        }
    }

    @Step("Close modal")
    public void closeModal() {
        waitSec(8);
        waitUntilElementsDisplayed(3, "//*[contains(@class, 'mat-dialog-content')]");
        moveMouseToElement(closeBtn());
        xBtn().click();
    }

    public void waitSec(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {

        }
    }

    public void makeVisibleSearchList() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        waitMileSeconds(5000);
        js.executeScript("document.querySelector(\"div[class='pac-container pac-logo hdpi']\").setAttribute('style', 'display: block;');");

    }

    @Step("Select ADSL page")
    public void selectAdsl() {
        moveMouseToElement(adslBtn());
        adslBtn().click();
    }

    public void selectVoip() {
        moveMouseToElement(voPiBtn());
        voPiBtn().click();
    }

    @Step("Check of search address field displayed")
    public boolean isFieldDisplayed() {
        return isElementDisplayed(enterAddressField());
    }

    public void searchAddressGlobal(String address){
        goToHomePage();
        searchAddress(address);
    }
}


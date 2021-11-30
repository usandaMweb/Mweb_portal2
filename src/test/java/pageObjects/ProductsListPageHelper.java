package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductsListPageHelper extends ProductsListPageElements {
    public ProductsListPageHelper(WebDriver driver) {
        super(driver);
    }

    public void getFirsProduct() {
        waitMileSeconds(3000);
        Actions action = new Actions(driver);
        WebElement product = viewMoreAboutFirstFibreProductBtn();
        action.doubleClick(product).perform();
    }

    public void getSecondProduct(){
        viewMoreAboutSecondFibreProductBtn().click();
    }

    public Integer getListOfProduct(String element) {
        waitForElementAppears(2, element);
        try {
            return driver.findElements(By.xpath(element)).size();
        } catch (Exception ex) {
            return 0;
        }
    }

    public boolean isFiberModalReadyDisplayed() {
        return isElementDisplayed(fibreReadyForInstallModal());
    }

    public boolean isLteModalDisplayed() {
        return isElementDisplayed(youCanGetLteModal());
    }

    public boolean isFrogFootAvailable() {
        waitMileSeconds(5500);
        return isElementDisplayed(frogFootInAvailableProviders());
    }

    public boolean isOctoTelAvailable() {
        return isElementDisplayed(octotelInAvailableProviders());
    }

    public boolean isOpenServeAvailable() {
        return isElementDisplayed(openserveInAvailableProviders());
    }

    @Step("Exclude FrogFoot from search results")
    public void excludeFrogFootFromSearch() {
        frogFootInAvailableProviders().click();
    }

    @Step("Exclude OctoTel from search results")
    public void excludeOctoTelFromSearch() {
        octotelInAvailableProviders().click();
    }

    @Step("Exclude OpenServe from search results")
    public void excludeOpenServeFromSearch() {
        openserveInAvailableProviders().click();
    }

    @Step("Return FrogFoot to search results")
    public void returnFrogFootToSearch() {
        frogFootInAvailableProviders().click();
    }

    @Step("Return OctoTel to search results")
    public void returnOctoTelToSearch() {
        octotelInAvailableProviders().click();
    }

    @Step("Check if FrogFoot available in search")
    public boolean checkIfFrogFootAvailableInSearch() {
        if (driver.findElements(By.xpath("//div[contains(@class, 'col-md-12')]//*[contains(@class,'resize-provider-image')]//*[@alt='Frogfoot']")).size() >= 1)
            return true;
        else return false;
    }

    @Step("Check if OctoTel available in search")
    public boolean checkIfOctotelAvailableInSearch() {
        if (driver.findElements(By.xpath("//div[contains(@class, 'col-md-12')]//*[contains(@class,'resize-provider-image')]//*[@alt='Octotel']")).size() >= 1)
            return true;
        else return false;
    }

    @Step("Check if OpenServe available in search")
    public boolean checkIfOpenServeAvailableInSearch() {
        if (driver.findElements(By.xpath("//div[contains(@class, 'col-md-12')]//*[contains(@class,'resize-provider-image')]//*[@alt='Openserve']")).size() >= 1)
            return true;
        else return false;
    }

    @Step("Check if FrogFoot is not available in search")
    public boolean checkIfFrogFootIsNotAvailableInSearch() {
        if (driver.findElements(By.xpath("//div[contains(@class, 'col-md-12')]//*[contains(@class,'resize-provider-image')]//*[@alt='Frogfoot']")).size() == 0)
            return true;
        else return false;
    }

    @Step("Check if OctoTel is not available in search")
    public boolean checkIfOctoTelIsNotAvailableInSearch() {
        if (driver.findElements(By.xpath("//div[contains(@class, 'col-md-12')]//*[contains(@class,'resize-provider-image')]//*[@alt='Octotel']")).size() == 0)
            return true;
        else return false;
    }

    @Step("Check if OpenServe is not available in search")
    public boolean checkIfOpenServeIsNotAvailableInSearch() {
        if (driver.findElements(By.xpath("//div[contains(@class, 'col-md-12')]//*[contains(@class,'resize-provider-image')]//*[@alt='Openserve']")).size() == 0)
            return true;
        else return false;
    }

    public boolean checkIfSearchFilterDisplayed(){
        return isElementDisplayed(searchFilter());
    }

    @Step("//")
    public boolean checkIf25MbpsAvailable(String speed ,int size) {
        if (driver.findElements(By.xpath("//*[contains(@class, 'download-speed')]//span[contains(@class, 'up-downspeed') and contains(text(), '"+speed+"')]")).size() == size)
            return true;
        else return false;
    }

    public void clickOnSearchFilters(){
        searchFilter().click();
    }

    public void select50100Mbps(){
        waitForElementAppears(2, filter50100Mbps);
        waitForElementToBeClickable(filter50100Mbps());
        filter50100Mbps().click();
    }

    public void select100Mbps(){
        waitForElementAppears(2, filter100Mbps);
        waitForElementToBeClickable(filter100Mbps());
        filter100Mbps().click();
    }
}

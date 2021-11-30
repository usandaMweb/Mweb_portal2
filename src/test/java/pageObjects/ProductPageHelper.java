package pageObjects;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductPageHelper extends ProductPageElements {
    public ProductPageHelper(WebDriver driver) {
        super(driver);
    }

    public void getCheckoutBtn() {
        checkoutBtn().click();
    }

    @Step("Check free router isn't selected")
    public boolean checkFreeRouterSelected() {
        if (driver.findElements(By.xpath("//*[contains(@class, 'card router-card active')]")).size() == 0) return true;
        else return false;
    }

    @Step("Check no router isn't selected")
    public boolean checkNoRouterSelected() {
        if (driver.findElements(By.xpath("//*[contains(@class,'fibre-productpage-button-fibrerouterselect active')]")).size() == 0)
            return true;
        else return false;
    }

    @Step("Select transfer fiber line")
    public void selectTransferLine() {
        optionTransferExistingFiberLine().click();
    }

    @Step("Add recommended to order")
    public void clickAddRecommended() {
        addRecommendedToOrderBtn().click();
    }

    @Step("Check if VoIP is not added")
    public boolean checkIfVoipIsNotAdded() {
        if (driver.findElements(By.xpath("//td[contains(text(), ' MWEB VoIP Lite - 250 Minutes ')]")).size() == 0)
            return true;
        else return false;
    }

    @Step("Check if VoIP is added")
    public boolean checkIfVoipIsAdded() {
        return voipOptionInSummary().isDisplayed();
    }

    @Step("Check if Microsoft Office is added")
    public boolean checkIfMicrosoftOfficeIsAdded() {
        return microsoftOfficeInSummary().isDisplayed();
    }

    @Step("Check if Microsoft Office is not added")
    public boolean checkIfMicrosoftOfficeIsNotAdded() {
        if (driver.findElements(By.xpath("//td[contains(text(), ' Office 365 (Home - 12 Month Plan) ')]")).size() == 0)
            return true;
        else return false;
    }

    @Step("Remove VoIP from order")
    public void removeVoipFromOrder() {
        removeVoIpFromOrder().click();
    }

    @Step("Check if Microsoft Office tooltip displayed")
    public boolean checkIfOffice356TooltipIsDisplayed() {
        return microsoftOfficeTooltip().isDisplayed();
    }

    @Step("Add Microsoft Office via tooltip")
    public void addOfficeViaTooltip() {
        addOfficeFromTooltipBtn().click();
    }

    @Step("Check if VoIP 250min tooltip displayed")
    public boolean checkIfVoipTooltipIsDisplayed() {
        return vOIPTooltip().isDisplayed();
    }

    @Step("Add VoIP 250min via tooltip")
    public void addVoip250ViaTooltip() {
        addOVoIPFromTooltipBtn().click();
    }

    @Step("Check if upsize deal is displayed")
    public boolean isUpsizeDealDisplayed() {
        return upsizeDealTooltip().isDisplayed();
    }

    @Step("Select upsize deal")
    public void selectUpsizeDeal(){
        upsizeDealBtn().click();
    }

    public String upsizedDeal(){
        return headingOfProduct().getText();
    }
}

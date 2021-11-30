package pageObjects;

import org.openqa.selenium.WebDriver;

public class CustomerInfoPageHelper extends CustomerInfoPageElements {
    public CustomerInfoPageHelper(WebDriver driver) {
        super(driver);
    }

    //TODO need to add ability to workaround
    public void idNumberField() {
        getElementByXpath("//input[@id='identitynumber']");
    }

    public void streetNumberField() {
        getElementByXpath("//input[@id='streetnumber']");
    }

    public void streetNameField() {
        getElementByXpath("//input[@id='streetname']");
    }

    public void bankAccountNumberField() {
        getElementByXpath("//input[@id='bankaccountnumber']");
    }

    public void bankingAccountNameField() {
        getElementByXpath("//input[@id='bankingaccountname']");
    }

    public void submitBtn() {
        getElementByXpath("//button[@id='btnSubmit']");
    }
}

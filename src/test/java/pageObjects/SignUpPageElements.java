package pageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageElements extends DriverHolder {
    public SignUpPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement newCustomerFirstName() {
        //TODO broken
        return getElementByXpath("//input[@id='name']");
    }

    public WebElement newCustomerSurname() {
        return getElementByXpath("//input[@id='surname']");
    }

    public WebElement mobilePhoneNumber() {
        return getElementByXpath("//input[@id='mobile-number']");
    }

    public WebElement email() {
        return getElementByXpath("//input[@id='email']");
    }
    public WebElement identitynumber() {
        return getElementByXpath("//input[@id='identitynumber']");
    }
    public WebElement username() {
        return getElementByXpath("//input[@id='user_id']");
    }
    public WebElement adress() {
        return getElementByXpath("//input[contains(@class, 'coverage')]");
    }

    public WebElement otp() {
        return getElementByXpath("//input[@id='otp']");
    }

    public WebElement password() {
        return getElementByXpath("//input[@id='passwd']");
    }
    public WebElement bankaccountnumber() {
        return getElementByXpath("//input[@id='bankaccountnumber']");
    }

    public WebElement registerBtn() {
        return getElementByXpath("//button[contains(@class, 'btn-register')]");
    }

//    public WebElement existingCustomerContainer(){
//        return getElementByXpath("//div[@class='login-container']");
//    }
//
//    public WebElement newCustomerContainer(){
//        return getElementByXpath("//div[@class='register-container']");
//    }

    public WebElement userNameFieldLogin() {
        return getElementByXpath("//input[@id='user_id']");
    }

    public WebElement userPasswordLogin() {
        return getElementByXpath("//input[@id='passwd']");
    }

    public WebElement loginOnSignUpBtn() {
        return getElementByXpath("//button[@id='btn-login']");
    }


}

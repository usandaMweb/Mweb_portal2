package pageObjects;

import org.openqa.selenium.WebDriver;

public class SignUpPageHelper extends SignUpPageElements {
    public SignUpPageHelper(WebDriver driver) {
        super(driver);
    }

    public void getFirstName() {
        newCustomerFirstName();
    }
//
//    public boolean isExistingCustomerContainerDisplayed() {
//        return isElementDisplayed(existingCustomerContainer());
//    }
//
//    public boolean isNewCustomerContainerDisplayed() {
//        return isElementDisplayed(newCustomerContainer());
//    }

    public boolean isFirstNameOnCheckoutDisplayed() {
        return isElementDisplayed(newCustomerFirstName());
    }

    public boolean isSurNameOnCheckoutDisplayed() {
        return isElementDisplayed(newCustomerSurname());
    }

    public void enterLogin() {
        userNameFieldLogin().sendKeys("nikita.dereviankin@iternal.group");
    }

    public void enterPassword() {
        userPasswordLogin().sendKeys("GkqgG3K@t");
    }

    public void clickLoginBtnOnSignUp() {
        loginOnSignUpBtn().click();
    }

    public SignUpPageHelper enterFirstName(String name) {
        newCustomerFirstName().sendKeys(name);
        return new SignUpPageHelper(driver);
    }

    public SignUpPageHelper enterSurname(String surname) {
        newCustomerSurname().sendKeys(surname);
        return new SignUpPageHelper(driver);
    }

    public SignUpPageHelper enterPhoneNumber(String phone) {
        mobilePhoneNumber().sendKeys(phone);
        return new SignUpPageHelper(driver);
    }

    public SignUpPageHelper enterEmail(String mail) {
        email().sendKeys(mail);
        return new SignUpPageHelper(driver);
    }
    public SignUpPageHelper enteridentitynumber(String identitynumber) {
        identitynumber().sendKeys(identitynumber);
        return new SignUpPageHelper(driver);
    }
    public SignUpPageHelper enterUsername(String username) {
        username().sendKeys(username);
        return new SignUpPageHelper(driver);
    }
    public SignUpPageHelper enterAddress(String adress) {
        adress().sendKeys(adress);
        return new SignUpPageHelper(driver);
    }

    public SignUpPageHelper enterOTP(String otp) {
        otp().sendKeys(otp);
        return new SignUpPageHelper(driver);
    }

    public SignUpPageHelper enterPassword(String password) {
        password().sendKeys(password);
        return new SignUpPageHelper(driver);
    }

    public SignUpPageHelper enterbankaccountnumber(String bankaccountnumber) {
        bankaccountnumber().sendKeys(bankaccountnumber);
        return new SignUpPageHelper(driver);
    }

    public void clickRegisterBtn() {
        registerBtn().click();
    }
}

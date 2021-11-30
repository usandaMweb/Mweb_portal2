package pageObjects;

import holders.DriverHolder;
import holders.TestInit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NC_checkout extends TestInit {
    public void nc_checkout() {

        HomePageElements obj = new HomePageElements(driver);
        SignUpPageHelper checkoutPage = new SignUpPageHelper(driver);
        checkoutPage.enterFirstName("TestFirstName");
        checkoutPage.enterSurname("TestSureName");
        checkoutPage.enterEmail("testmail@mail.com");
        checkoutPage.enterPhoneNumber("0783616438");
        checkoutPage.clickRegisterBtn();
        waitForPageLoad();
        checkoutPage.enteridentitynumber("2701054800082");
        obj.noEle().click();
        obj.freestanding().click();
        obj.suburd1().click();
        obj.suburd2().click();
        obj.noElem().click();
        obj.absa().click();
        checkoutPage.enterbankaccountnumber("45436474");
        obj.savings().click();
        obj.terms().click();
        obj.creditcheck().click();
        obj.confirmOrder().click();
        waitForPageLoad();


    }
}

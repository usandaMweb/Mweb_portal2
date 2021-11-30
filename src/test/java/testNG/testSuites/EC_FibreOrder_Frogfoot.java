package testNG.testSuites;

import holders.TestInit;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pageObjects.*;


public class EC_FibreOrder_Frogfoot extends TestInit {

    public String fibreProductsXpath = "//div[contains(@class, 'fibre-landingpage-productcard')]";
//    public String fibreReadyForInstall = "//div[contains(@class, 'alert border-color')]";

    @Description("Existing customer order fiber line")
    @Test
    public void ec_fiberLine() {
        HomePageHelper fiber = new HomePageHelper(driver);
        HomePageElements obj = new HomePageElements(driver);
        SignUpPageHelper checkoutPage = new SignUpPageHelper(driver);
        String pPassword= "!AJ1HdvB";
        ProductsListPageHelper productsList = new ProductsListPageHelper(driver);
        fiber.goToHomePageDev();
        waitForPageLoad();
        obj.loginBTN().click();
        waitForPageLoad();
        checkoutPage.enterUsername("57524627");
        checkoutPage.enterPassword(pPassword);
        obj.loginBTNSubmit().click();
        waitForPageLoad();
        obj.fullaccess().click();
        checkoutPage.enterOTP("3507");
        obj.VerifyPin().click();
        waitForPageLoad();
        obj.addProduct().click();
        waitForPageLoad();
        obj.addProduct().click();
        waitForPageLoad();
        obj.homeBTN().click();
        waitForPageLoad();
        fiber.searchAddress("29 Sheffield Close, Milnerton Rural, Cape Town");
        waitForPageLoad();
        productsList.scroll();
        productsList.getSecondProduct();
        waitForPageLoad();
        ProductPageHelper productPage = new ProductPageHelper(driver);
        productPage.getCheckoutBtn();
        waitForPageLoad();
        checkoutPage.enterUsername("57524627");
        checkoutPage.enterPassword(pPassword);
        obj.loginBTNSubmit().click();



    }
}

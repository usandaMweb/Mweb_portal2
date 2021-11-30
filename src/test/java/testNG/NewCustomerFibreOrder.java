package testNG;

import holders.TestInit;
import io.qameta.allure.Description;
import org.testng.annotations.Test;
import pageObjects.HomePageHelper;
import pageObjects.ProductPageHelper;
import pageObjects.ProductsListPageHelper;
import pageObjects.SignUpPageHelper;

import static org.testng.AssertJUnit.assertTrue;


public class NewCustomerFibreOrder extends TestInit {

    public String fibreProductsXpath = "//div[contains(@class, 'fibre-landingpage-productcard')]";
//    public String fibreReadyForInstall = "//div[contains(@class, 'alert border-color')]";

    @Description("New customer order fiber line")
    @Test
    public void fiberLine() {
        HomePageHelper fiber = new HomePageHelper(driver);
        fiber.goToHomePageDev();
        waitForPageLoad();
        fiber.searchAddress("20 Candican Road, Barbeque Downs, Midrand, South Africa");
        waitForPageLoad();
        assertTrue("Fiber isn't displayed", fiber.isFibreDisplayed());
        assertTrue("LTE isn't displayed", fiber.isLTeDisplayed());
        fiber.changeAddressBtn().click();
        fiber.searchAddress("1 Thomas Bowler Avenue, Edgemead, Cape Town, South Africa");
        assertTrue("Fiber isn't displayed", fiber.isFibreDisplayed());
        assertTrue("LTE isn't displayed", fiber.isLTeDisplayed());
        fiber.fibreViewProductsBtn().click();
        ProductsListPageHelper productsList = new ProductsListPageHelper(driver);
        waitForPageLoad();
        assertTrue("Incorrect count of products", productsList.getListOfProduct(fibreProductsXpath) == 4);
        productsList.scroll();
        assertTrue("Fibre is not ready and is not displayed", productsList.isFiberModalReadyDisplayed());
        productsList.getFirsProduct();
        waitForPageLoad();
        ProductPageHelper productPage = new ProductPageHelper(driver);
        productPage.getCheckoutBtn();
        SignUpPageHelper checkoutPage = new SignUpPageHelper(driver);
        assertTrue("First name on checkout is not displayed", checkoutPage.isFirstNameOnCheckoutDisplayed());
        assertTrue("Surname on checkout is not displayed", checkoutPage.isSurNameOnCheckoutDisplayed());
        //TODO Add test logic on checkout page
//        checkoutPage.enterFirstName("TestFirstName");
//        checkoutPage.enterSurname("TestSureName");
//        checkoutPage.enterEmail("testmail@mail.com");
//        checkoutPage.enterPhoneNumber("");
//        checkoutPage.clickRegisterBtn();


    }
}

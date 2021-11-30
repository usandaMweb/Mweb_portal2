package testNG.testSuites;

import holders.CreatingJSONDocument;
import holders.TestInit;
import io.qameta.allure.Description;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.FileReader;


public class NC_FibreOrder_Vumatel extends TestInit {

    @Description("new customer order fiber line")
    @Test
    public void nc_fiberLine_frogFoot() {
        JSONParser parser = new JSONParser();
        try {
            CreatingJSONDocument writeFile = new CreatingJSONDocument();
            writeFile.writeData();
            Object obj2 = parser.parse(new FileReader("src/mwebdata.json"));
            Object obj3 = parser.parse(new FileReader("src/addresses.json"));
            JSONObject jsonObject = (JSONObject) obj2;
            JSONObject jsonObject2 = (JSONObject) obj3;
            String name = (String)jsonObject.get("name");
            String surname = (String)jsonObject.get("surname");
            String number = (String)jsonObject.get("number");
            String idNumber = (String)jsonObject.get("idNumber");
            String email = (String)jsonObject.get("email");
            String account = (String)jsonObject.get("account");

            String vumatel = (String)jsonObject2.get("vumatel");


        HomePageHelper fiber = new HomePageHelper(driver);
        HomePageElements obj = new HomePageElements(driver);
        SignUpPageHelper checkoutPage = new SignUpPageHelper(driver);
        ProductsListPageHelper productsList = new ProductsListPageHelper(driver);
        fiber.goToHomePageDev();
        waitForPageLoad();
        fiber.searchAddress(vumatel);
        waitForPageLoad();
        productsList.scroll();
        productsList.getSecondProduct();
        waitForPageLoad();

        ProductPageHelper productPage = new ProductPageHelper(driver);
        productPage.getCheckoutBtn();
        checkoutPage.enterFirstName(name);
        checkoutPage.enterSurname(surname);
        checkoutPage.enterEmail(email);
        checkoutPage.enterPhoneNumber(number);
        checkoutPage.clickRegisterBtn();
        waitForPageLoad();
        checkoutPage.enteridentitynumber(idNumber);
        obj.noEle().click();
        obj.freestanding().click();
        obj.suburd1().click();
        obj.suburd2().click();
        obj.noElem().click();
        obj.absa().click();
        checkoutPage.enterbankaccountnumber(account);
        obj.savings().click();
        obj.terms().click();
        obj.creditcheck().click();
            obj.confirmOrder().click();
        //obj.confirmOrder().click();
        waitForPageLoad();
        waitForElement(By.xpath("//a[@class='btn button-primary order-confirmation-button-track-order ng-star-inserted']"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

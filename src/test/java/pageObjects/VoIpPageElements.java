package pageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VoIpPageElements extends DriverHolder {
    public VoIpPageElements(WebDriver driver) {
        super(driver);
    }

    public WebElement voipHeader() {
        return getElementByXpath("//div[@class='voip-text']//p");
    }

    public WebElement addPhoneVoip250min() {
        return getElementsByXpath("//button[contains(@class, 'button-secondary')]").get(1);
    }

    String modalXpath = "//*[contains(@class, 'modal-content')]";

    public String getModalXpath() {
        return modalXpath;
    }

    public WebElement modalAddPhoneVoip() {
        return getElementByXpath("//*[contains(@class, 'modal-content')]");
    }

    public WebElement addPhoneVoipOnModal() {
        return getElementsByXpath("//button[contains(@class, 'btn button-secondary')]").get(3);
    }

    public WebElement buyNowOn250min() {
        return getElementsByXpath("//button[contains(@class, 'voip-landingpage-buynow')]").get(1);
    }
}

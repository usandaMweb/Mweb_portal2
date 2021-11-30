package pageObjects;

import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class VoIpPageHelper extends VoIpPageElements {
    public VoIpPageHelper(WebDriver driver) {
        super(driver);
    }

    String voipText = "Use Mweb’s Voice over Internet Protocol (VoIP) products and save costs on local calls, including to mobile numbers, and international calls made over the Internet. FREE calls to other Mweb VoIP numbers and features such as caller ID, call forwarding and more. Handsets available to add to order.";

    public String getVoipText() {
        return voipText;
    }

    public void addPhone() {
        addPhoneVoip250min().isDisplayed();
        addPhoneVoip250min().click();
    }

    public void addPhoneOnModal() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        addPhoneVoipOnModal().isDisplayed();
        addPhoneVoipOnModal().click();
    }

    public void buyNow250MIn() {
        buyNowOn250min().click();
    }


}

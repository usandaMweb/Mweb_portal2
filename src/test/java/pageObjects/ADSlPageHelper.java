package pageObjects;

import org.openqa.selenium.WebDriver;

public class ADSlPageHelper extends ADSlPageElements {
    public ADSlPageHelper(WebDriver driver) {
        super(driver);
    }

    String adslText = "These ADSL products provide the same service as traditional ADSL products, but no longer require a landline/voice line from Telkom and a separate ADSL line. Customers can save up to R200 on a voice line rental fee and only pay a single fee for their ADSL product.";

    public String getAdslText() {
        return adslText;
    }

    public boolean isOfferBoardDisplayed() {
        return isElementDisplayed(offerTable());
    }
}

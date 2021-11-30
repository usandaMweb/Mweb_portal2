package pageObjects;

import holders.DriverHolder;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ADSlPageElements extends DriverHolder {
    public ADSlPageElements(WebDriver driver) {
        super(driver);
    }


    public WebElement adslHeader() {
        return getElementByXpath("//div[@class='adsl-text']//p");
    }

    public WebElement offerTable() {
        return getElementByXpath("//table[contains(@class, 'table-borderless')]");
    }

}

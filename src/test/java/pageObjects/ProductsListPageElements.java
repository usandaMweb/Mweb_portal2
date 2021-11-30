package pageObjects;

import holders.DriverHolder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsListPageElements extends DriverHolder {
    public ProductsListPageElements(WebDriver driver) {
        super(driver);
    }

    public String speedFilerXpath = "//span[contains(text(), 'Speed')]";
    public String filter50100Mbps = "//span[contains(@class, 'mat-checkbox-label') and contains(text(), '50 – 100 Mbps')]";
    public String filter100Mbps = "//span[contains(@class, 'mat-checkbox-label') and contains(text(), '100 Mbps+')]";

    public String fibreReadyForInstall = "//div[contains(@class, 'alert border-color')]";

    public WebElement viewMoreAboutFirstFibreProductBtn() {
        return getElementsByXpath("//div[contains(@class, 'landingpage-productcard')]").get(0);
    }

    public WebElement viewMoreAboutSecondFibreProductBtn() {
        return getElementsByXpath("//div[contains(@class, 'landingpage-productcard')]").get(1);
    }

    public WebElement viewMoreAboutLteProductBtn() {
        return getElementsByXpath("//a[contains(@class, 'btn-proceed lte-landingpage-button')]").get(0);
    }


    public WebElement fibreReadyForInstallModal() {
        return getElementByXpath("//div[contains(@class, 'alert border-color')]");
    }

    public WebElement youCanGetLteModal() {
        return getElementByXpath("//div[contains(@class, 'alert border-grey')]");
    }

    public WebElement frogFootInAvailableProviders(){
        return getElementByXpath("//div[contains(@class, 'col-md-4')]//*[@alt='Frogfoot']");
    }

    public WebElement octotelInAvailableProviders(){
        return getElementByXpath("//div[contains(@class, 'col-md-4')]//*[@alt='Octotel']");
    }

    public WebElement openserveInAvailableProviders(){
        return getElementByXpath("//div[contains(@class, 'col-md-4')]//*[@alt='Openserve']");
    }

    public WebElement searchFilter(){
        return getElementByXpath(speedFilerXpath);
    }

    public WebElement filter50100Mbps(){
        return getElementByXpath(filter50100Mbps);
    }

    public WebElement filter100Mbps(){
        return getElementByXpath(filter100Mbps);
    }
}

package holders;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class TestInit {
    public WebDriver driver;
    //First config file

    //setUp() Detects the OS and selects the correct driver
    @BeforeClass
    public void setUp() {
        if (System.getProperty("os.name").toLowerCase().contains("mac")) {
            System.setProperty(
                    "webdriver.chrome.driver",
                    "src/chromedriver_mac"
            );
        } else if (System.getProperty("os.name").toLowerCase().contains("linux")) {
            System.setProperty(
                    "webdriver.chrome.driver",
                    "src/chromedriver_linux"
            );
            System.setProperty("webdriver.chrome.whitelistedIps", "");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200", "--ignore-certificate-errors", "--disable-extensions", "--no-sandbox", "--disable-dev-shm-usage");
        } else {
            new Exception("CURRENT SOLUTION IMPLEMENTED ONLY FOR MAC AND WINDOWS");
        }
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            System.setProperty(
                    "webdriver.chrome.driver",
                    "src/chromedriver_win (2).exe"
            );
        }
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public void setChromeParams(ChromeOptions options) {
        options.addArguments("start-maximized");
        options.addArguments("whitelisted-ips");
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("disable-extensions");
        options.addArguments("headless");//use it in case you don't need browser UI
        options.addArguments("--window-size=1920x1080");


    }

    public void waitForPageLoad() {
        new WebDriverWait(driver, 30).until((ExpectedCondition<Boolean>) wd ->
                ((JavascriptExecutor) wd).executeScript("return document.readyState").equals("complete"));
    }
    public boolean waitForElement(By selector) {
        try {
            WebDriverWait wait = new WebDriverWait(this.driver, 30);
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(selector));
            return true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return false;
        }
    }


    @AfterClass
    public void close() {
//        driver.close();
        driver.quit();
    }
}

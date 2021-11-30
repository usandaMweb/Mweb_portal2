package holders;

import io.qameta.allure.Step;
import org.apache.logging.log4j.core.util.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

import java.io.File;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class DriverHolder {
    //Second configuration files that contains methods used at all levels in the project

    protected WebDriver driver;
    private Logger logger;

    public DriverHolder(WebDriver driver) {
        this.driver = driver;
    }

    @Step("Go to home page prod")
    public void goToHomePage() {
        driver.get("https://www.mweb.co.za/");
    }

    @Step("Go to home page Dev")
    public void goToHomePageDev() {
        driver.get("https://dev.mwebaws.co.za/");
    }


    public void waitForElementToBeClickable(WebElement element) {
        new WebDriverWait(driver, 30)
                .until(ExpectedConditions.elementToBeClickable(element));
    }

    public void waitUntilElementsDisplayed(int seconds, String locator) {
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(locator)));
    }



    @Step("Get element by Xpath")
    protected WebElement getElementByXpath(String xpath) {

        int timeToWait = 15;
        try {
            return (new WebDriverWait(driver, timeToWait))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
        } catch (TimeoutException e) {

            logger.info("Cant find element with xpath " + xpath + " after " + timeToWait + " seconds");
            logger.debug("\n" + e.toString());
            throw e;
        } catch (NoSuchElementException e) {
            logger.info("Cant find element with xpath " + xpath + " after " + timeToWait + " seconds");
            logger.debug("\n" + e.toString());
            throw e;
        }
    }

    @Step("Get elements by Xpath")
    protected List<WebElement> getElementsByXpath(String xpath) {
        return (new WebDriverWait(driver, 15))
                .until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath(xpath)));
    }

    public void waitForElementTodisappear(String xpath) {
        try {
            for (int i = 0; i < 50; i++) {
                if (driver.findElement(By.xpath(xpath)).isDisplayed()) {
                    waitMileSeconds(500);
                } else {
                    break;
                }
            }
        } catch (Exception e) {
//            logger.info("element with xpath " + xpath + " absent on screen");
        }
    }

    protected void waitMileSeconds(int mile) {
        try {
            Thread.sleep(mile);
        } catch (InterruptedException e) {
            logger.error(e.toString());
        }
    }

    public boolean isElementDisplayed(WebElement element) {
        try {
            return element.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    public void moveMouseToElement(WebElement element) {
        Actions actions = new Actions(driver);
        actions.moveToElement(element).perform();
    }
    public void hoverMouseToElement(WebElement element){
        Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("html/body/div[13]/ul/li[4]/a"));
        action.moveToElement(we).moveToElement(element).click().build().perform();
    }

    public String getTitle() {
        return driver.getTitle();
    }

    public void scroll() {
        waitMileSeconds(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");
    }

    public WebElement waitForElementAppears(int seconds, String xpathLocator) {
        WebElement element = null;
        for (int a = 0; a < seconds * 2; a++) {
            try {
                element = driver.findElement(By.xpath(xpathLocator));
            } catch (Exception e) {
                logger.info("waiting for element to appear, seconds waiting = " + a);
                waitMileSeconds(500);
            }
        }

        return element;
    }

}

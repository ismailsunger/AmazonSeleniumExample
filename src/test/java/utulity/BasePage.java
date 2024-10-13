package utulity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickByElement(WebElement element) {
        element.click();
    }

    public void sendTextToElement(WebElement element, String text) {
        element.click();
        element.sendKeys(text);
    }

    public WebElement findElement(WebElement element) {
        return element;
    }

    public Boolean isElementDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public Boolean isTextsEquals(String text1, String text2) {
        return text1.equals(text2);
    }

    public void sleep(int seconds) throws InterruptedException {
        Thread.sleep(seconds);
    }

    public void scroll(WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        try {
            int yScrollPosition = element.getLocation().getY() - 200;
            javascriptExecutor.executeScript("window.scroll(0, " + yScrollPosition + ");");
        } catch (Exception e) {
            System.out.println("Could not scrool to element...");
        }
    }
}
//    public void clickByElement(By locator) {
//        driver.findElement(locator).click();
//    }
package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utulity.BasePage;

public class BasketPage extends BasePage {
    @FindBy(className = "sc-product-price")
    public WebElement price;

    public BasketPage(WebDriver driver) {
        super(driver);
    }

    public boolean isPriceDisplayed() {
        driver.navigate().refresh();
        return isElementDisplayed(price);
    }
}
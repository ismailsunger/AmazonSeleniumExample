package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulity.BasePage;

import java.util.List;

public class ProductPage extends BasePage {
    @FindBy(id = "sp-cc-accept")
    public WebElement acceptButtonLocator;

    @FindBy(className = "s-pagination-strip")
    public WebElement paginationLocator;

    @FindBy(xpath = "//button[@id='a-autoid-1-announce']")
    public WebElement productLocator;

    @FindBy(xpath = "//a[@id='nav-cart']")
    public WebElement bounceLocator;

    @FindBy(xpath = "//div[@class='a-cardui-body a-scroller-none']")
    public WebElement lastControlLocator;

    @FindBy(xpath = "//img[@data-image-latency=\"s-product-image\"]")
    public List<WebElement> productImages;

    public ProductPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public ProductPage acceptButton() {
        clickByElement(acceptButtonLocator);
        return this;
    }

    public ProductPage scrollToPagination() {
        scroll(paginationLocator);
        return this;
    }

    public ProductPage productSelect() {
        clickByElement(productLocator);
        return this;
    }

    public BasketPage bounceSelect() {
        clickByElement(bounceLocator);
        return new BasketPage(driver);
    }

    public ProductPage selectProductByIndex(int index) {
        clickByElement(productImages.get(index));
        return this;
    }

}



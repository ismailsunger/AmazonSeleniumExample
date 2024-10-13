package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulity.BasePage;

public class HomePage extends BasePage {

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    public WebElement searchBoxLocator;

    @FindBy(xpath = "//input[@id='nav-search-submit-button']")
    public WebElement searchButtonLoctor;

    @FindBy(id = "sp-cc-accept")
    public WebElement acceptButton;

    @FindBy(className = "navFooterColHead")
    public WebElement footerItem;

    @FindBy(xpath = "//*[@class='navFooterColHead']")
    public WebElement aboutUs;

    public HomePage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public HomePage searchBox() {
        clickByElement(searchBoxLocator);
        return this;
    }

    public HomePage selectVestelText() {
        sendTextToElement(searchBoxLocator, "buzdolabi");
        return this;
    }

    public HomePage searchBoxButtonClick() {
        clickByElement(searchButtonLoctor);
        return this;
    }

    public ProductPage acceptClick() {
        clickByElement(acceptButton);
        return new ProductPage(driver);
    }

    public HomePage scrollToFooter() {
        scroll(footerItem);
        return this;
    }

    public boolean isAboutUsDisplayed() {
        return aboutUs.getText().equals("Hakkımızda");
    }
}


package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utulity.BasePage;

public class RegisterPage extends BasePage {

    @FindBy(xpath = "//input[@id='ap_customer_name']")
    private WebElement customerNameLocator;

    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement passwordLocator;

    @FindBy(xpath = "//input[@id='ap_password_check']")
    private WebElement passwordLocatorCheck;

    @FindBy(xpath = "//input[@name='legalMarketingCheckBox']")
    private WebElement checkButtonLocator;

    @FindBy(id = "continue")
    private WebElement lastCreateAccountLocator;

    @FindBy(xpath = "//h4[text()='Önemli Mesaj!']")
    private WebElement loginRegistryLocator;

    @FindBy(id = "ap_email")
    private WebElement emailLocator;

    public RegisterPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public RegisterPage enterEmail(String mail) {
        sendTextToElement(emailLocator, mail);
        return this;
    }

    public RegisterPage enterUsername(String username) {
        sendTextToElement(customerNameLocator, username);
        return this;
    }


    public RegisterPage enterPassword(String password) {
        sendTextToElement(passwordLocator, password);
        return this;
    }

    public RegisterPage enterPasswordToCheck(String password) {
        sendTextToElement(passwordLocatorCheck, password);
        return this;
    }

    public boolean isLoginDisplayed() {
        return isElementDisplayed(loginRegistryLocator);
    }

    public RegisterPage checkButtonClick() throws InterruptedException {
        sleep(5000);
        clickByElement(checkButtonLocator);
        return this;
    }

    public RegisterPage lastCreateAccountButtonClick() {
        clickByElement(lastCreateAccountLocator);
        return this;
    }
}

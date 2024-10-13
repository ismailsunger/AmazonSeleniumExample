package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utulity.BasePage;

public class LoginPage extends BasePage {
    @FindBy(xpath = "//input[@id='ap_email']")
    private WebElement emailLocator;
    @FindBy(xpath = "//span[text()='Hesap ve Listeler']")
    private WebElement signInButtonLocator;
    @FindBy(xpath = "//a[@id='createAccountSubmit']")
    private WebElement createAccountButtonLocator;
    @FindBy(xpath = "//input[@id='ap_password']")
    private WebElement passwordLocator;
    @FindBy(id = "signInSubmit")
    private WebElement loginButton;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage emailInput(String mail) {
        sendTextToElement(emailLocator, mail);
        return this;
    }

    public LoginPage clickLoginButton() {
        clickByElement(signInButtonLocator);
        return this;
    }

    public LoginPage enterPassword(String text) {
        sendTextToElement(passwordLocator, text);
        return this;
    }

    public RegisterPage createAccountsButtonClick() {
        clickByElement(createAccountButtonLocator);
        return new RegisterPage(driver);
    }

    public HomePage clickLogin() {
        clickByElement(loginButton);
        return new HomePage(driver);
    }
}
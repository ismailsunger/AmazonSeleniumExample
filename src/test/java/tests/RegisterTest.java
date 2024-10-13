package tests;

import org.junit.Assert;
import org.junit.Test;
import page.LoginPage;
import page.RegisterPage;
import utulity.BaseTest;

import static constants.TestUtils.userInfo;

public class RegisterTest extends BaseTest {

    @Test
    public void registerTest() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);

        RegisterPage registerPage = loginPage
                .clickLoginButton()
                .createAccountsButtonClick();

        registerPage.enterUsername(userInfo.USER_NAME)
                .enterEmail(userInfo.EMAIL)
                .enterPassword(userInfo.PASSWORD)
                .enterPasswordToCheck(userInfo.PASSWORD)
                .checkButtonClick()
                .lastCreateAccountButtonClick();

        Assert.assertTrue(registerPage.isLoginDisplayed());
    }
}

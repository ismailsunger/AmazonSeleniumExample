package tests;

import org.junit.Assert;
import org.junit.Test;
import page.HomePage;
import utulity.BaseTest;

public class HomePageTest extends BaseTest {
    protected HomePage homePage;

    @Test
    public void testHomePageAboutUs() {
        homePage = new HomePage(driver);

        homePage.scrollToFooter();
        Assert.assertTrue(homePage.isAboutUsDisplayed());
    }
}

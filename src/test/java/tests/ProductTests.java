package tests;

import org.junit.Assert;
import org.junit.Test;
import page.BasketPage;
import page.HomePage;
import page.ProductPage;
import utulity.BaseTest;

public class ProductTests extends BaseTest {

    @Test
    public void testProductPage() {

        ProductPage productPage = new HomePage(driver)
                .searchBox()
                .selectVestelText()
                .searchBoxButtonClick()
                .acceptClick();

        BasketPage basketPage = productPage
                .scrollToPagination()
                .bounceSelect();

        Assert.assertTrue(basketPage.isPriceDisplayed());
    }
}

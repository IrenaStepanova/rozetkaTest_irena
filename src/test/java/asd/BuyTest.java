package asd;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BuyTest {
    private FirefoxDriver driver;

    @Test
    public void testSum() throws InterruptedException {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        MainPage mainPage = new MainPage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        ProductPage priceLabel = new ProductPage(driver);

        mainPage.open();
        mainPage.searchProduct("розетка");
        searchResultPage.searchResult();
        priceLabel.PriceLabel();


        //click on first item in search result


        //Get price from product page
        String expectedPrice

                //Click "BUY"
        driver.findElement(By.cssSelector(".detail-buy-btn-link>button")).click();

        //Get price from cart
        String priceInCart = driver.findElement(By.cssSelector("span[name='cost']")).getText();

        Assert.assertEquals(expectedPrice, priceInCart);
    }
}

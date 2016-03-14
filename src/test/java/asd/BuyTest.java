package asd;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BuyTest {
    private FirefoxDriver driver;

    @Test
    public void testSum() {
        driver = new FirefoxDriver();
        driver.get("http://www.rozetka.com.ua");

        //type item name123
        driver.findElement(By.cssSelector("div[name='header-search-input-text-wrap']>input")).click();
        driver.findElement(By.cssSelector("div[name='header-search-input-text-wrap']>input")).sendKeys("розетка");

        //click search123
        driver.findElement(By.cssSelector("div[name='header-search-input-text-wrap']>input")).sendKeys(Keys.ENTER);

        //click on first item in search result
        driver.findElement(By.className("g-i-list-title")).click();

        //Get price from product page
        String expectedPrice = driver.findElement(By.id("price_label")).getText();

        //Click "BUY"
        driver.findElement(By.cssSelector(".detail-buy-btn-link>button")).click();

        //Get price from cart
        String priceInCart = driver.findElement(By.cssSelector("span[name='cost']")).getText();

        Assert.assertEquals(expectedPrice, priceInCart);
    }
}

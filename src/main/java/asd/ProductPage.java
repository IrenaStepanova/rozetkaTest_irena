package asd;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class ProductPage {

    private WebDriver driver;
    private By priceLabel = By.id("price_label");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    public void PriceLabel () {
        driver.findElement(priceLabel).getText();
    }
}

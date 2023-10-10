package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class cart {
    WebDriver driver;

    public cart(WebDriver driver) {
        this.driver = driver;
    }

    public void addQuantity(String i,String name) {
        WebElement item = driver.findElement(By.name(name));
        item.clear();
        item.sendKeys(i);
        driver.findElement(By.name("updateCartQuantities")).click();
    }

    public void Proceed() {
        driver.findElement(By.linkText("Proceed to Checkout")).click();
        driver.findElement(By.name("newOrder")).click();
        driver.findElement(By.linkText("Confirm")).click();
    }
}

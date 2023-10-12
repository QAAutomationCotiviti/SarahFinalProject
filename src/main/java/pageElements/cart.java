package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.utility;

public class cart {
    static utility util = new utility();
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
    public void item(){
        util.logInfo("Items in Cart:\n");
        WebElement table = driver.findElement(By.tagName("table"));
        java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));
        for (WebElement row : rows) {
            java.util.List<WebElement> cells = row.findElements(By.tagName("td"));
            for (WebElement cell : cells) {
                util.logInfo(cell.getText() + "\t");
            }
            util.logInfo("");
        }

    }
    public void Proceed() {
        driver.findElement(By.linkText("Proceed to Checkout")).click();
        driver.findElement(By.name("newOrder")).click();
        driver.findElement(By.linkText("Confirm")).click();
    }
}

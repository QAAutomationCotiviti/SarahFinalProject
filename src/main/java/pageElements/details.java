package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class details {
    WebDriver driver;
    public details(WebDriver driver) {
        this.driver = driver;
    }
    public void OrderDetails(){
        String order=driver.findElement(By.xpath("//th[@align='center']")).getText();
        System.out.println(order);
    }
    public void myAccount(){
        driver.findElement(By.linkText("My Account")).click();
        driver.findElement(By.linkText("My Orders")).click();
    }
}

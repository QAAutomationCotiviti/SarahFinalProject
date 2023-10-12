package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utilities.utility;

public class logIn {
    WebDriver driver;
    static utility util = new utility();

    public logIn(WebDriver driver) {
        this.driver = driver;
    }

    public void logInForm() {
//        driver.get("https://petstore.octoperf.com/actions/Account.action;jsessionid=CC111208E4A7981944F54750E4705127?signonForm=");
        driver.findElement(By.linkText("Sign In")).click();
    }

    public void fillForm(String user, String pass) {
        WebElement username = driver.findElement(By.name("username"));
        username.clear();
        username.sendKeys(user);
        WebElement password = driver.findElement(By.name("password"));
        password.clear();
        password.sendKeys(pass);

        WebElement loginbtn = driver.findElement(By.name("signon"));
        loginbtn.click();
        try {
            WebElement logMessage = driver.findElement(By.className("messages"));

            util.logErr(logMessage.getText());
        }
        catch (Exception e){
            util.logInfo("Logged In");
        }
    }
}

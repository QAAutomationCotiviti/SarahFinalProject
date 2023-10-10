package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUp {
    WebDriver driver;

    public signUp(WebDriver driver) {
        this.driver = driver;

    }
    public void signUpForm() {
        driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
    }
    public void byName(String name, String keys){
        driver.findElement(By.name(name)).sendKeys(keys);
    }
    public void fillForm(String user,String pass){
        byName("username",user);
        byName("password",pass);
        byName("repeatedPassword",pass);
        byName("account.firstName","Sarah");
        byName("account.lastName","Gorkhali");
        byName("account.email","sarah.gorkhali@gmail.com");
        byName("account.phone","+9771234567890");
        byName("account.address1","Address 1");
        byName("account.address2","Address 2");
        byName("account.city","City");
        byName("account.state","State");
        byName("account.zip","44700");
        byName("account.country","Nepal");
        driver.findElement(By.name("newAccount")).click();
    }
}

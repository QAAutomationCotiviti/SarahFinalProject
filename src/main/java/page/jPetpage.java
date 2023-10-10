package page;

import org.openqa.selenium.WebDriver;
import pageElements.*;
import utilities.utility;

public class jPetpage {
    static utility util = new utility();
    static WebDriver driver = util.initializeDriver("chrome");
    static signUp sig= new signUp(driver);
    static logIn log= new logIn(driver);
    static categories cat= new categories(driver);
    static cart cart= new cart(driver);
    static details details=new details(driver);

    public static void main(String[] args) {
        driver.manage().window().maximize();
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        util.sleep(1000);
        sig.signUpForm();
        sig.fillForm("Testing194","Testing1234");
//        log.logInForm();
//        log.fillForm("username","password");
//
//        cat.pick("fish");
//        cat.pick("reptiles");
//        cat.pick("cats");
//        cat.pick("search");

//        cart.addQuantity("4");
//        cart.Proceed();
//
//        details.OrderDetails();
//        details.myAccount();
    }
}

package testScenarios;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageElements.*;
import utilities.utility;

public class scenario {
    static utility util = new utility();
    static WebDriver driver = util.initializeDriver("chrome");
    static signUp sign= new signUp(driver);
    static logIn log= new logIn(driver);
    static categories cat= new categories(driver);
    static pageElements.cart cart= new cart(driver);
    static pageElements.details details=new details(driver);
    static String username="Testing1278";
    static String password="Testing1234";


    @BeforeTest
    public void setup() {
        driver.manage().window().maximize();
        driver.get("https://petstore.octoperf.com/actions/Catalog.action");
        util.sleep(1000);
    }
    @Test(priority = 1,enabled = false)
    public void signUp(){
        sign.signUpForm();
        sign.fillForm(username,password);
        System.out.println("Signed Up!!");
    }
    @Test(priority = 2)
    public void login(){
        log.logInForm();
        log.fillForm(username,password);
        System.out.println("Logged In Successfully!!!");
    }
    @Test(priority = 3)
    public void TestFish() {
        cat.pick("fish");
        cart.addQuantity("1","EST-3");
    }
    @Test(priority = 4)
    public void TestReptiles() {
        cat.pick("reptiles");
        cart.addQuantity("2","EST-11");
    }
    @Test(priority = 5)
    public void TestCats() {
        cat.pick("cats");
        cart.addQuantity("3","EST-14");
    }
    @Test(priority = 6)
    public void TestDogs() {
        cat.pick("dogs");
        cart.addQuantity("4","EST-23");
    }
    @Test(priority = 7)
    public void TestBirds() {
        cat.pick("birds");
        cart.addQuantity("5","EST-18");
    }
    @Test(priority = 8)
    public void TestBySearch() {
        cat.pick("search");
        cart.addQuantity("6","EST-10");
    }
    @Test(priority = 9)
    public void CheckOut(){
        cart.Proceed();
        System.out.println("Checked Out");
        details.OrderDetails();
    }

    @AfterTest
    public void teardown() {
        util.sleep(1000);
        driver.quit();
        System.out.println("Driver Closed");
    }
}

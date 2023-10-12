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
        util.logInfo("Signed Up!!");
    }
    @Test(priority = 3)
    public void login(){
        log.logInForm();
        log.fillForm(username,password);
    }
    @Test(priority = 2)
    public void loginErr(){
        log.logInForm();
        log.fillForm("abcd","abcd");
    }
    @Test(priority = 4)
    public void TestFish() {
        cat.pick("fish");
        cart.addQuantity("1","EST-3");
        util.logInfo("A Fish Added");
    }
    @Test(priority = 5)
    public void TestReptiles() {
        cat.pick("reptiles");
        cart.addQuantity("2","EST-11");
        util.logInfo("A Reptile Added");
    }
    @Test(priority = 6)
    public void TestCats() {
        cat.pick("cats");
        cart.addQuantity("3","EST-14");
        util.logInfo("A Cat Added");
    }
    @Test(priority = 7)
    public void TestDogs() {
        cat.pick("dogs");
        cart.addQuantity("4","EST-23");
        util.logInfo("A Dog Added");
    }
    @Test(priority = 8)
    public void TestBirds() {
        cat.pick("birds");
        cart.addQuantity("5","EST-18");
        util.logInfo("A Bird Added");
    }
    @Test(priority = 9)
    public void TestBySearch() {
        cat.pick("search");
        cart.addQuantity("6","EST-10");
        util.logInfo("A Dalmation Added Through Search.");
    }
    @Test(priority = 10)
    public void CheckOut(){
        cart.item();
        cart.Proceed();
        util.logInfo("Checked Out");
        details.OrderDetails();
    }

    @AfterTest
    public void teardown() {
        util.sleep(1000);
        driver.quit();
        util.logInfo("Driver Closed");
    }
}

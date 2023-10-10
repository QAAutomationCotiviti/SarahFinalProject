package pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class categories {
    WebDriver driver;

    public categories(WebDriver driver) {
        this.driver = driver;
    }
    public void pick(String choice){
        switch (choice){
            case "fish"->{
                driver.get("https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=FISH");
                select("FI-SW-02","EST-3");
            }
            case "dogs"->{
                driver.get("https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=DOGS");
                select("K9-RT-02","EST-23");
            }
            case "cats"->{
                driver.get("https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=CATS");
                select("FL-DSH-01","EST-14");
            }
            case "reptiles"->{
                driver.get("https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=REPTILES");
                select("RP-SN-01","EST-11");
            }
            case "birds"->{
                driver.get("https://petstore.octoperf.com/actions/Catalog.action?viewCategory=&categoryId=BIRDS");
                select("AV-CB-01","EST-18");
            }
            case "search"->{
                driver.findElement(By.name("keyword")).sendKeys("Dalmation");
                driver.findElement(By.name("searchProducts")).click();
                select("Great dog for a Fire Station","EST-10");
            }
        }
    }
    public void bylinkText(String link){
        driver.findElement(By.linkText(link)).click();
    }
    public void select(String animal,String type){
        bylinkText(animal);
        bylinkText(type);
        bylinkText("Add to Cart");
    }
}

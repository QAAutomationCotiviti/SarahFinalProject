package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static java.lang.System.exit;

public class utility {
    WebDriver driver;
    private static final Logger log = LogManager.getLogger(utility.class);

    public WebDriver initializeDriver(String browser){

        switch (browser.toLowerCase()){
            case "chrome": driver = new ChromeDriver();
                break;
            case "firefox": driver = new FirefoxDriver();
                break;
            case "edge": driver = new EdgeDriver();
                break;
            default:
                System.out.println(browser+ "is not a valid browser.");
                exit(1);
        } return driver;

    }
    public void sleep(int i){
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    public void logInfo(String info){
        log.info(info);
    }
    public void logErr(String error){
        log.error(error);
    }

}

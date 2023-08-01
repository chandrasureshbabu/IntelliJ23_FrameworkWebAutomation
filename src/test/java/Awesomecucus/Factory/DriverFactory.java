package Awesomecucus.Factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    public static WebDriver driver;
    static String Browser ="Edge";

    public static  WebDriver initializeDriver()
    {
        if(Browser== "chrome") {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if(Browser== "FireFox"){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }else if(Browser=="Edge"){
            WebDriverManager.edgedriver().setup();;
            driver=new EdgeDriver();
        }else
        {
            WebDriverManager.edgedriver().setup();;
            driver=new EdgeDriver();
        }
        driver.manage().window().maximize();

        return driver;
    }

    public static WebDriver getDriver()
    {
        return driver;
    }

    // we can write entire code single method
    // by comparing if driver with null


    public static WebDriver initGetDriver()
    {
        if(driver==null)
        {
            if(Browser=="chrome")
            {
                //System.setProperty("webdriver.chrome.driver","path");
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
            }else if (Browser=="Firefox")
            {
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();

            }else
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
        }
            driver.manage().window().maximize();
            return driver;
    }



}

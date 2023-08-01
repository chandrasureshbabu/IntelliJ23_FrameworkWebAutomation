package Awesomecucus.Pages;

import Awesomecucus.Utils.ConfigLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {


    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver){
        this.driver=driver;
        wait= new WebDriverWait(driver, Duration.ofSeconds(8));
        PageFactory.initElements(driver,this);
    }


    public void Load(String endpoint){

        driver.get(ConfigLoader.getInstance().getBaseUrl()+endpoint);
        System.out.println("****************************^^^^^^^^Url from congf file is :"+ConfigLoader.getInstance().getBaseUrl());

    }

}

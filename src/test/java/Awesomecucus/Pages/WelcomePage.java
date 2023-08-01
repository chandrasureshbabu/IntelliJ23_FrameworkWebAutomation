package Awesomecucus.Pages;

import Awesomecucus.Objects.Issue;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import javax.xml.xpath.XPath;

public class WelcomePage extends BasePage {

    public WebDriver driver;


    public WelcomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath="//*[@id='header']//descendant::ul[1]/li[10]/a") private WebElement LogoutLink;
    @FindBy(xpath = "//body/div[@id='header']/ul[1]/li[2]/a[1]") private  WebElement New_Link;

    @FindBy(css = "#title") private WebElement title;
    @FindBy(css = "#quicksearch_top") private  WebElement Search;
   // @FindBy(css = "#find_top") private  WebElement SearchBtn;
    @FindBy(xpath = "//*[@id='find_top']") private WebElement SearchBtn;


    public void Click_Logout(){
        wait.until(ExpectedConditions.elementToBeClickable(LogoutLink)).click();
        System.out.println("*******^^^^^Clicked Logout^^^^^*****");
        //return new HomePage(driver);
    }

    public void Click_New(){
        wait.until(ExpectedConditions.elementToBeClickable(New_Link)).click();
        System.out.println("*******^^^^^Clicked NewLink^^^^^*****");
    }

    public void page_title() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(title));
        String PageTitle=title.getText();
        if(PageTitle.equalsIgnoreCase("")){
            System.out.println("Am on welcome page");
        }else {
            System.out.println("no not on welcome page");
        }

        Thread.sleep(5000);
    }

    public  void Search_bug(String name) throws InterruptedException {
        Search.sendKeys(name);
        wait.until(ExpectedConditions.elementToBeClickable(SearchBtn)).click();
        Thread.sleep(5000);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^ Searched bug as per Input ^^^^^^^^^^^^^^^^^^^^^^^^^^^");

    }



}

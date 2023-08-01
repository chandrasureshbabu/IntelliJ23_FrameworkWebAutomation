package Awesomecucus.Pages;

import Awesomecucus.Objects.LoginDetails;
import Awesomecucus.Objects.User;
import com.sun.source.tree.IfTree;
import io.cucumber.java.Transpose;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;

import javax.xml.xpath.XPath;

public class HomePage  extends BasePage {

    public WebDriver driver;


          @FindBy(xpath = "//*[@id='login_link_top']") private WebElement LoginLink;
          @FindBy(xpath = "//*[@id='forgot_link_top']") private WebElement ForgotPasswordlink;
          @FindBy(xpath="//*[@id='header']//a[text()='Home']") private  WebElement Home_link;

          @FindBy(css = "#Bugzilla_login_top") private  WebElement Username;
          @FindBy(xpath="//input[@id='Bugzilla_password_top']") private WebElement Pswrd;
          @FindBy(css="#log_in_top") private  WebElement SignIn;



    public HomePage(WebDriver driver) {
        super(driver);
    }

        public HomePage click_Home(){

             System.out.println( wait.until(ExpectedConditions.visibilityOf(Home_link)));
             return  this;
        }

        public HomePage click_LoginLink()
        {
            System.out.println(wait.until(ExpectedConditions.visibilityOf(LoginLink)));
            wait.until(ExpectedConditions.elementToBeClickable(LoginLink)).click();
            return this;
        }

        public boolean CredFields_Displayed() {
            System.out.println("*******^^^^^Checking For CredFields^^^^^*****");
            if (wait.until(ExpectedConditions.visibilityOf(Username)).isEnabled()){
                System.out.println("Username Field Displayed :"+Username.isEnabled());
                System.out.println("*******^^^^^Checking For username Field^^^^^*****");

                return true;
            }else
            return  false;

        }
        public boolean PasswordField_Displayed()
        {
            if (Pswrd.isDisplayed()) {
                System.out.println("*******^^^^^Checking For password Field^^^^^*****");
                System.out.println("Password Field Displayed:"+Pswrd.isEnabled());
                return true;

            }else
                return false;

        }

        public boolean  SigninButton_Displayed()
        {
            if (SignIn.isDisplayed()){
                return true;
            }else
                return false;
        }

        public void LoginToBugzilla(String username , String password) throws InterruptedException {
            wait.until(ExpectedConditions.visibilityOf(Username)).sendKeys(username);
            wait.until(ExpectedConditions.visibilityOf(Pswrd)).sendKeys(password);
            wait.until(ExpectedConditions.elementToBeClickable(SignIn)).click();
            System.out.println("*******^^^^^Signed In ^^^^^*****");
            Thread.sleep(3000);
            //return new WelcomePage(driver);
        }

        public HomePage Click_forgotPassword()
        {
            System.out.println(wait.until(ExpectedConditions.visibilityOf(ForgotPasswordlink)));
            if(ForgotPasswordlink.isDisplayed()) {
                ForgotPasswordlink.click();
            }
            return this;
        }
        public boolean LoginLink_Displayed(){
            System.out.println("****in HomePage Class*****_Looking for Login Link");
            wait.until(ExpectedConditions.visibilityOf(LoginLink));
            //Assert.assertTrue(ForgotPasswordlink.isEnabled());
            return LoginLink.isDisplayed();
        }
        public boolean Forgotpassword_displayed(){
            System.out.println("****in HomePage Class*****_Looking for Forgotpassword_Link");
            wait.until(ExpectedConditions.visibilityOf(ForgotPasswordlink));
           return ForgotPasswordlink.isDisplayed();
        }

        // T5
        public HomePage enter_Username(String username) {
            Username.sendKeys(username);
            return this;
        }

        public HomePage enter_password(String psswd){
            Pswrd.sendKeys(psswd);
            return  this;
        }

        public HomePage Set_LoginCreds(String Usrname,String password){

            return enter_Username(Usrname).enter_password(password);
        }
        public void ClickLogin()
        {
            SignIn.click();
        }
        // end T5

        // T6 - method has object as an argument

        public HomePage Set_Creds(LoginDetails loginDetails){

                return enter_Username(loginDetails.getUsername())
                        .enter_password(loginDetails.getPassword());
        }
    }







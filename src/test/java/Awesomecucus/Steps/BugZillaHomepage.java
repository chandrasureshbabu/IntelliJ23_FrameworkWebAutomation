package Awesomecucus.Steps;

import Awesomecucus.Factory.DriverFactory;
import Awesomecucus.Pages.EnterBug;
import Awesomecucus.Pages.HomePage;
import Awesomecucus.Pages.WelcomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class BugZillaHomepage {


    public WebDriver driver;



    //By LoginLink= By.xpath("//*[@id='login_link_top']");
    //By ForgotPassword=By.xpath("//*[@id='forgot_link_top']");

    @Given("user is navigated to home page of bugizlla")
    public void user_is_navigated_to_home_page_of_bugizlla() throws InterruptedException {
        driver= DriverFactory.getDriver();
        /*System.out.println("Trying to get Bugzilla Home page");
        Thread.sleep(3000);
        driver.get("http://localhost:5001/");*/
        Thread.sleep(3000);
        new HomePage(driver).Load("/index.cgi?logout=1");
        //homepage.Load("http://localhost:5001/");
    }
    @Then("user should be able to Log in Link")
    public void user_should_be_able_to_log_in_link() throws InterruptedException {
        Thread.sleep(5000);
      //System.out.println("Displayed log in Link : "+ driver.findElement(LoginLink).isDisplayed());
        //System.out.println("  log in Link - Enabled: "+ driver.findElement("LoginLink").isDisplayed());
        Assert.assertTrue(new HomePage(driver).LoginLink_Displayed());
        System.out.println("Displayed log in Link : " + new HomePage(driver).LoginLink_Displayed());
        //or
        //Assert.assertTrue(homepage.LoginLink_Displayed());
        //System.out.println("Displayed log in Link : " + homepage.LoginLink_Displayed());



    }
    @Then("user should be able to see Forgotpassword link")
    public void user_should_be_able_to_see_forgotpassword_link() throws InterruptedException  {
        //System.out.println("Displayed forgotpassword Link : "+ driver.findElement(ForgotPassword).isDisplayed());
        //System.out.println("Forgotpassword Link  Enabled : "+ driver.findElement(ForgotPassword).isEnabled());
        //Thread.sleep(3000);
        Assert.assertTrue(new HomePage(driver).Forgotpassword_displayed());
        System.out.println("Displayed log in Link : " + new HomePage(driver).Forgotpassword_displayed());
        //or
        //Assert.assertTrue(homepage.Forgotpassword_displayed());
        //System.out.println("Displayed log in Link : " + homepage.Forgotpassword_displayed());
    }


    @Then("click Login Link")
    public void click_login_link() throws InterruptedException {
        System.out.println("Login Link Displayed  : "+new HomePage(driver).LoginLink_Displayed() +"  so Clicking Login Link :");
        new HomePage(driver).click_LoginLink();
        Thread.sleep(5000);

    }
    @Then("user should be able to see username and password fields")
    public void user_should_be_able_to_see_username_and_password_fields() {
        System.out.println("Cred Feild username Displayed : "+new HomePage(driver).CredFields_Displayed());
        System.out.println("password are Displayed : "+new HomePage(driver).PasswordField_Displayed());

    }
    @Then("user should be able to see Login button")
    public void user_should_be_able_to_see_login_button() throws InterruptedException {
        System.out.println("Sign in button: "+new HomePage(driver).SigninButton_Displayed());
        Assert.assertTrue(new HomePage(driver).SigninButton_Displayed());

    }
    @Then("Enter Username {string} and Password {string} and Click Login")
    public void enter_username_and_password_and_click_login(String username, String password) throws InterruptedException {
        new HomePage(driver).LoginToBugzilla(username,password);
        //new WelcomePage(driver).Click_Logout();
        Thread.sleep(5000);

    }

    //----

    @Then("Click New on WelcomePage")
    public void click_new_on_welcome_page() {
        System.out.println("***********^^^^^^^on_welcome_page^^^^^^^^^**********" );
        new WelcomePage(driver).Click_New();


    }
    @Then("App Redirected to BugPage")
    public void app_redirected_to_bug_page() {

        System.out.println("Page Title is :"+new EnterBug(driver).On_EnterBugPage());
        if (new EnterBug(driver).On_EnterBugPage().equalsIgnoreCase("Bugzilla – Enter Bug: TestProduct"))
        {
            System.out.println("***********^^^^^^^on Bug details page^^^^^^^^^**********" );
        }


    }
    @Then("Enter BugDetails")
    public void enter_bug_details(List<Map<String,String>> bDetails) throws InterruptedException {
        new EnterBug(driver).Set_BugDetails(bDetails.get(0).get("Severity"),
                bDetails.get(0).get("Hardware"),
                bDetails.get(0).get("Os"),
                bDetails.get(0).get("ShortDesc"),
                bDetails.get(0).get("Description"));
        new EnterBug(driver).submitBug();
        Thread.sleep(3000);


    }




}



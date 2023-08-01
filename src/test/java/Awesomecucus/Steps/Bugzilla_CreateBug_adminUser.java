package Awesomecucus.Steps;

import Awesomecucus.Factory.DriverFactory;
import Awesomecucus.Objects.BugDetails;
import Awesomecucus.Objects.Issue;
import Awesomecucus.Objects.LoginDetails;
import Awesomecucus.Objects.User;
import Awesomecucus.Pages.BugListPage;
import Awesomecucus.Pages.EnterBug;
import Awesomecucus.Pages.HomePage;
import Awesomecucus.Pages.WelcomePage;
import Awesomecucus.Utils.ConfigLoader;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.util.List;
import java.util.Map;

public class Bugzilla_CreateBug_adminUser {

    public WebDriver driver;
    public HomePage homePage;
    public WelcomePage welcomePage;
    public EnterBug enterbug;
    public BugListPage bugListPage;
// T5  - this is Sharing context between Steps  via variable  but not recommended way
    private  String Username ;
    private  String Password;
// end T5
// T6 calling data from Gerkin file using  Domain object and CustomDatable classes
   private LoginDetails loginDetails;
   private BugDetails bugDetails;
//T7
private  Issue issue;


    @Given("User navigated Bugzilla Homepage")
    public void userNavigatedBugzillaHomepage() {
        driver= DriverFactory.getDriver();
        homePage= new HomePage(driver);
        homePage.Load("/index.cgi?logout=1");


    }
    @When("Clicks LoginLink")
    public void clicks_login_link() {

        homePage.click_LoginLink();
    }
    @Then("Username Field  and password Fields are Displayed")
    public void username_field_and_password_fields_are_displayed() {
        Assert.assertTrue(homePage.CredFields_Displayed());
    }
    @Then("User Enters valid Admin Username {string} and Password {string}")
    public void user_enters_valid_admin_username_and_password(String username, String password) throws InterruptedException {
       homePage.LoginToBugzilla(username,password);
    }
    @Then("Admin User is on Welcomepage")
    public void adminUserIsOnWelcomepage() throws InterruptedException {
        welcomePage= new WelcomePage(driver);
        welcomePage.page_title();
    }


    @Then("Clicks New on welcomePage")
    public void    clicksNewOnWelcomePage() {

        welcomePage.Click_New();
    }

    @Then("user is on Bugzilla_enterBug page")
    public void userIsOnBugzilla_enterBugPage() {
        enterbug= new EnterBug(driver);
        String tile=enterbug.On_EnterBugPage();
        System.out.println(tile);
        if (tile.equalsIgnoreCase(""))
        {
            System.out.println("--------------****^^^^^^^is  on enter bug details page^^^^^^^*******-------------- ");
        }else
            System.out.println("--------------****^^^^^^^is not!!! on enter bug details page^^^^^^^*******-------------- ");
    }

    @Then("user enters bugDetails")
    public void userEntersBugDetails(List<Map<String, String>> bugDetails) {

        enterbug.Set_BugDetails(bugDetails.get(0).get("Severity"),
                bugDetails.get(0).get("Hardware"),
                bugDetails.get(0).get("Os"),
                bugDetails.get(0).get("ShortDesc"),
                bugDetails.get(0).get("Description"));
    }

    @And("Submit bug")
    public void submitBug() throws InterruptedException {
        enterbug.submitBug();
    }


    // T5
    @And("Admin user credentails are")
    public void adminUserCredentailsAre(List<Map<String,String>> Creds) {
        // for this private variables are Declared in this Class  and assign values mentioned in feature file
        // to get values from Data table of feature  used List of map as shown in this method argument
        // this method is not recommended
        Username=Creds.get(0).get("Username");
        Password=Creds.get(0).get("Password");

    }

    @Then("Provide Admin Creds")
    public void provideAdminCreds() {

        homePage.Set_LoginCreds(Username,Password);
    }

    @And("Click Login")
    public void clickLogin() {
        homePage.ClickLogin();

    }
    // end T5



    //T6
    @And("Admin user creds are")
    public void adminUserCredsAre(LoginDetails loginDetails) {
        System.out.println("^^^^^^^^^ trying to Read object^^^^^^^^^^^^^^^^^^ from Steps Class");
        this.loginDetails=loginDetails;
    }

    @Then("Enter Admin Creds")
    public void enterAdminCreds() {
        homePage.Set_Creds(loginDetails);
    }


    @Then("provide BugDetails")
    public void provideBugDetails(BugDetails bugDetails) {
        this.bugDetails=bugDetails;
        enterbug.Set_IssueDetails(bugDetails);

    }
    //end T6
    //T7 and T8
    @And("Search a bug {issue}")
    public void searchABug(Issue issue) throws InterruptedException {
        //this.issue=issue;
        welcomePage.Search_bug(issue.getBugName());
        Thread.sleep(1000);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^ Searched bug as per Input -Step Definaation^^^^^^^^^^^^^^^^^^^^^^^^^^^");
    }

    @Then("Admin user should see a Bugname {issue}")
    public void adminUserShouldSeeABugname(Issue issue) {
        bugListPage= new BugListPage(driver);
        //this.issue=issue;
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^ For Count 1 ^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        bugListPage.SearchedIssue(issue);
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^ For Count 3 ^^^^^^^^^^^^^^^^^^^^^^^^^^^");

    }
    //end T7 and T8
}

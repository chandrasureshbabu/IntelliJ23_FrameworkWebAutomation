package Awesomecucus.Steps;

import Awesomecucus.Pages.EnterBug;
import Awesomecucus.Pages.WelcomePage;
import io.cucumber.java.en.Then;
import org.bouncycastle.est.LimitedSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.Map;

public class EnterBugDetails {

    public WebDriver driver;

    /*@Then("Click New on WelcomePage")
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
    public void enter_bug_details(List<Map<String,String>> bDetails) {
        new EnterBug(driver).Set_BugDetails(bDetails.get(0).get("Severity"),
                                            bDetails.get(0).get("Hardware"),
                                            bDetails.get(0).get("Os"),
                                            bDetails.get(0).get("ShortDesc"),
                                            bDetails.get(0).get("Description"));
        new EnterBug(driver).submitBug();


    }*/

}

package Awesomecucus.Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tablesteps {
    @When("i search for {string} on the page")
    public void iSearchForOnThePage(String cucumber_expression) {
        System.out.println("i search for \"<cucumber_expression>\" on the page");
    }

    @Given("on Cucumber doc page")
    public void onCucumberDocPage() {
        System.out.println("this is table");
    }

    @And("i search for {string} on the doc page")
    public void iSearchForOnTheDocPage(String Regular_expressions) {
        System.out.println("this is table i search for \"<Regular_expressions>\" on the doc page");
    }

    @Then("result are {string} vs {string}")
    public void resultAreVs(String cucumber_expression, String Regular_expressions) {
        System.out.println("result are \"<cucumber_expression>\" vs \"<Regular_expressions>\"");
    }

    @Then("i see results displaying {int} logo on logo page")
    public void i_see_results_displaying_bird_on_logo_page(Integer bird) {
        System.out.println("i see results displaying" +bird+ " on logo page");
    }
    //parameters from feature Files observe below and above Steps
    @Then("i see results displaying {double} bird on logo page")
    public void i_see_results_displaying_bird_on_logo_page(Double double1) {
        System.out.println("i see results displaying" +double1+ " on logo page");
    }
  // bug zilla
    @Given("on the Bugzilla homepage")
    public void on_the_bugzilla_homepage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("ion_the_bugzilla_homepage");
    }
    @When("Clicks on login link")
    public void clicks_on_login_link() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("clicks_on_login_link");
    }
    @Then("username password fields appearon the page")
    public void username_password_fields_appearon_the_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("username_password_fields_appearon_the_page");
    }
    @Then("Enter valid creds {string} and {string}")
    public void enter_valid_creds_and(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("valid_uname: "+username);
        System.out.println("valid_uname: "+password);

    }
    @Then("Click on login button")
    public void click_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click_on_login_button");
    }
    @Then("should be able login")
    public void should_be_able_login() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("should_be_able_login");
    }

    //bug

    @Given("usr on the welcome page")
    public void usr_on_the_welcome_page() {
        System.out.println("usr_on_the_welcome_page");
    }
    @When("Click new link")
    public void click_new_link() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click_new_link");
    }
    @Then("Select {string}")
    public void select(String Severity) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Severity:"+Severity);
    }

    @Then("Enter Bug {string}")
    public void enter_bug(String Desc) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Description :"+Desc);

    }
    @Then("Click Submit Bug button")
    public void click_submit_bug_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("click submit");
    }
    // custom parameters






}

package Awesomecucus.Steps;

import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.awt.*;

public class TagConceptSteps {

    @Given("User is on the Bugzilla Home Page")
    public void user_is_on_the_bugzilla_home_page() {
       System.out.println("On Bugzilla Home Page");
    }
    @When("Clicks on the Login Page")
    public void clicks_on_the_login_page() {
        System.out.println("To Login page");
    }
    @Then("Provides Username {string} and Password {string}")
    public void provides_username_and_password(String username, String password) {
        System.out.println("Provide Username :"+ username +" "+"Provide Password:"+password);
    }
    @Then("Clicks login button")
    public void clicks_login_button() {
        System.out.println("Click submit buuton");
    }

   /* Tags can be Applied at
    Feature level
    Rule Level
    Scenario level
    And At data level  i.e. Examples level as well - please refer to respective  feature file
    */
}

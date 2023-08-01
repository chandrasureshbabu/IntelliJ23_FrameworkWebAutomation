package Awesomecucus.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepss {

    @Given("on home page")
    public void on_home_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("on home page");
    }
    @When("clicks on logo")
    public void clicks_on_logo() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("clicks on logo");
    }
    @Then("Logo is displayed")
    public void logo_is_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Logo is displayed");
    }


    // second scenario

    @Given("on home page two")
    public void on_home_page_two() {
        System.out.println("on_home_page_two");
    }
    @When("clicks on logo two")
    public void clicks_on_logo_two() {
        System.out.println("clicks_on_logo_two");
    }
    @Then("second Logo is displayed")
    public void second_logo_is_displayed() {
        System.out.println("second_logo_is_displayed");
    }

}

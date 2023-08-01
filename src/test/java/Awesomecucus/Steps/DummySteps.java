package Awesomecucus.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import javax.xml.transform.stream.StreamSource;

public class DummySteps {

    @Given("this dummy app")
    public void this_dummy_app() {
        System.out.println("this_dummy_app");
    }
    @When("provide dummy creds")
    public void provide_dummy_creds() {
        System.out.println("provide_dummy_creds");
    }
    @When("click on Button")
    public void click_on_button() {
        System.out.println("This is click on dummy Button");
    }
    @Then("Dummy logo is displayed")
    public void dummy_logo_is_displayed() {
        System.out.println("This is dummy_logo_is_displayed");
    }
}

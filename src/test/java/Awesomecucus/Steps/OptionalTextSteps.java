package Awesomecucus.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OptionalTextSteps {


    @Given("on Cucus page")
    public void on_cucus_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Optional Text Concept-on_cucus_page");
    }
    //Optional text Concept

    @When("Search the Apple from homepage")
    public void search_the_apple_from_homepage() {
        System.out.println("Optional Text Concept-Search the Apple from homepage");
    }
    @Then("user able to see the apple(s) in search results")
    public void user_able_to_see_the_apple_in_search_results() {
        System.out.println("Optional Text Concept-user able to see the apples in search results");
    }
}

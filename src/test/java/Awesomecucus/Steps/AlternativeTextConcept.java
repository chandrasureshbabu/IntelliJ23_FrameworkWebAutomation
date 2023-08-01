package Awesomecucus.Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AlternativeTextConcept {

    @Given("am on store page")
    public void am_on_store_page() {
        System.out.println("alternative text- on store page");
    }
    @When("user provide the login creds")
    public void user_provide_the_login_creds() {
        System.out.println("alternative text- user_provide_the_login_creds");
    }
    @Then("user is on the products/results page")
    public void user_is_on_the_products_page() {
        System.out.println("alternative text- user_is_on_the_products_page");
    }

}

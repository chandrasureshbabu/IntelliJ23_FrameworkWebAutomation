package Awesomecucus.Steps;

import Awesomecucus.Objects.Credentials;
import io.cucumber.java.ParameterType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CustmParaSteps {



    @Given("user is on the Bugzilla hompage")
    public void user_is_on_the_bugzilla_hompage() {
        System.out.println("user is on the Bugzilla hompage");

    }
    @ParameterType(".*")
    public Credentials cred(String uname){
        return new Credentials(uname);
    }
    @Then("User provides Valid {cred}")
    public void user_provides_valid(Credentials cred) {

        //Credentials cred= new Credentials(username);
        System.out.println("***************^^^^^^^^^^^^^^^^^^user is :"+ cred.getUserName());

    }
    @Then("provide valid Password")
    public void provide_valid_password() {
        System.out.println("provide valid Password");
    }



}


package Awesomecucus.Steps;

import Awesomecucus.Objects.User;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class DatatableCncptSteps {

    /*@Given("user1 is on homepage")
    public void user1_is_on_homepage() {
        System.out.println("user1 is on homepage");
    }*/
    /*@Given("user1 is on homepage")
    public void user1_is_on_homepage() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user1 is on homepage");
    }

    @Then("Provide valid username and password")
    public void provide_valid_username_and_password(DataTable datatable)  {

       //List<String> creds= datatable.asList();
        //System.out.println("user1 uname:"+creds.get(0));
        // list should be sequencel way but in feature file its in the row wise

        List<String> creds= datatable.values();
        System.out.println("Exp1 - This is to Demo Datatable Concept exp1 -with out header - user1 uname:"+creds.get(0));
        System.out.println("Exp1 - This is to Demo Datatable Concept exp1 -with out header - user1 password:"+creds.get(1));



        //or
        List<String> c2= datatable.row(0);
        System.out.println("user1-1 uname:"+c2.get(0));
        System.out.println("user1 -1password:"+c2.get(1));

    }

    @Then("Provide valid username and password of user2")
    public void provide_valid_username_and_password_of_user2(DataTable dt1) {
        System.out.println("*****------Row(0)-----*******");
        List<String> c3= dt1.row(0);
        System.out.println("Exp2 - This is to Demo Datatable Concept exp1 -with out header - user2-1 uname:"+c3.get(0));
        System.out.println("Exp2 - This is to Demo Datatable Concept exp1 -with out header -user2-1 password:"+c3.get(1));

        // to read next row we need to

        System.out.println("*****------Row(1)-----*******");

        List<String> c4= dt1.row(1);
        System.out.println("Exp2 - This is to Demo Datatable Concept exp1 -with out header -user2-2 uname:"+c4.get(0));
        System.out.println("Exp2 - This is to Demo Datatable Concept exp1 -with out header -user2-2 password:"+c4.get(1));

        // or
        List<List<String>> c5= dt1.asLists();
        System.out.println("*****----Row(0) and Row(1)-------*******");

        System.out.println("Exp2 - This is to Demo Datatable Concept exp1 -with out header user2-r1uname:"+c5.get(0).get(0));
        System.out.println("Exp2 - This is to Demo Datatable Concept exp1 -with out header user2-r1 password:"+c5.get(0).get(1));
        System.out.println("Exp2 - This is to Demo Datatable Concept exp1 -with out header user2-r2 uname:"+c5.get(1).get(0));
        System.out.println("Exp2 - This is to Demo Datatable Concept exp1 -with out header user2-r2 password:"+c5.get(1).get(1));
    }

    @DataTableType
    public User userentry(List<String> entry){
        return  new User(entry.get(0), entry.get(1));
    }
    @Then("Provide valid username and password of user3")
    public void provide_valid_username_and_password_of_user3(User user) {
        System.out.println("This is to Demo Datatable Concept exp3 " +
                "-Single row with out header with Custom Datatable object username :"+user.getUsername());
        System.out.println("This is to Demo Datatable Concept exp3 " +
                "-Single row with out header with Custom Datatable object password :"+user.getPassword());


    }

    @Then("Provide valid username and password of user4")
    public void provide_valid_username_and_password_of_user4(List<User> users) {
        System.out.println("This is to Demo Datatable Concept exp4" +
                " -Multiple rows with out header with Custom Datatable object username row 0:"+users.get(0).getUsername());
        System.out.println("This is to Demo Datatable Concept exp4 " +
                "-Multiple rows with out header with Custom Datatable object password row 0:"+users.get(0).getPassword());
        System.out.println("This is to Demo Datatable Concept exp4 " +
                "-Multiple rows with out header with Custom Datatable object username row 1:"+users.get(1).getUsername());
        System.out.println("This is to Demo Datatable Concept exp4" +
                " -Multiple rows with out header with Custom Datatable object password row 1:"+users.get(1).getPassword());
    }

    @Then("Provide valid username and password of user5")
    public void provide_valid_username_and_password_of_user5(List<List<String>> users) {
        System.out.println("This is to Demo Datatable Concept exp5 " +
                "-single rows with  header with Custom Datatable object username :"+users.get(1).get(0));
        System.out.println("This is to Demo Datatable Concept exp5 " +
                "-single rows with  header with Custom Datatable object password :"+users.get(1).get(1));
    }
    @Then("Provide valid username and password of user6")
    public void provide_valid_username_and_password_of_user6(List<Map<String,String>> users) {
        System.out.println(" This is to Demo Datatable Concept exp6 " +
                "-Multiple rows with  header with Custom Datatable object username row 0 :"+users.get(0).get("Username"));
        System.out.println(" This is to Demo Datatable Concept exp6 " +
                "-Multiple rows with  header with Custom Datatable object password row 0:"+users.get(0).get("Password"));
        System.out.println(" This is to Demo Datatable Concept exp6 " +
                "-Multiple rows with  header with Custom Datatable object username row 1:"+users.get(1).get("Username"));
        System.out.println(" This is to Demo Datatable Concept exp6 " +
                "-Multiple rows with  header with Custom Datatable object password row 1:"+users.get(1).get("Password"));
    }*/



}


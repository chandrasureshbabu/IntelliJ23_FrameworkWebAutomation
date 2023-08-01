
package Awesomecucus.Steps;


import Awesomecucus.Objects.User;
import Awesomecucus.Objects.User1;
import Awesomecucus.Objects.User2;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.DataTableType;
import io.cucumber.java.Transpose;
import io.cucumber.java.en.Then;

import java.util.List;
import java.util.Map;

public class DatatableCnceptSteps1 {



   /* @Then("Provide valid username and password of user7")
    public void provide_valid_username_and_password_of_user7(User1 user) {
        System.out.println("This is to Demo Datatable Concept exp7" +
                " -single rows with  header with Custom Datatable object using maps Username is  :"+user.getUsername());
        System.out.println("This is to Demo Datatable Concept exp7 " +
                "-single rows with  header with Custom Datatable object using mapsPassword is  :"+user.getPassword());
    }

    @Then("Provide valid username and password of user8")
    public void provide_valid_username_and_password_of_user8(List<User1> users) {
        System.out.println("This is to Demo Datatable Concept exp8 " +
                "-Multiple rows with  header with Custom Datatable object using mapsUsername is  :"+users.get(0).getUsername());
        System.out.println("This is to Demo Datatable Concept exp8 " +
                "-Multiple rows with  header with Custom Datatable object using mapsPassword is  :"+ users.get(0).getPassword());

        System.out.println("This is to Demo Datatable Concept exp8 " +
                "-Multiple rows with  header with Custom Datatable object using mapsUsername is  :"+users.get(1).getUsername());
        System.out.println("This is to Demo Datatable Concept exp8" +
                " -Multiple rows with  header with Custom Datatable object using mapsPassword is  :"+ users.get(1).getPassword());
    }

    @Then("Provide valid username and password of user9")
    public void provide_valid_username_and_password_of_user9(List<String> users) {
        System.out.println("This is to Demo Datatable Concept exp9 " +
                "-Single column with no header with Custom Datatable object using maps Username is  :"+users.get(0));
        System.out.println("This is to Demo Datatable Concept exp9 " +
                "-Single column with no header with Custom Datatable object using maps Password is  :"+ users.get(1));

    }

    @Then("Provide valid username and password of user10")
    public void provide_valid_username_and_password_of_user10(DataTable datatable) {
        List<String> user=datatable.asList();
        System.out.println("This is to Demo Datatable Concept exp10 " +
                "-Single column with no header with Custom Datatable object using maps and datatable Username is  :"+user.get(0));
        System.out.println("This is to Demo Datatable Concept exp10 " +
                "-Single column with no header with Custom Datatable object using maps and datatable Password is  :"+ user.get(1));

    }

    @Then("Provide valid username and password of user11")
    public void provide_valid_username_and_password_of_user11(DataTable datatable) {
        Map<String,String> user=datatable.asMap();
        System.out.println("This is to Demo Datatable Concept exp11 " +
                "-Single column with  header with Custom Datatable object using maps and datatable Username is  :"+user.get("Username"));
        System.out.println("This is to Demo Datatable Concept exp11 " +
                "-Single column with  header with Custom Datatable object using maps and datatable Password is  :"+ user.get("Password"));
    }

    @DataTableType
    public User userentry(Map<String,String> entry){

        return new User(entry.get("Username"),entry.get("Password"));
    }
    @Then("Provide valid username and password of user12")
    public void provide_valid_username_and_password_of_user12(User user) {
        //Map<String,String> user=datatable.asMap();
        System.out.println("This is to Demo Datatable Concept exp12" +
                " -Single column with  header with Custom Datatable object using maps Username is  :"+user.getUsername());
        System.out.println("This is to Demo Datatable Concept exp12 " +
                "-Single column with  header with Custom Datatable object using maps Password is  :"+ user.getPassword());
    }

    @DataTableType
    public User2 userentry2(List<String>entry)
    {
        return  new User2(entry.get(0),entry.get(1));
    }


@Then("Provide valid username and password of user13")
    public void provide_valid_username_and_password_of_user13(List<String> user) {
        //Map<String,String> user=datatable.asMap();
        System.out.println("Username is  :"+user.get(0));
        System.out.println("Password is  :"+ user.get(1));

        //or
    }


    @Then("Provide valid username and password of user13")
    public void provide_valid_username_and_password_of_user13(@Transpose User2 user2) {
        //Map<String,String> user=datatable.asMap();
        System.out.println("This is to Demo Datatable Concept exp13" +
                "-Single column with no header with Custom Datatable object And Transpose Username is  :"+user2.getUsername());
        System.out.println("This is to Demo Datatable Concept exp13" +
                "-Single column with no header with Custom Datatable object And Transpose Password is  :"+ user2.getPassword());
    }
    @DataTableType
    public User1 userentry1(Map<String,String> entry)
    {
        return  new User1(entry.get("Username"),entry.get("Password"));
    }

    @Then("Provide valid username and password of user14")
    public void provide_valid_username_and_password_of_user14(@Transpose User1 user) {
        //Map<String,String> user=datatable.asMap();
        System.out.println("This is to Demo Datatable Concept exp14" +
                "-Single column with  header with Custom object And Transpose Username is  :"+user.getUsername());
        System.out.println("This is to Demo Datatable Concept exp14" +
                "-Single column with  header with Custom object And Transpose Password is  :"+ user.getPassword());

    }*/







}


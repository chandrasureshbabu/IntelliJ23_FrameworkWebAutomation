package Awesomecucus.CustomType;

import Awesomecucus.Objects.LoginDetails;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class CustomDataTableType_UserCreds {

    //T6
    @DataTableType
    public LoginDetails loginDetailsEntry(Map<String,String> entry){
        return  new LoginDetails(entry.get("Username"),entry.get("Password"));
    }
}

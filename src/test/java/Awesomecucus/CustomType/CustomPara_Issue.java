package Awesomecucus.CustomType;

import Awesomecucus.Objects.Issue;
import io.cucumber.java.ParameterType;

public class CustomPara_Issue {

    @ParameterType(".*")
    public Issue issue(String name){

        return new Issue(name.replace("\"",""));
    }
}

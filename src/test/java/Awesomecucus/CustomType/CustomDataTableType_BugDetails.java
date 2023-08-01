package Awesomecucus.CustomType;

import Awesomecucus.Objects.BugDetails;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class CustomDataTableType_BugDetails {

    @DataTableType
    public BugDetails bugDetailsEntry(Map<String,String> entry){
        return new BugDetails(entry.get("Severity"),
                               entry.get("Hardware"),
                                entry.get("Os"),
                                 entry.get("ShortDesc"),
                                    entry.get("Description"));
    }
}

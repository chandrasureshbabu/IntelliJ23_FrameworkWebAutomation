package Awesomecucus.Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE;

@CucumberOptions(

        plugin = {"pretty", "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt","summary"},

        monochrome = false,
        dryRun = false,
        snippets = CAMELCASE,
        tags = "@T8",
        glue = {"Awesomecucus.Hooks","Awesomecucus.Steps","Awesomecucus.CustomType","Awesomecucus.Objects"},
        features = "src/test/resources/Awesomecucus"


  )
public class TestNGRunnerTest extends AbstractTestNGCucumberTests {

    @BeforeClass
    public static void DBClean()
    {
        System.out.println("Data from DB tg runner");
    }

    @AfterClass
    public static void QuiteDriver()
    {
        System.out.println("Close Driver tg runner");
    }
}
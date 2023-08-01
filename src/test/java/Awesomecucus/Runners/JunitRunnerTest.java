package Awesomecucus.Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber.html","summary"},
        snippets= CAMELCASE,
        monochrome = false,
        dryRun = false,
        //tags = "@sc1 or @Atext or @F1 or @Opt or @DT",
        tags = "@T3",
        glue = {"Awesomecucus.Steps","Awesomecucus.Hooks"},
        features = "src/test/resources/Awesomecucus"
)
public class JunitRunnerTest {
    @BeforeClass
    public static void DbClean()
    {
        System.out.println("DB Cleaner");
    }


    @AfterClass
    public static void QuitDriver()
    {
        System.out.println("Quite the Driver");
    }


}

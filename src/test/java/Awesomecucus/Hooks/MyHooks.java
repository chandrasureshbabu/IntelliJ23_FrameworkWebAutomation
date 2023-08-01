package Awesomecucus.Hooks;

import Awesomecucus.Factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;

public class MyHooks {

private WebDriver driver;
   @Before
    public  void before()
    {
      driver= DriverFactory.initializeDriver();
       System.out.println("_______******At my hooks Before Hook*******________");

    }
    /*@BeforeAll
    public void BeforeALL()
    {
        driver= DriverFactory.initializeDriver();
        //driver= DriverFactory.getDriver();
        System.out.println("_______******At my hooks BeforeALL Hook*******________");
    }*/
  @After
    public void After()
    {

        driver.quit();
        System.out.println("_______******At my hooks After Hook*******________");
    }
   /* @AfterAll
    public void AfterAllScenarios()
    {

        driver.quit();
        System.out.println("_______******At my hooks After ALL Hook*******________");
    }*/
}

package Awesomecucus.Hooks;

import io.cucumber.java.*;


public class CucumberHooks {


    @BeforeAll
    public static void  CleanUpBeforeLaunch()
    {
        System.out.println("@Before- ALL Clean up before Launch- hook");
    }

    @AfterAll
    public static void AfterTestsCleanUp()
    {
        System.out.println("@After ALL-Clean up After Execution -hook");
    }
    @Before
    public static void beforeHook(){System.out.println(("@Before hook - runs Before every scenario"));}
    @After
    public static void afterHook(){System.out.println(("@After hook - runs after every scenario"));}

    // Order of hooks execution
    @Before(order =0)
    public static  void BeforeOrderHook(Scenario scenario){

        System.out.println(("@Before hook Order 0 - runs Before every scenario"));}

    @After(order=0)
    public static void AfterOrderHook(Scenario scenario){
        System.out.println(("@After hook Order 0- runs after every scenario"));}

    @Before(order=1)
    public  static  void BeforeOrderHook1(Scenario scenario){
        System.out.println(("@Before hook order 1 - runs Before every scenario"));}

    @After(order=1)
    public static void AfterOrderHook1(Scenario scenario){
        System.out.println(("@After hook order 1 - runs after every scenario"));}

    // after hooks runs after every scenario irrespective of the result
    // after hooks order will be in reverse to the before hooks order
    // if multiple after hooks are there then the all will be executed

    //-- tags in hooks
    @Before("@scenario2")
    public static  void BeforeOrderHook_Tags(Scenario scenario){

        System.out.println(("@Before hook for @scenario2 - runs Before every scenario"));}

    @After("@scenario2")
    public static void AfterOrderHook_Tags(Scenario scenario){
        System.out.println(("@After hook for @scenario2 runs after every scenario"));}

    @Before("@scenario3")
    public  static  void BeforeOrderHook1_Tags(Scenario scenario){
        System.out.println(("@Before hook for @scenario3 - runs Before every scenario"));}

    @After("@scenario3")
    public static void AfterOrderHook1_Tags(Scenario scenario){
        System.out.println(("@After hook for @scenario3 - runs after every scenario"));}
    // tags should be same for scenario in feature file and hooks method then respective hooks will be executed for that scenario

    //Before and After steps hooks - will executed for every step
    // these BeforeStep and AfterStep hooks will executed for failed scenario as well, but next step after failed will be ignored
    // we can pass "Scenario as an arguments to the these hooks"
    //ordering and tagging will be same as before and after hooks
    @BeforeStep
    public  static  void beforeStep_Hook(){System.out.println(("@BeforeStep hook  - runs after every Step"));}

    @AfterStep
    public  static  void AfterStep_Hook(){System.out.println(("@AfterStep hook  - runs after every Step"));}


}

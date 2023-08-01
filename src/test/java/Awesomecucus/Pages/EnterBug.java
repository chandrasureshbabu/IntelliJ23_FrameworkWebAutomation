package Awesomecucus.Pages;

import Awesomecucus.Objects.BugDetails;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import javax.xml.xpath.XPath;
import java.util.List;

public class EnterBug extends BasePage{

    public WebDriver driver;
    public EnterBug(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//select[@id='bug_severity']") private WebElement bug_Severity;
    @FindBy(xpath="//select[@id='rep_platform']") private  WebElement HardWare;

    @FindBy(xpath = "//select[@id='op_sys']") private WebElement OS;

    @FindBy(xpath = "//input[@id='short_desc']") private  WebElement Short_Desc;

    @FindBy(css = "#comment") private WebElement Desc;
    @FindBy(css = "#commit")private  WebElement Submit_bug;

    @FindBy(css = "#title")private  WebElement Title;

    public EnterBug select_Severity(String severity){

        Select select= new Select(bug_Severity);
        List<WebElement> severityOptions= select.getOptions();
        for(WebElement severityOption:severityOptions){
            if(severityOption.getText().equals(severity))
            {
                select.selectByVisibleText(severity);
            }
        }
        return this;
    }


    public EnterBug select_Hardware(String hardware){
        Select select = new Select(wait.until(ExpectedConditions.visibilityOf(HardWare)));
        List<WebElement> hardwareOptions= select.getOptions();
        for(WebElement hardwareOption: hardwareOptions){
            if(hardwareOption.getText().equalsIgnoreCase(hardware)){
                select.selectByVisibleText(hardware);
            }
        }
        return this;
    }

    public EnterBug Select_OS(String Os){
        Select select= new Select(OS);
        List<WebElement> Os_Options=select.getOptions();
        for (WebElement Os_Option:Os_Options){
            if(Os_Option.getText().equalsIgnoreCase(Os)){
                select.selectByVisibleText(Os);
            }
        }
        return this;
    }

    public EnterBug enter_BugDesc(String shortDesc,String bugdesc){
        Short_Desc.sendKeys(shortDesc);
        Desc.sendKeys(bugdesc);
        return this;
    }

    public void submitBug() throws InterruptedException {
        Submit_bug.click();
        System.out.println("***********^^^^^Submitted Bug^^^^^^^********");
        Thread.sleep(5000);
    }

    public String On_EnterBugPage()
    {
        String pageTitle=Title.getText();
        return pageTitle;
    }

    public EnterBug Set_BugDetails(String Severity,String Hardware, String OS,String BugShortDesc,String BugDescription)
    {
        return select_Severity(Severity).
                select_Hardware(Hardware).
                Select_OS(OS).
                enter_BugDesc(BugShortDesc,BugDescription);

    }

    //T6
    public EnterBug Set_IssueDetails(BugDetails bugDetails){
        return select_Severity(bugDetails.getSeverity()).
                select_Hardware(bugDetails.getHardware()).
                Select_OS(bugDetails.getOs()).
                enter_BugDesc(bugDetails.getShortDesc(),bugDetails.getDescription());
    }


}

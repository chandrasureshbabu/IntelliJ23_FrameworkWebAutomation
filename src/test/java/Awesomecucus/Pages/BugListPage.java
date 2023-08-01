package Awesomecucus.Pages;

import Awesomecucus.Objects.Issue;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BugListPage extends BasePage{

    public  WebDriver driver;
    public BugListPage(WebDriver driver) {

        super(driver);
    }

    @FindBy(xpath = "//span[contains(text(),'bug')]") private WebElement BugCount;


    public void SearchedIssue(Issue issue){
        System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^ Entered For Count 2 ^^^^^^^^^^^^^^^^^^^^^^^^^^^");
        String issueCount=(BugCount.getText());
        System.out.println("No of Issue with   :"+issue.getBugName() +"  is :"+issueCount.trim());
        if(BugCount.isDisplayed())
        {
            System.out.println("No of Issue  :"+issueCount.trim());
        }else
        {
            System.out.println("No of Issues listed :");
        }
    }
}

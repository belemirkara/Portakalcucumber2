package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WorkingHoursPage {

    public WorkingHoursPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.ID, using ="registerTab3")
    public WebElement whtab;

    @FindBy(how = How.ID, using ="1_6")
    public WebElement lr;

    @FindBy(how = How.ID, using ="0_6")
    public WebElement lr2;

    @FindBy(how = How.ID, using ="2_6")
    public WebElement lr3;

    @FindBy(how = How.ID, using ="3_6")
    public WebElement lr4;

    @FindBy(how = How.ID, using ="4_6")
    public WebElement lr5;

    @FindBy(how = How.ID, using ="5_6")
    public WebElement lr6;

    @FindBy(how = How.ID, using ="6_6")
    public WebElement lr7;

    @FindBy(how = How.CSS, using ="#\\31 _9")
    public WebElement ud;

    @FindBy(how = How.ID, using ="2_9")
    public WebElement ud1;

    @FindBy(how = How.ID, using = "workHoursSuccessMessage")
    public WebElement whsuccesspopup;




    public void WorkingHours() {

        whtab.click();
    }

    public void WorkingHours1() {

        whsuccesspopup.click();
    }

}

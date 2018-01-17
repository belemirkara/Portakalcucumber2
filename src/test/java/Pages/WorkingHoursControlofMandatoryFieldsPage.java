package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class WorkingHoursControlofMandatoryFieldsPage {


    public WorkingHoursControlofMandatoryFieldsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.ID, using ="workHoursInsufficientMessage")
    public WebElement workinghoursfailpopup;

    public void WorkingHoursControlofMandatoryFields() {

        workinghoursfailpopup.click();
    }

}

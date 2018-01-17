package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class WorkingHoursControlofclearandclearformbuttonsPage {

    public WorkingHoursControlofclearandclearformbuttonsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.ID, using ="deleteWorkHour_1_6")
    public WebElement clearbutton1;

    @FindBy(how = How.ID, using ="deleteWorkHour_2_9")
    public WebElement clearbutton2;


    @FindBy(how = How.ID, using ="1_6")
    public List<WebElement> monday;

    @FindBy(how = How.ID, using ="2_9")
    public List<WebElement> tuesday;

    @FindBy(how = How.XPATH, using ="/html/body/div[1]/div/div[1]/div/small/u")
    public WebElement clearform;

    @FindBy(how = How.ID, using ="workingHoursSelection")
    public List<WebElement> table;

    @FindBy(how = How.ID, using ="workinghoursStatus")
    public List<WebElement> cell;

    public void WorkingHoursControlofclearandclearformbuttons() {

        clearbutton1.click();
    }
    public void WorkingHoursControlofclearandclearformbuttons1() {

        clearbutton2.click();
    }

    public void WorkingHoursControlofclearandclearformbuttons2() {

        clearform.click();
    }
}


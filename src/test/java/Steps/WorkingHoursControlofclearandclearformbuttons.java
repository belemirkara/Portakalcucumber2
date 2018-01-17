package Steps;

import Base.BaseUtil;
import Pages.WorkingHoursControlofclearandclearformbuttonsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.junit.Assume;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.UUID;


public class WorkingHoursControlofclearandclearformbuttons extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();

    public WorkingHoursControlofclearandclearformbuttons(BaseUtil base) {

        this.base = base;
    }


    @Then("^i click Sil button$")
    public void iClickSilButton() throws Throwable {

        WorkingHoursControlofclearandclearformbuttonsPage page=new WorkingHoursControlofclearandclearformbuttonsPage(base.driver);
       page.WorkingHoursControlofclearandclearformbuttons();
        Thread.sleep(3000);

    }

    @And("^i see field is deleted which i clicked clear button$")
    public void iSeeFieldisDeletedWhichiClickedclearButton() throws Throwable {

        WorkingHoursControlofclearandclearformbuttonsPage page=new WorkingHoursControlofclearandclearformbuttonsPage(base.driver);
        List<WebElement> monday =page.monday;

        List<WebElement>tableCells=page.cell;



        for(WebElement row : monday) {
            if(!monday.contains(tableCells)){

            }

            else{
                Assert.fail();
            }
        }
        Thread.sleep(3000);

    }

    @And("^i see fields are deleted which i clicked clear button$")
    public void iSeeFieldsAreDeletedWhichiClickedclearButton() throws Throwable {

        WorkingHoursControlofclearandclearformbuttonsPage page=new WorkingHoursControlofclearandclearformbuttonsPage(base.driver);
        List<WebElement> tuesday = page.tuesday;

        List<WebElement> tableCells=page.cell;



        for(WebElement row : tuesday) {
            if(!tuesday.contains(tableCells)){

            }

            else{
                Assert.fail();
            }
        }
        Thread.sleep(3000);


    }

    @Then("^i click Silforupdwn button$")
    public void iClickSilforupdwnButton() throws Throwable {

        WorkingHoursControlofclearandclearformbuttonsPage page=new WorkingHoursControlofclearandclearformbuttonsPage(base.driver);
        page.WorkingHoursControlofclearandclearformbuttons1();
        Thread.sleep(3000);
    }

    @Then("^i click clear form button$")
    public void iClickclearformButton() throws Throwable {


        WorkingHoursControlofclearandclearformbuttonsPage page=new WorkingHoursControlofclearandclearformbuttonsPage(base.driver);
        page.WorkingHoursControlofclearandclearformbuttons2();
        Thread.sleep(3000);
    }

    @And("^i see all of fields are deleted$")
    public void iSeeAllOfFieldsAreDeleted() throws Throwable {

        WorkingHoursControlofclearandclearformbuttonsPage page=new WorkingHoursControlofclearandclearformbuttonsPage(base.driver);
        List<WebElement> table = page.table;

        List<WebElement> tableCells=page.cell;



        for(WebElement row : table) {
            if(!table.contains(tableCells));

            else{
            Assert.fail();
        }
    }
        }}


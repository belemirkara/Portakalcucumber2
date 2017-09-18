package Steps;

import Base.BaseUtil;
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

public class SilveFormuTemizleButonCalismasaatleri extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();

    public SilveFormuTemizleButonCalismasaatleri(BaseUtil base) {

        this.base = base;
    }


    @Then("^ı click Sil button$")
    public void ıClickSilButton() throws Throwable {
        WebElement silbttn = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"1_6\"]/div/table/tbody/tr[3]/td/a")));
        silbttn.click();
        Thread.sleep(3000);

    }

    @And("^ı see field is deleted which ı clicked sil button$")
    public void ıSeeFieldIsDeletedWhichIClickedSilButton() throws Throwable {
        List<WebElement> pzt = base.driver.findElements(By.id("1_6"));

        List<WebElement> tableCells= base.driver.findElements(By.id("workinghoursStatus"));



        for(WebElement row : pzt) {
            if(!pzt.contains(tableCells)){

            }

            else{
                Assert.fail();
            }
        }
        Thread.sleep(3000);

    }

    @And("^ı see fields are deleted which ı clicked sil button$")
    public void ıSeeFieldsAreDeletedWhichIClickedSilButton() throws Throwable {
        List<WebElement> sali = base.driver.findElements(By.id("2_9"));

        List<WebElement> tableCells= base.driver.findElements(By.id("workinghoursStatus"));



        for(WebElement row : sali) {
            if(!sali.contains(tableCells)){

            }

            else{
                Assert.fail();
            }
        }
        Thread.sleep(3000);


    }

    @Then("^ı click Silforupdwn button$")
    public void ıClickSilforupdwnButton() throws Throwable {
        WebElement silbttn = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"2_9\"]/div/table/tbody/tr[3]/td/a")));
        silbttn.click();
        Thread.sleep(3000);
    }

    @Then("^ı click Formu temizle button$")
    public void ıClickFormuTemizleButton() throws Throwable {

        WebElement formutemizlebttn = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(" /html/body/div[1]/div/div[1]/div/small/u")));
        formutemizlebttn.click();
        Thread.sleep(3000);
    }

    @And("^ı see all of fields are deleted$")
    public void ıSeeAllOfFieldsAreDeleted() throws Throwable {

        List<WebElement> table = base.driver.findElements(By.id("workingHoursSelection"));

        List<WebElement> tableCells= base.driver.findElements(By.id("workinghoursStatus"));



        for(WebElement row : table) {
            if(!table.contains(tableCells));

            else{
            Assert.fail();
        }
    }
        }}


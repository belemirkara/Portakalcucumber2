package Steps;

import Base.BaseUtil;
import Pages.WorkingHoursUpdatePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;


public class WorkingHoursUpdate extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();

    public WorkingHoursUpdate(BaseUtil base) {

        this.base = base;
    }

    @And("^i click an field in the table$")
    public void iClickAnFieldinTheTable() throws Throwable {

        Thread.sleep(6000);
        WorkingHoursUpdatePage page=new WorkingHoursUpdatePage(base.driver);
        page.WorkingHoursUpdate();

    }

    @And("^i see working hours$")
    public void iSeeWorkingHours() throws Throwable {
        Thread.sleep(3000);
        WorkingHoursUpdatePage page=new WorkingHoursUpdatePage(base.driver);

        WebElement wh =page.whcell;
        String ab2 = wh.getText();

        try {

            Assert.assertTrue(ab2.contains("08:00\n"));
            Assert.assertTrue(ab2.contains("08:45"));
        } catch (AssertionError ae) {

            Assert.fail();
        }
    }

    @And("^i click minutes in working hours$")
    public void iClickMinutesinWorkingHours() throws Throwable {
        Thread.sleep(3000);
        WorkingHoursUpdatePage page=new WorkingHoursUpdatePage(base.driver);
        page.WorkingHoursUpdate2();
    }

    @And("^i see and update values and control accuracy$")
    public void iSeeAndUpdateValuesAndControlAccuracy() throws Throwable {

        Thread.sleep(3000);

        WorkingHoursUpdatePage page=new WorkingHoursUpdatePage(base.driver);
        int[] minutes = {00, 15, 30, 45};

        page.m1.click();

        page.selectminute1.click();
        Select ddlminute = new Select(page.selectminute1);


        int rminute = r.nextInt(minutes.length - 1);

        ddlminute.selectByIndex(rminute);


        Thread.sleep(3000);

        page.selectminute2.click();
        Select ddlminute2 = new Select(page.selectminute2);


        int rminute2 = r.nextInt(minutes.length - 1);


        ddlminute2.selectByIndex(rminute2);

        page.close.click();

        Thread.sleep(3000);

        if (rminute2 > rminute) {

        } else {
            Assert.fail();
        }

        Thread.sleep(3000);


    }}


package Steps;

import Base.BaseUtil;
import Pages.WorkingHoursPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class WorkingHours extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();

    public WorkingHours(BaseUtil base) {

        this.base = base;
    }

    @And("^i click working hours tab$")
    public void iclickworkinghourstab() throws Throwable {

        Thread.sleep(6000);
        WorkingHoursPage page=new WorkingHoursPage(base.driver);
        Thread.sleep(3000);
        page.WorkingHours();
        Thread.sleep(3000);
    }

    @When("^i click from left to right$")
    public void iClickFromLeftToRight() throws Throwable {

        Thread.sleep(3000);
        WorkingHoursPage page=new WorkingHoursPage(base.driver);

        WebElement element = page.lr;

        WebElement target = page.lr2;

        (new Actions(base.driver)).dragAndDrop(element, target).perform();

        Thread.sleep(3000);
    }

    @Then("^i confirm the coming hours$")
    public void iConfirmTheComingHours() throws Throwable {

        WorkingHoursPage page=new WorkingHoursPage(base.driver);

        WebElement monday =page.lr;

        WebElement tuesday = page.lr3;

        WebElement wednesday =page.lr4;

        WebElement thursday = page.lr5;

        WebElement friday = page.lr6;

        WebElement saturday =page.lr7;

        WebElement sunday = page.lr2;



        try {

            String ab = monday.getText();
            String ab1 = tuesday.getText();
            String ab2 = wednesday.getText();
            String ab3 = thursday.getText();
            String ab4 = friday.getText();
            String ab5 = saturday.getText();
            String ab6 = sunday.getText();

            Assert.assertTrue(ab.contains("06:00\n"));
            Assert.assertTrue(ab.contains("06:45"));
            Thread.sleep(1000);

            Assert.assertTrue(ab1.contains("06:00\n"));
            Assert.assertTrue(ab1.contains("06:45"));
            Thread.sleep(1000);

            Assert.assertTrue(ab2.contains("06:00\n"));
            Assert.assertTrue(ab2.contains("06:45"));
            Thread.sleep(1000);

            Assert.assertTrue(ab3.contains("06:00\n"));
            Assert.assertTrue(ab3.contains("06:45"));
            Thread.sleep(1000);

            Assert.assertTrue(ab4.contains("06:00\n"));
            Assert.assertTrue(ab4.contains("06:45"));
            Thread.sleep(1000);

            Assert.assertTrue(ab5.contains("06:00\n"));
            Assert.assertTrue(ab5.contains("06:45"));
            Thread.sleep(1000);

            Assert.assertTrue(ab6.contains("06:00\n"));
            Assert.assertTrue(ab6.contains("06:45"));
            Thread.sleep(1000);

        } catch (AssertionError ae) {

            Assert.fail();
        }


    }

    @When("^i click up to down$")
    public void iClickUpToDown() throws Throwable {


        Thread.sleep(3000);
        WorkingHoursPage page=new WorkingHoursPage(base.driver);

        WebElement myElement = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.elementToBeClickable(page.ud));
        myElement.click();
        Actions move = new Actions(base.driver);
        move.moveToElement(myElement).clickAndHold();
        move.moveByOffset(100, 202);
        move.release();
        move.perform();

    }


    @Then("^i confirm the coming hourss$")
    public void iConfirmTheComingHourss() throws Throwable {

        Thread.sleep(3000);
        WorkingHoursPage page=new WorkingHoursPage(base.driver);
        WebElement tuesday =page.ud1;
        String ab2 = tuesday.getText();

        try {

            Assert.assertTrue(ab2.contains("09:00\n"));
            Assert.assertTrue(ab2.contains("17:00"));
        } catch (AssertionError ae) {

            Assert.fail();
        }
    }

    @Then("^i see working hours success pop up$")
    public void iSeeworkinghourssuccessPopUp() throws Throwable {
        try {

            Thread.sleep(3000);
            WorkingHoursPage page=new WorkingHoursPage(base.driver);
            page.WorkingHours1();
        Thread.sleep(1000);

        Alert alt3 = base.driver.switchTo().alert();
        alt3.accept();


    } catch (NoAlertPresentException noe) {


    }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

}

    @And("^i confirm working hours are saved successfully pop up message$")
    public void iConfirmworkinghoursaresavedsuccessfullyPopUpMessage() throws Throwable {

        Thread.sleep(3000);

        try {

            WorkingHoursPage page=new WorkingHoursPage(base.driver);
            WebElement cs = page.whsuccesspopup;

            String ab = cs.getText();

            Assert.assertEquals("Çalışma saatleri başarıyla kayıt edildi.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }
    }


    @And("^i refresh the page$")
    public void iRefreshThePage() throws Throwable {
        base.driver.navigate().refresh();
    }

}







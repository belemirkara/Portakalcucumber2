package Steps;

import Base.BaseUtil;
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

public class SaatupdateCalismaSaatleri extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();

    public SaatupdateCalismaSaatleri(BaseUtil base) {

        this.base = base;
    }

    @And("^i click an field in the table$")
    public void iClickAnFieldinTheTable() throws Throwable {
        WebElement calismasaatleri = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("3_8")));
        calismasaatleri.click();
        Thread.sleep(3000);
    }

    @And("^i see working hours$")
    public void iSeeWorkingHours() throws Throwable {
        WebElement clismasaati = base.driver.findElement(By.id("3_8"));
        String ab2 = clismasaati.getText();

        try {

            Assert.assertTrue(ab2.contains("08:00\n"));
            Assert.assertTrue(ab2.contains("08:45"));
        } catch (AssertionError ae) {

            Assert.fail();
        }
    }

    @And("^i click minutes in working hours$")
    public void iClickMinutesinWorkingHours() throws Throwable {
        WebElement minute1 = base.driver.findElement(By.xpath("//*[@id=\"selectedCell\"]/tbody/tr[1]/td/a/u"));
        WebElement minute2 = base.driver.findElement(By.xpath("//*[@id=\"selectedCell\"]/tbody/tr[2]/td/span/a/u"));
        minute1.click();
        minute2.click();
    }

    @And("^i see and update values and control accuracy$")
    public void iSeeAndUpdateValuesAndControlAccuracy() throws Throwable {

        int[] minutes = {00, 15, 30, 45};

        WebElement Select_minutes1 = (new WebDriverWait(base.driver, 45))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/div/center/div/select")));
            Select_minutes1.click();
        Select ddlminute = new Select(Select_minutes1);


        int gelenminute = r.nextInt(minutes.length - 1);

        ddlminute.selectByIndex(gelenminute);


        WebElement Select_minutes2 = (new WebDriverWait(base.driver, 45))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[5]/div[2]/div/center/div/select")));

        Select_minutes2.click();
        Select ddlminute2 = new Select(Select_minutes2);


        int gelenminute2 = r.nextInt(minutes.length - 1);


        ddlminute2.selectByIndex(gelenminute2);


        if (gelenminute2 > gelenminute) {

        } else {
            Assert.fail();
        }

        Thread.sleep(3000);


    }}




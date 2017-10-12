package Steps;

import Base.BaseUtil;
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
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.rmi.runtime.Log;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class calismasaatleri extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();

    public calismasaatleri(BaseUtil base) {

        this.base = base;
    }

    @And("^i see i am in calisma saatleri page$")
    public void iSeeiAminÇalismaSaatleriPage() throws Throwable {
        WebElement calismasaatleri = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("registerTab3")));
        calismasaatleri.click();
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        Thread.sleep(3000);
    }

    @When("^i click from left to right$")
    public void iClickFromLeftToRight() throws Throwable {

        WebElement element = base.driver.findElement(By.id("1_6"));

        WebElement target = base.driver.findElement(By.id("0_6"));

        (new Actions(base.driver)).dragAndDrop(element, target).perform();
         Thread.sleep(3000);
    }

    @Then("^i confirm the coming hours$")
    public void iConfirmTheComingHours() throws Throwable {
        WebElement pzt = base.driver.findElement(By.id("1_6"));

        WebElement sali = base.driver.findElement(By.id("2_6"));

        WebElement crsmba = base.driver.findElement(By.id("3_6"));

        WebElement pers = base.driver.findElement(By.id("4_6"));

        WebElement cuma = base.driver.findElement(By.id("5_6"));

        WebElement cmrtesi = base.driver.findElement(By.id("6_6"));

        WebElement pazar = base.driver.findElement(By.id("0_6"));



        try {

            String ab = pzt.getText();
            String ab1 = sali.getText();
            String ab2 = crsmba.getText();
            String ab3 = pers.getText();
            String ab4 = cuma.getText();
            String ab5 = cmrtesi.getText();
            String ab6 = pazar.getText();

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

        WebElement myElement = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.elementToBeClickable(By.cssSelector("#\\31 _9")));
        myElement.click();
        Actions move = new Actions(base.driver);
        move.moveToElement(myElement).clickAndHold();
        move.moveByOffset(100, 202);
        move.release();
        move.perform();

    }


    @Then("^i confirm the coming hourss$")
    public void iConfirmTheComingHourss() throws Throwable {

        WebElement sali = base.driver.findElement(By.id("2_9"));
        String ab2 = sali.getText();

        try {

            Assert.assertTrue(ab2.contains("09:00\n"));
            Assert.assertTrue(ab2.contains("17:00"));
        } catch (AssertionError ae) {

            Assert.fail();
        }
    }

    @Then("^i see Çalisma saatleri basariyla kayit edildi pop up$")
    public void iSeeÇalismaSaatleriBasariylaKayitEdildiPopUp() throws Throwable {
        try {

            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }

    @And("^i confirm Çalisma saatleri basariyla kayit edildi pop up message$")
    public void iConfirmÇalismaSaatleriBasariylaKayitEdildiPopUpMessage() throws Throwable {

        Thread.sleep(3000);

        try {
            WebElement cs = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));

            String ab = cs.getText();

            Assert.assertEquals("Çalışma saatleri başarıyla kayıt edildi.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }
    }

    @And("^i get full screen$")
    public void iGetFullScreen() throws Throwable {
        base.driver.manage().window().maximize();
        Thread.sleep(3000);
    }

    @And("^i get browser foreground$")
    public void iGetBrowserForeground() throws Throwable {
            Thread.sleep(3000);
        }


    @And("^i get kullaniciadi and pw from login$")
    public void iGetKullaniciadiAndPwFromLogin() throws Throwable {

        try(BufferedReader br = new BufferedReader(new FileReader(Login.FilePath))) {

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            String everything = sb.toString();

            String[] abc = everything.split("-");

            Login.fileUserName = abc[0];
            Login.filePassword = abc[1];

        }

        WebElement username = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
        username.click();
        username.sendKeys(Login.fileUserName);

        WebElement password = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
        password.click();
        password.sendKeys(Login.filePassword);



        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        Thread.sleep(3000);
    }
}







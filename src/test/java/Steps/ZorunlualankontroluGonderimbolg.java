package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class ZorunlualankontroluGonderimbolg extends BaseUtil {

    public BaseUtil base;
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    Random r = new Random();

    public ZorunlualankontroluGonderimbolg(BaseUtil base) {


        this.base = base;
    }



    @And("^i see Restoranın ana semti için bir tutar girmek zorundasiniz pop up$")
    public void iSeeRestoranınAnaSemtiIçinBirTutarGirmekZorundasinizPopUp() throws Throwable {
        try {

            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {

            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
        }

    }

    @And("^i confirm Restoranın ana semti için bir tutar girmek zorundasiniz pop up message$")
    public void iConfirmRestoranınAnaSemtiIçinBirTutarGirmekZorundasinizPopUpMessage() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        try {
            WebElement anasemtpopup = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));

            String ab = anasemtpopup.getText();

            Assert.assertEquals("Restoranın ana semti için bir tutar girmek zorundasınız.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }

    }
    }


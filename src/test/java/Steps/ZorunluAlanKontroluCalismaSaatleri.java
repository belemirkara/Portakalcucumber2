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

public class ZorunluAlanKontroluCalismaSaatleri  extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();

    public ZorunluAlanKontroluCalismaSaatleri(BaseUtil base) {

        this.base = base;
    }




    @And("^ı see Tabloyu kayıt edebilmeniz için en az bir adet çalışma saati oluşturmanız gerekmektedir pop up$")
    public void ıSeeTabloyuKayıtEdebilmenizIçinEnAzBirAdetÇalışmaSaatiOluşturmanızGerekmektedirPopUp() throws Throwable {
        try {

            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]"));
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }


    @And("^ı confirm Tabloyu kayıt edebilmeniz için en az bir adet çalışma saati oluşturmanız gerekmektedir pop up message$")
    public void ıConfirmTabloyuKayıtEdebilmenizIçinEnAzBirAdetÇalışmaSaatiOluşturmanızGerekmektedirPopUpMessage() throws Throwable {
        Thread.sleep(3000);

        try {
            WebElement cs = (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[2]/div[6]")));

            String ab = cs.getText();

            Assert.assertEquals("Tabloyu kayıt edebilmeniz için en az bir adet çalışma saati oluşturmanız gerekmektedir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }
    }
    }


package Steps;

import Base.BaseUtil;
import Pages.WorkingHoursControlofMandatoryFieldsPage;
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

public class WorkingHoursControlofMandatoryFields extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();

    public WorkingHoursControlofMandatoryFields(BaseUtil base) {

        this.base = base;
    }




    @And("^i see working hours fail pop up$")
    public void iSeeworkinghoursfailPopUp() throws Throwable {
        try {

            WorkingHoursControlofMandatoryFieldsPage page=new WorkingHoursControlofMandatoryFieldsPage(base.driver);
            page.WorkingHoursControlofMandatoryFields();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();


        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }


    @And("^i confirm you need to add at least a working hour for saving table pop up message$")
    public void iConfirmyouneedtoaddatleastaworkinghourforsavingtablePopUpMessage() throws Throwable {
        Thread.sleep(3000);

        try {

            WorkingHoursControlofMandatoryFieldsPage page=new WorkingHoursControlofMandatoryFieldsPage(base.driver);
            WebElement cs =page.workinghoursfailpopup;
            String ab = cs.getText();

            Assert.assertEquals("Tabloyu kayıt edebilmeniz için en az bir adet çalışma saati oluşturmanız gerekmektedir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }
    }
    }


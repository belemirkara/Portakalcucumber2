package Steps;

import Base.BaseUtil;
import Pages.AttachmentsPage;
import Pages.ContactInformationPage;
import Pages.ServingPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Attachments extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    public String uploadfile = "//Users//belemir.karabacakoglu//Desktop//download.jpeg";
    public String uploadfile1 = "//Users//belemir.karabacakoglu//Desktop//openbutton1.jpeg";
    public String uploadfile2 = "//Users//belemir.karabacakoglu//Desktop//browser.jpeg";

    public Attachments(BaseUtil base) {

        this.base = base;
    }


    @And("^i click the attachments in progress bar$")
    public void iClickTheattachmentsinProgressBar() throws Throwable {

        Thread.sleep(10000);
        AttachmentsPage page = new AttachmentsPage(base.driver);
        page.Attachments();

    }

    @And("^i upload a file for brochure field$")
    public void iUploadAFileForbrochureField() throws Throwable {

        Thread.sleep(3000);
        AttachmentsPage page = new AttachmentsPage(base.driver);
        page.Attachments2();
    }

    @And("^i upload a file for signboard field$")
    public void iUploadAFileForsignboardField() throws Throwable {
        Thread.sleep(3000);
        AttachmentsPage page = new AttachmentsPage(base.driver);
        page.Attachments7();

    }


    @And("^i check the acceptance criterion$")
    public void iCheckTheacceptancecriterion() throws Throwable {


        AttachmentsPage page = new AttachmentsPage(base.driver);
        page.Attachments4();
    }

    @When("^i click complete info button$")
    public void iClickcompleteinfoButton() throws Throwable {

        AttachmentsPage page = new AttachmentsPage(base.driver);
        page.Attachments5();
    }

    @And("^i see attachmentssuccess pop up$")
    public void iSeeattachmentssuccessPopUp() throws Throwable {
        try {
            try {

                Thread.sleep(3000);
                AttachmentsPage page = new AttachmentsPage(base.driver);
                page.Attachments6();
                Thread.sleep(1000);

                Alert alt3 = base.driver.switchTo().alert();
                alt3.accept();

            } catch (NoAlertPresentException noe) {


            }
        } catch (AssertionError ae) {

            Assert.fail();
        }
    }


    @And("^i confirm attachmentssuccess pop up message$")
    public void iConfirmattachmentssuccessPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try {

            Thread.sleep(3000);
            AttachmentsPage page = new AttachmentsPage(base.driver);
            String ab = page.attachmentssuccesspopup.getText();

            Assert.assertEquals("İşlem Başarılı", ab);
            Thread.sleep(3000);

        } catch (AssertionError ae) {

            Assert.fail();
        }


    }


    @And("^i upload a file for identity$")
    public void iUploadAFileForIdentity() throws Throwable {
        Thread.sleep(3000);
        AttachmentsPage page = new AttachmentsPage(base.driver);
        page.Attachments8();
    }

    @And("^i see kitchen information pop up return serving3$")
    public void iSeeKitchenInformationPopUpReturnServing3() throws Throwable {
        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("kitchenInfo")).size() > 0;


        if (isPresent == false) {


        }
        if (isPresent == true) {

            Thread.sleep(6000);

            ContactInformationPage page2 = new ContactInformationPage(base.driver);
            page2.Contact13();

            Thread.sleep(6000);

            ServingPage page1 = new ServingPage(base.driver);
            page1.Serving1();

            Thread.sleep(6000);

            Select ddlkitchen = new Select(page1.kitchenselection);


            ddlkitchen.selectByVisibleText("Börek");

            Thread.sleep(6000);

            ContactInformationPage page3 = new ContactInformationPage(base.driver);
            page3.Contact10();

            Thread.sleep(6000);
            page3.Contact13();


            Thread.sleep(10000);
            AttachmentsPage page = new AttachmentsPage(base.driver);
            page.Attachments();
        }
    }
}

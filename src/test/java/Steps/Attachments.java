package Steps;

import Base.BaseUtil;
import Pages.AttachmentsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Attachments extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    public String uploadfile="Kullanicilar//Masaustu//bele.jpg";

    public Attachments(BaseUtil base) {

        this.base = base;
    }
   
   
    @And("^i click the attachments in progress bar$")
    public void iClickTheattachmentsinProgressBar() throws Throwable {

        Thread.sleep(3000);
        AttachmentsPage page=new AttachmentsPage(base.driver);
        page.Attachments();

    }

    @And("^i upload a file for brochure field$")
    public void iUploadAFileForbrochureField() throws Throwable {

        Thread.sleep(500);
        AttachmentsPage page = new AttachmentsPage(base.driver);
        page.Attachments2();

     Pattern pattern=new Pattern(uploadfile);
        Pattern openButton = new Pattern("Kullanicilar//Masaustu//openbutton.png");
        Screen screen = new Screen();
        screen.type(pattern,"Kullanicilar//Masaustu//openbutton.png");
            screen.click(openButton);



    }


    @And("^i upload a file for signboard field$")
    public void iUploadAFileForsignboardField() throws Throwable {
        Thread.sleep(3000);
        AttachmentsPage page=new AttachmentsPage(base.driver);
        page.Attachments7();

        Screen screen = new Screen();
        screen.type(uploadfile);
        screen.wait("joker.jpeg");
        screen.doubleClick("joker.jpeg");


    }

    @And("^i check the acceptance criterion$")
    public void iCheckTheacceptancecriterion() throws Throwable {


        AttachmentsPage page=new AttachmentsPage(base.driver);
        page.Attachments4();
    }

    @When("^i click complete info button$")
    public void iClickcompleteinfoButton() throws Throwable {

        AttachmentsPage page=new AttachmentsPage(base.driver);
        page.Attachments5();
    }

    @And("^i see attachmentssuccess pop up$")
    public void iSeeattachmentssuccessPopUp() throws Throwable {
        try{
        try {

            Thread.sleep(3000);
            AttachmentsPage page=new AttachmentsPage(base.driver);
            page.Attachments6();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {


        }
        } catch(AssertionError ae) {

            Assert.fail();
        }
    }



    @And("^i confirm attachmentssuccess pop up message$")
    public void iConfirmattachmentssuccessPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try{

          Thread.sleep(3000);
            AttachmentsPage page=new AttachmentsPage(base.driver);
            String ab = page.attachmentssuccesspopup.getText();

            Assert.assertEquals("İşlem Başarılı", ab);
            Thread.sleep(3000);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }


    @And("^i upload a file for identity$")
    public void iUploadAFileForIdentity() throws Throwable {
        Thread.sleep(3000);
        AttachmentsPage page=new AttachmentsPage(base.driver);
        page.Attachments8();

        Screen screen = new Screen();
        screen.type(uploadfile);
        screen.wait(0.3000);
        screen.doubleClick("joker.jpeg");

    }
    }


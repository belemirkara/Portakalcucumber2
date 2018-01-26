package Steps;

import Base.BaseUtil;
import Pages.AttachmentsPage;
import Pages.ContactInformationPage;
import Pages.ServingPage;
import com.sun.tools.javac.util.Log;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;


import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.net.URISyntaxException;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Attachments extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    public String uploadfile1 = "//Users//belemir.karabacakoglu//Desktop//bele4.jpeg";
    public String uploadfile2 = "//Users//belemir.karabacakoglu//Desktop//bele4.jpeg";


    public Attachments(BaseUtil base) {

        this.base = base;



    }


    @And("^i click the attachments in progress bar$")
    public void iClickTheattachmentsinProgressBar() throws Throwable {

        Thread.sleep(3000);
        AttachmentsPage page = new AttachmentsPage(base.driver);
        page.Attachments();

    }


    @And("^i upload a file for brochure field$")
    public void iUploadAFileForbrochureField() throws Throwable {

        Thread.sleep(3000);
        AttachmentsPage page = new AttachmentsPage(base.driver);
        page.Attachments2();


        File file = new File(uploadfile2);

        StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot = new Robot();

// Cmd + Tab is needed since it launches a Java app and the browser looses focus

       robot.keyPress(KeyEvent.VK_META);

        robot.keyPress(KeyEvent.VK_TAB);

        robot.keyRelease(KeyEvent.VK_META);

        robot.keyRelease(KeyEvent.VK_TAB);

        robot.delay(500);

//Open Goto window

        robot.keyPress(KeyEvent.VK_META);

        robot.keyPress(KeyEvent.VK_SHIFT);

        robot.keyPress(KeyEvent.VK_G);

        robot.keyRelease(KeyEvent.VK_META);

        robot.keyRelease(KeyEvent.VK_SHIFT);

        robot.keyRelease(KeyEvent.VK_G);

//Paste the clipboard value

        robot.keyPress(KeyEvent.VK_META);

        robot.keyPress(KeyEvent.VK_V);

        robot.keyRelease(KeyEvent.VK_META);

        robot.keyRelease(KeyEvent.VK_V);

//Press Enter key to close the Goto window and Upload window

        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_ENTER);

        robot.delay(500);

        robot.keyPress(KeyEvent.VK_ENTER);

        robot.keyRelease(KeyEvent.VK_ENTER);


Thread.sleep(4000);
        ContactInformationPage page1=new ContactInformationPage(base.driver);
     page1.Contact13();
    }


    @And("^i upload a file for signboard field$")
    public void iUploadAFileForsignboardField() throws Throwable {

        Thread.sleep(3000);
        AttachmentsPage page = new AttachmentsPage(base.driver);
        page.Attachments8();


        File file = new File(uploadfile2);

        StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot1 = new Robot();



        robot1.keyPress(KeyEvent.VK_META);

        robot1.keyPress(KeyEvent.VK_SHIFT);

        robot1.keyPress(KeyEvent.VK_G);

        robot1.keyRelease(KeyEvent.VK_META);

        robot1.keyRelease(KeyEvent.VK_SHIFT);

        robot1.keyRelease(KeyEvent.VK_G);

//Paste the clipboard value/Users
        robot1.delay(500);
        robot1.keyPress(KeyEvent.VK_META);

        robot1.keyPress(KeyEvent.VK_V);

        robot1.keyRelease(KeyEvent.VK_META);

        robot1.keyRelease(KeyEvent.VK_V);

//Press Enter key to close the Goto window and Upload window

        robot1.keyPress(KeyEvent.VK_ENTER);

        robot1.keyRelease(KeyEvent.VK_ENTER);

        robot1.delay(500);

        robot1.keyPress(KeyEvent.VK_ENTER);

        robot1.keyRelease(KeyEvent.VK_ENTER);

        Thread.sleep(3000);
        ContactInformationPage page1=new ContactInformationPage(base.driver);
        page1.Contact13();

    }



    @And("^i check the acceptance criterion$")
    public void iCheckTheacceptancecriterion() throws Throwable {

        Thread.sleep(30000);

        AttachmentsPage page = new AttachmentsPage(base.driver);

        page.Attachments4();
    }


    @When("^i click complete info button$")
    public void iClickcompleteinfoButton() throws Throwable {

        Thread.sleep(3000);
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
package Steps;

import Base.BaseUtil;
import Pages.AttachmentControlofMandatoryFieldsPage;
import Pages.AttachmentsPage;
import Pages.ContactInformationPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AttachmentsControlofMandatoryFields extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    public String uploadfile1 = "//Users//belemir.karabacakoglu//Desktop//bele4.jpeg";

    public AttachmentsControlofMandatoryFields(BaseUtil base) {

        this.base = base;

    }



    @And("^i upload a file for signature field$")
    public void iUploadAFileForSignatureField() throws Throwable {


        Thread.sleep(3000);
        AttachmentControlofMandatoryFieldsPage page = new AttachmentControlofMandatoryFieldsPage(base.driver);
        page.AttachmentControlofMandatoryFields1();

Thread.sleep(3000);

                File file = new File(uploadfile1);

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


                //Check for data here. Return true if the data is what you want it to b

    }



    @And("^i upload a file for logo field$")
    public void iUploadAFileForLogoField() throws Throwable {

        Thread.sleep(3000);
        AttachmentControlofMandatoryFieldsPage page = new AttachmentControlofMandatoryFieldsPage(base.driver);
        page.AttachmentControlofMandatoryFields2();


        Thread.sleep(4000);
        Robot robot = new Robot();


        File file = new File(uploadfile1);

        StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);


// Cmd + Tab is needed since it launches a Java app and the browser looses focus

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


        //Check for data here. Return true if the data is what you want it to be

    }

    @And("^i upload a file for brand field$")
    public void iUploadAFileForBrandField() throws Throwable {

        Thread.sleep(3000);
        AttachmentControlofMandatoryFieldsPage page = new AttachmentControlofMandatoryFieldsPage(base.driver);
        page.AttachmentControlofMandatoryFields3();


                File file = new File(uploadfile1);

                StringSelection stringSelection = new StringSelection(file.getAbsolutePath());
                Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);

        Robot robot = new Robot();


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

        Thread.sleep(3000);
        ContactInformationPage page1=new ContactInformationPage(base.driver);
        page1.Contact13();
    }



    @And("^i see attachmentsfail pop up$")
    public void iSeeAttachmentsfailPopUp() throws Throwable {
        try {
            try {

                Thread.sleep(3000);
                AttachmentControlofMandatoryFieldsPage page = new AttachmentControlofMandatoryFieldsPage(base.driver);
                page.AttachmentControlofMandatoryFields4();

                Thread.sleep(1000);

                Alert alt3 = base.driver.switchTo().alert();
                alt3.accept();

            } catch (NoAlertPresentException noe) {


            }
        } catch (AssertionError ae) {

            Assert.fail();
        }
    }


    @And("^i confirm there are missing value pop up message$")
    public void iConfirmThereAreMissingValuePopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try {

            Thread.sleep(3000);
            AttachmentControlofMandatoryFieldsPage page = new AttachmentControlofMandatoryFieldsPage(base.driver);
            String ab = page.attachmentfailpopup.getText();

            Assert.assertEquals(
                    "Broşür, Marka Tescil Belgesi, Tabela girişi / girişleri eksiktir, tamamlamadan bilgilerinizi gönderemezsiniz.", ab);
            Thread.sleep(3000);

        } catch (AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^i delete all uploads$")
    public void iDeleteAllUploads() throws Throwable {

        Thread.sleep(3000);
        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("deleteAttachment_0_0")).size() > 0;
        AttachmentControlofMandatoryFieldsPage page = new AttachmentControlofMandatoryFieldsPage(base.driver);

        if (isPresent == true) {
            page.AttachmentControlofMandatoryFields5();
            Thread.sleep(1000);
            ContactInformationPage page1=new ContactInformationPage(base.driver);
            page1.Contact13();
        }

        Thread.sleep(3000);
        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    Boolean isPresent1 = base.driver.findElements(By.id("deleteAttachment_1_0")).size() > 0;
        if (isPresent1 == true) {
            page.AttachmentControlofMandatoryFields6();
            Thread.sleep(1000);
            ContactInformationPage page1=new ContactInformationPage(base.driver);
            page1.Contact13();
        }

        Thread.sleep(3000);
        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent2 = base.driver.findElements(By.id("deleteAttachment_2_0")).size() > 0;
        if (isPresent2 == true) {
            page.AttachmentControlofMandatoryFields7();
            Thread.sleep(1000);
            ContactInformationPage page1=new ContactInformationPage(base.driver);
            page1.Contact13();
        }
        Thread.sleep(3000);
        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent3 = base.driver.findElements(By.id("deleteAttachment_3_0")).size() > 0;
        if (isPresent3 == true) {
            page.AttachmentControlofMandatoryFields8();
            Thread.sleep(1000);
            ContactInformationPage page1=new ContactInformationPage(base.driver);
            page1.Contact13();
        }

        Thread.sleep(6000);
        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent4 = base.driver.findElements(By.id("deleteAttachment_4_0")).size() > 0;
        if (isPresent4 == true) {
            page.AttachmentControlofMandatoryFields9();
            Thread.sleep(1000);
            ContactInformationPage page1=new ContactInformationPage(base.driver);
            page1.Contact13();
        }

        Thread.sleep(6000);
        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent5 = base.driver.findElements(By.id("deleteAttachment_5_0")).size() > 0;
        if (isPresent5 == true) {
            page.AttachmentControlofMandatoryFields10();
            Thread.sleep(1000);
            ContactInformationPage page1=new ContactInformationPage(base.driver);
            page1.Contact13();



    }

}

    @And("^i confirm there are missing values pop up message$")
    public void iConfirmThereAreMissingValuesPopUpMessage() throws Throwable {


        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try {

            Thread.sleep(3000);
            AttachmentControlofMandatoryFieldsPage page = new AttachmentControlofMandatoryFieldsPage(base.driver);
            String ab = page.attachmentfailpopup.getText();

            Assert.assertEquals("Tabela girişi / girişleri eksiktir, tamamlamadan bilgilerinizi gönderemezsiniz.", ab);
            Thread.sleep(3000);

        } catch (AssertionError ae) {

            Assert.fail();
        }


    }



}


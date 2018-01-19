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

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Attachments extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    public String uploadfile="//Users//belemir.karabacakoglu//Desktop//download.jpeg";

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

        Thread.sleep(3000);
        AttachmentsPage page=new AttachmentsPage(base.driver);
        page.Attachments2(uploadfile);
    }

    @And("^i upload a file for signboard field$")
    public void iUploadAFileForsignboardField() throws Throwable {

        WebElement tabela = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[10]/div/div[2]/button")));
        tabela.click();

        tabela.sendKeys(uploadfile);
    }

    @And("^i check the acceptance criterion$")
    public void iCheckTheacceptancecriterion() throws Throwable {

        WebElement kabulkriteri = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("cb1")));
        kabulkriteri.click();

    }

    @When("^i click complete info button$")
    public void iClickcompleteinfoButton() throws Throwable {

        WebElement bilgilerimitamamlabuton = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("btnSaveAndContinue")));
        bilgilerimitamamlabuton.click();

    }

    @And("^i see attachmentssuccess pop up$")
    public void iSeeattachmentssuccessPopUp() throws Throwable {

        try {


            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]")).click();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {

  Assert.fail();
        }base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }



    @And("^i confirm attachmentssuccess pop up message$")
    public void iConfirmattachmentssuccessPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try{
            WebElement islembasarilipopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("1")));

            String ab = islembasarilipopup.getText();

            Assert.assertEquals("İşlem Başarılı", ab);
            Thread.sleep(3000);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }


    @When("^i finished all pages,i see (\\d+) steps page$")
    public void iFinishedAllPagesiSeeStepsPage(int arg0) throws Throwable {

    }
}

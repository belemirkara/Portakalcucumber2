package Steps;

import Base.BaseUtil;
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

public class BelgelerEkler extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();

    public BelgelerEkler(BaseUtil base) {

        this.base = base;
    }
   
   
    @And("^i click the Belgeler Ekler in progress bar$")
    public void iClickTheBelgelerEklerinProgressBar() throws Throwable {

        WebElement belgelerekler = (new WebDriverWait(base.driver, 60))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("registerTab5")));

        belgelerekler.click();
    }

    @And("^i upload a file for brosur field$")
    public void iUploadAFileForBrosurField() throws Throwable {

        WebElement brosur = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[5]/div/div[2]/button")));
        brosur.click();

        brosur.sendKeys("//Users//belemir.karabacakoglu//Desktop//download.jpeg");
    }

    @And("^i upload a file for tabela field$")
    public void iUploadAFileForTabelaField() throws Throwable {

        WebElement tabela = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div[1]/div[10]/div/div[2]/button")));
        tabela.click();

        tabela.sendKeys("//Users//belemir.karabacakoglu//Desktop//download.jpeg");
    }

    @And("^i check the kabul kriteri$")
    public void iCheckTheKabulKriteri() throws Throwable {

        WebElement kabulkriteri = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("cb1")));
        kabulkriteri.click();

    }

    @When("^i click bilgi girislerimi tamamla button$")
    public void iClickBilgiGirislerimiTamamlaButton() throws Throwable {

        WebElement bilgilerimitamamlabuton = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("btnSaveAndContinue")));
        bilgilerimitamamlabuton.click();

    }

    @And("^i see islem Basarili pop up$")
    public void iSeeislemBasariliPopUp() throws Throwable {

        try {


            base.driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[6]")).click();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {


        }base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }



    @And("^i confirm islem Basarili pop up message$")
    public void iConfirmislemBasariliPopUpMessage() throws Throwable {

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

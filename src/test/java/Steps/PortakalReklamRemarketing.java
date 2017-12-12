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
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class PortakalReklamRemarketing extends BaseUtil

{


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();


    public PortakalReklamRemarketing(BaseUtil base) {

        this.base = base;
    }


    @When("^i get Remarketing$")
    public void iGetRemarketing() throws Throwable {


        String urlpage = base.driver.getCurrentUrl();

        StringBuilder sb = new StringBuilder(urlpage);
        sb.append("/selfservice/remarketing");

        String newurl = sb.toString();

        base.driver.get(newurl);


    }


    @Then("^i see contents of remarketing nedir in first tab$")
    public void iSeeContentsOfRemarketingNedirInFirstTab() throws Throwable {

        WebElement ContentsOfRemarketingNedir = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("tab_Description")));
        ContentsOfRemarketingNedir.click();

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        if (ContentsOfRemarketingNedir.isDisplayed()) {

        } else {
            Assert.fail();
        }

    }

    @When("^i click remarketing reklami tanimla button in first tab remarketing nedir$")
    public void iClickRemarketingReklamiTanimlaButtonInFirstTabRemarketingNedir() throws Throwable {

        WebElement RemarketingReklamiTanimlaButton = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("tab_Description")));
        RemarketingReklamiTanimlaButton.click();

        Thread.sleep(3000);

    }

    @Then("^i see contents of remarketing olustur$")
    public void iSeeContentsOfRemarketingOlustur() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.className("alert-warning")).size() > 0;

        if (isPresent == true) {
        } else {
   Thread.sleep(3000);
            WebElement ContentsOfRemarketingOlustur = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.className("tab-content")));


            base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            if (ContentsOfRemarketingOlustur.isDisplayed()) {

            } else {
                Assert.fail();
            }

        }
    }

    @When("^i click second tab remarketing olustur$")
    public void iClickSecondTabRemarketingOlustur() throws Throwable {

        WebElement RemarketingOlustur = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("menuCreate")));
        RemarketingOlustur.click();

        Thread.sleep(3000);

    }

    @And("^i click Reklamda Yer Alacak Bir Gorsel Secin radio button$")
    public void iClickReklamdaYerAlacakBirGorselSecinRadioButton() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.className("alert-warning")).size() > 0;

        if (isPresent == true) {
        } else {
            WebElement ReklamdaYerAlacakBirGorselSecinRadioButton = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("radio_1_2")));
            ReklamdaYerAlacakBirGorselSecinRadioButton.click();

        }
    }

    @And("^i click image in the right of page$")
    public void iClickImageInTheRightOfPage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.className("alert-warning")).size() > 0;

        if (isPresent == true) {
        } else {
            WebElement ImageInTheRightOfPage = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("image-holder")));
            ImageInTheRightOfPage.click();

            base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

            if (ImageInTheRightOfPage.isDisplayed()) {

            } else {
                Assert.fail();
            }

        }
    }

    @And("^i click Reklaminiz icin Slogan Belirleyin field and enter text$")
    public void iClickReklaminizIcinSloganBelirleyinFieldAndEnterText() throws Throwable {

      /*  base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.className("alert-warning")).size() > 0;

        if (isPresent == true) {
        } else {
            WebElement ReklaminizIcinSloganBelirleyinField = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.className("form-control ng-pristine")));
            ReklaminizIcinSloganBelirleyinField.click();
            ReklaminizIcinSloganBelirleyinField.sendKeys(randomUUIDString);

        }
    }
*/}

    @And("^i click Reklaminizi Kac Kisiye Gosterme istediginizi belirleyin table and choose one of the checkbox AND i see Faturaniza Eklenecek Toplam Tutar is same as checkbox$")
    public void iClickReklaminiziKacKisiyeGostermeIstediginiziBelirleyinTableAndChooseOneOfTheCheckboxANDISeeFaturanizaEklenecekToplamTutarIsSameAsCheckbox() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.className("alert-warning")).size() > 0;

        if (isPresent == true) {
        } else {

            WebElement ReklaminiziKacKisiyeGostermeIstediginiziBelirleyinTable = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.className("table-advance")));

            ReklaminiziKacKisiyeGostermeIstediginiziBelirleyinTable.click();

            base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

            if (ReklaminiziKacKisiyeGostermeIstediginiziBelirleyinTable.isDisplayed()) {

                WebElement ReklaminiziKacKisiyeGostermeIstediginiziBelirleyinbutton = (new WebDriverWait(base.driver, 90))
                        .until(ExpectedConditions.presenceOfElementLocated(By.tagName("product_check")));

                ReklaminiziKacKisiyeGostermeIstediginiziBelirleyinbutton.click();
                String a =ReklaminiziKacKisiyeGostermeIstediginiziBelirleyinbutton.getAttribute("value");

                WebElement faturatext = (new WebDriverWait(base.driver, 90))
                        .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_Create\"]/ng-include/div[1]/div[6]/span/b")));

                String b = faturatext.getText();

                if (b.contains(a)) {


                } else {
                    Assert.fail();
                }
            } else {
                Assert.fail();
            }


        }
    }

    @And("^i choose date after today from Reklaminizin Yayinlanmasini istediginiz Bir Tarih Araligi Belirleyin$")
    public void iChooseDateAfterTodayFromReklaminizinYayinlanmasiniIstediginizBirTarihAraligiBelirleyin() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.className("alert-warning")).size() > 0;

        if (isPresent == true) {
        } else {

            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

            Date date = new Date();
            String dateFormatted = dateFormat.format(date);

            LocalDate First = LocalDate.parse(dateFormatted);

            LocalDate Second = First.plusDays(1);

            WebElement dateWidget = base.driver.findElement(By.className("daterangepicker"));
            List<WebElement> columns = dateWidget.findElements(By.tagName("td"));

            for (WebElement cell : columns) {

                if (cell.getText().equals(Second)) {
                    cell.click();
                    break;
                }

            }
        }
    }


    @And("^i click reklami onayla button$")
    public void iClickReklamiOnaylaButton() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.className("alert-warning")).size() > 0;

        if (isPresent == true) {
        } else {
            WebElement ReklamiOnaylaButton = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_Create_server_side\"]/div[1]/div[6]/div/a[1]")));
            ReklamiOnaylaButton.click();
        }
    }

    @And("^i see adn confirm Onayliyor musunuz alert$")
    public void iSeeAdnConfirmOnayliyorMusunuzAlert() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.className("alert-warning")).size() > 0;

        if (isPresent == true) {
        } else {

            try {


                base.driver.findElement(By.className("table-condensed")).click();
                Thread.sleep(1000);

                Alert alt3 = base.driver.switchTo().alert();
                alt3.accept();

            } catch (NoAlertPresentException noe) {


            }
            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        }
    }

    @And("^i click vazgec button in the onayliyor musunuz alert$")
    public void iClickVazgecButtonInTheOnayliyorMusunuzAlert() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.className("alert-warning")).size() > 0;

        if (isPresent == true) {
        } else {
            WebElement VazgecButton = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.className("red-mint")));
            VazgecButton.click();
        }
    }

    @And("^i click onayla button in the onayliyor musunuz alert$")
    public void iClickOnaylaButtonInTheOnayliyorMusunuzAlert() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.className("alert-warning")).size() > 0;

        if (isPresent == true) {
        } else {

            WebElement OnaylaButton = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.className("green-jungle")));
            OnaylaButton.click();
        }
    }

    @And("^i see Talebinizi aldık En gec (\\d+) is gunu icerisinde yayina alinacaktir pop up$")
    public void iSeeTalebiniziAldıkEnGecIsGunuIcerisindeYayinaAlinacaktirPopUp(int arg0) throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.className("alert-warning")).size() > 0;

        if (isPresent == true) {
        } else {
            try {


                base.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[6]")).click();
                Thread.sleep(1000);

                Alert alt3 = base.driver.switchTo().alert();
                alt3.accept();

            } catch (NoAlertPresentException noe) {


            }
            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        }
    }

    @And("^i confirm Talebinizi aldık  En geç (\\d+) is gunu icerisinde yayina alinacaktir pop up message$")
    public void iConfirmTalebiniziAldıkEnGeçIsGunuIcerisindeYayinaAlinacaktirPopUpMessage(int arg0) throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.className("alert-warning")).size() > 0;

        if (isPresent == true) {
        } else {
            base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


            try {
                WebElement remarketingpopup = (new WebDriverWait(base.driver, 15))
                        .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/div[2]/div[6]")));

                String ab = remarketingpopup.getText();

                Assert.assertEquals("Talebinizi aldık. En geç 3 iş günü içerisinde yayına alınacaktır.", ab);
                Thread.sleep(3000);

            } catch (AssertionError ae) {

                Assert.fail();
            }
        }
    }

    @Then("^i click tamam button in remarketing$")
    public void iClickTamamButtonInRemarketing() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.className("alert-warning")).size() > 0;

        if (isPresent == true) {
        }
        else {


        WebElement tamambutton = (new WebDriverWait(base.driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/div[2]/button[1]")));
        tamambutton.click();
    }
}}

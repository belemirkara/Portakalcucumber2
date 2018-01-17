package Steps;

import Base.BaseUtil;
import Pages.ContactInformationPage;
import Pages.ServingControlofMandatoryofQuestionsPage;
import Pages.ServingPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class ServingControlofMandatoryquestions extends BaseUtil {


    public BaseUtil base;
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();
    Random r = new Random();

    public ServingControlofMandatoryquestions(BaseUtil base) {


        this.base = base;
    }


    @And("^i choose kitchen such as kebap§Turk Mutfagi and dont answer the mandatory questions txts$")
    public void iChooseKitchenSuchAsKebapTurkMutfagiAndDontAnswerTheMandatoryQuestionsTxts() throws Throwable {

        Thread.sleep(1000);

        ServingPage page = new ServingPage(base.driver);

        WebElement Selection_kitchen = page.kitchenselection;


        Select ddlkitchen = new Select(Selection_kitchen);


        ddlkitchen.selectByVisibleText("Kebap & Türk Mutfağı");

        Thread.sleep(3000);

    }


    @Then("^i see the serving fail pop up$")
    public void iSeeTheServingFailPopUp() throws Throwable {


        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

        try {

            Thread.sleep(1000);

            ServingControlofMandatoryofQuestionsPage page = new ServingControlofMandatoryofQuestionsPage(base.driver);
            page.ServingControlofMandatoryofQuestions();

            Alert alt2 = base.driver.switchTo().alert();
            alt2.accept();

        } catch (NoAlertPresentException noe) {

        }


    }

    @Then("^i confirm please fill the mandatory fields pop up message$")
    public void iConfirmPleaseFillTheMandatoryFieldsPopUpMessage() throws Throwable {


        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try {
            ServingControlofMandatoryofQuestionsPage page = new ServingControlofMandatoryofQuestionsPage(base.driver);
            WebElement failpopup = page.servingfailpopup;

            String ab = failpopup.getText();

            Assert.assertEquals("Mutfak seçiminizle ilgili zorunlu soruları cevaplandırmadınız, lütfen zorunlu alanları doldurunuz.", ab);
            Thread.sleep(3000);

        } catch (AssertionError ae) {

            Assert.fail();
        }


    }


    @And("^i choose kitchen such as kebap§Turk Mutfagi and dont click the mandatory questions checkbox just fill the txt$")
    public void iChooseKitchenSuchAsKebapTurkMutfagiAndDontClickTheMandatoryQuestionsCheckboxJustFillTheTxt() throws Throwable {
        base.driver.manage().deleteAllCookies();
        Thread.sleep(1000);

        ServingPage page = new ServingPage(base.driver);

        WebElement Selection_kitchen = page.kitchenselection;

        Select ddlkitchen = new Select(Selection_kitchen);


        ddlkitchen.selectByVisibleText("Kebap & Türk Mutfağı");

        Thread.sleep(3000);

        page.Serving2(randomUUIDString);
        page.Serving5(randomUUIDString);
        page.Serving7(randomUUIDString);

    }


    @And("^i choose kitchen such as kebap§Turk Mutfagi and click the mandatory questions checkbox dont fill the its txt$")
    public void iChooseKitchenSuchAsKebapTurkMutfagiAndClickTheMandatoryQuestionsCheckboxDontFillTheitsTxt() throws Throwable {
        base.driver.manage().deleteAllCookies();
        Thread.sleep(1000);

        ServingPage page = new ServingPage(base.driver);

        WebElement Selection_kitchen = page.kitchenselection;

        Select ddlkitchen = new Select(Selection_kitchen);


        ddlkitchen.selectByVisibleText("Kebap & Türk Mutfağı");

        Thread.sleep(3000);

        List<WebElement> options = page.checkboxdm;

        int index = r.nextInt(options.size());
        options.get(index).click();

        page.Serving5(randomUUIDString);
        page.Serving7(randomUUIDString);


    }

    @And("^i clear all values1$")
    public void iClearAllValues1() throws Throwable {


       Thread.sleep(3000);
        ServingPage page = new ServingPage(base.driver);
        page.fieldquestion1.clear();
        page.fieldquestion4.clear();
        page.fieldquestion6.clear();

    }

    @And("^i clear all values2$")
    public void iClearAllValues2() throws Throwable {


        Thread.sleep(3000);
        ServingPage page = new ServingPage(base.driver);
        page.fieldquestion1.clear();
        page.fieldquestion4.clear();
        page.fieldquestion6.clear();

    }

    @And("^i clear all values3$")
    public void iClearAllValues3() throws Throwable {


        Thread.sleep(3000);
        ServingPage page = new ServingPage(base.driver);
        page.fieldquestion1.clear();
        page.fieldquestion4.clear();
        page.fieldquestion6.clear();

    }
}






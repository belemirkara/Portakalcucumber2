package Steps;

import Base.BaseUtil;
import Pages.ServingControlofMandatoryFieldsPage;
import Pages.ServingPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
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

public class ServingControlofMandatoryFields extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();

    public ServingControlofMandatoryFields(BaseUtil base){


        this.base=base;
    }

    @Then("^i see the you need to choose kitchen for saving serving informations txt$")
    public void iSeeThetheyouneedtochoosekitchenforsavingservinginformationstxt() throws Throwable {


        try {

            ServingControlofMandatoryFieldsPage page=new ServingControlofMandatoryFieldsPage(base.driver);

            String ab = page.mandatoryalert.getText();
            Assert.assertEquals("Servis bilgilerinizi kaydedebilmeniz için mutfak seçmeniz gerekmektedir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();
        }


    }

    @When("^i dont do anything in payment methods$")
    public void idontdoanythinginpaymentmethods() throws Throwable {

    }




    @And("^i delete clicks in payment methods$")
    public void iDeleteClicksInPaymentMethods() throws Throwable {

        Thread.sleep(3000);

        ServingControlofMandatoryFieldsPage page=new ServingControlofMandatoryFieldsPage(base.driver);

        page.ServingControlofMandatoryField1();

        page.ServingControlofMandatoryField();

        page.ServingControlofMandatoryField2();

        page.ServingControlofMandatoryField3();

        page.ServingControlofMandatoryField4();

        page.ServingControlofMandatoryField5();

        page.ServingControlofMandatoryField6();

        page.ServingControlofMandatoryField7();

        page.ServingControlofMandatoryField8();


    }

    @And("^i get choose kitchen in combobox$")
    public void iGetChooseKitchenInCombobox() throws Throwable {

        ServingPage page=new ServingPage(base.driver);

        WebElement Selection_kitchen =page.kitchenselection;

        Select ddlkitchen = new Select(Selection_kitchen);


        ddlkitchen.selectByVisibleText("Mutfak Seçiniz");


    }
}



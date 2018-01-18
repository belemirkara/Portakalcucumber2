package Steps;

import Base.BaseUtil;
import Pages.ContactInformationPage;
import Pages.DeliverylengthPage;
import Pages.SelfregPage;
import Pages.ServingPage;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;



public class Deliverylength extends BaseUtil {

    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    int randomamountValue = r.nextInt(6);
    int randomamountValueofdiger = r.nextInt(31);

    public Deliverylength(BaseUtil base) {


        this.base = base;
    }

    @And("^i click the delivery in progress bar$")
    public void iClickThedeliveryinProgressBar() throws Throwable {

        Thread.sleep(6000);
        DeliverylengthPage page=new DeliverylengthPage(base.driver);
        page.Deliverylength();
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        Thread.sleep(3000);
    }

    @And("^i enter main district amount as max five tl and click enter$")
    public void iEntermaindistrictAmountAsMaxFiveTlAndClickEnter() throws Throwable {

        Thread.sleep(3000);
        DeliverylengthPage page=new DeliverylengthPage(base.driver);

        int min = 0;
        int max = 5;


        WebElement maindistrict =page.maindistrict;
        page.Deliverylength2(String.valueOf(randomamountValue));
    }

    @And("^i enter most closed districts amount max thirty tl and click enter i control that all fields are filled by same amount$")
    public void iEntermostcloseddistrictsAmountMaxThirtyTlAndClickEnterIControlThatAllFieldsAreFilledBySameAmount() throws Throwable {


        Thread.sleep(3000);
        DeliverylengthPage page=new DeliverylengthPage(base.driver);

        int min = 0;
        int max = 30;

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("semt_1")).size() > 0;

        if (isPresent == true) {

            page.Deliverylength3(String.valueOf(randomamountValueofdiger));
            Thread.sleep(700);



            String themostclosedsf=page.themostcloseddistrict.getAttribute("value");


            WebElement themostclosedsemtfield1 =page.minprice;


            String themostsf1=page.minprice.getAttribute("value");

            if (themostclosedsf.equals(themostsf1)) {

            } else {
                Assert.fail();
            }


        } else if (isPresent == false) {

        }
    }

    @And("^i enter closed districts amount max thirty and click enter and i control that all fields are filled by same amount$")
    public void iEntercloseddistrictsAmountMaxThirtyAndClickEnterAndIControlThatAllFieldsAreFilledBySameAmount() throws Throwable {


        Thread.sleep(3000);
        DeliverylengthPage page=new DeliverylengthPage(base.driver);

        int min = 0;
        int max = 30;
        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("semt_2")).size() > 0;

        if (isPresent == true) {

            page.Deliverylength4(String.valueOf(randomamountValueofdiger));

            String closedsf=page.closeddistricts.getAttribute("value");

            String closedsf1=page.minprice2.getAttribute("value");

            if (closedsf.equals(closedsf1)) {

            } else {
                Assert.fail();
            }



        } else if (isPresent == false) {


        }
    }


    @And("^i enter far districts amount max thirty and click enter and i control that all fields are filled by same amount$")
    public void iEnterfardistrictsAmountMaxThirtyAndClickEnterAndIControlThatAllFieldsAreFilledBySameAmount() throws Throwable {

        Thread.sleep(3000);
        DeliverylengthPage page=new DeliverylengthPage(base.driver);


        int min = 0;
        int max = 30;

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("semt_3")).size() > 0;

        if (isPresent == true) {

           page.Deliverylength5(String.valueOf(randomamountValueofdiger));


            String farsf=page.fardistricts.getAttribute("value");

            WebElement farsemtfield1 = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("deliverMinPrice3")));


            String farsf1=page.minprice3.getAttribute("value");

            if (farsf.equals(farsf1)) {

            } else {
                Assert.fail();
            }


        } else if (isPresent == false) {


        }
    }


    @And("^i choose district in district selection combobox$")
    public void iChoosedistrictindistrictselectionCombobox() throws Throwable {

        Thread.sleep(3000);
        DeliverylengthPage page=new DeliverylengthPage(base.driver);

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("semt_0")).size() > 0;

        if (isPresent == true) {

            page.Deliverylength6();
            Thread.sleep(1000);


            page.Deliverylength7();

            page.Deliverylength8();

            List<WebElement> options =page.comboboxoptions;

            Thread.sleep(1000);


           page.Deliverylength9(String.valueOf(randomamountValueofdiger));
            Thread.sleep(700);



            String othersf=page.allselectiondistricts.getText();

            WebElement digersemtfield1 = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("deliverMinPrice0")));


            String othersf1=page.minprice0.getText();

            if (othersf.equals(othersf1)) {

            } else {
                Assert.fail();
            }



        } else if (isPresent == false) {



        }
    }


    @And("^i see delivery success pop up$")
    public void iSeedeliverysuccessPopUp() throws Throwable {
        Thread.sleep(3000);
        DeliverylengthPage page=new DeliverylengthPage(base.driver);

        base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        try {


            page.Deliverylength10();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {

            Assert.fail();


        }base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }

    @And("^i confirm the operation is successfull pop up message$")
    public void iConfirmtheoperationissuccessfullPopUpMessage() throws Throwable {

        Thread.sleep(3000);
        DeliverylengthPage page=new DeliverylengthPage(base.driver);
        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

        try {

            String ab = page.deliverysuccesspopup.getText();

            Assert.assertEquals("İşlem başarıyla gerçekleştirildi.", ab);

        } catch (AssertionError ae) {

            Assert.fail();
        }

    }
    @Then("^i stay in delivery page$")
    public void iStayInGonderimBolgeleriPage() throws Throwable {

        Thread.sleep(3000);
        try {
            String URL = base.driver.getCurrentUrl();
            Assert.assertEquals(URL, "http://portakal.ystest.com/SelfRegistration/registrationwizard/delivery" );
            Thread.sleep(1000);
        } catch (AssertionError ae) {

            Assert.fail();
        }
    }


    @When("^i click saveandcontinuebutton in delivery$")
    public void iClicksaveandcontinuebuttonIndelivery() throws Throwable {

        Thread.sleep(3000);
        DeliverylengthPage page=new DeliverylengthPage(base.driver);
        page.Deliverylength11();
    }


    @And("^i see kitchen information pop up return serving$")
    public void iSeeKitchenInformationPopUpReturnServing() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);


            DeliverylengthPage page=new DeliverylengthPage(base.driver);
        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.id("/html/body/div[2]/div[2]/div[6]")).size() > 0;

        if (isPresent == true) {

            ServingPage page1=new ServingPage(base.driver);
            page1.Serving1();


            WebElement Selection_kitchen =page1.kitchenselection;

            Select ddlkitchen = new Select(Selection_kitchen);


            ddlkitchen.selectByVisibleText("Börek");

            ContactInformationPage page3=new ContactInformationPage(base.driver);
            page3.Contact10();
        }}
}





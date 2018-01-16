package Steps;

import Base.BaseUtil;
import Model.UserModel;
import Pages.ContactInformationPage;
import Repository.Repo;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;

import java.util.Random;
import java.util.UUID;

import java.util.concurrent.TimeUnit;

public class ContactInformation extends BaseUtil {

    public BaseUtil base;
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    Random r = new Random();
    int randomNumber = r.nextInt(899999) + 1000000;


    public ContactInformation(BaseUtil base) {


        this.base = base;
    }

    @Given("^i click the Contact Information in progress bar$")
    public void iClickTheContactInformationinProgressBar() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);

        page.Contact1();


    }

    @And("^i delete restaurantownername and type again$")
    public void iDeleterestaurantownernameAdAndTypeAgain() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact2(base.uret());




    }

    @And("^i delete restaurantownersurname and type again$")
    public void iDeleterestaurantownersurnameAndTypeAgain() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact3(base.uret());
    }

    @And("^i delete restaurantownerno and type again$")
    public void iDeleterestaurantownernoAndTypeAgain() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);

        page.Contact4("(216)" + randomNumber);

    }

    @And("^i enter managername if i want$")
    public void iEntermanagernameifiWant() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact5(base.uret());

    }

    @And("^i enter managersurname if i want$")
    public void iEntermanagersurnameifiWant() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact6(base.uret());


    }

    @And("^i enter managerno if i want$")
    public void iEntermanagernoifiWant() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact7("(216)" + randomNumber);


    }

    @And("^i delete restaurantno and type again$")
    public void iDeleterestaurantnoAndTypeAgain() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact8("(212)" + randomNumber);
    }

    @And("^i delete email and type again$")
    public void iDeleteEmailAndTypeAgain() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact9(base.uret()+"@"+"afhdagf.com");

    }


    @When("^i click savebutton$")
    public void iClicksaveButton() throws Throwable {

        Thread.sleep(3000);
        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact10();


    }



    @When("^i click saveandcontinuebutton$")
    public void iClicksaveandcontinuebutton() throws Throwable {


        Thread.sleep(3000);

        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact11();
    }



    @And("^i confirm contact informations are saved successfully pop up message$")
    public void iConfirmcontactinformationsaresavedsuccessfullyPopUpMessage() throws Throwable {


        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try{
            ContactInformationPage page=new ContactInformationPage(base.driver);
            WebElement successpopup=page.contactinformationsuccesspopup;

            String ab = successpopup.getText();

            Assert.assertEquals("İletişim bilgileriniz başarıyla kaydedildi.", ab);
            Thread.sleep(3000);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }




    @Then("^i stay in same page$")
    public void iStayinSamePage() throws Throwable {
        try {
            String URL = base.driver.getCurrentUrl();
            Assert.assertEquals(URL, "http://portakal.ystest.com/SelfRegistration/registrationwizard/contact" );
            Thread.sleep(1000);
        } catch (AssertionError ae) {

            Assert.fail();
        }
    }



    @Then("^i click ok button$")
    public void iClickokButton() throws Throwable {

        Thread.sleep(1000);


        ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact13();

        Thread.sleep(1000);


    }

    @And("^i get username and pw from login$")
    public void iGetusernameAndPwFromLogin() throws Throwable {


        Thread.sleep(3000);

Repo repo = new Repo(this.base);
UserModel user = repo.GetUser();

       ContactInformationPage page=new ContactInformationPage(base.driver);
        page.Contact15(user.UserName,user.Password);


        Thread.sleep(3000);
    }
}


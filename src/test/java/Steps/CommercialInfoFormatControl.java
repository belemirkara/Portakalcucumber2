package Steps;

import Base.BaseUtil;
import Pages.CommercialInfoControlofmandatoryFieldsPage;
import Pages.CommercialInfoFormatControlPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class CommercialInfoFormatControl extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();

    public CommercialInfoFormatControl(BaseUtil base) {
        this.base = base;
    }



    @And("^i delete tckn and send tckn with wrong format$")
    public void iDeleteTcknAndSendTcknWithWrongFormat() throws Throwable {

        Thread.sleep(3000);
        CommercialInfoFormatControlPage page=new CommercialInfoFormatControlPage(base.driver);
        page.CommercialInfoFormatControl1("12345678999");

    }


    @And("^i confirm the TCKN is not right format pop up message$")
    public void iConfirmtheTCKNisnotrightformatPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {

            CommercialInfoFormatControlPage page=new CommercialInfoFormatControlPage(base.driver);
            WebElement tcknwrngformat =page.commercialconfirmationmessage;
            String ab = tcknwrngformat.getText();

            Assert.assertEquals("TC kimlik numarası doğru formatta değildir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }


    }



    @And("^i delete tckn and send tckn with missing format$")
    public void iDeleteTcknAndSendTcknWithMissingFormat() throws Throwable {


        Thread.sleep(3000);
        CommercialInfoFormatControlPage page=new CommercialInfoFormatControlPage(base.driver);
        page.CommercialInfoFormatControl1("1234567899");

    }



    @And("^i confirm the TCKN s length must be 11 pop up message$")
    public void iConfirmtheTCKNslengthmustbe11PopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {

            CommercialInfoFormatControlPage page=new CommercialInfoFormatControlPage(base.driver);
            WebElement tcknwrngformat =page.commercialconfirmationmessage;

            String ab = tcknwrngformat.getText();

            Assert.assertEquals("TC kimlik numarası alanının uzunluğu 11 olmalıdır.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }


    }

    @And("^i delete VKN and enter wrong format$")
    public void iDeleteVKNAndEnterWrongFormat() throws Throwable {

        Thread.sleep(3000);
        CommercialInfoFormatControlPage page = new CommercialInfoFormatControlPage(base.driver);
        page.CommercialInfoFormatControl2("0000000000");


    }

    @And("^i confirm VKN is not right format pop up message$")
    public void iConfirmVKNisnotrightformatPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {

            CommercialInfoFormatControlPage page = new CommercialInfoFormatControlPage(base.driver);
            WebElement VKN =page.commercialconfirmationmessage;

            String ab = VKN.getText();

            Assert.assertEquals("Vergi numarası doğru formatta değildir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }

    @And("^i delete VKN and enter missing format$")
    public void iDeleteVKNAndEnterMissingFormat() throws Throwable {

        Thread.sleep(3000);
        CommercialInfoFormatControlPage page = new CommercialInfoFormatControlPage(base.driver);
        page.CommercialInfoFormatControl2("123456789");

    }


    @And("^i confirm the vkn s length must be 10 pop up message$")
    public void iConfirmthevknslengthmustbe10PopUpMessage() throws Throwable {


        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {

            CommercialInfoFormatControlPage page = new CommercialInfoFormatControlPage(base.driver);
            WebElement VKN =page.commercialconfirmationmessage;
            String ab = VKN.getText();

            Assert.assertEquals("Vergi numarası alanının uzunluğu 10 olmalıdır.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }


    @And("^i delete iban and enter wrong format iban$")
    public void iDeleteibanAndEnterWrongFormatiban() throws Throwable {

        Thread.sleep(3000);
        CommercialInfoFormatControlPage page = new CommercialInfoFormatControlPage(base.driver);
        page.CommercialInfoFormatControl3("TR000000000000000000000000");

    }

    @And("^i confirm the IBAN is not right format pop up message$")
    public void iConfirmtheIBANisnotrightformatPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {

            CommercialInfoFormatControlPage page = new CommercialInfoFormatControlPage(base.driver);
            WebElement ibannowrngformat = page.commercialconfirmationmessage;

            String ab = ibannowrngformat.getText();

            Assert.assertEquals("IBAN doğru formatta değildir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }

    @And("^i delete iban and enter missing format iban$")
    public void iDeleteibanAndEnterMissingFormatiban() throws Throwable {

        Thread.sleep(3000);
        CommercialInfoFormatControlPage page = new CommercialInfoFormatControlPage(base.driver);
        page.CommercialInfoFormatControl3("TR76001340000000028680000");
    }



    @And("^i confirm IBAN s lenght must be 26 pop up message$")
    public void iConfirmIBANslenghtmustbe26PopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {

            CommercialInfoFormatControlPage page = new CommercialInfoFormatControlPage(base.driver);
            WebElement ibannowrngformat =page.commercialconfirmationmessage;

            String ab = ibannowrngformat.getText();

            Assert.assertEquals("IBAN alanının uzunluğu 26 olmalıdır.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }

    @And("^i delete kep adresi and enter wrong format kep adresi$")
    public void iDeleteKepAdresiAndEnterWrongFormatKepAdresi() throws Throwable {

       Thread.sleep(3000);
        CommercialInfoFormatControlPage page = new CommercialInfoFormatControlPage(base.driver);
        page.CommercialInfoFormatControl4(randomUUIDString);
    }



    @And("^i confirm the kep adress is not right format pop up message$")
    public void iConfirmthekepadressisnotrightformatPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {

            CommercialInfoFormatControlPage page = new CommercialInfoFormatControlPage(base.driver);
            WebElement kepadreswrongformat =page.commercialconfirmationmessage;
            String ab = kepadreswrongformat.getText();

            Assert.assertEquals("Kep adresi doğru formatta değildir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }

    @And("^i select commercial type with wrong format mersis$")
    public void iSelectcommercialtypeWithWrongFormatMersis() throws Throwable {

        CommercialInfoFormatControlPage page = new CommercialInfoFormatControlPage(base.driver);
        Select s4 = new Select(page.fieldlegalType3);

        String[] mersis = {"00011", "00012", "00013", "00014", "00015", "00016", "00017", "00018", "00019"};
        String[] mersis2 = {"00015", "00016", "00017"};

        int listSize = s4.getOptions().size();
        if (listSize > 1) {
            int optionindex = r.nextInt(listSize - 1);

            if (optionindex == 0 || optionindex==1) {
                s4.selectByVisibleText("Şahıs");


                page.CommercialInfoFormatControl1("60591947528");



                String rmersis = mersis[r.nextInt(mersis.length - 1)];
                page.CommercialInfoFormatControl6("0" + "4780040920" + rmersis);


            }

            if (optionindex == 2) {

                s4.selectByVisibleText("Diğer");

                page.CommercialInfoFormatControl2("4780040920");

                String gelenmersis = mersis2[r.nextInt(mersis2.length - 1)];
                page.CommercialInfoFormatControl6("60591947528" + gelenmersis);

            }
        }
    }


    @And("^i confirm the mersis is not right format pop up message$")
    public void iConfirmthemersisisnotrightformatPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {

            CommercialInfoFormatControlPage page = new CommercialInfoFormatControlPage(base.driver);
            WebElement kep =page.commercialconfirmationmessage;

            String ab = kep.getText();

            Assert.assertEquals("Mersis numarası doğru formatta değildir.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }


    @And("^i select commercial type with missing format mersis$")
    public void iSelectcommercialtypeWithMissingFormatMersis() throws Throwable {


        CommercialInfoFormatControlPage page = new CommercialInfoFormatControlPage(base.driver);
        Select s4 = new Select(page.fieldlegalType3);

        int listSize = s4.getOptions().size();
        if (listSize > 1) {

            int optionindex = r.nextInt(listSize - 1);

            if (optionindex == 0 || optionindex==1) {

                s4.selectByVisibleText("Şahıs");

               page.CommercialInfoFormatControl1("60591947528");


               page.CommercialInfoFormatControl6("60591947528" );

            }

            if (optionindex == 2) {

                s4.selectByVisibleText("Diğer");

               page.CommercialInfoFormatControl2("4780040920");

               page.CommercialInfoFormatControl6("0" + "4780040920" );
            }
        }
    }




    @And("^i confirm mersis s length must be 16 pop up message$")
    public void iConfirmmersisslengthmustbe16rPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {

            CommercialInfoFormatControlPage page = new CommercialInfoFormatControlPage(base.driver);
            WebElement kepadresmissingformat = page.commercialconfirmationmessage;
            String ab = kepadresmissingformat.getText();

            Assert.assertEquals("Mersis numarası alanının uzunluğu 16 olmalıdır.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }


    @And("^i delete invoicemail and type wrong format$")
    public void iDeleteinvoicemailAndTypeWrongFormat() throws Throwable {

        Thread.sleep(3000);
        CommercialInfoFormatControlPage page = new CommercialInfoFormatControlPage(base.driver);

        String[] email = {"fasfljsdlfgmailcom", "KALEM@gmail.com", "Şğ@gmail.com"};

        String remail = email[r.nextInt(email.length - 1)];

        page.CommercialInfoFormatControl7(remail);

    }


    @And("^i confirm the please enter valid mail pop up message$")
    public void iConfirmthepleaseentervalidmailPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {

            CommercialInfoFormatControlPage page = new CommercialInfoFormatControlPage(base.driver);
            WebElement email =page.popupemailerror;

            String ab = email.getText();

            Assert.assertEquals("Lütfen geçerli bir mail adresi giriniz", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        } }


    @Then("^i see the commercial failemail pop up$")
    public void iSeeTheCommercialFailemailPopUp() throws Throwable {
        try {

            Thread.sleep(3000);

            CommercialInfoFormatControlPage page = new CommercialInfoFormatControlPage(base.driver);
            page.CommercialInfoFormatControl8();

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {
            base.driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);

        }

    }

}








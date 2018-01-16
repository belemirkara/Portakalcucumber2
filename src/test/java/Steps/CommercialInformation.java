package Steps;

import Base.BaseUtil;
import Pages.CommercialInformationPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class CommercialInformation extends BaseUtil {

    public BaseUtil base;
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    Random r = new Random();



    public CommercialInformation(BaseUtil base) {


        this.base = base;
    }



    @And("^i enter the commercial title$")
    public void iEnterThecommercialtitle() throws Throwable {

        Thread.sleep(3000);
        CommercialInformationPage page=new CommercialInformationPage(base.driver);
         page.Commercial1(randomUUiDString);
    }


    @And("^i enter the tax office$")
    public void iEnterThetaxoffice() throws Throwable {
        Thread.sleep(3000);
        CommercialInformationPage page=new CommercialInformationPage(base.driver);
          page.Commercial2(randomUUiDString);
    }


    @And("^i select commercial type$")
    public void iSelectcommercialtype() throws Throwable {


        Thread.sleep(3000);
        CommercialInformationPage page=new CommercialInformationPage(base.driver);
        Select s4 = new Select(page.fieldlegalType);

        String[] mersis = {"00011", "00012", "00013", "00014", "00015", "00016", "00017", "00018", "00019"};
        String[] mersis2 = {"00015", "00016", "00017"};

        int listSize = s4.getOptions().size();
        if (listSize > 1) {
            int optionindex = r.nextInt(listSize - 1);

            if (optionindex == 0 || optionindex==1) {
                s4.selectByVisibleText("Şahıs");

                page.Commercial3("60591947528");

                String rmersis = mersis[r.nextInt(mersis.length - 1)];
                page.Commercial4("60591947528" + rmersis);

            }
            if (optionindex == 2) {

                s4.selectByVisibleText("Diğer");

                page.Commercial5("4780040920");

                String gelenmersis = mersis2[r.nextInt(mersis2.length - 1)];
                page.Commercial4("0" + "4780040920" + gelenmersis);
            }
        }
    }

    @And("^i click commercialInformation tab$")
    public void iClickCommercialInformationTab() throws Throwable {

        Thread.sleep(3000);
        CommercialInformationPage page=new CommercialInformationPage(base.driver);
        page.Commercial6();
    }



    @And("^i delete invoiceemailaddress and type again$")
    public void iDeleteinvoiceemailaddressAndTypeAgain() throws Throwable {

        Thread.sleep(3000);
        CommercialInformationPage page=new CommercialInformationPage(base.driver);
        page.Commercial7(base.uret() + "@" + "afhdagf.com");
    }

    @Then("^i stay in commercialInfo page$")
    public void iStayincommercialInfoPage() throws Throwable {

        Thread.sleep(3000);
        try {
            String URL = base.driver.getCurrentUrl();
            Assert.assertEquals(URL, "http://portakal.ystest.com/SelfRegistration/registrationwizard/commercial" );
            Thread.sleep(1000);
        } catch (AssertionError ae) {

            Assert.fail();
        }
    }



    @And("^i enter iban$")
    public void iEnteriban() throws Throwable {

        String[] iban = {"TR830004600354888000002868", "TR330013400000000286800007", "TR110020500000070770700001"};
        CommercialInformationPage page=new CommercialInformationPage(base.driver);
        String geleniban = iban[r.nextInt(iban.length - 1)];
        page.Commercial8(geleniban);


    }


    @And("^i confirm commercial informations are saved successfully pop up message$")
    public void iConfirmcommercialinformationsaresavedsuccessfullyPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

        try {
            CommercialInformationPage page=new CommercialInformationPage(base.driver);
            WebElement islembasarilipopup =page.confirmationmessage;
            String ab = islembasarilipopup.getText();

            Assert.assertEquals("Ticari bilgileriniz başarıyla kaydedildi.", ab);

        } catch (AssertionError ae) {

            Assert.fail();

        }


    }

    @And("^i enter kep address$")
    public void iEnterkepaddress() throws Throwable {

        Thread.sleep(3000);
        CommercialInformationPage page=new CommercialInformationPage(base.driver);
       page.Commercial9(base.uret() + "." + base.uret() + "@" + "hs03.kep.tr");










    }

}



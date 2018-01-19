package Steps;

import Base.BaseUtil;
import Pages.ContactInformationPage;
import Pages.DeliveryCountyPage;
import com.google.common.base.Function;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class DeliveryCounty extends BaseUtil {

    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    int randomamountValueofdiger = r.nextInt(31);

    public DeliveryCounty(BaseUtil base) {

        this.base = base;
    }


    @And("^i click county tab in gonderim bolg$")
    public void iClickcountyTabInGonderimBolg() throws Throwable {


        Thread.sleep(3000);
        DeliveryCountyPage page=new DeliveryCountyPage(base.driver);
        page.DeliveryCounty();


    }

    @And("^i choose county from the county combobox in delivery page$")
    public void iChoosecountyFromthecountyComboboxIndeliverypage() throws Throwable {

        Thread.sleep(3000);
        DeliveryCountyPage page=new DeliveryCountyPage(base.driver);

        Select ddlcounty = new Select(page.countydropdown);

        List<WebElement> resultList = ddlcounty.getOptions();
        int result = resultList.size();

        while (result == 0) {
            iChoosecountyFromthecountyComboboxIndeliverypage();
        }

        if (ddlcounty.getOptions().isEmpty()) {

            ContactInformationPage page2=new ContactInformationPage(base.driver);
            page2.Contact10();


        } else if (!ddlcounty.getOptions().isEmpty()) {

            int listSize = ddlcounty.getOptions().size();

            if (listSize > 1) {
                int optionIndex = r.nextInt(listSize - 1);

                if (optionIndex == 0) {
                    ddlcounty.selectByIndex(1);
                }

                if (optionIndex > 0) {
                    ddlcounty.selectByIndex(optionIndex);
                }
            }
        }
    }


    @And("^i enter amount for all max thirty tl in selected counties field$")
    public void iEnteramountforallmaxthirtytlinselectedcountiesfield() throws Throwable {

        Thread.sleep(3000);
        DeliveryCountyPage page=new DeliveryCountyPage(base.driver);

        int min = 0;
        int max = 30;

        page.selectioncountytable.click();
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        Thread.sleep(3000);

          page.DeliveryCounty2(String.valueOf(randomamountValueofdiger));
           Thread.sleep(1000);

           String sisf = page.allamountcounty.getAttribute("value");


      Thread.sleep(3000);

      String sif1 = page.selectioncountytable2.getAttribute("value");

        if (sisf.equals(sif1)) {

        } else {
            Assert.fail();
        }

    }



}







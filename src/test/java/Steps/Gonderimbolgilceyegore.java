package Steps;

import Base.BaseUtil;
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

public class Gonderimbolgilceyegore extends BaseUtil {

    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    int randomamountValueofdiger = r.nextInt(31);

    public Gonderimbolgilceyegore(BaseUtil base) {

        this.base = base;
    }


    @And("^i click ilceye gore tab in gonderim bolg$")
    public void iClickIlceyeGoreTabInGonderimBolg() throws Throwable {

        WebElement ilceyegore = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("option2")));
        ilceyegore.click();
        Thread.sleep(3000);
    }

    @And("^i choose ilce from ilce seciniz combobox in gonderim bolg$")
    public void iChooseIlceFromIlceSecinizComboboxInGonderimBolg() throws Throwable {

        Thread.sleep(3000);
        WebElement ilce = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("selectCountyDropdown")));

        Select ddlIlce = new Select(ilce);

        List<WebElement> resultList = ddlIlce.getOptions();
        int result = resultList.size();

        while (result == 0) {
            iChooseIlceFromIlceSecinizComboboxInGonderimBolg();
        }

        if (ddlIlce.getOptions().isEmpty()) {
            WebElement kb = (new WebDriverWait(driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("btnSave")));
            kb.click();
        } else if (!ddlIlce.getOptions().isEmpty()) {

            int listSize = ddlIlce.getOptions().size();
            if (listSize > 1) {
                int optionIndex = r.nextInt(listSize - 1);

                if (optionIndex == 0) {
                    ddlIlce.selectByIndex(1);
                }

                if (optionIndex > 0) {
                    ddlIlce.selectByIndex(optionIndex);
                }
            }
        }
    }


    @And("^i enter tumune uygulacak fiyat max thirty tl in secili ilceler field$")
    public void iEnterTumuneUygulacakFiyatMaxThirtyTlInSeciliIlcelerField() throws Throwable {


        int min = 0;
        int max = 30;

        WebElement seciliilcelertable = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div[3]/div")));

        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        Thread.sleep(3000);


        WebElement seciliilcelertumuneuygulanacakfiyat = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("totalpriceCounty")));
        seciliilcelertumuneuygulanacakfiyat.click();
        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        Thread.sleep(3000);


        seciliilcelertumuneuygulanacakfiyat.sendKeys(String.valueOf(randomamountValueofdiger));
        Thread.sleep(700);


        base.driver.findElement(By.id("totalpriceCounty")).sendKeys(Keys.ENTER);

        String sisf = seciliilcelertumuneuygulanacakfiyat.getAttribute("value");


        WebElement seciliilcelerfield1 = (new WebDriverWait(base.driver, 45))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[4]/div[3]/div/div[2]/table[2]/tbody/tr[1]/td[2]/input")));

        String sif1 = seciliilcelerfield1.getAttribute("value");

        if (sisf.equals(sif1)) {

        } else {
            Assert.fail();
        }

    }


    @And("^i click kaydetvedevametbutton in another gonderim bolg page$")
    public void iClickKaydetvedevametbuttonInAnotherGonderimBolgPage() throws Throwable {

        WebElement kvdeb = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("btnSaveContinue")));
        kvdeb.click();
    }

}







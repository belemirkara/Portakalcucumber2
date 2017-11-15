package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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

            String newurl=sb.toString();

            base.driver.get(newurl);


        }


        @Then("^i see contents of remarketing nedir in first tab$")
        public void iSeeContentsOfRemarketingNedirInFirstTab() throws Throwable {

            WebElement ContentsOfRemarketingNedir= (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("tab_Description")));
            ContentsOfRemarketingNedir.click();

            base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            if (ContentsOfRemarketingNedir.isDisplayed())
            {

            } else
            {
                Assert.fail();
            }

        }

        @When("^i click remarketing reklami tanimla button in first tab remarketing nedir$")
        public void iClickRemarketingReklamiTanimlaButtonInFirstTabRemarketingNedir() throws Throwable {

        WebElement RemarketingReklamiTanimlaButton= (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("tab_Description")));
            RemarketingReklamiTanimlaButton.click();

        }

        @Then("^i see contents of remarketing olustur$")
        public void iSeeContentsOfRemarketingOlustur() throws Throwable {


        WebElement ContentsOfRemarketingOlustur= (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("tab_Description")));
            ContentsOfRemarketingOlustur.click();

            base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            if (ContentsOfRemarketingOlustur.isDisplayed())
            {

            } else
            {
                Assert.fail();
            }

        }

        @When("^i click second tab remarketing olustur$")
        public void iClickSecondTabRemarketingOlustur() throws Throwable {

        WebElement RemarketingOlustur= (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("menuCreate")));
            RemarketingOlustur.click();



        }

        @And("^i click Reklamda Yer Alacak Bir Gorsel Secin radio button$")
        public void iClickReklamdaYerAlacakBirGorselSecinRadioButton() throws Throwable {

            WebElement ReklamdaYerAlacakBirGorselSecinRadioButton= (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("radio_1_1")));
            ReklamdaYerAlacakBirGorselSecinRadioButton.click();

        }

        @And("^i click image in the right of page$")
        public void iClickImageInTheRightOfPage() throws Throwable {

        WebElement ImageInTheRightOfPage= (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("image-holder")));
            ImageInTheRightOfPage.click();

            base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

            if (ImageInTheRightOfPage.isDisplayed())
            {

            } else
            {
                Assert.fail();
            }

        }

        @And("^i click Reklaminiz icin Slogan Belirleyin field and enter text$")
        public void iClickReklaminizIcinSloganBelirleyinFieldAndEnterText() throws Throwable {
           
            WebElement ReklaminizIcinSloganBelirleyinField= (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("radio_1_1")));
            ReklaminizIcinSloganBelirleyinField.click();
            ReklaminizIcinSloganBelirleyinField.sendKeys(randomUUIDString);

        }


        @And("^i click Reklaminizi Kac Kisiye Gosterme istediginizi belirleyin table and choose one of the checkbox AND i see Faturaniza Eklenecek Toplam Tutar is same as checkbox$")
        public void iClickReklaminiziKacKisiyeGostermeIstediginiziBelirleyinTableAndChooseOneOfTheCheckboxANDISeeFaturanizaEklenecekToplamTutarIsSameAsCheckbox() throws Throwable {

            WebElement ReklaminiziKacKisiyeGostermeIstediginiziBelirleyinTable= (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_Create\"]/ng-include/div[1]/div[2]/div/table")));

            ReklaminiziKacKisiyeGostermeIstediginiziBelirleyinTable.click();

            base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

            if (ReklaminiziKacKisiyeGostermeIstediginiziBelirleyinTable.isDisplayed())
            {
                List<WebElement> radios = base.driver.findElements(By.tagName("tr"));
                int k=r.nextInt(radios.size());
                radios.get(k-1).click();

                String a=radios.get(k-1).getAttribute("value");

                WebElement faturatext= (new WebDriverWait(base.driver, 90))
                        .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_Create\"]/ng-include/div[1]/div[6]/span/b")));

               String b=faturatext.getText();

               if(a.equals(b)){


                }

                else{
                   Assert.fail();
               }
            } else
            {
                Assert.fail();
            }




        }
    }



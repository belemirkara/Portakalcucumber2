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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class ProjeMenuleri extends BaseUtil

{


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();
    public static String FilePath ="//Users//belemir.karabacakoglu//Desktop//projemenuleriproduct.txt";


    public ProjeMenuleri(BaseUtil base) {

        this.base = base;
    }





    @When("^i get Proje Menuleri$")
    public void iGetProjeMenuleri() throws Throwable {
        String urlpage = base.driver.getCurrentUrl();

        StringBuilder sb = new StringBuilder(urlpage);
        sb.append("/selfservice/menu");

        String newurl = sb.toString();

        base.driver.get(newurl);

    }

    @Then("^i see contents of proje menuleri nedir in first tab$")
    public void iSeeContentsOfProjeMenuleriNedirInFirstTab() throws Throwable {

        WebElement ContentsOfProjeMenuleriNedir = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("tab_FAQ")));

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        if (ContentsOfProjeMenuleriNedir.isDisplayed()) {

        } else {
            Assert.fail();
        }
    }

    @When("^i click coca cola menusu olustur button in proje menuleri  page$")
    public void iClickCocaColaMenusuOlusturButtonInProjeMenuleriPage() throws Throwable {

        WebElement CocaColaMenusuOlusturButton = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("red-thunderbird")));
        CocaColaMenusuOlusturButton.click();

    }

    @Then("^i see contents of coca cola menusu olustur page$")
    public void iSeeContentsOfCocaColaMenusuOlusturPage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.className("alert-warning")).size() > 0;

        if (isPresent == true) {
        } else {
            Thread.sleep(3000);

            WebElement ContentsOfCocaColaMenusuOlustur = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.className("tab-content")));


            base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            if (ContentsOfCocaColaMenusuOlustur.isDisplayed()) {
Thread.sleep(3000);
            } else {
                Assert.fail();
            }

        }
    }

    @When("^i click vodafone menusu olustur button in proje menuleri  page$")
    public void iClickVodafoneMenusuOlusturButtonInProjeMenuleriPage() throws Throwable {

        WebElement VodafoneMenusuOlusturButton = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("margin-left-20")));
        VodafoneMenusuOlusturButton.click();

    }

    @Then("^i see contents of vodafone menusu olustur page$")
    public void iSeeContentsOfVodafoneMenusuOlusturPage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.className("alert-warning")).size() > 0;

        if (isPresent == true) {
        } else {
            Thread.sleep(3000);

            WebElement ContentsOfvodafoneMenusuOlustur = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.className("tab-content")));


            base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
            if (ContentsOfvodafoneMenusuOlustur.isDisplayed()) {

            } else {
                Assert.fail();
            }

        }

    }

    @When("^i click second tab coca cola menusu olustur$")
    public void iClickSecondTabCocaColaMenusuOlustur() throws Throwable {

        WebElement SecondTabCocaColaMenusuOlustur = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("menuCocaCola")));
        SecondTabCocaColaMenusuOlustur.click();
    }

    @And("^i see en cok satilan urunler table in coca cola page$")
    public void iSeeEnCokSatilanUrunlerTableInCocaColaPage() throws Throwable {

        WebElement EnCokSatilanUrunlerTableInCocaColaPage = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("col-xs-6")));

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        if (EnCokSatilanUrunlerTableInCocaColaPage.isDisplayed()) {

        } else {
            Assert.fail();
        }

    }

    @And("^i see icecekler table in coca cola page$")
    public void iSeeIceceklerTableInCocaColaPage() throws Throwable {

        WebElement IceceklerTableInCocaColaPage = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("col-xs-6")));

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        if (IceceklerTableInCocaColaPage.isDisplayed()) {

        } else {
            Assert.fail();
        }

    }

    @And("^i choose a product from en cok satilan urun table$")
    public void iChooseAProductFromEnCokSatilanUrunTable() throws Throwable {

        WebElement products = base.driver.findElement(By.id("product"));
        List<WebElement> links = products.findElements(By.className("green-jungle"));


        int index =r.nextInt(links.size()-1);

             links.get(index).click();
             
             }

    @And("^i return the proje menuleri nedir page$")
    public void iReturnTheProjeMenuleriNedirPage() throws Throwable {

        WebElement ProjeMenuleriNedirPage = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("menuFAQ")));
        ProjeMenuleriNedirPage.click();
    }

    @And("^i choose a beverage from icecekler table$")
    public void iChooseABeverageFromIceceklerTable() throws Throwable {

        WebElement products = base.driver.findElement(By.id("beverage"));
        List<WebElement> links = products.findElements(By.className("green-jungle"));


        int index =r.nextInt(links.size()-1);

        links.get(index).click();



    }

    @And("^i click menu olustur button$")
    public void iClickMenuOlusturButton() throws Throwable {

        WebElement menuolusturbutton = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("pull-right")));
        menuolusturbutton.click();
    }

    @And("^i see Coca-Cola menusu olusturuldu pop up$")
    public void iSeeCocaColaMenusuOlusturulduPopUp() throws Throwable {

        try {


            base.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[6]")).click();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {


        }base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


    }

    @And("^i confirm Coca-Cola menusu olusturuldu pop up message$")
    public void iConfirmCocaColaMenusuOlusturulduPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try{
            WebElement CocaColaMenusuOlusturulduPopUpMessage= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/div[2]/div[6]")));

            String ab = CocaColaMenusuOlusturulduPopUpMessage.getText();

            Assert.assertEquals("Coca-Cola menüsü oluşturuldu", ab);
            Thread.sleep(3000);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^i click tamam button in coca cola page$")
    public void iClickTamamButtonInCocaColaPage() throws Throwable {
        
        WebElement tamambutton = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[4]/div[2]/button[1]")));
        tamambutton.click();
    }

    @And("^i click mevcut proje menuleri tab$")
    public void iClickMevcutProjeMenuleriTab() throws Throwable {

    }

    @And("^i get menus informations$")
    public void iGetMenusInformations() throws Throwable {

        WebElement products = base.driver.findElement(By.className("col-xs-12"));
        String product=products.getText();

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(FilePath), "utf-8"))) {

            String result = product;

            writer.write(result);
        }


    }
}





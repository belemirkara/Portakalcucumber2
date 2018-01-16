package Steps;

import Base.BaseUtil;
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

import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;


public class Serving extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();

    public Serving(BaseUtil base) {

        this.base = base;
    }


    @And("^i click servingtab$")
    public void iclickservingtab() throws Throwable {

        Thread.sleep(3000);
        ServingPage page=new ServingPage(base.driver);
        page.Serving1();
    }


    @And("^i choose kitchen and fill the questions$")
    public void iChoosekitchenandfillthequestions() throws Throwable {


        Thread.sleep(1000);

        ServingPage page=new ServingPage(base.driver);

        String[] kitchen = {"Börek", "Cafe", "Çiğ Köfte", "Çin Mutfağı", "Damacana Su", "Deniz Mahsulleri", "Döner", "Dünya Mutfağı",
                "Ev Yemekleri", "Fastfood & Sandwich", "Japon Mutfağı", "Kebap & Türk Mutfağı", "Kokoreç", "Köfte", "Kumpir", "Pasta & Tatlı", "Pide", "Pizza & İtalyan", "Tavuk"};

        WebElement Selection_kitchen =page.kitchenselection;

        Select ddlkitchen = new Select(Selection_kitchen);


        int rkitchen = r.nextInt(kitchen.length - 1);


        ddlkitchen.selectByVisibleText(kitchen[rkitchen]);


        if (kitchen[rkitchen].equals("Börek")) {
            Thread.sleep(3000);

        }


        if (kitchen[rkitchen].equals("Cafe")) {

            Thread.sleep(3000);

            page.Serving3(randomUUiDString);

            page.Serving6(randomUUiDString);

            page.Serving9(randomUUiDString);

        }
        if (kitchen[rkitchen].equals("Çiğ Köfte")) {
            Thread.sleep(3000);

            page.Serving2(randomUUiDString);

            page.Serving3(randomUUiDString);

            page.Serving4(randomUUiDString);
        }


        if (kitchen[rkitchen].equals("Çin Mutfağı")) {

            Thread.sleep(3000);
            page.Serving2(randomUUiDString);

            page.Serving3(randomUUiDString);

        }

        if (kitchen[rkitchen].equals("Damacana Su")) {
            Thread.sleep(3000);

            page.Serving2(randomUUiDString);

            page.Serving4(randomUUiDString);
        }


        if (kitchen[rkitchen].equals("Deniz Mahsulleri")) {

            Thread.sleep(3000);

            List<WebElement> options =page.checkboxdm;

            int index = r.nextInt(options.size());
            options.get(index).click();

            page.Serving4(randomUUiDString);

        }

        if (kitchen[rkitchen].equals("Döner")) {

            page.Serving2(randomUUiDString);

            page.Serving3(randomUUiDString);
        }


        if (kitchen[rkitchen].equals("Dünya Mutfağı")) {
            Thread.sleep(3000);

            page.Serving3(randomUUiDString);

            page.Serving6(randomUUiDString);

            page.Serving9(randomUUiDString);
        }

        if (kitchen[rkitchen].equals("Ev Yemekleri")) {
            Thread.sleep(3000);
            page.Serving2(randomUUiDString);

        }
        if (kitchen[rkitchen].equals("Fastfood & Sandwich")) {
            Thread.sleep(3000);

            page.Serving2(randomUUiDString);

            page.Serving3(randomUUiDString);
        }
        if (kitchen[rkitchen].equals("Japon Mutfağı")) {
            Thread.sleep(3000);

            page.Serving2(randomUUiDString);

            page.Serving3(randomUUiDString);
        }

        if (kitchen[rkitchen].equals("Kebap & Türk Mutfağı")) {
            Thread.sleep(3000);


            List<WebElement> options =page.checkboxdm;

            int index = r.nextInt(options.size());
            options.get(index).click();

            page.Serving5(randomUUiDString);
            page.Serving7(randomUUiDString);

        }

        if (kitchen[rkitchen].equals("Kokoreç")) {
            Thread.sleep(3000);

            page.Serving2(randomUUiDString);
            page.Serving3(randomUUiDString);
        }

        if (kitchen[rkitchen].equals("Köfte")) {
            Thread.sleep(3000);

            page.Serving2(randomUUiDString);
            page.Serving3(randomUUiDString);
            page.Serving4(randomUUiDString);
        }

        if (kitchen[rkitchen].equals("Kumpir")) {
            Thread.sleep(3000);

            page.Serving2(randomUUiDString);
            page.Serving3(randomUUiDString);
            page.Serving4(randomUUiDString);
            page.Serving5(randomUUiDString);
        }

        if (kitchen[rkitchen].equals("Pasta & Tatlı")) {
            Thread.sleep(3000);

            page.Serving2(randomUUiDString);
            page.Serving3(randomUUiDString);
            page.Serving4(randomUUiDString);
            page.Serving6(randomUUiDString);
            page.Serving7(randomUUiDString);
        }
        if (kitchen[rkitchen].equals("Pide")) {

            Thread.sleep(3000);

            page.Serving4(randomUUiDString);
            page.Serving5(randomUUiDString);
        }
        if (kitchen[rkitchen].equals("Pizza & İtalyan")) {

            Thread.sleep(3000);

            page.Serving2(randomUUiDString);
            page.Serving3(randomUUiDString);
            page.Serving5(randomUUiDString);
        }
        if (kitchen[rkitchen].equals("Tavuk")) {
            Thread.sleep(3000);

            page.Serving3(randomUUiDString);
            page.Serving4(randomUUiDString);
            page.Serving5(randomUUiDString);
        }}


    @And("^i confirm Serving informations are saved pop up message$")
    public void iConfirmServinginformationsaresavedPopUpMessage() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try {

            ServingPage page=new ServingPage(base.driver);
            WebElement successpopup =page.fieldsuccessconfirmation;

            String ab = successpopup.getText();

            Assert.assertEquals("Servis bilgileriniz başarıyla kaydedildi.", ab);

        } catch (AssertionError ae) {

            Assert.fail();
        }
    }

    @And("^i check payment methods$")
    public void iCheckpaymentmethods() throws Throwable {



        WebElement option1 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("creditCard")));
        option1.click();
        WebElement option2 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("ticket")));
        option2.click();
        WebElement option3 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("ticketFoodCheck")));
        option3.click();
        WebElement option4 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("sodexo")));
        option4.click();
        WebElement option5 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("sodexoCheck")));
        option5.click();
        WebElement option6 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("multinet")));
        option6.click();
        WebElement option7 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("setCard")));
        option7.click();
        WebElement option8 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("metropol")));
        option8.click();
        WebElement option9 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("wallet")));
        option9.click();
    }

}


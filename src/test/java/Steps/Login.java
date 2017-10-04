package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;


public class Login {

    public BaseUtil base;
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    Random r = new Random();

    public Login(BaseUtil base) {


        this.base = base;
    }

    @And("^i enter kullaniciadi$")
    public void iEnterKullaniciadi() throws Throwable {

        WebElement kullaniciadi = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
        kullaniciadi.click();
        kullaniciadi.sendKeys("900443");
    }

    @And("^i enter pw$")
    public void iEnterPw() throws Throwable {

        WebElement password = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
        password.click();
        password.sendKeys("z58BQvsK");
    }

    @And("^i click benihatirla checkbox if i want$")
    public void iClickBenihatirlaCheckboxifiWant() throws Throwable {

        WebElement benihatirla = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("rememberMe")));
        benihatirla.click();

    }


    @And("^i click girisyap button$")
    public void iClickGirisyapButton() throws Throwable {

        WebElement girisyap = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[2]/div[2]/form/fieldset/div[4]/button")));
        girisyap.click();

        Thread.sleep(3000);

    }

    @Then("^i login successfully$")
    public void iLoginSuccessfully() throws Throwable {

        try {
            String URL = base.driver.getCurrentUrl();
            Assert.assertEquals(URL, "http://portakal.ystest.com/SelfRegistration/registrationwizard/commercial");
            Thread.sleep(1000);
        } catch (AssertionError ae) {

            Assert.fail();
        }
    }

    @Given("^i navigate to login page$")
    public void iNavigateToLoginPage() throws Throwable {
        base.driver.navigate().to("http://portakal.ystest.com");
        Thread.sleep(1000);





    }
}

package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.UUID;

public class Login {

    public BaseUtil base;
    UUID uuid = UUID.randomUUID();
    String randomUUIDString = uuid.toString();
    Random r=new Random();

    public Login(BaseUtil base) {


        this.base = base;
    }

    @Given("^I navigate to login page$")
    public void iNavigateToLoginPage() throws Throwable {

        base.driver.get("http://portakal.ystest.com");
    }

    @And("^ı enter kullaniciadi$")
    public void ıEnterKullaniciadi() throws Throwable {
        WebElement kullaniciadi= (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
        kullaniciadi.click();
        kullaniciadi.sendKeys("900422");
    }

    @And("^ı enter pw$")
    public void ıEnterPw() throws Throwable {
        WebElement password= (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
        password.click();
        password.sendKeys("qenAPqcQ");
    }

    @And("^ı click benihatırla checkbox if ı want$")
    public void ıClickBenihatırlaCheckboxIfIWant() throws Throwable {
        WebElement benihatirla= (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("rememberMe")));
        benihatirla.click();

    }


    @And("^ı click girisyap button$")
    public void ıClickGirisyapButton() throws Throwable {
        WebElement girisyap= (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[2]/div[2]/form/fieldset/div[4]/button")));
       girisyap.click();

    }

    @Then("^ı login successfully$")
    public void ıLoginSuccessfully() throws Throwable {
        WebElement girisyap= (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]")));

        Thread.sleep(1000);
    }
}

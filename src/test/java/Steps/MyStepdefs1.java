package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MyStepdefs1 extends BaseUtil {
      public BaseUtil base;
     Random r=new Random();


    public MyStepdefs1(BaseUtil base) {
        this.base = base;
    }

    @And("^ı enter şube sorumlusu ad with correct format$")
    public void ıEnterŞubeSorumlusuAdWithCorrectFormat() throws Throwable {

        WebElement subesorumluad= (new WebDriverWait(base.driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/input[1]")));
        subesorumluad.sendKeys(base.uret());

    }

    @And("^ı enter şube sorumlusu soyad with correct format$")
    public void ıEnterŞubeSorumlusuSoyadWithCorrectFormat() throws Throwable {

        WebElement subesorumlusoyad= (new WebDriverWait(base.driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[1]/div/div[3]/input[2]")));
        subesorumlusoyad.sendKeys(base.uret());

    }

    @And("^ı enter şube sorumlusu telno with correct format$")
    public void ıEnterŞubeSorumlusuTelnoWithCorrectFormat() throws Throwable {

        int randomNumber = r.nextInt(899999) + 1000000;

        WebElement subesorumlutel= (new WebDriverWait(base.driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-po-number")));

        subesorumlutel.sendKeys("212" + randomNumber);

    }
    }


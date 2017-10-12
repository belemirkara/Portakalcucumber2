package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.UUID;


public class Defaultticksservisbilgileri extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();

    public Defaultticksservisbilgileri(BaseUtil base) {
        this.base = base;
    }

    @And("^i want to click nakit$")
    public void iWantToClickNakit() throws Throwable {
        WebElement cash = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("cash")));
        cash.click();
    }

    @And("^i see i cant$")
    public boolean iSeeiCant() throws Throwable {
        try{
            WebDriverWait wait = new WebDriverWait(base.driver, 6);
            wait.until(ExpectedConditions.elementToBeClickable(base.driver.findElement(By.id("cash"))));
            return false;
        }
        catch (Exception e){
            return true;
        }

    }

    @And("^i want to click okk$")
    public void iWantToClickOkk() throws Throwable {
        WebElement occ = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("occ")));
       occ.click();


}

    @And("^i see i cantt$")
    public boolean iSeeiCantt() throws Throwable {
        try{
            WebDriverWait wait = new WebDriverWait(base.driver, 6);
            wait.until(ExpectedConditions.elementToBeClickable(base.driver.findElement(By.id("occ"))));
            return false;
        }
        catch (Exception e){
            return true;
        }

    }
}

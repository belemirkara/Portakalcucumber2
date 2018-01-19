package Steps;

import Base.BaseUtil;
import Pages.DefaultTicksServingPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Random;
import java.util.UUID;


public class Defaultticksserving extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();

    public Defaultticksserving(BaseUtil base) {
        this.base = base;
    }

    @And("^i want to click cash$")
    public void iWantToClickcash() throws Throwable {
  Thread.sleep(3000);
        DefaultTicksServingPage page=new DefaultTicksServingPage(base.driver);
        page.DefaultTicksServingPage();
    }

    @And("^i see i cant$")
    public boolean iSeeiCant() throws Throwable {
        try{
            Thread.sleep(3000);
            DefaultTicksServingPage page=new DefaultTicksServingPage(base.driver);
            WebDriverWait wait = new WebDriverWait(base.driver, 6);
            wait.until(ExpectedConditions.elementToBeClickable(page.cbxcash));
            return false;
        }
        catch (Exception e){
            return true;
        }

    }

    @And("^i want to click okk$")
    public void iWantToClickOkk() throws Throwable {

        Thread.sleep(3000);
        DefaultTicksServingPage page=new DefaultTicksServingPage(base.driver);
       page.DefaultTicksServingPage2();

}

    @And("^i see i cantt$")
    public boolean iSeeiCantt() throws Throwable {
        try{

            Thread.sleep(3000);
            DefaultTicksServingPage page=new DefaultTicksServingPage(base.driver);
            WebDriverWait wait = new WebDriverWait(base.driver, 6);
            wait.until(ExpectedConditions.elementToBeClickable(page.cbxocc));
            return false;
        }
        catch (Exception e){
            return true;
        }

    }
}

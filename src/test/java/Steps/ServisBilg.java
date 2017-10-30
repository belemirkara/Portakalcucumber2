package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.Random;
import java.util.UUID;


public class ServisBilg extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();

    public ServisBilg(BaseUtil base) {

        this.base = base;
    }


    @When("^borek is taken i fill the textfields$")
    public void borekisTakeniFillTheTextfields() throws Throwable {

        WebElement question1 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[1]/textarea")));
        question1.click();
        question1.sendKeys(randomUUiDString);

        WebElement question2 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[2]/textarea")));
        question2.click();
        question2.sendKeys(randomUUiDString);

        WebElement question3 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[3]/textarea")));
        question3.click();
        question3.sendKeys(randomUUiDString);
    }

    @When("^Cafe is taken i fill the textfields$")
    public void cafeisTakeniFillTheTextfields() throws Throwable {

        WebElement question3 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[3]/textarea")));
        question3.click();
        question3.sendKeys(randomUUiDString);

        WebElement question4 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[4]/textarea")));
        question4.click();
        question4.sendKeys(randomUUiDString);

        WebElement question8 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[8]/textarea")));
        question8.click();
        question8.sendKeys(randomUUiDString);

    }

    @When("^cig Kofte is taken i fill the textfields$")
    public void cigKofteisTakeniFillTheTextfields() throws Throwable {

        WebElement question1 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[1]/textarea")));
        question1.click();
        question1.sendKeys(randomUUiDString);

        WebElement question2 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[2]/textarea")));
        question2.click();
        question2.sendKeys(randomUUiDString);

        WebElement question3 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[3]/textarea")));
        question3.click();
        question3.sendKeys(randomUUiDString);
    }

    @When("^cin Mutfagi is taken i fill the textfields$")
    public void cinMutfagiisTakeniFillTheTextfields() throws Throwable {

        WebElement question1 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[1]/textarea")));
        question1.click();
        question1.sendKeys(randomUUiDString);

        WebElement question2 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[2]/textarea")));
        question2.click();
        question2.sendKeys(randomUUiDString);

    }

    @When("^Damacana Su is taken i fill the textfields$")
    public void damacanaSuisTakeniFillTheTextfields() throws Throwable {

        WebElement question1 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[1]/textarea")));
        question1.click();
        question1.sendKeys(randomUUiDString);

        WebElement question2 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[2]/textarea")));
        question2.click();
        question2.sendKeys(randomUUiDString);
    }

    @When("^Deniz Mahsulleri is taken i fill the textfields$")
    public void denizMahsulleriisTakeniFillTheTextfields() throws Throwable {

        List<WebElement> options = base.driver.findElements(By.xpath("//*[@id=\"paymentForm\"]/div[1]/div[2]")) ;
        int index = r.nextInt(options.size());
        options.get(index).click();

        WebElement question3 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[3]/textarea")));
        question3.click();
        question3.sendKeys(randomUUiDString);

    }

    @When("^doner is taken i fill the textfields$")
    public void donerIsTakenIFillTheTextfields() throws Throwable {

        WebElement question1 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[1]/textarea")));
        question1.click();
        question1.sendKeys(randomUUiDString);

        WebElement question2 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[2]/textarea")));
        question2.click();
        question2.sendKeys(randomUUiDString);

    }

    @When("^dunya Mutfagi is taken i fill the textfields$")
    public void dunyaMutfagiIsTakenIFillTheTextfields() throws Throwable {



        WebElement question3 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[3]/textarea")));
        question3.click();
        question3.sendKeys(randomUUiDString);

        WebElement question4 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[4]/textarea")));
        question4.click();
        question4.sendKeys(randomUUiDString);

        WebElement question8 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[8]/textarea")));
        question8.click();
        question8.sendKeys(randomUUiDString);
    }

    @When("^Ev Yemekleri is taken i fill the textfields$")
    public void evYemekleriisTakeniFillTheTextfields() throws Throwable {

        WebElement question1 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[1]/textarea")));
        question1.click();
        question1.sendKeys(randomUUiDString);

        WebElement question2 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[2]/textarea")));
        question2.click();
        question2.sendKeys(randomUUiDString);

    }

    @When("^Fastfood & Sandwich is taken i fill the textfields$")
    public void fastfoodSandwichisTakeniFillTheTextfields() throws Throwable {

        WebElement question1 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[1]/textarea")));
        question1.click();
        question1.sendKeys(randomUUiDString);

        WebElement question2 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[2]/textarea")));
        question2.click();
        question2.sendKeys(randomUUiDString);

    }

    @When("^Japon Mutfagi is taken i fill the textfields$")
    public void japonMutfagiisTakeniFillTheTextfields() throws Throwable {

        WebElement question1 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[1]/textarea")));
        question1.click();
        question1.sendKeys(randomUUiDString);

        WebElement question2 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[2]/textarea")));
        question2.click();
        question2.sendKeys(randomUUiDString);
    }

    @When("^Kebap & Turk Mutfagi is taken i fill the textfields$")
    public void kebapTurkMutfagiisTakeniFillTheTextfields() throws Throwable {

        WebElement question1 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[1]/textarea")));
        question1.click();
        question1.sendKeys(randomUUiDString);

        List<WebElement> options = base.driver.findElements(By.xpath("//*[@id=\"paymentForm\"]/div[2]/div[2]")) ;
        int index = r.nextInt(options.size());
        options.get(index).click();

        WebElement question3 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[3]/textarea")));
        question3.click();
        question3.sendKeys(randomUUiDString);

    }

    @When("^Kokorec is taken i fill the textfields$")
    public void kokorecisTakeniFillTheTextfields() throws Throwable {
        WebElement question2 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[2]/textarea")));
        question2.click();
        question2.sendKeys(randomUUiDString);

        WebElement question3 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[3]/textarea")));
        question3.click();
        question3.sendKeys(randomUUiDString);
    }

    @When("^Kofte is taken i fill the textfields$")
    public void kofteisTakeniFillTheTextfields() throws Throwable {

        WebElement question1 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[1]/textarea")));
        question1.click();
        question1.sendKeys(randomUUiDString);

        WebElement question3 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[3]/textarea")));
        question3.click();
        question3.sendKeys(randomUUiDString);

        WebElement question4 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[4]/textarea")));
        question4.click();
        question4.sendKeys(randomUUiDString);
    }

    @When("^Kumpir is taken i fill the textfields$")
    public void kumpirisTakeniFillTheTextfields() throws Throwable {

        WebElement question1 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[1]/textarea")));
        question1.click();
        question1.sendKeys(randomUUiDString);

        WebElement question2 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[2]/textarea")));
        question2.click();
        question2.sendKeys(randomUUiDString);

        WebElement question3 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[3]/textarea")));
        question3.click();
        question3.sendKeys(randomUUiDString);

        WebElement question4 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[4]/textarea")));
        question4.click();
        question4.sendKeys(randomUUiDString);
    }

    @When("^Pasta & Tatli is taken i fill the textfields$")
    public void pastaTatliisTakeniFillTheTextfields() throws Throwable {
        WebElement question1 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[1]/textarea")));
        question1.click();
        question1.sendKeys(randomUUiDString);

        WebElement question2 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[2]/textarea")));
        question2.click();
        question2.sendKeys(randomUUiDString);

        WebElement question4 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[4]/textarea")));
        question4.click();
        question4.sendKeys(randomUUiDString);

        WebElement question5 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[5]/textarea")));
        question5.click();
        question5.sendKeys(randomUUiDString);

        WebElement question6 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[6]/textarea")));
        question6.click();
        question6.sendKeys(randomUUiDString);
    }


    @When("^Pide is taken i fill the textfields$")
    public void pideisTakeniFillTheTextfields() throws Throwable {

        WebElement question1 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[1]/textarea")));
        question1.click();
        question1.sendKeys(randomUUiDString);

        WebElement question2 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[2]/textarea")));
        question2.click();
        question2.sendKeys(randomUUiDString);
    }

    @When("^Pizza & italyan i fill the textfields$")
    public void pizzaitalyaniFillTheTextfields() throws Throwable {

        WebElement question1 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[1]/textarea")));
        question1.click();
        question1.sendKeys(randomUUiDString);

        WebElement question2 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[2]/textarea")));
        question2.click();
        question2.sendKeys(randomUUiDString);

        WebElement question3 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[3]/textarea")));
        question3.click();
        question3.sendKeys(randomUUiDString);
    }

    @When("^Tavuk is taken i fill the textfields$")
    public void tavukisTakeniFillTheTextfields() throws Throwable {

        WebElement question1 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[1]/textarea")));
        question1.click();
        question1.sendKeys(randomUUiDString);

        WebElement question2 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[2]/textarea")));
        question2.click();
        question2.sendKeys(randomUUiDString);

        WebElement question4 = (new WebDriverWait(base.driver, 5))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"paymentForm\"]/div[4]/textarea")));
        question4.click();
        question4.sendKeys(randomUUiDString);
    }



}


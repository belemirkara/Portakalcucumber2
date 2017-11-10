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

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class reklamjokertekilrestoran extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();


    private Connection connection;
    private static Statement statement;
    private static ResultSet rs;
    public static String FilePath ="//Users//belemir.karabacakoglu//Desktop//templogin.txt";
    public static String fileUserName;
    public static String filePassword;

    public static String FilePathcityselect ="//Users//belemir.karabacakoglu//Desktop//cityselect.txt";
    public static String FilePathdistrictselect ="//Users//belemir.karabacakoglu//Desktop//districtselect.txt";
    public static String FilePathdateselect ="//Users//belemir.karabacakoglu//Desktop//dateselect.txt";

    public static String filecityname;
    public static String filedate;
    public static String filedistrict;


    public reklamjokertekilrestoran(BaseUtil base) {

        this.base = base;
    }


    @When("^i click second option joker$")
    public void iClickSecondOptionJoker() throws Throwable {


        /*   Actions builder = new Actions(base.driver);
        WebElement element = base.driver.findElement(By.xpath("/html/body/div[1]/div/div[4]/div/ul/li[2]/a"));
        builder.moveToElement(element).click().build().perform();
     List<WebElement> options = base.driver.findElements(By.xpath("/html/body/div[1]/div/div[4]/div/ul/li[2]/a/i"));
        for (WebElement opt : options) {

            if (opt.getText().equals("joker")) {
                opt.click(); */
            }

    @Then("^i see contents of joker nedir in first tab$")
    public void iSeeContentsOfJokerNedirInFirstTab() throws Throwable {

        WebElement jokernedir= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("tab_Description")));
        jokernedir.click();
    }

    @When("^i click daha fazla bilgi al button in first tab joker nedir$")
    public void iClickDahaFazlaBilgiAlButtonInFirstTabJokerNedir() throws Throwable {

        WebElement DahaFazlaBilgiAlButton= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[1]/div[1]/div/div/div[1]/div/a[1]")));
        DahaFazlaBilgiAlButton.click();
    }

    @When("^i click joker indirimi tanimla button in first tab joker nedir$")
    public void iClickJokerIndirimiTanimlaButtonInFirstTabJokerNedir() throws Throwable {

        WebElement JokerIndirimiTanimlaButton= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div[1]/div[1]/div/div/div[1]/div/a[2]")));
        JokerIndirimiTanimlaButton.click();
    }

    @Then("^i am sent to third tab joker takvimi page$")
    public void iAmSentToThirdTabJokerTakvimiPage() throws Throwable {

        WebElement JokerTakviminotaktif= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_Register\"]/ng-include/div/div")));




        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        if(!JokerTakviminotaktif.isDisplayed()) {

        WebElement JokerTakvimiPage= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"middle\"]/div[2]/div")));

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        if (JokerTakvimiPage.isDisplayed())
        {

        } else
        {
            Assert.fail();
        }

    }

    else if(JokerTakviminotaktif.isDisplayed()){
            iClickSecondTabRaporlar();
        }
    }

    @When("^i click second tab raporlar$")
    public void iClickSecondTabRaporlar() throws Throwable {

        WebElement SecondTabRaporlar= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("menuReport")));

        SecondTabRaporlar.click();

    }

    @And("^i see calisma Saatlerine Gore Siparis Dagiliminiz table$")
    public void iSeeCalismaSaatlerineGoreSiparisDagiliminizTable() throws Throwable {

        WebElement CalismaSaatlerineGoreSiparisDagiliminizTable= (new WebDriverWait(base.driver, 240))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_Report\"]/ng-include/div/div[2]")));


        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        if (CalismaSaatlerineGoreSiparisDagiliminizTable.isDisplayed())
        {

        } else
        {
            Assert.fail();
        }

    }

    @And("^i see Gonderim Bolgesi Analizi table$")
    public void iSeeGonderimBolgesiAnaliziTable() throws Throwable {

        WebElement GonderimBolgesiAnaliziTable= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_Report\"]/ng-include/div/div[3]")));

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        if (GonderimBolgesiAnaliziTable.isDisplayed())
        {

        } else
        {
            Assert.fail();
        }

    }

    @And("^i click third tab joker takvimi$")
    public void iClickThirdTabJokerTakvimi() throws Throwable {

        WebElement ThirdTabJokerTakvimi= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("menuRegister")));

        ThirdTabJokerTakvimi.click();
    }

    @And("^i choose a radiobutton from Joker Reklaminda Yer Alacak Bir Gorsel Secin$")
    public void iChooseARadiobuttonFromJokerReklamindaYerAlacakBirGorselSecin() throws Throwable {

        WebElement ARadiobuttonFromJokerReklamindaYerAlacakBirGorselSecin= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.name("selectedimage")));
        ARadiobuttonFromJokerReklamindaYerAlacakBirGorselSecin.click();

    }

    @When("^i get a mouse reklam in the navigation bar and i click joker$")
    public void iGetAMouseReklamInTheNavigationBarAndIClickJoker() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement element = base.driver.findElement(By.linkText("Reklam"));

        Actions action = new Actions(base.driver);

        action.moveToElement(element);

        WebElement subElement = base.driver.findElement(By.linkText("Joker"));

        action.moveToElement(subElement);

        action.click();

        action.perform();

    }


}




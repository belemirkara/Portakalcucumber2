package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.UUID;

public class Raporlama extends BaseUtil{

    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();


    private Connection connection;
    private static Statement statement;
    private static ResultSet rs;

    private Connection c;
    private static Statement s;
    private static ResultSet rs1;
    private static String downloadPath = "//Users//belemir.karabacakoglu//Downloads";


    public static String FilePath = "//Users//belemir.karabacakoglu//Desktop//templogin.txt";
    public static String fileUserName;
    public static String filePassword;

    public static String FilePathcityselect = "//Users//belemir.karabacakoglu//Desktop//cityselect.txt";
    public static String FilePathdistrictselect = "//Users//belemir.karabacakoglu//Desktop//districtselect.txt";
    public static String FilePathdateselect = "//Users//belemir.karabacakoglu//Desktop//dateselect.txt";

    public static String filecityname;
    public static String filedate;
    public static String filedistrict;


    public Raporlama(BaseUtil base) {

        this.base = base;
    }


    @When("^i click raporlama in the navigation bar$")
    public void iClickRaporlamaInTheNavigationBar() throws Throwable {

        WebElement raporlama = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[4]/div/ul/li[3]/a")));
        raporlama.click();
    }

    @Then("^i see restoran performans raporlari page$")
    public void iSeeRestoranPerformansRaporlariPage() throws Throwable {

        WebElement PerformansRaporlariPage = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("menuSummaryReport")));

    }

    @And("^i see siparis&ciro trend,gondeirm bolg pazar payi,yeni kullanici orani,siparis frekansi graphs$")
    public void iSeeSiparisCiroTrendGondeirmBolgPazarPayiYeniKullaniciOraniSiparisFrekansiGraphs() throws Throwable {

        WebElement SiparisCiroTrend = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_38\"]/ng-include/div/div[1]/div[1]/div")));

        WebElement GondeirmBolgPazarPayi = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_38\"]/ng-include/div/div[1]/div[1]/div")));

        WebElement YeniKullaniciOrani = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_38\"]/ng-include/div/div[2]/div[1]/div")));

    }
}

package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class Raporlama extends BaseUtil {

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
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_38_server_side\"]/div/div[1]/div[1]")));

        WebElement GondeirmBolgPazarPayi = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_38_server_side\"]/div/div[1]/div[2]")));

        WebElement YeniKullaniciOrani = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_38_server_side\"]/div/div[2]/div[1]")));

        WebElement SiparisFrekansi = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_38_server_side\"]/div/div[2]/div[2]")));

    }

    @When("^i click exceleaktar button$")
    public void iClickExceleaktarButton() throws Throwable {

    
        WebElement ExceleaktarButton = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("green-seagreen")));
        ExceleaktarButton.click();

    }

    @Then("^i click the second tab gonderim bolgeleri$")
    public void iClickTheSecondTabGonderimBolgeleri() throws Throwable {

        WebElement GonderimBolgeleri = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("menuAreaReport")));
        GonderimBolgeleri.click();

    }

    @And("^i see listele button,ay secim combobox,details of gonderim bolg table,bolg gore siparis yuzdesi and bolg gore ciro yuzdesi charts,diger bolg siparis table and diger bolg ciro table$")
    public void iSeeListeleButtonAySecimComboboxDetailsOfGonderimBolgTableBolgGoreSiparisYuzdesiAndBolgGoreCiroYuzdesiChartsDigerBolgSiparisTableAndDigerBolgCiroTable() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.xpath("//*[@id=\"tab_39\"]/ng-include/div/div[2]")).size() > 0;

        if (isPresent == true) {
        } else {

            WebElement aycombobox = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_39\"]/ng-include/div/div[1]/div/select")));

            WebElement listelebutton = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_39\"]/ng-include/div/div[1]/div/a")));

            WebElement table = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.className("dataTables_scroll")));

            WebElement bolggoresiparisyuzdesigraph = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_39\"]/ng-include/div/div[3]/div[1]")));

            WebElement BolgGoreCiroYuzdesigraph = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_39\"]/ng-include/div/div[3]/div[2]")));

            WebElement digerbolgsiparistable = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_39\"]/ng-include/div/div[3]/div[1]/div[2]")));

            WebElement digerbolgcirotable = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_39\"]/ng-include/div/div[3]/div[2]/div[2]")));


        }


    }


    @When("^i choose ay from gonderim bolg ay secim combobox$")
    public void iChooseAyFromGonderimBolgAySecimCombobox() throws Throwable {

        Thread.sleep(1000);

        String[] ay = {"Kasım 2015", "Aralık 2015", "Ocak 2016", "Şubat 2016", "Mart 2016", "Nisan 2016", "Mayıs 2016", "Haziran 2016", "Temmuz 2016", "Ağustos 2016",
                "Eylül 2016", "Ekim 2016", "Kasım 2016", "Aralık 2016", "Ocak 2017", "Şubat 2017", "Mart 2017", "Nisan 2017", "Mayıs 2017", "Haziran 2017",
                "Temmuz 2017", "Ağustos 2017", "Eylül 2017", "Ekim 2017"};

        WebElement Select_ay = (new WebDriverWait(base.driver, 45))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_39\"]/ng-include/div/div[1]/div/select")));
        Select ddlay = new Select(Select_ay);


        int gelenay = r.nextInt(ay.length - 1);


        ddlay.selectByVisibleText(ay[gelenay]);
    }


    @And("^i click listele button in raporlama gonderim bolg$")
    public void iClickListeleButtonInRaporlamaGonderimBolg() throws Throwable {

        WebElement listelebutton = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_39\"]/ng-include/div/div[1]/div/a")));
        listelebutton.click();
    }


    @And("^i click the third tab urun raporu$")
    public void iClickTheThirdTabUrunRaporu() throws Throwable {

        WebElement UrunRaporu = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("menuProductReport")));
        UrunRaporu.click();
    }

    @And("^i see ay secim combobox,listele button,urun grubu combobox,urun grubu bazli satis grafigi charts$")
    public void iSeeAySecimComboboxListeleButtonUrunGrubuComboboxUrunGrubuBazliSatisGrafigiCharts() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        Boolean isPresent = base.driver.findElements(By.xpath("//*[@id=\"tab_41\"]/ng-include/div/div[2]")).size() > 0;

        if (isPresent == true) {
        } else {

            WebElement AySecimCombobox = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_41\"]/ng-include/div/div[1]/div/select")));

            WebElement ListeleButton = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_41\"]/ng-include/div/div[1]/div/a")));

            WebElement UrunGrubuCombobox = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_41\"]/ng-include/div/div[1]/div/div/select")));

            WebElement UrunGrubuBazliSatisGrafigiCharts = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"product-report-table_wrapper\"]/div[2]/div")));


    }
    }
}
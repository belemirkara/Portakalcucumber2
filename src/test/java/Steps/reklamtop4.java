package Steps;

import Base.BaseUtil;
import com.google.common.base.Function;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.net.URL;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class reklamtop4 extends BaseUtil {


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


    public reklamtop4(BaseUtil base) {

        this.base = base;
    }


    @And("^i see i am in portakal homepage$")
    public void iSeeIAmInPortakalHomepage() throws Throwable {

        Thread.sleep(6000);
        try {
            String URL = base.driver.getCurrentUrl();
            Assert.assertEquals(URL, "http://portakal01.ystest.com/");
            Thread.sleep(1000);

        } catch (AssertionError ae) {

            Assert.fail();
        }
    }


    @When("^i click reklam in the navigation bar$")
    public void iClickReklamInTheNavigationBar() throws Throwable {

        WebElement reklam = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[4]/div/ul/li[2]/a")));
        reklam.click();
    }

    @Then("^i see four subtab of reklam are opened$")
    public void iSeeFourSubtabOfReklamAreOpened() throws Throwable {


    }

    @When("^i choose city and restaurant from the combobox$")
    public void iChooseCityAndRestaurantFromTheCombobox() throws Throwable {

/*
        String hostName = "192.168.0.40";
        String dbName = "SALCATEST_MSCRM";
        String user = "CrmSqlUser";
        String password = "CrmSqlPass";
        String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;loginTimeout=30;", hostName, dbName, user, password);

        Connection c = null;
        try {

            System.out.println("Connecting to Database...");
            c = DriverManager.getConnection(url);
            if (c != null) {
                System.out.println("Connected to the Database...");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try{

            String q = "select TOP 1 name,AccountId,new_cityid from Account (NOLOCK) WHERE AccountId is NOT NULL and new_cityid is NOT NULL and new_portalstatus=3 and new_isfinancialmain = 0 and new_financialaccountid is null and new_catalogname IS NOT NULL AND new_categoryname IS NOT NULL AND statecode = 0 AND statuscode = 100000015  order by CreatedOn desc";
            Statement s = c.createStatement();
            rs1 = s.executeQuery(q);


            while(rs1.next())
            {

                String resid = rs1.getString("AccountId");
                String cityid  = rs1.getString("new_cityid");

              try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(FilePath), "utf-8"))) {

                    String result = resid + "|" + cityid;

                    writer.write(result);
                }
  */
        Thread.sleep(3000);

        String urlpage = base.driver.getCurrentUrl();

        StringBuilder sb = new StringBuilder(urlpage);
        sb.append("?");
        sb.append("cityId=");
        sb.append("0C91C581-585C-E511-80CE-005056AA4260");
        sb.append("&restId=");
        sb.append("F3E764C4-C841-E611-80EF-005056AA5C50");
        String newurl = sb.toString();

        base.driver.get(newurl);


         /*       } }catch (SQLException ex) {
            ex.printStackTrace();
        }

        if (c != null) {
            try {
                System.out.println("Closing Database Connection...");
                c.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }
  */
    }

    @Then("^i see contents of top(\\d+) nedir in first tab$")
    public void iSeeContentsOfTopNedirInFirstTab(int arg0) throws Throwable {

        WebElement top4homepage = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("tab-content")));
        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        if (top4homepage.isDisplayed()) {

        } else {
            Assert.fail();
        }

    }


    @When("^i click second tab rezervasyon$")
    public void iClickSecondTabRezervasyon() throws Throwable {

        WebElement secondtabreservation = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("menuReservation")));
        secondtabreservation.click();
    }

    @Then("^i see contents of rezervasyon in second tab$")
    public void iSeeContentsOfRezervasyonInSecondTab() throws Throwable {

        WebElement secondtabreservation = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("tab-content")));

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        if (secondtabreservation.isDisplayed()) {

        } else {
            Assert.fail();
        }

    }


    @And("^i click kampanya tarihi combobox$")
    public void iClickKampanyaTarihiCombobox() throws Throwable {

        WebElement kampanyatarihi = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("bs_1_0")));
        kampanyatarihi.click();

    }

    @And("^i click the clickable option from the kampanya tarihi combobox$")
    public void iClickTheClickableOptionFromTheKampanyaTarihiCombobox() throws Throwable {

        Thread.sleep(3000);


        base.driver.manage().deleteAllCookies();


        JavascriptExecutor js = (JavascriptExecutor) base.driver;


        js.executeScript("function getrandomNumber(){var rndnumber = Math.floor((Math.random() * 5) + 1); console.log('rnd',rndnumber); return rndnumber; };___SeleniumHelper.DropDown(\"bs_1_0\").selectOption(getrandomNumber());");
        js.executeScript("___SeleniumHelper.DropDown(\"bs_1_0\").getValue(function(val){  })");
        js.executeScript("___SeleniumHelper.DropDown(\"bs_1_0\").getValue(function(val){ window.targetValue = val.dropdown_selected_value.date });");
        js.executeScript("targetValue");


    }


    @And("^i click kampanya turu combobox$")
    public void iClickKampanyaTuruCombobox() throws Throwable {

        WebElement kampanyaturu= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("bs_3_0")));
        kampanyaturu.click();
    }

    @And("^i click the first clickable option from the kampanya turu combobox$")
    public void iClickTheFirstClickableOptionFromTheKampanyaTuruCombobox() throws Throwable {

        Thread.sleep(3000);

        JavascriptExecutor js1 = (JavascriptExecutor)base.driver;

        js1.executeScript("___SeleniumHelper.DropDown(\"bs_2_0\").selectOption(1);");
        js1.executeScript("___SeleniumHelper.DropDown(\"bs_2_0\").getValue()");


    }

    @And("^i click aylik fatura tutari combobox$")
    public void iClickAylikFaturaTutariCombobox() throws Throwable {

        WebElement ayliktutar= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("bs_3_0")));
        ayliktutar.click();
    }

    @And("^i click the clickable option from the aylik fatura tutari combobox$")
    public void iClickTheClickableOptionFromTheAylikFaturaTutariCombobox() throws Throwable {
        JavascriptExecutor js = (JavascriptExecutor)base.driver;



        js.executeScript("___SeleniumHelper.DropDown(\"bs_3_0\").selectOption(1);");
        js.executeScript("___SeleniumHelper.DropDown(\"bs_3_0\").getValue(function(val){ console.log(val); })");
        js.executeScript("___SeleniumHelper.DropDown(\"bs_3_0\").getValue(function(val){ window.targetValue1 = val.dropdown_selected_value.Description });");
        js.executeScript("targetValue1");
        }

    @And("^i click ekle button$")
    public void iClickEkleButton() throws Throwable {

      while(base.driver.findElement(By.id("FullyBookedBtn")).isDisplayed()){

            iClickKampanyaTarihiCombobox();
            iClickTheClickableOptionFromTheKampanyaTarihiCombobox();
            iClickKampanyaTuruCombobox();
            iClickTheFirstClickableOptionFromTheKampanyaTuruCombobox();
            iClickAylikFaturaTutariCombobox();
            iClickTheClickableOptionFromTheAylikFaturaTutariCombobox();

        }
            WebElement eklebutton = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("addReservationBtn")));
            eklebutton.click();

            WebElement aktifsemtuyarisibutton = (new WebDriverWait(base.driver, 90))
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/div[2]/div[6]")));


            if (aktifsemtuyarisibutton.isDisplayed()) {

                WebElement tamambutton = (new WebDriverWait(base.driver, 90))
                        .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/div[2]/button[1]")));
                tamambutton.click();
                iClickTheClickableOptionFromTheKampanyaTarihiCombobox();
                iClickKampanyaTuruCombobox();
                iClickTheFirstClickableOptionFromTheKampanyaTuruCombobox();
                iClickAylikFaturaTutariCombobox();
                iClickTheClickableOptionFromTheAylikFaturaTutariCombobox();

            }
        }

    @And("^i see sepetim field$")
    public void iSeeSepetimField() throws Throwable {

        WebElement sepetim= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("reservationSummary")));
        sepetim.click();
    }

    @And("^i click satin al button$")
    public void iClickSatinAlButton() throws Throwable {

        WebElement satinalbutton= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("reservationBuy")));
        satinalbutton.click();
    }

    @Then("^i see Secmis oldugunuz rezervasyonlar faturalariniza eklenecektir Onayliyor musunuz pop up")
    public void iSeeSecmisOldugunuzRezervasyonlarFaturalarinizaEklenecektirOnayliyorMusunuzPopUp() throws Throwable {

        try {


            base.driver.findElement(By.id("reservationWarningMessage")).click();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {


        }base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }

    @When("^i click vazgec button$")
    public void iClickVazgecButton() throws Throwable {

        WebElement vazgecbutton= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/div[2]/button[2]")));
        vazgecbutton.click();
    }

    @Then("^i see i cant buy this rezervation$")
    public void iSeeICantBuyThisRezervation() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        Boolean isPresent = base.driver.findElements(By.id("reservationSummary")).size() > 0;

        if(isPresent==true) {


        }else if(isPresent==false) {
            Assert.fail();

        }
    }

    @When("^i click onayla button$")
    public void iClickOnaylaButton() throws Throwable {
           Thread.sleep(3000);
        WebElement onaylabutton= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/div[2]/button[1]")));
        onaylabutton.click();
    }

    @Then("^i see Rezervasyon Listeniz Basariyla Kayit Edilmistir pop up$")
    public void iSeeRezervasyonListenizBasariylaKayitEdilmistirPopUp() throws Throwable {
        try {


            base.driver.findElement(By.id("reservationSuccessMessage")).click();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {


        }base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

    }

    @And("^i click tamam button in Rezervasyon Listeniz Basariyla Kayit Edilmistir pop up$")
    public void iClickTamamButtonInRezervasyonListenizBasariylaKayitEdilmistirPopUp() throws Throwable {

        WebElement tamambutton= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/div[2]/button[1]")));
        tamambutton.click();

    }

    @And("^i see the reservation is came in satin alimlar field$")
    public void iSeeTheReservationIsCameInSatinAlimlarField() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        Boolean isPresent = base.driver.findElements(By.id("pastTop4List")).size() > 0;

        if(isPresent==true) {


        }else if(isPresent==false) {
            Assert.fail();

        }

    }

    @When("^i click eksi button$")
    public void iClickEksiButton() throws Throwable {

        WebElement eksibutton= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("listBtn")));
        eksibutton.click();

    }

    @Then("^i see the satin alimlar field is reduced$")
    public void iSeeTheSatinAlimlarFieldIsReduced() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        Boolean isPresent = base.driver.findElements(By.xpath("//*[@id=\"tab_Reservation\"]/ng-include/div/div/div[2]/div/div[1]")).size() > 0;

        if(isPresent==true) {
            Assert.fail();
        }else if(isPresent==false) {


        }


    }

    @When("^i click arti button$")
    public void iClickArtiButton() throws Throwable {

        WebElement artibutton= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_Reservation\"]/ng-include/div/div/div[2]/h3/i[2]")));
        artibutton.click();
    }

    @Then("^i see the satin alimlar field is opened again$")
    public void iSeeTheSatinAlimlarFieldIsOpenedAgain() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        Boolean isPresent = base.driver.findElements(By.xpath("//*[@id=\"tab_Reservation\"]/ng-include/div/div/div[2]/div/div[1]")).size() > 0;

        if(isPresent==true) {

            Assert.fail();
        }else if(isPresent==false) {


        }
    }


    @Then("^i click the third tab bilgiler$")
    public void iClickTheThirdTabBilgiler() throws Throwable {

        WebElement thirdtabbilgiler= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("menuInfo")));
        thirdtabbilgiler.click();
    }

    @And("^i see the content of bilgiler page$")
    public void iSeeTheContentOfBilgilerPage() throws Throwable {

        WebElement contentbilgiler= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("tab_Info")));
        contentbilgiler.click();
    }

     @When("^i click the fourth tab semt raporu$")
     public void iClickTheFourthTabSemtRaporu() throws Throwable {

        WebElement semtraporu= (new WebDriverWait(base.driver, 90))
                 .until(ExpectedConditions.presenceOfElementLocated(By.id("menuReport")));
         semtraporu.click();
     }


    @And("^i see the content of semt raporu page$")
    public void iSeeTheContentOfSemtRaporuPage() throws Throwable {

        WebElement semtraporu= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("tab_Description")));
        semtraporu.click();
    }

    @And("^i choose same city from il combobox$")
    public void iChooseSameCityFromIlCombobox() throws Throwable {

        try(BufferedReader br = new BufferedReader(new FileReader(Login.FilePath))) {

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            String everything = sb.toString();

            filecityname = everything;

            WebElement il = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("citySelectBox_")));
            Select ddlil = new Select(il);


            ddlil.selectByVisibleText(filecityname);

            Thread.sleep(3000);
        }
    }

    @And("^i choose same district from semt combobox$")
    public void iChooseSameDistrictFromSemtCombobox() throws Throwable {

        try(BufferedReader br = new BufferedReader(new FileReader(Login.FilePath))) {

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            String everything = sb.toString();

            filedistrict = everything;

            WebElement semt = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("districtSelectBox")));
            Select ddlil = new Select(semt);


            ddlil.selectByVisibleText(filedistrict);

            Thread.sleep(3000);
        }
    }

    @And("^i choose same date from tarih combobox$")
    public void iChooseSameDateFromTarihCombobox() throws Throwable {

        try(BufferedReader br = new BufferedReader(new FileReader(Login.FilePath))) {

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();

            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
            }

            String everything = sb.toString();

            filedate = everything;

            WebElement tarih = (new WebDriverWait(base.driver, 45))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("districtSelectBox")));
            Select ddlil = new Select(tarih);


            ddlil.selectByVisibleText(filedate);

            Thread.sleep(3000);
        }
    }

    @And("^i click listele button$")
    public void iClickListeleButton() throws Throwable {

        WebElement listelebutton= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("filterBtn")));
        listelebutton.click();
    }

    @Then("^i see reservation in the field which i bought in rezervasyon tab$")
    public void iSeeReservationInTheFieldWhichIBoughtInRezervasyonTab() throws Throwable {


        Thread.sleep(3000);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate localDate = LocalDate.now();
        String date=dtf.format(localDate);



        if(base.driver.getPageSource().contains(date)){

            if(base.driver.getPageSource().contains("YEMEKSEPETI/belemir.karabacak"))
            {



                }

            }

            else
            {
                Assert.fail();
            } }

    @When("^i click the last tab toplu top(\\d+)$")
    public void iClickTheLastTabTopluTop(int arg0) throws Throwable {
        WebElement lasttabtoplutop4= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("menuBulkReservation")));
        lasttabtoplutop4.click();
    }

    @Then("^i see date and excel field in the page$")
    public void iSeeDateAndExcelFieldInThePage() throws Throwable {

        WebElement dateselect= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("selectDateBtn")));

        WebElement excelfile= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("reservationFile")));

    }

    @And("^i click tarih combobox$")
    public void iClickTarihCombobox() throws Throwable {
      base.driver.findElement(By.id("selectDateBtn")).click();

    }

    @And("^i click choose file button$")
    public void iClickChooseFileButton() throws Throwable {
        base.driver.findElement(By.id("reservationFile")).click();
    }

    @And("^i add a file$")
    public void iAddAFile() throws Throwable {
        WebElement excelfile= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("reservationFile")));
        excelfile.sendKeys("//Users//belemir.karabacakoglu//Desktop//EmptyBulkTop4.xlsx");
    }

    @And("^i click gonder button$")
    public void iClickGonderButton() throws Throwable {

        WebElement gonderbutton = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("sendTop4Btn")));
              gonderbutton.click();
    }

    @Then("^i see the records in saved,being under seven points and unsaved fields$")
    public void iSeeTheRecordsInSavedBeingUnderSevenPointsAndUnsavedFields() throws Throwable {

        WebElement gonderbutton = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("collapse_danger")));
        gonderbutton.click();
    }

    @Then("^i click excele aktar button$")
    public void iClickExceleAktarButton() throws Throwable {

        WebElement ExceleAktarButton = (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.className("green-seagreen")));
        ExceleAktarButton.click();
    }

    @And("^i see the excel was downloaded$")
    public boolean iSeeTheExcelWasDownloaded(String dirPath, String ext) throws Throwable {

        boolean flag = false;
        File dir = new File(dirPath);
        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            flag = false;
        }

        for (int i = 1; i < files.length; i++) {
            if (files[i].getName().contains(ext)) {
                flag = true;
            }
        }
        return flag;


    }



    @Then("^i see saved lines in confirmed field$")
    public void iSeeSavedLinesInConfirmedField() throws Throwable {

    }


    @When("^i click daha fazla bilgi al button in first tab top(\\d+) nedir$")
    public void iClickDahaFazlaBilgiAlButtonInFirstTabTopNedir(int arg0) throws Throwable {

        WebElement dahafazlabilgialbutton= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("getInfoBtn")));
        dahafazlabilgialbutton.click();
    }

    @When("^i click top(\\d+) alani rezerve et button in first tab top(\\d+) nedir$")
    public void iClickTopAlaniRezerveEtButtonInFirstTabTopNedir(int arg0, int arg1) throws Throwable {

        WebElement rezerveetbutonu= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("reserveTop4")));
        rezerveetbutonu.click();

    }

    @And("^i click sil button$")
    public void iClickSilButton() throws Throwable {

        WebElement silbutonu= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"deleteReservation\"]")));
        silbutonu.click();

        Thread.sleep(3000);

    }

    @Then("^i see sepetim field is empty$")
    public void iSeeSepetimFieldIsEmpty() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        Boolean isPresent = base.driver.findElements(By.id("reservationSummary")).size() > 0;

        if(isPresent==true) {

            Assert.fail();

        }else if(isPresent==false) {


        } }

    @Then("^i see Eklediginiz TOP(\\d+) rezervasyonu silinecektir devam etmek istiyor musunuz pop up$")
    public void iSeeEklediginizTOPRezervasyonuSilinecektirDevamEtmekIstiyorMusunuzPopUp(int arg0) throws Throwable {
        try {

            Thread.sleep(3000);
            base.driver.findElement(By.id("reservationdeleteQuestion")).click();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {


        }base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


    }

    @And("^i confirm Eklediginiz TOP(\\d+) rezervasyonu silinecektir devam etmek istiyor musunuz pop up$")
    public void iConfirmEklediginizTOPRezervasyonuSilinecektirDevamEtmekIstiyorMusunuzPopUp(int arg0) throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try{
            WebElement silmepopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("reservationdeleteQuestion")));

            String ab = silmepopup.getText();

            Assert.assertEquals("Eklediğiniz TOP4 rezervasyonu silinecektir, devam etmek istiyor musunuz?", ab);
            Thread.sleep(3000);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^i confirm Secmis oldugunuz rezervasyonlar faturalariniza eklenecektir Onayliyor musunuz pop up$")
    public void iConfirmSecmisOldugunuzRezervasyonlarFaturalarinizaEklenecektirOnayliyorMusunuzPopUp() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try{
            WebElement satinalpopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("reservationWarningMessage")));

            String ab = satinalpopup.getText();

            Assert.assertEquals("Seçmiş olduğunuz rezervasyonlar faturalarınıza eklenecektir. Onaylıyor musunuz?", ab);
            Thread.sleep(3000);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^i confirm Rezervasyon Listeniz Basariyla Kayit Edilmistir pop up$")
    public void iConfirmRezervasyonListenizBasariylaKayitEdilmistirPopUp() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);


        try{
            WebElement reservasyonalmapopup= (new WebDriverWait(base.driver, 15))
                    .until(ExpectedConditions.presenceOfElementLocated(By.id("reservationSuccessMessage")));

            String ab = reservasyonalmapopup.getText();

            Assert.assertEquals("Rezervasyon Listeniz Başarıyla Kayıt Edilmiştir", ab);
            Thread.sleep(3000);

        } catch(AssertionError ae) {

            Assert.fail();
        }


    }

    @And("^i get semt and write$")
    public void iGetSemtAndWrite() throws Throwable {


        WebElement semt= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"reservation-table-body\"]/tr[1]/td[1]")));

       String filedistrict= semt.getText();

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(FilePathdistrictselect), "utf-8"))) {

            writer.write(filedistrict);
        }
    }


    @And("^i click a date from tarih combobox$")
    public void iClickADateFromTarihCombobox() throws Throwable {

        List<WebElement> options = base.driver.findElements(By.id("selectDateBtn"));
        int index = options.size();
        int gelendate=r.nextInt(index-1);
        options.get(gelendate).click();
    }


    @And("^i enter kullaniciadi and pw as admin$")
    public void iEnterKullaniciadiAndPwAsAdmin() throws Throwable {

        WebElement username= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
        username.click();

        username.sendKeys("Yemeksepeti/belemir.karabacak");

        WebElement password= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
        password.click();

        password.sendKeys("13101988");
    }


    @And("^i confirm the excel$")
    public void iConfirmTheExcel() throws Throwable {

        Assert.assertTrue("Failed to download document which has extension .xls",iSeeTheExcelWasDownloaded(downloadPath, ".xls"));

    }

    @When("^i get first option TOP(\\d+)$")
    public void iGetFirstOptionTOP(int arg0) throws Throwable {

        String urlpage = base.driver.getCurrentUrl();

        StringBuilder sb = new StringBuilder(urlpage);
        sb.append("/selfservice/top4");

        String newurl = sb.toString();

        base.driver.get(newurl);

    }
}




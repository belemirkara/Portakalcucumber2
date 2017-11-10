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
    public static String FilePath ="//Users//belemir.karabacakoglu//Desktop//templogin.txt";
    public static String fileUserName;
    public static String filePassword;

    public static String FilePathcityselect ="//Users//belemir.karabacakoglu//Desktop//cityselect.txt";
    public static String FilePathdistrictselect ="//Users//belemir.karabacakoglu//Desktop//districtselect.txt";
    public static String FilePathdateselect ="//Users//belemir.karabacakoglu//Desktop//dateselect.txt";

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
            Assert.assertEquals(URL, "http://portakal01.ystest.com/" );
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

        /*WebElement reklamssubtab= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/div/div[4]/div/ul/li[2]/a/i")));
        reklamssubtab.click(); */

    }

    @When("^i click first option TOP(\\d+)$")
    public void iClickFirstOptionTOP(int arg0) throws Throwable {

        List<WebElement> options = base.driver.findElements(By.xpath("/html/body/div[1]/div/div[4]/div/ul/li[2]/a/i"));
        for (WebElement opt : options) {

            if (opt.getText().equals("TOP4")) {
                opt.click();
    }}}


    @When("^i choose city from the city combobox in top(\\d+) s homepage$")
    public void iChooseCityFromTheCityComboboxInTopSHomepage(int arg0) throws Throwable {

        Thread.sleep(1000);

        WebElement city= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("citySelectBox")));
        city.click();


        Set<Cookie> allcookies = driver.manage().getCookies();

        String[] sehir = {"ADANA", "ADIYAMAN", "AFYONKARAHİSAR", "AKSARAY", "AMASYA", "ANKARA", "ANTALYA", "AYDIN", "BALiKESİR", "BATMAN", "BİLECİK",
                "BOLU", "BURSA", "ÇANAKKALE", "ÇORUM", "DENİZLİ", "DİYARBAKiR", "DÜZCE", "EDİRNE", "ELAZiĞ", "ERZİNCAN", "ERZURUM", "ESKİŞEHİR",
                "GAZİANTEP", "GİRESUN", "HATAY", "ISPARTA", "İSTANBUL", "İZMİR", "KAHRAMANMARAŞ", "KARABÜK", "KASTAMONU", "KAYSERİ", "KIBRIS", "KiRKLARELİ", "KiRŞEHİR",
                "KOCAELİ", "KONYA", "KÜTAHYA", "MALATYA", "MANİSA", "MARDİN", "MERSİN", "MUĞLA", "NEVŞEHİR", "NİĞDE", "ORDU", "OSMANİYE", "RİZE", "SAKARYA", "SAMSUN", "ŞANLIURFA",
                "SİNOP", "SİVAS", "TEKİRDAĞ", "TOKAT", "TRABZON", "UŞAK", "VAN", "YALOVA", "YOZGAT", "ZONGULDAK"};


        List<WebElement> options = base.driver.findElements(By.cssSelector("#citySelectBox > div > ul"));


        int gelensehir = r.nextInt(sehir.length-1);

        String array=sehir[gelensehir];


        for (WebElement opt : options) {

            if(opt.getAttribute("ck").equals(array)) {

                opt.click();


                }

            }

        Thread.sleep(3000);

        try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                new FileOutputStream(FilePathcityselect), "utf-8"))) {

            String result =sehir[gelensehir];

            writer.write(result);
        }

    }


    @When("^i choose restaurant from the restoran combobox in top(\\d+)'s homepage$")
    public void iChooseRestaurantFromTheRestoranComboboxInTopSHomepage(int arg0) throws Throwable {

        List<WebElement> options = base.driver.findElements(By.xpath("//*[@id=\"restaurantSelectBox\"]/div/ul"));

        WebElement restoran= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurantSelectBox")));
        restoran.click();

        int index = options.size();
         int gelenrestoran = r.nextInt(index-1);
        options.get(gelenrestoran).click();

    }

    @Then("^i see contents of top(\\d+) nedir in first tab$")
    public void iSeeContentsOfTopNedirInFirstTab(int arg0) throws Throwable {

        WebElement top4homepage= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("tab_Description")));
        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        if (top4homepage.isDisplayed())
        {

        } else
        {
            Assert.fail();
        }

    }



    @When("^i click second tab rezervasyon$")
    public void iClickSecondTabRezervasyon() throws Throwable {

        WebElement secondtabreservation= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("menuReservation")));
        secondtabreservation.click();
    }

    @Then("^i see contents of rezervasyon in second tab$")
    public void iSeeContentsOfRezervasyonInSecondTab() throws Throwable {

        WebElement secondtabreservation= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"middle\"]/div[2]/div")));

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        if (secondtabreservation.isDisplayed())
        {

        } else
        {
            Assert.fail();
        }

    }


    @And("^i click kampanya tarihi combobox$")
    public void iClickKampanyaTarihiCombobox() throws Throwable {

        WebElement kampanyatarihi= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"bs_1_0\"]/div/button")));
        kampanyatarihi.click();

    }

    @And("^i click the clickable option from the kampanya tarihi combobox$")
    public void iClickTheClickableOptionFromTheKampanyaTarihiCombobox() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);


                List<WebElement> dropdown=base.driver.findElements(By.xpath(" //*[@id=\"bs_1_0_dd\"]/li[3]/a"));


             int gelenkampanya= r.nextInt(dropdown.size());

             for(int i=0;i<=dropdown.size();i++){

                   if(i==gelenkampanya) {

                       WebElement element = dropdown.get(i);
                       element.click();

                   } } }

    @And("^i click kampanya turu combobox$")
    public void iClickKampanyaTuruCombobox() throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        WebElement kampanyaturu= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"bs_2_0\"]/div")));
        kampanyaturu.click();
    }

    @And("^i click the first clickable option from the kampanya turu combobox$")
    public void iClickTheFirstClickableOptionFromTheKampanyaTuruCombobox() throws Throwable {

        List<WebElement> dropdown2 = base.driver.findElements(By.id("bs_2_0_dd"));

       String a= base.driver.findElement(By.id("bs_2_0_dd")).getAttribute("data-size");
        String b= base.driver.findElement(By.id("bs_2_0_dd")).getAttribute("data-option");

        int sonuc=Integer.valueOf(a.toString());

        for(int i=0;i<=sonuc;i++){

           if(b.equals("Aylık Rezervasyon")){

               WebElement element = dropdown2.get(i);
               element.click();


        }}}

    @And("^i click aylik fatura tutari combobox$")
    public void iClickAylikFaturaTutariCombobox() throws Throwable {

        WebElement ayliktutar= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("bs_3_0")));
        ayliktutar.click();
    }

    @And("^i click the clickable option from the aylik fatura tutari combobox$")
    public void iClickTheClickableOptionFromTheAylikFaturaTutariCombobox() throws Throwable {

        List<WebElement> dropdown3 = base.driver.findElements(By.id("bs_3_0_dd"));

        int aylikfatura= r.nextInt(dropdown3.size());

        for(int i=0;i<=dropdown3.size();i++){

            if(i==aylikfatura) {

                WebElement element = dropdown3.get(i);
                element.click();


    }}}

    @And("^i click ekle button$")
    public void iClickEkleButton() throws Throwable {

        WebElement eklebutton= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"reservation-table-body\"]/tr[1]/td[7]/a")));
        eklebutton.click();
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
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"table-container\"]/table[2]/tbody/tr[4]/td/a/span")));
        satinalbutton.click();
    }

    @Then("^i see Secmis oldugunuz rezervasyonlar faturalariniza eklenecektir Onayliyor musunuz pop up")
    public void iSeeSecmisOldugunuzRezervasyonlarFaturalarinizaEklenecektirOnayliyorMusunuzPopUp() throws Throwable {

        try {


            base.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[6]")).click();
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

        WebElement onaylabutton= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/div[2]/button[1]")));
        onaylabutton.click();
    }

    @Then("^i see Rezervasyon Listeniz Basariyla Kayit Edilmistir pop up$")
    public void iSeeRezervasyonListenizBasariylaKayitEdilmistirPopUp() throws Throwable {
        try {


            base.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[6]")).click();
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

        Boolean isPresent = base.driver.findElements(By.xpath("//*[@id=\"tab_Reservation\"]/ng-include/div/div/div[2]")).size() > 0;

        if(isPresent==true) {


        }else if(isPresent==false) {
            Assert.fail();

        }

    }

    @When("^i click eksi button$")
    public void iClickEksiButton() throws Throwable {

        WebElement eksibutton= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_Reservation\"]/ng-include/div/div/div[2]/h3/i[2]")));
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
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"districtSelectBox\"]/div/button")));
            Select ddlil = new Select(tarih);


            ddlil.selectByVisibleText(filedate);

            Thread.sleep(3000);
        }
    }

    @And("^i click listele button$")
    public void iClickListeleButton() throws Throwable {

        WebElement listelebutton= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_Report\"]/ng-include/div/div[1]/a")));
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
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_BulkReservation\"]/ng-include/div/div[1]/div[2]/form/div[1]/div[1]/select")));

        WebElement excelfile= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("reservationFile")));

    }

    @And("^i click tarih combobox$")
    public void iClickTarihCombobox() throws Throwable {
      base.driver.findElement(By.xpath("//*[@id=\"tab_BulkReservation\"]/ng-include/div/div[1]/div[2]/form/div[1]/div[1]/select")).click();

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
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"tab_BulkReservation\"]/ng-include/div/div[1]/div[2]/form/div[2]/button")));
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
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @And("^i see the excel was downloaded$")
    public void iSeeTheExcelWasDownloaded() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Then("^i see saved lines in confirmed field$")
    public void iSeeSavedLinesInConfirmedField() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }


    @When("^i click daha fazla bilgi al button in first tab top(\\d+) nedir$")
    public void iClickDahaFazlaBilgiAlButtonInFirstTabTopNedir(int arg0) throws Throwable {

        WebElement dahafazlabilgialbutton= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[1]/div/a[1]")));
        dahafazlabilgialbutton.click();
    }

    @When("^i click top(\\d+) alani rezerve et button in first tab top(\\d+) nedir$")
    public void iClickTopAlaniRezerveEtButtonInFirstTabTopNedir(int arg0, int arg1) throws Throwable {

        WebElement rezerveetbutonu= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[3]/div/div[1]/div/div/div[1]/div/a[2]")));
        rezerveetbutonu.click();

    }

    @And("^i click sil button$")
    public void iClickSilButton() throws Throwable {

        WebElement silbutonu= (new WebDriverWait(base.driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"table-container\"]/table[1]/tbody/tr/td[4]/i")));
        silbutonu.click();

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


            base.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[6]")).click();
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
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/div[2]/div[6]")));

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
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/div[2]/div[6]")));

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
                    .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/div[2]/div[6]")));

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

        List<WebElement> options = base.driver.findElements(By.xpath("//*[@id=\"tab_BulkReservation\"]/ng-include/div/div[1]/div[2]/form/div[1]/div[1]/select"));
        int index = options.size();
        int gelendate=r.nextInt(index-1);
        options.get(gelendate).click();
    }


    @And("^i enter kullaniciadi and pw as admin$")
    public void iEnterKullaniciadiAndPwAsAdmin() throws Throwable {

    }
}




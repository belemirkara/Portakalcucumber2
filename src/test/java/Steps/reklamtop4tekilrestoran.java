package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.sql.*;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

public class reklamtop4tekilrestoran extends BaseUtil {


    public BaseUtil base;
    Random r = new Random();
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    private Connection connection;
    private static Statement statement;
    private static ResultSet rs;
    public static String FilePath = "//Users//belemir.karabacakoglu//Desktop//templogin.txt";
    public static String fileUserName;
    public static String filePassword;

    public static String FilePathcityselect = "//Users//belemir.karabacakoglu//Desktop//cityselect.txt";
    public static String FilePathdistrictselect = "//Users//belemir.karabacakoglu//Desktop//districtselect.txt";
    public static String FilePathdateselect = "//Users//belemir.karabacakoglu//Desktop//dateselect.txt";

    public static String filecityname;
    public static String filedate;
    public static String filedistrict;


    public reklamtop4tekilrestoran(BaseUtil base) {

        this.base = base;
    }


    @And("^i enter kullaniciadi and pw as an tekil restaurant from db$")
    public void iEnterKullaniciadiAndPwAsAnTekilRestaurantFromDb() throws Throwable {
        String hostName = "192.168.0.40";
        String dbName = "SALCATEST_MSCRM";
        String user = "CrmSqlUser";
        String password = "CrmSqlPass";
        String url = String.format("jdbc:sqlserver://%s:1433;database=%s;user=%s;password=%s;loginTimeout=30;", hostName, dbName, user, password);

        Connection connection = null;
        try {
            //Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
            System.out.println("Connecting to Database...");
            connection = DriverManager.getConnection(url);
            if (connection != null) {
                System.out.println("Connected to the Database...");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        try {

            String query = "select TOP 1 name,new_accountusername,new_accountpassword from Account (NOLOCK) WHERE new_accountusername is NOT NULL and new_accountpassword is NOT NULL and new_portalstatus=3 and new_isfinancialmain = 0 and new_financialaccountid is null and new_catalogname IS NOT NULL AND new_categoryname IS NOT NULL AND statecode = 0 AND statuscode = 100000015  order by CreatedOn desc";
            statement = connection.createStatement();
            rs = statement.executeQuery(query);

            while (rs.next()) {

                String username = rs.getString("new_accountusername");
                String passwrd = rs.getString("new_accountpassword");

                try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                        new FileOutputStream(FilePath), "utf-8"))) {

                    String result = username + "-" + passwrd;

                    writer.write(result);
                }


                base.driver.findElement((By.id("username"))).sendKeys(username);
                base.driver.findElement((By.id("password"))).sendKeys(passwrd);


            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        if (connection != null) {
            try {
                System.out.println("Closing Database Connection...");
                connection.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

    }

    @And("^i confirm top(\\d+) pop up$")
    public void iConfirmTopPopUp(int arg0) throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

    try

    {
        WebElement top4popup = (new WebDriverWait(base.driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/div[2]/div[6]")));

        String ab = top4popup.getText();

        Assert.assertEquals("TOP4 reklamları sadece puanı 7.0 ve yukarısında olan restoranlarda yayınlanabilmektedir.Seçimlerinize uygun olarak restoran puanınız seçtiğiniz aylarda 7.0 ve üzerindeyse reklamlarınız ikinci bir onaya gerek duyulmadan otomatik olarak yayına alınacaktır.", ab);
        Thread.sleep(3000);

    } catch(AssertionError ae) {

        Assert.fail();

    }

}

    @And("^i see top(\\d+) pop up$")
    public void iSeeTopPopUp(int arg0) throws Throwable {

        base.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

        try {


            base.driver.findElement(By.xpath("/html/body/div[6]/div[2]/div[6]")).click();
            Thread.sleep(1000);

            Alert alt3 = base.driver.switchTo().alert();
            alt3.accept();

        } catch (NoAlertPresentException noe) {


        }
        base.driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);



    }


    @And("^i click tamam button in rezervation top(\\d+) pop up$")
    public void iClickTamamButtonInRezervationTopPopUp(int arg0) throws Throwable {

        WebElement top4popuptamambutton = (new WebDriverWait(base.driver, 15))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[6]/div[2]/button[1]")));

        top4popuptamambutton.click();
    }
}



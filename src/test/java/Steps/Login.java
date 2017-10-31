package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;


import java.sql.*;

public class Login extends BaseUtil {

    public BaseUtil base;
    UUID uuid = UUID.randomUUID();
    String randomUUiDString = uuid.toString();
    Random r = new Random();
    private Connection connection;
    private static Statement statement;
    private static ResultSet rs;
    public static String FilePath ="//Users//belemir.karabacakoglu//Desktop//templogin.txt";
    public static String fileUserName;
    public static String filePassword;

    public Login(BaseUtil base) {


        this.base = base;
    }

    @And("^i enter kullaniciadi and pw from db$")
    public void iEnterKullaniciadiAndPwFromDb() throws Throwable {

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

                       try{

                    String query = "select TOP 1 * from Account (NOLOCK) WHERE new_accountusername is NOT NULL and new_accountpassword is NOT NULL and new_portalstatus=1 order by CreatedOn desc";
                    statement = connection.createStatement();
                    rs = statement.executeQuery(query);

                   while(rs.next())
                   {

                       String username = rs.getString("new_accountusername");
                       String passwrd  = rs.getString("new_accountpassword");

                       try (Writer writer = new BufferedWriter(new OutputStreamWriter(
                               new FileOutputStream(FilePath), "utf-8"))) {

                           String result = username + "-" + passwrd;

                           writer.write(result);
                       }



                        base.driver.findElement((By.id("username"))).sendKeys(username);
                        base.driver.findElement((By.id("password"))).sendKeys(passwrd);


                } }catch (SQLException ex) {
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

    @And("^i click benihatirla checkbox if i want$")
    public void iClickBenihatirlaCheckboxifiWant() throws Throwable {

        WebElement benihatirla = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("rememberMe")));
        benihatirla.click();
        Thread.sleep(3000);

    }


    @And("^i click girisyap button$")
    public void iClickGirisyapButton() throws Throwable {

        WebElement girisyap = (new WebDriverWait(base.driver, 30))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[2]/div[1]/div[1]/div/div[2]/div[2]/form/fieldset/div[4]/button")));
        girisyap.click();

        Thread.sleep(3000);

    }

    @Then("^i login successfully$")
    public void iLoginSuccessfully() throws Throwable {

        Thread.sleep(3000);
        try {
            String URL = base.driver.getCurrentUrl();
            Assert.assertEquals(URL, "http://portakal.ystest.com/SelfRegistration/registrationwizard/commercial");
            Thread.sleep(3000);
        } catch (AssertionError ae) {

            Assert.fail();
        }
    }

    @Given("^i navigate to login page$")
    public void iNavigateToLoginPage() throws Throwable {
        base.driver.navigate().to("http://portakal.ystest.com");
        Thread.sleep(1000);

    }


}

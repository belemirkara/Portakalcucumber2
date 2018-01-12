package Steps;

import Base.BaseUtil;
import Model.UserModel;
import Pages.LoginPage;
import Repository.Repo;
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
   public static UserModel user1 = null;

    public Login(BaseUtil base) {


        this.base = base;
    }

    @And("^i enter username and pw from db$")
    public void iEnterusernameAndPwFromDb() throws Throwable {

        Repo repo = new Repo(base);

        user1 = repo.GetUser();



        LoginPage page = new LoginPage(base.driver);
        page.Login1(user1.UserName, user1.Password);
    }

    @And("^i click rememberme checkbox$")
    public void iClickremembermeCheckbox() throws Throwable {

        LoginPage page=new LoginPage(base.driver);

        page.Click1();


        Thread.sleep(3000);

    }


    @And("^i click login button$")
    public void iClickloginButton() throws Throwable {

        LoginPage page=new LoginPage(base.driver);

        page.Click2();

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

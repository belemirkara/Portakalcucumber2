package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


    public LoginPage(WebDriver driver){

    PageFactory.initElements(driver,this);

}



    @FindBy(how=How.ID,using="username")
    public WebElement txtusername;

    @FindBy(how=How.ID,using="password")
    public WebElement txtpassword;

    @FindBy(how=How.ID,using="rememberMe")
    public WebElement buttonrememberme;

    @FindBy(how=How.XPATH,using="/html/body/div[2]/div[1]/div[1]/div/div[2]/div[2]/form/fieldset/div[4]/button")
    public WebElement buttonsignup;



    public void Login1(String sUsername,String sPassword){

        txtusername.sendKeys(sUsername);
        txtpassword.sendKeys(sPassword);
    }

    public void Click1(){
        buttonrememberme.click();
    }
    public void Click2(){
        buttonsignup.click();
    }
}

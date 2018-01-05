package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelfregPage {

    public SelfregPage(WebDriver driver){

        PageFactory.initElements(driver,this);

    }


    @FindBy(how= How.ID,using="restaurant-name")
    public WebElement fieldrestaurantname;

    @FindBy(how=How.ID,using="restaurant-city")
    public WebElement fieldrestaurantcity;

    @FindBy(how=How.ID,using="restaurant-county")
    public WebElement fieldrestaurantcountry;

    @FindBy(how=How.ID,using="restaurant-address")
    public WebElement fieldrestaurantaddress;

    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[1]/div/div[2]/input[1]")
    public WebElement fieldrestaurantownername;

    @FindBy(how=How.ID,using="/html/body/div[1]/div/div[1]/div/div[2]/input[2]")
    public WebElement fieldrestaurantownersurname;

    @FindBy(how=How.ID,using="restaurant-owner-phone")
    public WebElement fieldrestaurantownerno;

    @FindBy(how=How.ID,using="restaurant-owner-email")
    public WebElement fieldrestaurantno;

    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[1]/div/div[6]/input[1]")
    public WebElement fieldfirstemail;

    @FindBy(how=How.XPATH,using="/html/body/div[1]/div/div[1]/div/div[6]/input[2]")
    public WebElement fieldlastemail;

    @FindBy(how=How.ID,using="register-my-restaurant")
    public WebElement buttonregister;

    @FindBy(how=How.XPATH,using="/html/body/div[2]/div[1]/div[1]/div/div[1]/div[2]/a")
    public WebElement buttonsignup;

    @FindBy(how=How.ID,using="restaurantRegisterSuccessMessage")
    public WebElement successpopupregister;

    @FindBy(how=How.ID,using="restaurant-district")
    public WebElement fieldrestaurantdistrict;

    public void Register1(String sfieldrestaurantname) {

        fieldrestaurantname.sendKeys(sfieldrestaurantname);
    }

    public void Register2(String sfieldrestaurantcountry,String sfieldrestaurantaddress){

        fieldrestaurantcountry.sendKeys(sfieldrestaurantcountry);
        fieldrestaurantaddress.sendKeys(sfieldrestaurantaddress);
    }

    public void Register3(String sfieldrestaurantcountry,String sfieldrestaurantownersurname){

        fieldrestaurantownername.sendKeys(sfieldrestaurantcountry);
        fieldrestaurantownersurname.sendKeys(sfieldrestaurantownersurname);
    }

    public void Register4(String sfieldrestaurantownerno,String sfieldrestaurantno){

        fieldrestaurantownerno.sendKeys(sfieldrestaurantownerno);
        fieldrestaurantno.sendKeys(sfieldrestaurantno);
    }

    public void Register5(String sfieldfirstemail,String sfieldlastemail){

        fieldfirstemail.sendKeys(sfieldfirstemail);
        fieldlastemail.sendKeys(sfieldlastemail);
    }
    public void Click(){

        buttonregister.click();
        buttonsignup.click();
    }


}

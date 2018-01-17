package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ContactInformationPage {


    public ContactInformationPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.ID, using = "registerTab0")
    public WebElement contactinformationtab;

    @FindBy(how = How.ID, using = "ownerName")
    public WebElement fieldownername;

    @FindBy(how = How.ID, using = "ownerLastName")
    public WebElement fieldownerLastName;

    @FindBy(how = How.ID, using = "restaurant-owner-phone")
    public WebElement fieldrestaurantownerphone;

    @FindBy(how = How.ID, using = "managerName")
    public WebElement fieldmanagerName;

    @FindBy(how = How.ID, using = "managerLastName")
    public WebElement fieldmanagerLastName;

    @FindBy(how = How.ID, using = "restaurant-po-number")
    public WebElement fieldrestaurantponumber;

    @FindBy(how = How.ID, using = "restaurant-phone")
    public WebElement fieldrestaurantphone;

    @FindBy(how = How.ID, using = "restaurant-owner-email")
    public WebElement fieldrestaurantowneremail;

    @FindBy(how = How.ID, using = "btnSave")
    public WebElement buttonbtnSave;

    @FindBy(how = How.ID, using = "btnSaveAndContinue")
    public WebElement buttonbtnSaveAndContinue;

    @FindBy(how = How.ID, using = "1")
    public WebElement contactinformationsuccesspopup;

    @FindBy(how = How.XPATH, using ="/html/body/div[2]/div[2]/button[1]")
    public WebElement buttonok;

    @FindBy(how = How.ID, using = "username")
    public WebElement fieldusername;

    @FindBy(how = How.ID, using = "password")
    public WebElement fieldpassword;


    public void Contact15(String sfieldusername,String sfieldpassword){

        fieldusername.sendKeys(sfieldusername);
        fieldpassword.sendKeys(sfieldpassword);
    }








    public void Contact1(){

        contactinformationtab.click();

    }

    public void Contact2(String sfieldownername){
        fieldownername.clear();
        fieldownername.sendKeys(sfieldownername);

    }

    public void Contact3(String sfieldownerLastName){
        fieldownerLastName.clear();
        fieldownerLastName.sendKeys(sfieldownerLastName);

    }

    public void Contact4(String sfieldrestaurantownerphone){
        fieldrestaurantownerphone.clear();
        fieldrestaurantownerphone.sendKeys(sfieldrestaurantownerphone);

    }

    public void Contact5(String sfieldmanagerName){
        fieldmanagerName.clear();
        fieldmanagerName.sendKeys(sfieldmanagerName);

    }

    public void Contact6(String sfieldmanagerLastName){
        fieldmanagerLastName.clear();
        fieldmanagerLastName.sendKeys(sfieldmanagerLastName);

    }

    public void Contact7(String sfieldrestaurantponumber){
        fieldrestaurantponumber.clear();
        fieldrestaurantponumber.sendKeys(sfieldrestaurantponumber);

    }

    public void Contact8(String sfieldrestaurantphone){
        fieldrestaurantphone.clear();
        fieldrestaurantphone.sendKeys(sfieldrestaurantphone);

    }

    public void Contact9(String sfieldrestaurantowneremail){
        fieldrestaurantowneremail.clear();
        fieldrestaurantowneremail.sendKeys(sfieldrestaurantowneremail);

    }

    public void Contact14(){

        contactinformationsuccesspopup.click();

    }

    public void Contact10(){

        buttonbtnSave.click();

    }

    public void Contact11(){

        buttonbtnSaveAndContinue.click();

    }

    public void Contact12(){

        buttonbtnSaveAndContinue.click();

    }


    public void Contact13(){

        buttonok.click();

    }

    public void Contact18(){

        contactinformationsuccesspopup.click();

    }

}



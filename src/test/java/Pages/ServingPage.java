package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ServingPage {


    public ServingPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.ID, using = "registerTab2")
    public WebElement servingtab;

    @FindBy(how = How.ID, using = "restaurant-kitchen")
    public WebElement kitchenselection;

    @FindBy(how = How.XPATH, using = "//*[@id=\"paymentForm\"]/div[1]/textarea")
    public WebElement fieldquestion1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"paymentForm\"]/div[2]/textarea")
    public WebElement fieldquestion2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"paymentForm\"]/div[3]/textarea")
    public WebElement fieldquestion3;

    @FindBy(how = How.XPATH, using = "//*[@id=\"paymentForm\"]/div[4]/textarea")
    public WebElement fieldquestion4;

    @FindBy(how = How.XPATH, using = "//*[@id=\"paymentForm\"]/div[5]/textarea")
    public WebElement fieldquestion5;

    @FindBy(how = How.XPATH, using = "//*[@id=\"paymentForm\"]/div[6]/textarea")
    public WebElement fieldquestion6;

    @FindBy(how = How.XPATH, using = "//*[@id=\"paymentForm\"]/div[7]/textarea")
    public WebElement fieldquestion7;

    @FindBy(how = How.XPATH, using = "//*[@id=\"paymentForm\"]/div[8]/textarea")
    public WebElement fieldquestion8;

    @FindBy(how = How.CLASS_NAME, using = "checker")
    public WebElement checkboxdm;

    @FindBy(how = How.CLASS_NAME, using = "checked")
    public WebElement checkboxdm1;

    @FindBy(how = How.ID, using = "1")
    public WebElement fieldsuccessconfirmation;


    public void Serving1() {

        servingtab.click();
    }


    public void Serving2(String sfieldquestion1) {

        fieldquestion1.click();
        fieldquestion1.clear();
        fieldquestion1.sendKeys(sfieldquestion1);

    }

    public void Serving3(String sfieldquestion2) {

        fieldquestion2.click();
        fieldquestion2.clear();
        fieldquestion2.sendKeys(sfieldquestion2);

    }

    public void Serving4(String sfieldquestion3) {

        fieldquestion3.click();
        fieldquestion3.clear();
        fieldquestion3.sendKeys(sfieldquestion3);

    }

    public void Serving5(String sfieldquestion4) {

        fieldquestion4.click();
        fieldquestion4.clear();
        fieldquestion4.sendKeys(sfieldquestion4);

    }

    public void Serving6(String sfieldquestion5) {

        fieldquestion5.click();
        fieldquestion5.clear();
        fieldquestion5.sendKeys(sfieldquestion5);

    }

    public void Serving7(String sfieldquestion6) {

        fieldquestion6.click();
        fieldquestion6.clear();
        fieldquestion6.sendKeys(sfieldquestion6);

    }


    public void Serving8(String sfieldquestion7) {

        fieldquestion7.click();
        fieldquestion7.clear();
        fieldquestion7.sendKeys(sfieldquestion7);

    }

    public void Serving9(String sfieldquestion8) {

        fieldquestion8.click();
        fieldquestion8.clear();
        fieldquestion8.sendKeys(sfieldquestion8);

    }

    public void Serving10() {

        fieldsuccessconfirmation.click();

    }

    public void Serving11() {
        fieldquestion1.clear();
        fieldquestion4.clear();
        fieldquestion6.clear();
    }


}
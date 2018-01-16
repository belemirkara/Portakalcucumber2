package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CommercialInformationPage {


    public CommercialInformationPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.ID, using = "legalName")
    public WebElement fieldcommercialtitle;

    @FindBy(how = How.ID, using = "taxoffice")
    public WebElement fieldtaxoffice;

    @FindBy(how = How.ID, using = "legalType")
    public WebElement fieldlegalType;

    @FindBy(how = How.ID, using = "identitynumber")
    public WebElement fieldTCKN;

    @FindBy(how = How.ID, using = "mersisnumber")
    public WebElement fieldmersisno;

    @FindBy(how = How.ID, using = "registerTab1")
    public WebElement tabcommercial;

    @FindBy(how = How.ID, using = "taxnumber")
    public WebElement fieldtaxnumber;

    @FindBy(how = How.ID, using = "earchivemailaddress")
    public WebElement fieldinvoiceemail;

    @FindBy(how = How.ID, using = "ibannumber")
    public WebElement fieldiban;

    @FindBy(how = How.ID, using = "1")
    public WebElement confirmationmessage;

    @FindBy(how = How.ID, using = "kepaddress")
    public WebElement filedkepaddress;


    public void Commercial1(String sfieldcommercialtitle) {
        fieldcommercialtitle.click();
        fieldcommercialtitle.clear();
        fieldcommercialtitle.sendKeys(sfieldcommercialtitle);

    }

    public void Commercial2(String sfieldtaxoffice) {
        fieldtaxoffice.click();
        fieldtaxoffice.clear();
        fieldtaxoffice.sendKeys(sfieldtaxoffice);

    }

    public void Commercial3(String sidentitynumber) {
        fieldTCKN.click();
        fieldTCKN.sendKeys(sidentitynumber);

    }

    public void Commercial4(String sfieldmersisno) {
        fieldmersisno.click();
        fieldmersisno.clear();
        fieldmersisno.sendKeys(sfieldmersisno);

    }

    public void Commercial5(String sfieldtaxnumber) {
        fieldtaxnumber.click();
        fieldtaxnumber.sendKeys(sfieldtaxnumber);

    }

    public void Commercial6() {
        tabcommercial.click();

    }

    public void Commercial7(String sfieldinvoiceemail) {
        fieldinvoiceemail.click();
        fieldinvoiceemail.clear();
        fieldinvoiceemail.sendKeys(sfieldinvoiceemail);

    }

    public void Commercial8(String sfieldiban) {
        fieldiban.click();
        fieldiban.clear();
        fieldiban.sendKeys(sfieldiban);

    }

    public void Commercial9(String sfiledkepaddress) {
        filedkepaddress.click();
        filedkepaddress.clear();
        filedkepaddress.sendKeys(sfiledkepaddress);

    }
}


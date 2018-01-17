package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CommercialInfoFormatControlPage {

    public CommercialInfoFormatControlPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.ID, using = "identitynumber")
    public WebElement fieldTCKN3;

    @FindBy(how = How.ID, using = "legalType")
    public WebElement fieldlegalType3;

    @FindBy(how = How.ID, using = "mersisnumber")
    public WebElement fieldmersisno3;

    @FindBy(how = How.ID, using = "taxnumber")
    public WebElement fieldtaxnumber3;

    @FindBy(how = How.ID, using = "earchivemailaddress")
    public WebElement fieldinvoiceemail3;

    @FindBy(how = How.ID, using = "ibannumber")
    public WebElement fieldiban3;

    @FindBy(how = How.ID, using = "3")
    public WebElement commercialconfirmationmessage;

    @FindBy(how = How.ID, using = "kepaddress")
    public WebElement fieldkepaddress3;

    @FindBy(how = How.ID, using = "emailerror")
    public WebElement popupemailerror;


    public void CommercialInfoFormatControl1(String sfieldTCKN3) {

        fieldTCKN3.click();
        fieldTCKN3.clear();
        fieldTCKN3.sendKeys(sfieldTCKN3);

    }

    public void CommercialInfoFormatControl2(String sfieldtaxnumber3) {

        fieldtaxnumber3.click();
        fieldtaxnumber3.clear();
        fieldtaxnumber3.sendKeys(sfieldtaxnumber3);

    }

    public void CommercialInfoFormatControl3(String sfieldiban3) {

        fieldiban3.click();
        fieldiban3.clear();
        fieldiban3.sendKeys(sfieldiban3);

    }


    public void CommercialInfoFormatControl4(String sfieldkepaddress3) {

        fieldkepaddress3.click();
        fieldkepaddress3.clear();
        fieldkepaddress3.sendKeys(sfieldkepaddress3);

    }

    public void CommercialInfoFormatControl5(String sfieldlegalType3) {

        fieldlegalType3.click();
        fieldlegalType3.clear();
        fieldlegalType3.sendKeys(sfieldlegalType3);

    }

    public void CommercialInfoFormatControl6(String sfieldmersisno3) {

        fieldmersisno3.click();
        fieldmersisno3.clear();
        fieldmersisno3.sendKeys(sfieldmersisno3);

    }

    public void CommercialInfoFormatControl7(String sfieldinvoiceemail3) {

        fieldinvoiceemail3.click();
        fieldinvoiceemail3.clear();
        fieldinvoiceemail3.sendKeys(sfieldinvoiceemail3);

    }

    public void CommercialInfoFormatControl8() {

        popupemailerror.click();

        }
}
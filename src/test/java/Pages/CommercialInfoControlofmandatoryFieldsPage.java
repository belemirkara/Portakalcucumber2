package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class CommercialInfoControlofmandatoryFieldsPage {


    public CommercialInfoControlofmandatoryFieldsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.ID, using = "3")
    public WebElement commercialfailPopUp;

    @FindBy(how = How.ID, using = "legalName")
    public WebElement fieldcommercialtitle2;

    @FindBy(how = How.ID, using = "taxoffice")
    public WebElement fieldtaxoffice2;

    @FindBy(how = How.ID, using = "legalType")
    public WebElement fieldlegalType2;

    @FindBy(how = How.ID, using = "identitynumber")
    public WebElement fieldTCKN2;

    @FindBy(how = How.ID, using = "mersisnumber")
    public WebElement fieldmersisno2;

    @FindBy(how = How.ID, using = "ibannumber")
    public WebElement fieldiban2;

    @FindBy(how = How.ID, using = "earchivemailaddress")
    public WebElement fieldinvoiceemail2;

    @FindBy(how = How.ID, using = "taxnumber")
    public WebElement fieldtaxnumber2;





    public void CommercialInfoControlofmandatory1() {

        commercialfailPopUp.click();

    }

    public void CommercialInfoControlofmandatory2() {

        fieldcommercialtitle2.clear();

    }

    public void CommercialInfoControlofmandatory3() {
        fieldtaxoffice2.clear();
    }

    public void CommercialInfoControlofmandatory4() {
        fieldTCKN2.click();
        fieldTCKN2.clear();
    }

    public void CommercialInfoControlofmandatory5(String sgetfieldmersisno ) {
        fieldmersisno2.click();
        fieldmersisno2.clear();
        fieldmersisno2.sendKeys(sgetfieldmersisno);
    }

    public void CommercialInfoControlofmandatory6() {

        fieldiban2.click();
        fieldiban2.clear();
    }

    public void CommercialInfoControlofmandatory7() {
        fieldinvoiceemail2.clear();
        fieldinvoiceemail2.clear();
    }


    public void CommercialInfoControlofmandatory8() {

        fieldmersisno2.click();
        fieldmersisno2.clear();
    }

    public void CommercialInfoControlofmandatory9() {
        fieldtaxnumber2.click();
        fieldtaxnumber2.clear();
    }

}



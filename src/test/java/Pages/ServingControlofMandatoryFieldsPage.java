package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ServingControlofMandatoryFieldsPage {


    public ServingControlofMandatoryFieldsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.ID, using = "creditCard")
    public WebElement cbxcreditCard;

    @FindBy(how = How.CLASS_NAME, using = "alert-warning")
    public WebElement mandatoryalert;

    @FindBy(how = How.ID, using = "ticket")
    public WebElement cbxticket;

    @FindBy(how = How.ID, using = "ticketFoodCheck")
    public WebElement cbxticketFoodCheck;

    @FindBy(how = How.ID, using = "sodexo")
    public WebElement cbxsodexo;

    @FindBy(how = How.ID, using = "sodexoCheck")
    public WebElement cbxsodexoCheck;

    @FindBy(how = How.ID, using = "multinet")
    public WebElement cbxmultinet;

    @FindBy(how = How.ID, using = "setCard")
    public WebElement cbxsetCard;

    @FindBy(how = How.ID, using = "metropol")
    public WebElement cbxmetropol;

    @FindBy(how = How.ID, using = "wallet")
    public WebElement cbxwallet;


    public void ServingControlofMandatoryField() {

        cbxticket.click();
    }


    public void ServingControlofMandatoryField1() {

        cbxcreditCard.click();
    }


    public void ServingControlofMandatoryField2() {

        cbxticketFoodCheck.click();
    }

    public void ServingControlofMandatoryField3() {

        cbxsodexo.click();

    }

    public void ServingControlofMandatoryField4() {

        cbxsodexoCheck.click();

    }

    public void ServingControlofMandatoryField5() {

        cbxmultinet.click();


    }

    public void ServingControlofMandatoryField6() {

        cbxsetCard.click();


    }


    public void ServingControlofMandatoryField7() {

        cbxmetropol.click();


    }

    public void ServingControlofMandatoryField8() {

        cbxwallet.click();


    }

}

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


    @FindBy(how = How.ID, using = "ownerName")
    public WebElement fieldrestaurantownername2;

    @FindBy(how = How.ID, using = "ownerLastName")
    public WebElement fieldrestaurantownersurname2;

    @FindBy(how = How.ID, using = "restaurant-owner-phone")
    public WebElement fieldrestaurantownerno2;

    @FindBy(how = How.ID, using = "restaurant-phone")
    public WebElement fieldrestaurantno2;

    @FindBy(how = How.ID, using = "restaurant-owner-email")
    public WebElement fieldrestaurantmail2;

    @FindBy(how = How.ID, using = "2")
    public WebElement failpopup;

    @FindBy(how = How.ID, using = "managerName")
    public WebElement fieldmanagername2;

    @FindBy(how = How.ID, using = "managerLastName")
    public WebElement fieldmanagersurname2;

    @FindBy(how = How.ID, using = "restaurant-po-number")
    public WebElement fieldmanagerno2;

    @FindBy(how = How.CLASS_NAME, using = ("alert-warning"))
    public WebElement txtcontactmandatory;

    @FindBy(how = How.ID, using = ("btnSave"))
    public WebElement BUTTONSave;

    @FindBy(how = How.ID, using = ("btnSaveAndContinue"))
    public WebElement BUTTONSaveandcontinue;

    public void ContactInfoMandatory1() {

        fieldrestaurantownername2.clear();
    }

    public void ContactInfoMandatory2() {

        fieldrestaurantownersurname2.clear();

    }

    public void ContactInfoMandatory3() {
        fieldrestaurantownerno2.clear();
    }

    public void ContactInfoMandatory4() {

        fieldrestaurantno2.clear();
    }

    public void ContactInfoMandatory5() {

        fieldrestaurantmail2.clear();
    }

    public void ContactInfoMandatory6() {

        failpopup.click();
    }

    public void ContactInfoMandatory7() {

        fieldmanagername2.clear();
    }


    public void ContactInfoMandatory8() {

        fieldmanagersurname2.clear();
    }

    public void ContactInfoMandatory9() {

        fieldmanagerno2.clear();
    }

}

}

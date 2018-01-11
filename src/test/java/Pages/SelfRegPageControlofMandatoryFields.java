package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SelfRegPageControlofMandatoryFields {

    public SelfRegPageControlofMandatoryFields(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.XPATH, using = "html/body/div[1]/div/div[1]/div/div[3]/input[1]")
    public WebElement fieldmanagername;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[3]/input[2]")
    public WebElement fieldmanagersurname;

    @FindBy(how = How.ID, using = "restaurant-po-number")
    public WebElement fieldmanagerno;

    @FindBy(how = How.XPATH, using = "html/body/div[2]/div[2]/div[6]")
    public WebElement failpopup;




    public void Manager1(String sfieldmanagername){

        fieldmanagername.sendKeys(sfieldmanagername);

    }

    public void Manager2(String sfieldmanagersurname){

        fieldmanagersurname.sendKeys(sfieldmanagersurname);

    }

    public void Manager3(String sfieldmanagerno){

        fieldmanagerno.sendKeys(sfieldmanagerno);

    }

}




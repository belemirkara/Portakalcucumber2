package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ServingControlofMandatoryofQuestionsPage {


    public ServingControlofMandatoryofQuestionsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[6]")
    public WebElement servingfailpopup;



    public void ServingControlofMandatoryofQuestions() {

        servingfailpopup.click();
    }


}
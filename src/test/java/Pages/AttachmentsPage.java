package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AttachmentsPage {

    public AttachmentsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.ID, using ="registerTab5")
    public WebElement attachmentstab;

    @FindBy(how = How.XPATH, using ="/html/body/div[1]/div/div[1]/div[1]/div[5]/div/div[2]/button")
    public WebElement brochurebutton;

    @FindBy(how = How.XPATH, using ="/html/body/div[1]/div/div[1]/div[1]/div[10]/div/div[2]/button")
    public WebElement signboardbutton;

    @FindBy(how = How.ID, using ="cb1")
    public WebElement acceptancecriteriaradiobutton;

    @FindBy(how = How.ID, using ="btnSaveAndContinue")
    public WebElement saveandcontinuebuttonattachemnts;

    @FindBy(how = How.ID, using ="1")
    public WebElement attachmentssuccesspopup;


    public void Attachments() {

        attachmentstab.click();
    }

    public void Attachments2(String sbrochurebutton) {

        brochurebutton.click();
        brochurebutton.sendKeys(sbrochurebutton);
    }


}

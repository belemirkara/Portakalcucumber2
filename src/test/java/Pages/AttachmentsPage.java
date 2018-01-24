package Pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.List;

public class AttachmentsPage {

    public AttachmentsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.ID, using = "registerTab5")
    public WebElement attachmentstab;

    @FindBy(how = How.ID, using ="uploadButton_0")
    public WebElement button0;

    @FindBy(how = How.ID, using ="uploadButton_4")
    public WebElement button4;

    @FindBy(how = How.ID, using ="uploadButton_5")
    public WebElement button5;

    @FindBy(how = How.ID, using = "termsAgreementCheckbox")
    public WebElement acceptancecriteriaradiobutton;

    @FindBy(how = How.ID, using = "btnSaveAndContinue")
    public WebElement saveandcontinuebuttonattachemnts;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[6]")
    public WebElement attachmentssuccesspopup;




    public void Attachments() {

        attachmentstab.click();
    }

    public void Attachments2() {

        button0.click();

    }
    public void Attachments7() {

        button4.click();
    }

    public void Attachments8() {

        button5.click();

        }


    public void Attachments4() {
        acceptancecriteriaradiobutton.click();
    }

    public void Attachments5() {

        saveandcontinuebuttonattachemnts.click();
    }


    public void Attachments6() {

        attachmentssuccesspopup.click();
    }
}
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AttachmentControlofMandatoryFieldsPage {

    public AttachmentControlofMandatoryFieldsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.ID, using = "uploadButton_1")
    public WebElement button1;

    @FindBy(how = How.ID, using = "uploadButton_2")
    public WebElement button2;

    @FindBy(how = How.ID, using = "uploadButton_3")
    public WebElement button3;

    @FindBy(how = How.ID, using = "deleteAttachment_0_0")
    public WebElement deletebutton0;


    @FindBy(how = How.ID, using = "deleteAttachment_1_0")
    public WebElement deletebutton1;


    @FindBy(how = How.ID, using = "deleteAttachment_2_0")
    public WebElement deletebutton2;


    @FindBy(how = How.ID, using = "deleteAttachment_3_0")
    public WebElement deletebutton3;


    @FindBy(how = How.ID, using = "deleteAttachment_4_0")
    public WebElement deletebutton4;


    @FindBy(how = How.ID, using = "deleteAttachment_5_0")
    public WebElement deletebutton5;



    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[6]")
    public WebElement attachmentfailpopup;

    public void AttachmentControlofMandatoryFields1(){

        button1.click();
    }

    public void AttachmentControlofMandatoryFields2(){

        button2.click();
    }

    public void AttachmentControlofMandatoryFields3(){

        button3.click();
    }

    public void AttachmentControlofMandatoryFields5(){

        deletebutton0.click();
    }
    public void AttachmentControlofMandatoryFields6(){

        deletebutton1.click();
    }
    public void AttachmentControlofMandatoryFields7(){

        deletebutton2.click();
    }

    public void AttachmentControlofMandatoryFields8(){

        deletebutton3.click();
    }

    public void AttachmentControlofMandatoryFields9(){

        deletebutton4.click();
    }

    public void AttachmentControlofMandatoryFields10(){

        deletebutton5.click();
    }
    public void AttachmentControlofMandatoryFields4(){

        attachmentfailpopup.click();
    }
}

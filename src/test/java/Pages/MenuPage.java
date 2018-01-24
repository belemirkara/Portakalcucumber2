package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MenuPage {

    public MenuPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div[1]/div[5]/div[2]/div/div/div[3]/a")
    public WebElement menubutton;

    @FindBy(how = How.ID, using = "exampleInputPassword1")
    public WebElement productname;

    @FindBy(how = How.XPATH, using = "(//*[@id=\"exampleInputPassword1\"])[2]")
    public WebElement productcontent;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/div/div[4]/div/div[2]/form/div[2]/a")
    public WebElement menuaddbutton;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/div/div[4]/div/div[2]/table/tbody/tr[1]/td[1]")
    public WebElement prodctnameintable;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/div/div[4]/div/div[2]/table/tbody/tr[1]/td[2]")
    public WebElement prodctcontentintable;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/div/div[4]/div/div[2]/table/tbody/tr[2]/td[3]/button")
    public WebElement seconddeletebutton;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/div/textarea[1]")
    public WebElement textarea1;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div/div/textarea[4]")
    public WebElement textarea4;

    @FindBy(how = How.ID, using = "1")
    public WebElement menusuccesspopup;


    public void Menu1(){
        menubutton.click();
    }

    public void Menu2(String productnames){
        productname.click();
        productname.sendKeys(productnames);
    }

    public void Menu3(String productcontents){
        productcontent.click();
        productcontent.sendKeys(productcontents);
    }
    public void Menu4(){
        menuaddbutton.click();
    }

    public void Menu5(String textareas){
        textarea1.click();
        textarea1.sendKeys(textareas);
        textarea4.click();
        textarea4.sendKeys(textareas);
    }

    public void Menu6(){
        seconddeletebutton.click();
    }

    public void Menu7(){
        menusuccesspopup.click();
    }
}

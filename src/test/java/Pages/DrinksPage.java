package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.text.DecimalFormat;
import java.util.List;

public class DrinksPage {


    public DrinksPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div[1]/div[5]/div[1]/div/div/div[3]/a")
    public WebElement createdrinkmenubutton;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[1]/div[2]/div/a")
    public WebElement adddrinkmenubutton;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[1]/div[2]/div/ul")
    public List<WebElement> options1;


    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[1]/div[2]/div[1]/input")
    public WebElement drinknamefield;


    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[1]/div[2]/div[2]/input")
    public WebElement drinkpricefield;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[1]/div[2]/div[3]/button")
    public WebElement createbutton;

    @FindBy(how = How.ID, using = "show-list-button")
    public WebElement listbutton;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]")
    public WebElement addeddrinks;

    @FindBy(how = How.ID, using = "check_3001")
    public WebElement firstproduct;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[1]/div[3]/input")
    public WebElement enterpricefield;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[1]/div[4]/button")
    public WebElement addbutton;


    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[6]")
    public WebElement alertpopup;

    @FindBy(how = How.ID, using = "dropdownMenu1")
    public WebElement selectiondropdown;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/button[2]")
    public WebElement disclaimbutton;


    public void Drink1(){

        createdrinkmenubutton.click();
    }

    public void Drink2(){

        adddrinkmenubutton.click();
    }

    public void Drink3(String sdrinknamefield){

        drinknamefield.click();
        drinknamefield.sendKeys(sdrinknamefield);

    }

    public void Drink4(){

        drinkpricefield.click();




    }

    public void Drink5(){

        createbutton.click();


    }

    public void Drink6(){

        listbutton.click();


    }

    public void Drink7(){

        firstproduct.click();


    }

    public void Drink12(){

        alertpopup.click();


    }
    public void Drink8(String senterpricefield){

        enterpricefield.click();
        DecimalFormat myFormatter = new DecimalFormat(senterpricefield);
        enterpricefield.sendKeys(senterpricefield);

    }

    public void Drink9(){

        addbutton.click();


    }

    public void Drink10(){

        selectiondropdown.click();


    }

    public void Drink11(){

        disclaimbutton.click();


    }
}

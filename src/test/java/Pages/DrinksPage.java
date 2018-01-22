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

    @FindBy(how = How.ID, using = "customNotes")
    public WebElement customnotes;

    @FindBy(how = How.CLASS_NAME, using = "beverage-list")
    public WebElement productlist;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[2]/div[1]/label")
    public WebElement productlist2;


    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[11]/div[1]/label")
    public WebElement productlist3;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[1]/div[3]/input")
    public WebElement enterpricefield;


    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[2]/div[3]/input")
    public WebElement enterpricefield2;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[1]/div[4]/button")
    public WebElement addbutton;


    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[2]/div[4]/button")
    public WebElement addbutton2;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[11]/div[4]/button")
    public WebElement addbutton3;

    @FindBy(how = How.CLASS_NAME, using = "dropdown")
    public WebElement addbuttondropdown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"addedBeveragesList\"]/tbody/tr/td[1]")
    public WebElement addeddrinks1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"addedBeveragesList\"]/tbody/tr[2]/td[1]")
    public WebElement addeddrinks2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"addedBeveragesList\"]/tbody/tr[3]/td[1]")
    public WebElement addeddrinks3;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[6]")
    public WebElement alertpopup;

    @FindBy(how = How.ID, using = "dropdownMenu1")
    public WebElement selectiondropdown;

    @FindBy(how = How.CLASS_NAME, using = "dropdown-menu")
    public List<WebElement> dropdown;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/button[2]")
    public WebElement disclaimbutton;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[11]/div[3]/input")
    public WebElement comboboxenterprice;


    @FindBy(how = How.ID, using = "check_aa4da079-c0c3-e711-80fa-00505692008b")
    public WebElement optionatom;

    @FindBy(how = How.XPATH, using = "//*[@id=\"addedBeveragesList\"]/tbody/tr[2]/td[2]")
    public WebElement addedoptions2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"addedBeveragesList\"]/tbody/tr[3]/td[2]")
    public WebElement addedoptions3;



    public void Drink1(){

        createdrinkmenubutton.click();
    }

    public void Drink88(){

        optionatom.click();
    }

    public void Drink2(){

        adddrinkmenubutton.click();
    }

    public void Drink3(String sdrinknamefield){

        drinknamefield.click();
        drinknamefield.sendKeys(sdrinknamefield);

    }

    public void Drink4(String sdrinkpricefield){

        drinkpricefield.click();
        drinkpricefield.sendKeys(sdrinkpricefield);



    }

    public void Drink5(){

        createbutton.click();


    }

    public void Drink6(){

        listbutton.click();


    }


    public void Drink12(){

        alertpopup.click();


    }
    public void Drink8(String senterpricefield){

        enterpricefield.click();
        enterpricefield.sendKeys(senterpricefield);

    }


    public void Drink20(String senterpricefield2){

        enterpricefield2.click();
        enterpricefield2.sendKeys(senterpricefield2);

    }


    public void Drink18(String senterpricefield){

        comboboxenterprice.click();
        comboboxenterprice.sendKeys(senterpricefield);

    }

    public void Drink9(){

        addbutton.click();


    }

    public void Drink21(){

        addbutton2.click();


    }

    public void Drink888(){

        addbutton3.click();


    }

    public void Drink10(){

        selectiondropdown.click();



    }

    public void Drink11(){

        disclaimbutton.click();


    }

    public void Drink19(){

        addbuttondropdown.click();


    }
}

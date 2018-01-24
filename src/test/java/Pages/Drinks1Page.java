package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.text.DecimalFormat;
import java.util.List;

public class Drinks1Page {


    public Drinks1Page(WebDriver driver) {

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

    @FindBy(how = How.CLASS_NAME, using = "dropdown")
    public WebElement addbuttondropdown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"addedBeveragesList\"]/tbody/tr[1]/td[1]")
    public WebElement addeddrink1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"addedBeveragesList\"]/tbody/tr[2]/td[1]")
    public WebElement addeddrink2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"addedBeveragesList\"]/tbody/tr[4]/td[1]")
    public WebElement addeddrink4;

    @FindBy(how = How.XPATH, using = "//*[@id=\"addedBeveragesList\"]/tbody/tr[3]/td[1]")
    public WebElement addeddrink3;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[6]")
    public WebElement alertpopup;

    @FindBy(how = How.ID, using = "dropdownMenu1")
    public WebElement selectiondropdown;

    @FindBy(how = How.CLASS_NAME, using = "dropdown-menu")
    public List<WebElement> dropdown;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/button[2]")
    public WebElement disclaimbutton;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[11]/div[3]/input")
    public WebElement combobox1enterprice;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[11]/div[4]/button")
    public WebElement dropdowncocacolaaddbutton;

    @FindBy(how = How.ID, using = "check_aa4da079-c0c3-e711-80fa-00505692008b")
    public WebElement optionfirst;

    @FindBy(how = How.ID, using = "check_c17fe4d1-ccc3-e711-80fa-00505692008b")
    public WebElement optionfirs2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"addedBeveragesList\"]/tbody/tr[2]/td[2]")
    public WebElement addedoptions2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"addedBeveragesList\"]/tbody/tr[4]/td[2]")
    public WebElement addedoptions4;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[7]")
    public WebElement optionline;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[7]/div[3]/input")
    public WebElement comboboxenterprice2;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[1]/div[2]/div/ul/li[2]/a")
    public WebElement pepsidropdownfirst;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[1]/div[1]")
    public WebElement cocacola33;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[1]/div[3]/input")
    public WebElement enterpricecocacola33;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[1]/div[4]/button")
    public WebElement addbuttoncocacola33;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[3]/div[1]")
    public WebElement cocacolazero33;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[3]/div[3]/input")
    public WebElement enterpricecocacolazero33;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[3]/div[4]/button")
    public WebElement addbuttoncocacolazero33;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[4]/div[1]")
    public WebElement fanta33;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[4]/div[3]/input")
    public WebElement enterpricefanta33;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[4]/div[4]/button")
    public WebElement addbuttonfanta33;


    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[13]/div[1]")
    public WebElement cocacolalight1;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[13]/div[3]/input")
    public WebElement enterpricecocacolalight1;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[13]/div[4]/button")
    public WebElement addbuttoncocacolalight1;


    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[16]/div[1]")
    public WebElement sprite1;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[16]/div[3]/input")
    public WebElement enterpricesprite1;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[16]/div[4]/button")
    public WebElement addbuttonsprite1;


    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[23]/div[1]")
    public WebElement ayran20;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[23]/div[3]/input")
    public WebElement enterpriceayran20;


    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[23]/div[4]/button")
    public WebElement addbuttonayran20;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[7]/div[4]/button")
    public WebElement addbuttonpepsidropdown;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[1]/div[1]")
    public WebElement pepsi33;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[1]/div[3]/input")
    public WebElement enterpricepepsi33;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[1]/div[4]/button")
    public WebElement addbuttonpepsi33;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[2]/div[1]")
    public WebElement pepsilight33;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[2]/div[3]/input")
    public WebElement enterpricepepsilight33;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[2]/div[4]/button")
    public WebElement addbuttonpepsilight33;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[3]/div[1]")
    public WebElement pepsimax33;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[3]/div[3]/input")
    public WebElement enterpricepepsimax33;

    @FindBy(how = How.XPATH, using = "/html/body/div[1]/div/div[1]/div/div[4]/div[2]/div[2]/div[3]/div[4]/button")
    public WebElement addbuttonpepsimax33;







    public void Drinkspepsi3()
    {
        pepsidropdownfirst.click();
    }

    public void Drinkspepsi2()
    {
        addbuttonpepsidropdown.click();
    }


    public void Drink1(){

        createdrinkmenubutton.click();
    }

    public void Drink88(){

        optionfirst.click();
    }

    public void Drink2(){

        adddrinkmenubutton.click();
    }

    public void Drink3(String sdrinknamefield){

        drinknamefield.click();
        drinknamefield.sendKeys(sdrinknamefield);

    }

    public void Drink00(String sdrinknamefield){

        enterpricecocacola33.click();
        enterpricecocacola33.sendKeys(sdrinknamefield);

    }

    public void Drink01(String sdrinknamefield){

        enterpricecocacolazero33.click();
        enterpricecocacolazero33.sendKeys(sdrinknamefield);

    }

    public void Drink02(String sdrinknamefield){

        enterpricefanta33.click();
        enterpricefanta33.sendKeys(sdrinknamefield);

    }

    public void Drink03(String sdrinknamefield){

        enterpricecocacolalight1.click();
        enterpricecocacolalight1.sendKeys(sdrinknamefield);

    }


    public void Drink05(String sdrinknamefield){

        enterpricesprite1.click();
        enterpricesprite1.sendKeys(sdrinknamefield);

    }

    public void Drink06(String sdrinknamefield){

        enterpriceayran20.click();
        enterpriceayran20.sendKeys(sdrinknamefield);

    }

    public void Drink07(){

        addbuttoncocacola33.click();

    }

    public void Drink08(){

        addbuttoncocacolazero33.click();

    }

    public void Drink09(){

        addbuttonfanta33.click();

    }
    public void Drink1000(){

        addbuttoncocacolalight1.click();

    }

    public void Drink1002(){

        addbuttonsprite1.click();

    }
    public void Drink1003(){

        addbuttonayran20.click();

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


    public void Drink18(String senterpricefield){

        combobox1enterprice.click();
        combobox1enterprice.sendKeys(senterpricefield);



    }

    public void Drink027(String senterpricefield){

        comboboxenterprice2.click();
        comboboxenterprice2.sendKeys(senterpricefield);



    }

    public void Drink10(){

        selectiondropdown.click();



    }

    public void Drink11(){

        disclaimbutton.click();


    }

    public void Drink19(){

        dropdowncocacolaaddbutton.click();


    }

    public void Drink0001(String sdrinknamefield){

        enterpricepepsi33.click();
        enterpricepepsi33.sendKeys(sdrinknamefield);

    }

    public void Drink0002(){

        addbuttonpepsi33.click();
    }

    public void Drink0003(String sdrinknamefield){

        enterpricepepsilight33.click();
        enterpricepepsilight33.sendKeys(sdrinknamefield);

    }

    public void Drink0004(){

        addbuttonpepsilight33.click();
    }

    public void Drink0005(String sdrinknamefield){

        enterpricepepsimax33.click();
        enterpricepepsimax33.sendKeys(sdrinknamefield);

    }

    public void Drink0006(){

        addbuttonpepsimax33.click();
    }

    public void Drink0007(){

        optionfirs2.click();
    }
}

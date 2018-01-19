package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeliveryCountyPage {

    public DeliveryCountyPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.ID, using ="option2")
    public WebElement countyTab;

    @FindBy(how = How.ID, using ="selectCountyDropdown")
    public WebElement countydropdown;


    @FindBy(how = How.XPATH, using ="/html/body/div[1]/div/div[1]/div/div[4]/div[3]/div")
    public WebElement selectioncountytable;

    @FindBy(how = How.ID, using ="totalpriceCounty")
    public WebElement allamountcounty;

    @FindBy(how = How.XPATH, using ="/html/body/div[1]/div/div[1]/div/div[4]/div[3]/div/div[2]/table[2]/tbody/tr[1]/td[2]/input")
    public WebElement selectioncountytable2;



    public void DeliveryCounty(){
        countyTab.click();

    }

    public void DeliveryCounty2(String sallamountcounty){
        allamountcounty.click();
        allamountcounty.sendKeys(sallamountcounty);
        allamountcounty.sendKeys(Keys.ENTER);

    }

}

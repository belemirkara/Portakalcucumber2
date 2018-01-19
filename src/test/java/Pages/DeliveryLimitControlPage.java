package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeliveryLimitControlPage {

    public DeliveryLimitControlPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.ID, using ="semt_ana")
    public WebElement maindistrict2;

    @FindBy(how = How.ID, using ="main-area-delivery-price")
    public WebElement maindeliveryprice;

    @FindBy(how = How.ID, using ="districtSelectBox")
    public WebElement districtSelectBox;

    @FindBy(how = How.ID, using ="checkallbutton")
    public WebElement checkallbutton;

    @FindBy(how = How.ID, using ="add_district")
    public WebElement adddistrict;

    @FindBy(how = How.ID, using ="cb_1_2188790fd3d1394df6f35d42c16ff08766642c59b336c3cb6eea8c638b5a3ed2")
    public List<WebElement> options;

    @FindBy(how = How.ID, using ="deliverMinPrice0")
    public WebElement deliverMinPrice0;


    @FindBy(how = How.ID, using ="option1")
    public WebElement lenghth;

    @FindBy(how = How.XPATH, using ="/html/body/div[1]/div/div[1]/div/div[4]/div/table/tbody/tr[1]/td[3]/input")
    public WebElement maindistrictinanotherpage;

    @FindBy(how = How.XPATH, using ="/html/body/div[1]/div/div[1]/div/div[4]/div/table/tbody/tr[2]/td[3]/input")
    public WebElement otherdistrictinanotherpage;

    @FindBy(how = How.XPATH, using ="/html/body/div[1]/div/div[1]/div/div[4]/div/div")
    public WebElement alertdelivery;

    public void DeliveryLimitControl(String smaindeliveryprice){

        maindeliveryprice.click();
        maindeliveryprice.clear();
        maindeliveryprice.sendKeys(smaindeliveryprice);
        maindeliveryprice.sendKeys(Keys.ENTER);
    }

    public void DeliveryLimitControl4(String sdeliverMinPrice0){

        deliverMinPrice0.click();
        deliverMinPrice0.clear();
        deliverMinPrice0.sendKeys(sdeliverMinPrice0);
        deliverMinPrice0.sendKeys(Keys.ENTER);
    }
    public void DeliveryLimitControl5(String smaindistrictinanotherpage){

        maindistrictinanotherpage.click();
        maindistrictinanotherpage.clear();
        maindistrictinanotherpage.sendKeys(smaindistrictinanotherpage);
        maindistrictinanotherpage.sendKeys(Keys.ENTER);
    }

    public void DeliveryLimitControl6(String sotherdistrictinanotherpage){

        otherdistrictinanotherpage.click();
        otherdistrictinanotherpage.clear();
        otherdistrictinanotherpage.sendKeys(sotherdistrictinanotherpage);
        otherdistrictinanotherpage.sendKeys(Keys.ENTER);
    }

    public void DeliveryLimitControl1(){

        districtSelectBox.click();
    }

    public void DeliveryLimitControl2(){

        checkallbutton.click();
    }

    public void DeliveryLimitControl3(){

        adddistrict.click();
    }

    public void DeliveryLimitControl7(){

        alertdelivery.click();
    }

    public void DeliveryLimitControl8(){

        lenghth.click();
    }
}

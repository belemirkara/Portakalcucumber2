package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeliveryLengthControlOfMandatoryFieldsPage {

    public DeliveryLengthControlOfMandatoryFieldsPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.ID, using ="main-area-delivery-price")
    public WebElement mainareadeliveryprice1;

    @FindBy(how = How.ID, using ="othertotalprice_2")
    public WebElement othertotalprice2;

    @FindBy(how = How.ID, using ="othertotalprice_3")
    public WebElement othertotalprice3;

    @FindBy(how = How.ID, using ="othertotalprice_0")
    public WebElement othertotalprice0;



    @FindBy(how = How.XPATH, using ="/html/body/div[2]/div[2]/div[6]")
    public WebElement faildelivery;

    public void DeliveryLengthControlOfMandatoryFields1(){


        faildelivery.click();

    }

    public void DeliveryLengthControlOfMandatoryFields2(){


        mainareadeliveryprice1.click();
        mainareadeliveryprice1.clear();
        mainareadeliveryprice1.sendKeys(",");

    }

    public void DeliveryLengthControlOfMandatoryFields3(){


        othertotalprice2.click();
        othertotalprice2.clear();
        othertotalprice2.sendKeys("'");
        othertotalprice2.sendKeys(Keys.ENTER);

    }

    public void DeliveryLengthControlOfMandatoryFields4(){


        othertotalprice3.click();
        othertotalprice3.clear();
        othertotalprice3.sendKeys("'");
        othertotalprice3.sendKeys(Keys.ENTER);

    }

    public void DeliveryLengthControlOfMandatoryFields5(){


        othertotalprice0.click();
        othertotalprice0.clear();
        othertotalprice0.sendKeys("'");
        othertotalprice0.sendKeys(Keys.ENTER);

    }

}

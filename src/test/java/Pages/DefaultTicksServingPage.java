package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DefaultTicksServingPage {

    public DefaultTicksServingPage(WebDriver driver) {

        PageFactory.initElements(driver, this);

    }


    @FindBy(how = How.ID, using ="cash")
    public WebElement cbxcash;


    @FindBy(how = How.ID, using ="occ")
    public WebElement cbxocc;

    public void DefaultTicksServingPage(){
        cbxcash.click();

    }

    public void DefaultTicksServingPage2(){
        cbxocc.click();

    }

}

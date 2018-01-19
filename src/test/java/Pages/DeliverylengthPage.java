package Pages;




import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeliverylengthPage {


        public DeliverylengthPage(WebDriver driver) {

            PageFactory.initElements(driver, this);

        }


        @FindBy(how = How.ID, using ="registerTab4")
        public WebElement deliverytab;

        @FindBy(how = How.ID, using ="semt_ana")
        public WebElement maindistrict;

        @FindBy(how = How.ID, using ="main-area-delivery-price")
        public WebElement fieldmaindistrict;


        @FindBy(how = How.ID, using ="othertotalprice_1")
        public WebElement allthemostcloseddistrict;

        @FindBy(how = How.ID, using ="deliverMinPrice1")
        public WebElement minprice;



        @FindBy(how = How.ID, using ="othertotalprice_2")
        public WebElement allcloseddistrict1;

        @FindBy(how = How.CSS, using ="deliverMinPrice2")
        public WebElement minprice2;


        @FindBy(how = How.ID, using = "othertotalprice_3")
        public WebElement allfardistricts;

        @FindBy(how = How.ID, using = "deliverMinPrice3")
        public WebElement minprice3;

        @FindBy(how = How.ID, using = "districtSelectBox")
        public WebElement districtselectbox;

        @FindBy(how = How.ID, using = "checkallbutton")
        public WebElement checkallbutton;

        @FindBy(how = How.ID, using = "add_district")
        public WebElement addistrictbutton;

        @FindBy(how = How.XPATH, using = "//*[@id=\"districtSelectBox\"]/div/ul")
        public List<WebElement> comboboxoptions;

        @FindBy(how = How.ID, using = "othertotalprice_0")
        public WebElement allselectiondistricts;

        @FindBy(how = How.ID, using = "deliverMinPrice0")
        public WebElement minprice0;

        @FindBy(how = How.ID, using = "1")
        public WebElement deliverysuccesspopup;

        @FindBy(how = How.ID, using = "btnSaveContinue")
        public WebElement saveandcontinuebuttondelivery;




        public void Deliverylength() {

            deliverytab.click();
        }

        public void Deliverylength2(String sfieldmaindistrict) {

            fieldmaindistrict.click();
            fieldmaindistrict.clear();
            fieldmaindistrict.sendKeys(sfieldmaindistrict);
            fieldmaindistrict.sendKeys(Keys.ENTER);
        }

        public void Deliverylength3(String sallthemostcloseddistrict) {

            allthemostcloseddistrict.click();
            allthemostcloseddistrict.clear();
            allthemostcloseddistrict.sendKeys(sallthemostcloseddistrict);
            allthemostcloseddistrict.sendKeys(Keys.ENTER);
        }

        public void Deliverylength4(String sallcloseddistrict1) {

            allcloseddistrict1.click();
            allcloseddistrict1.clear();
            allcloseddistrict1.sendKeys(sallcloseddistrict1);
            allcloseddistrict1.sendKeys(Keys.ENTER);
        }

        public void Deliverylength5(String sallfardistricts) {

            allfardistricts.click();
            allfardistricts.clear();
            allfardistricts.sendKeys(sallfardistricts);
            allfardistricts.sendKeys(Keys.ENTER);
        }



        public void Deliverylength6() {

            districtselectbox.click();

        }

        public void Deliverylength7() {

            checkallbutton.click();

        }

        public void Deliverylength8() {

            addistrictbutton.click();

        }
    public void Deliverylength9(String sallselectiondistricts) {

        allselectiondistricts.click();
        allselectiondistricts.clear();
        allselectiondistricts.sendKeys(sallselectiondistricts);
        allselectiondistricts.sendKeys(Keys.ENTER);
    }

    public void Deliverylength10() {

        deliverysuccesspopup.click();

    }

    public void Deliverylength11() {

        saveandcontinuebuttondelivery.click();

    }



    }



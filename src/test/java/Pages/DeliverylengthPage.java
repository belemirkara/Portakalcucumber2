package Pages;




import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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

        @FindBy(how = How.ID, using ="semt_1")
        public WebElement themostcloseddistrict;

        @FindBy(how = How.ID, using ="othertotalprice_1")
        public WebElement allthemostcloseddistrict;

        @FindBy(how = How.ID, using ="deliverMinPrice1")
        public WebElement minprice;

        @FindBy(how = How.ID, using ="semt_2")
        public WebElement closeddistricts;

        @FindBy(how = How.ID, using ="othertotalprice_2")
        public WebElement allcloseddistrict1;

        @FindBy(how = How.CSS, using ="deliverMinPrice2")
        public WebElement minprice2;

        @FindBy(how = How.ID, using ="semt_3")
        public WebElement fardistricts;

        @FindBy(how = How.ID, using = "othertotalprice_3")
        public WebElement allfardistricts;

        @FindBy(how = How.ID, using = "deliverMinPrice3")
        public WebElement minprice3;

        @FindBy(how = How.ID, using = "semt_0")
        public WebElement selectiondistricts;

        @FindBy(how = How.ID, using = "districtSelectBox")
        public WebElement districtselectbox;

        @FindBy(how = How.ID, using = "checkallbutton")
        public WebElement checkallbutton;

        @FindBy(how = How.ID, using = "add_district")
        public WebElement adddistrictbutton;

        @FindBy(how = How.XPATH, using = "//*[@id=\"districtSelectBox\"]/div/ul")
        public WebElement comboboxoptions;

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
        }
    }



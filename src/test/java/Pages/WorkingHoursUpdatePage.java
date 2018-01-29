package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;




public class WorkingHoursUpdatePage {

        public WorkingHoursUpdatePage(WebDriver driver) {

            PageFactory.initElements(driver, this);

        }


        @FindBy(how = How.ID, using ="3_8")
        public WebElement whcell;

        @FindBy(how = How.XPATH, using ="//*[@id=\"selectedCell\"]/tbody/tr[1]/td/a/u")
        public WebElement minute1;

        @FindBy(how = How.XPATH, using ="//*[@id=\"selectedCell\"]/tbody/tr[2]/td/span/a/u")
        public WebElement minute2;

        @FindBy(how = How.XPATH, using ="/html/body/div[4]/div[2]/div/center/div/select")
        public WebElement selectminute1;

        @FindBy(how = How.XPATH, using ="/html/body/div[5]/div[2]/div/center/div/select")
        public WebElement selectminute2;

    @FindBy(how = How.XPATH, using ="/html/body/div[4]/div[2]/div/center/button")
    public WebElement close;

    @FindBy(how = How.XPATH, using ="/html/body/div[5]/div[2]/div/center/button")
    public WebElement close1;

    @FindBy(how = How.XPATH, using ="//*[@id=\"selectedCell\"]/tbody/tr[1]/td/a/u")
    public WebElement m1;

    @FindBy(how = How.XPATH, using ="//*[@id=\"selectedCell\"]/tbody/tr[2]/td/span/a")
    public WebElement m2;

    @FindBy(how = How.CLASS_NAME, using ="red-text")
    public WebElement redtext;

        public void WorkingHoursUpdate() {

            whcell.click();
        }

        public void WorkingHoursUpdate2() {

            minute1.click();
            minute2.click();
        }

    }



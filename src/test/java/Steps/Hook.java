package Steps;

import Base.BaseUtil;
import cucumber.api.java.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {

        this.base = base;

    }

    @Before
    public void initializeTest() {

        System.setProperty("webdriver.gecko.driver", "//Users//belemir.karabacakoglu//Desktop//geckodriver");
        base.driver = new FirefoxDriver();

    }


}
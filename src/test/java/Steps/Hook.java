package Steps;

import Base.BaseUtil;
import cucumber.api.java.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;


public class Hook extends BaseUtil {

    private BaseUtil base;
    private static String downloadPath = "//Users//belemir.karabacakoglu//Downloads";

    public Hook(BaseUtil base) {

        this.base = base;

    }

    @Before
    public void initializeTest() {

        System.setProperty("webdriver.gecko.driver", "//Users//belemir.karabacakoglu//Desktop//geckodriver");

        FirefoxOptions options = new FirefoxOptions();
        options.setAcceptInsecureCerts(true);
        options.addPreference("browser.download.folderList", 2);
        options.addPreference("browser.download.dir", downloadPath);
        options.addPreference("browser.helperApps.neverAsk.saveToDisk", "application/xml,text/plain,text/xml,image/jpeg,text/csv,application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");

        DesiredCapabilities caps = DesiredCapabilities.firefox();

        options.merge(caps);
        base.driver = new FirefoxDriver(options);
        base.driver.manage().window().maximize();
    }


       @cucumber.api.java.After
        public void closetest() {

        base.driver.quit();

        }}



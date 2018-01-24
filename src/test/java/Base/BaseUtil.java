package Base;



import Pages.SelfregPage;
import com.google.common.base.Function;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;


import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class BaseUtil {
    Random r = new Random();
    public WebDriver driver;


    public String uret() {

        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 3; i < 10; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        String output = sb.toString();


        return output;

    }


    public void uret2() {


        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

        SelfregPage page = new SelfregPage(driver);
        WebElement ilce = page.fieldrestaurantcountry;

        Select ddlIlce = new Select(ilce);

        List<WebElement> resultList = ddlIlce.getOptions();
        int result = resultList.size();

        while (result == 0) {
            uret2();
        }

        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        wait.withTimeout(45, TimeUnit.SECONDS);

        Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver arg0) {
                if (ddlIlce.getOptions().isEmpty()) {
                    return false;
                }

                return true;
            }
        };

        wait.until(function);

        int listSize = ddlIlce.getOptions().size();
        if (listSize > 1) {
            int optionIndex = r.nextInt(listSize - 1);

            if (optionIndex == 0) {
                ddlIlce.selectByIndex(1);
            }

            if (optionIndex > 0) {
                ddlIlce.selectByIndex(optionIndex);
            }


        }

        }


    public void uret3() {

        driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
        SelfregPage page = new SelfregPage(driver);

        WebElement semt = page.fieldrestaurantdistrict;
        Select ddlsemt = new Select(semt);


        List<WebElement> resultList = ddlsemt.getOptions();
        int result = resultList.size();

        while (result == 0) {
            uret3();
        }
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
        wait.pollingEvery(250, TimeUnit.MILLISECONDS);
        wait.withTimeout(45, TimeUnit.SECONDS);

        Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>() {
            public Boolean apply(WebDriver arg0) {
                if (ddlsemt.getOptions().isEmpty()) {
                    return false;
                }

                return true;
            }
        };

        wait.until(function);

        int listSize = ddlsemt.getOptions().size();
        if (listSize > 1) {
            int optionIndex = r.nextInt(listSize - 1);

            if (optionIndex == 0) {
                ddlsemt.selectByIndex(1);
            }

            if (optionIndex > 0) {
                ddlsemt.selectByIndex(optionIndex);
            }

    }

    }
}

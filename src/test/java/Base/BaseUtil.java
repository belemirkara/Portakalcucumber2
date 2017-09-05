package Base;



import com.google.common.base.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;


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
    public void uret2()  {
        WebElement ilce = (new WebDriverWait(driver, 90))
                .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-county")));
        Select s2 = new Select(ilce);

        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
        wait.pollingEvery(250,  TimeUnit.MILLISECONDS);
        wait.withTimeout(45, TimeUnit.SECONDS);

        Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>()
        {
            public Boolean apply(WebDriver arg0) {
                if (s2.getOptions().isEmpty()) {
                    return false;
                }

                return true;
            }
        };

        wait.until(function);

        int listSize = s2.getOptions().size();
        if (listSize > 1) {
            int optionIndex= r.nextInt(listSize - 1);

            if(optionIndex==0) {
                s2.selectByIndex(1);
            }

           if(optionIndex>0){
                s2.selectByIndex(optionIndex);
           }



        }}

  public void uret3(){

      WebElement semt= (new WebDriverWait(driver, 90))
              .until(ExpectedConditions.presenceOfElementLocated(By.id("restaurant-district")));
      Select s2 = new Select(semt);

      FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
      wait.pollingEvery(250,  TimeUnit.MILLISECONDS);
      wait.withTimeout(45, TimeUnit.SECONDS);

      Function<WebDriver, Boolean> function = new Function<WebDriver, Boolean>()
      {
          public Boolean apply(WebDriver arg0) {
              if (s2.getOptions().isEmpty()) {
                  return false;
              }

              return true;
          }
      };

      wait.until(function);

      int listSize = s2.getOptions().size();
      if (listSize > 1) {
          int optionIndex = r.nextInt(listSize - 1);

          if (optionIndex == 0) {
              s2.selectByIndex(1);
          }

          if (optionIndex > 0) {
              s2.selectByIndex(optionIndex);
          }


      }}}

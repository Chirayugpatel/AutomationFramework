package testphphome;

import base.CommonAPI;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import phphome.PHPHome;

/**
 * Created by patelio on 8/19/2017.
 */
public class TestPHPHome extends CommonAPI {

    @Test (priority = 0)
    public void searchBox () throws InterruptedException {
        PHPHome phpHome = PageFactory.initElements(driver, PHPHome.class);
        phpHome.goToSearchBox();
        sleepFor(3);

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL is " + currentUrl);
        String expectedUrl = "http://php.net/manual/en/function.eval.php";
        Assert.assertEquals(currentUrl,expectedUrl);
        System.out.println("URL Verified");
    }

    @Test (priority = 1)
    public void presenceOfCautionMessage () throws InterruptedException {
        PHPHome phpHome = PageFactory.initElements(driver, PHPHome.class);
        phpHome.goToSearchBox();
        sleepFor(3);
        if(driver.getPageSource().contains("caution")){
            System.out.println("Caution Message Present");
        }
        else {
            System.out.println("Caution Message is not Present");
        }
    }
}

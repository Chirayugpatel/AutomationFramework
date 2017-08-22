package phphome;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by patelio on 8/19/2017.
 */
public class PHPHome extends CommonAPI {

    @FindBy(how = How.CSS, using = "input.search-query:nth-child(2)")
    public static WebElement searchBox;

    public static WebElement getSearchBox() {
        return searchBox;
    }
    public void goToSearchBox (){
        getSearchBox().sendKeys("eval", Keys.ENTER);
    }

}

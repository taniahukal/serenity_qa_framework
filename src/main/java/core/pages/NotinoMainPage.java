package core.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class NotinoMainPage extends AbstractPage {

    private static final String SEARCH_BAR = "//input[@class='search-box__input']";

    public NotinoMainPage (WebDriver driver)
    { super(driver); }

    public void typeSearchText () {
        findBy(SEARCH_BAR).then().type("SpiriTime Flower Time").sendKeys(Keys.ENTER);
    }

}

package core.pages;

import org.openqa.selenium.WebDriver;

public class RozetkaSearchResultPage extends AbstractPage {

    private static final String ITEM = "";

    public RozetkaSearchResultPage (WebDriver driver)
    { super(driver); }

    public void selecttItem () {
        findBy(ITEM).then().click();
    }
}

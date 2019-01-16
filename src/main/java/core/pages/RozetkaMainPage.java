package core.pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class RozetkaMainPage extends AbstractPage {

    private static final String SEARCH_BAR = "//input [@class='rz-header-search-input-text passive']";

    public RozetkaMainPage(WebDriver driver) {
        super(driver);
    }

    public void typeTextToSearchBar(final String text) {
        findBy(SEARCH_BAR).then().type("Huawei").then().sendKeys(Keys.ENTER);
    }

}
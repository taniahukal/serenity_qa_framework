package core.pages;

import org.openqa.selenium.WebDriver;

public class RozetkaItemsPage extends AbstractPage {

    private static final String ADD_TO_WHISHLIST_BUTTON = "";

    public RozetkaItemsPage (final WebDriver driver) {
        super(driver);
    }

    public void addItemToWhishlist () {
        findBy(ADD_TO_WHISHLIST_BUTTON).then().click();
    }

}

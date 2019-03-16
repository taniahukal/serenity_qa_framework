package core.pages;

import org.openqa.selenium.WebDriver;

public class NotinoWishlistPage extends AbstractPage {

    private static final String ITEMS_NAME = "//h3[@class='sc-cQFLBn bwjTkK']";

    public NotinoWishlistPage (WebDriver driver)
    { super(driver); }

    public String getItemsName () {
        final String ItemsName = findBy(ITEMS_NAME).getText();
        return ItemsName;
    }

}

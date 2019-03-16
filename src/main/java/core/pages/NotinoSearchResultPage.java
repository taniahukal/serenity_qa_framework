package core.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotinoSearchResultPage extends AbstractPage {

    private static final String WISHLIST_PAGE = "//a[@class='wishlist-box__link header-box__link']";

    public NotinoSearchResultPage(WebDriver driver)
    { super(driver); }

    public void clickOnWishlistButton () {
       find(By.xpath("//li[@data-product-code='11590533']//a[@class='wishlist__nav']")).click();
    }

    public void goToWishlistPage () {
        findBy(WISHLIST_PAGE).then().click();
    }
}

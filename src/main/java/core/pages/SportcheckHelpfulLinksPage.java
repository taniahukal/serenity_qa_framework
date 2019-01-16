package core.pages;

import core.panels.HelpfulLinksPanel;
import org.openqa.selenium.WebDriver;

public class SportcheckHelpfulLinksPage extends AbstractPage {

    private static final String HELPFUL_LINKS_PANEL = "//div[@class='footer-section__show-more active']//div[contains (@data-module-type, 'HelpfulLinks')]";

    public SportcheckHelpfulLinksPage(WebDriver driver) {
        super(driver);
    }

    public HelpfulLinksPanel getHelpfulLinksPanel () {
        return new HelpfulLinksPanel(findBy(HELPFUL_LINKS_PANEL), this);
    }
}

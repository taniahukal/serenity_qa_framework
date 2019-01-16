package core.panels;

import core.pages.AbstractPage;
import net.serenitybdd.core.pages.WebElementFacade;

import java.util.List;
import java.util.stream.Collectors;

public class HelpfulLinksPanel extends AbstractPanel {

    private static final String HELPFUL_LINKS = ".//div[./h3[text()='HELPFUL LINKS']]//a[not(@style)]";

    public HelpfulLinksPanel(WebElementFacade panelLocator, AbstractPage rootPage) {
        super(panelLocator, rootPage);
    }

    public List<String> getHelpfulLinksText () {
        final List<WebElementFacade> helpfulLinksItems = getRootPage().findAll(HELPFUL_LINKS);
        return helpfulLinksItems.stream()
                .map(item -> item.getText())
                .collect(Collectors.toList());
    }
}

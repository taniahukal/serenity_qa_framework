package core.panels;

import core.pages.AbstractPage;
import net.serenitybdd.core.pages.WebElementFacade;

public class ItemPanel extends AbstractPanel {

    private static final String ITEM = "";

    public ItemPanel(WebElementFacade panelLocator, AbstractPage rootPage) {
        super(panelLocator, rootPage);
    }
}

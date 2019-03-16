package core.panels;

import core.pages.AbstractPage;
import net.serenitybdd.core.pages.WebElementFacade;

public class AddToWishlistPanel extends AbstractPanel{

    private static final String LOGIN = "//input[@name='login']";

    public AddToWishlistPanel (WebElementFacade panelLocator, AbstractPage rootPage) {
        super(panelLocator, rootPage);
    }

    public void typeLogin () {

    }


}


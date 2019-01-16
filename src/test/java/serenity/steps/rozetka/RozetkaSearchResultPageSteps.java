package serenity.steps.rozetka;

import core.pages.RozetkaSearchResultPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;

public class RozetkaSearchResultPageSteps {

    private RozetkaSearchResultPage rozetkaSearchResultPage;

    public RozetkaSearchResultPageSteps (final Pages pages) {
        this.rozetkaSearchResultPage = pages.getPage (RozetkaSearchResultPage.class);
    }

    @Step

    public void selecttItem() {rozetkaSearchResultPage.selecttItem();
    }
}

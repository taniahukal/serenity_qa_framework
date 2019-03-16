package serenity.steps.rozetka;

import core.pages.NotinoSearchResultPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class NotinoSearchResultPageSteps extends ScenarioSteps {

    private NotinoSearchResultPage rozetkaSearchResultPage;

    public NotinoSearchResultPageSteps(final Pages pages) {
        this.rozetkaSearchResultPage = pages.getPage (NotinoSearchResultPage.class);
    }

    @Step
    public void clickOnWishlistButton () {rozetkaSearchResultPage.clickOnWishlistButton();}

    @Step
    public void goToWishlistPage() {rozetkaSearchResultPage.goToWishlistPage();}
}

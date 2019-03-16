package serenity.steps.rozetka;

import core.pages.NotinoMainPage;
import core.pages.NotinoWishlistPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class NotinoWishlistSteps extends ScenarioSteps {

    private NotinoWishlistPage notinoWishlistPage;

    public NotinoWishlistSteps(final Pages pages) {
        this.notinoWishlistPage = pages.getPage (NotinoWishlistPage.class);
    }

    @Step
    public String getItemsName () {return notinoWishlistPage.getItemsName();}
}

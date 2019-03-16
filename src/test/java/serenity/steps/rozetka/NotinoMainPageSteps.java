package serenity.steps.rozetka;

import core.pages.NotinoMainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class NotinoMainPageSteps extends ScenarioSteps {

    private NotinoMainPage notinoMainPage;

    public NotinoMainPageSteps (final Pages pages) {
        this.notinoMainPage = pages.getPage (NotinoMainPage.class);
    }

    @Step
    public void openPage(final String link) {
        notinoMainPage.openAt(link);
    }

    @Step
    public void typeSearchText(final String text) { notinoMainPage.typeSearchText();}

}

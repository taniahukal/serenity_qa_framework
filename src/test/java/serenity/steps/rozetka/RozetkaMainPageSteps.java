package serenity.steps.rozetka;

import core.pages.RozetkaMainPage;
import core.pages.SportcheckHelpfulLinksPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class RozetkaMainPageSteps extends ScenarioSteps {

    private RozetkaMainPage rozetkaMainPage;

    public RozetkaMainPageSteps(final Pages pages) {
        this.rozetkaMainPage = pages.getPage (RozetkaMainPage.class);
    }

    @Step
    public void openPage(final String link) {
        rozetkaMainPage.openAt(link);
    }

    @Step
    public void typeTextToSearchBar(final String text) {
        rozetkaMainPage.typeTextToSearchBar(text);
    }
}

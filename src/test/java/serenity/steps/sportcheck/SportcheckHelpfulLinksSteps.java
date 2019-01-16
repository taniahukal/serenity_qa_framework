package serenity.steps.sportcheck;


import core.pages.SportcheckHelpfulLinksPage;
import core.panels.HelpfulLinksPanel;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import java.util.List;

public class SportcheckHelpfulLinksSteps extends ScenarioSteps {

    private SportcheckHelpfulLinksPage sportcheckHelpfulLinksPage;

    public SportcheckHelpfulLinksSteps(final Pages pages) {
        this.sportcheckHelpfulLinksPage = pages.getPage(SportcheckHelpfulLinksPage.class);
    }

    @Step
    public void openPage(final String link) {
        sportcheckHelpfulLinksPage.openAt(link);

    }

    @Step
    public void scrollsDown() {
    }

    @Step
    public List<String> getHelpfulLinksList() {
        final HelpfulLinksPanel helpfulLinksPanel = sportcheckHelpfulLinksPage.getHelpfulLinksPanel();
        return helpfulLinksPanel.getHelpfulLinksText();
    }
}

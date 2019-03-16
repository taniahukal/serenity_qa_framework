package jbehave.scenariosteps.rozetka;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import serenity.steps.rozetka.NotinoMainPageSteps;

public class NotinoMainPageScenario {

    @Steps
    private NotinoMainPageSteps notinoMainPageSteps;

    @Given("user open Notino main page, using following url: '$link'")
    public void openRozetkaMainPage (final String link) {
        notinoMainPageSteps.openPage(link);
    }

    @When("user types search parameter to search bar '$text'")
    public void typeSearchText (final String text) {notinoMainPageSteps.typeSearchText(text);}
}

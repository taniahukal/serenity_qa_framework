package jbehave.scenariosteps.rozetka;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import serenity.steps.rozetka.RozetkaMainPageSteps;

public class RozetkaMainPageScenario {

    @Steps
    private RozetkaMainPageSteps rozetkaMainPageSteps;

    @Given ("user is open Rozetka main page, using following url: '$link'")
            public void openRozetkaMainPage (final String link) {
        rozetkaMainPageSteps.openPage(link);
    }

    @When("user types '$text' in search bar")
    public void typeTextToSearchBar (final String text) {
        rozetkaMainPageSteps.typeTextToSearchBar(text);
    }

}

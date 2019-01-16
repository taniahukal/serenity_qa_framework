package jbehave.scenariosteps.sportcheck;

import core.pages.SportcheckHelpfulLinksPage;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import serenity.steps.sportcheck.SportcheckHelpfulLinksSteps;

import java.util.List;

public class SportcheckHelpfulLinksScenario {

    @Steps
    private SportcheckHelpfulLinksSteps sportcheckHelpfulLinksSteps;

    @Given("user open Sportcheck main page, using following url: '$link'")
    public void openSportcheckHelpfulLinksPage (final String link) {
        sportcheckHelpfulLinksSteps.openPage(link);
    }

    @When("user scrolls the page")
    public void scrollSportcheckHelpfulLinkPage () {
        sportcheckHelpfulLinksSteps.scrollsDown();
    }

    @Then("next helpful links should be displayed: '$helpfulLinksList'")
    public void verifyHelpfulLinks (final List<String> expectedHelpfulLinks) {
        final List<String> actualHelpfulLinksList = sportcheckHelpfulLinksSteps.getHelpfulLinksList();
        Assert.assertArrayEquals("There are incorrect 'HELPFUL LINKS' displayed!",
                expectedHelpfulLinks.toArray(), actualHelpfulLinksList.toArray());

    }


}

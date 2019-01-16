package jbehave.scenariosteps.rozetka;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;
import serenity.steps.rozetka.RozetkaSearchResultPageSteps;

public class RozetkaSearchResultPageScenario {

    @Steps
    private RozetkaSearchResultPageSteps rozetkaSearchResultPageSteps;

    @When("user picks up one of the items and clicks 'Add to Whishlist' button")
    public void selectItem () {rozetkaSearchResultPageSteps.selecttItem();}

}


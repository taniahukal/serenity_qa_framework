package jbehave.scenariosteps.rozetka;

import core.pages.RozetkaSearchResultPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;
import serenity.steps.rozetka.RozetkaItemsPageSteps;

public class RozetkaItemsPageScenario  {

    @Steps
    private RozetkaItemsPageSteps rozetkaItemsPageSteps;

    @When("user picks up one of the items")
    public void addItemToWishlist () {rozetkaItemsPageSteps.addItemToWishlist();}
}

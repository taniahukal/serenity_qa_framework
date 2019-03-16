package jbehave.scenariosteps.rozetka;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.When;
import serenity.steps.rozetka.NotinoSearchResultPageSteps;

public class NotinoSearchResultPageScenario {

    @Steps
    private NotinoSearchResultPageSteps rozetkaSearchResultPageSteps;

    @When("user clicks 'Add to Wishlist' button")
    public void clickOnWishlistButton() {rozetkaSearchResultPageSteps.clickOnWishlistButton();}

    @When("user goes to Wishlist")
    public void goToWishlistPage() {rozetkaSearchResultPageSteps.goToWishlistPage();}
}


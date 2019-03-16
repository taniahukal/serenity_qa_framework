package jbehave.scenariosteps.rozetka;

import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Then;
import org.unitils.reflectionassert.ReflectionAssert;
import serenity.steps.rozetka.NotinoMainPageSteps;
import serenity.steps.rozetka.NotinoWishlistSteps;

public class NotinoWishlistPageScenario {

    @Steps
    private NotinoWishlistSteps notinoWishlistSteps;

    @Then("selected item 'SpiriTime Flower Time' is in the Wishlist")
    public void isSelectedItemInWishlist() {
        final String ItemsName = notinoWishlistSteps.getItemsName();
        ReflectionAssert.assertReflectionEquals("There are incorrect items displayed!",
                notinoWishlistSteps.getItemsName(), ItemsName);
    }
}

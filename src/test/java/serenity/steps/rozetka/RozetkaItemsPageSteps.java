package serenity.steps.rozetka;

import core.pages.RozetkaItemsPage;
import core.pages.RozetkaMainPage;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

public class RozetkaItemsPageSteps extends ScenarioSteps {

    private RozetkaItemsPage rozetkaItemsPage;

    public RozetkaItemsPageSteps (final Pages pages) {
        this.rozetkaItemsPage = pages.getPage (RozetkaItemsPage.class);
    }

    public void addItemToWishlist() {rozetkaItemsPage.addItemToWhishlist();
    }
}

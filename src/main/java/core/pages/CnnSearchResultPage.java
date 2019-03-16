package core.pages;

import dto.CnnSearchFilterCriteriaDTO;
import dto.CnnSearchItemDTO;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.WebDriver;

import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CnnSearchResultPage extends AbstractPage {

    private static final String ARTICLE_TYPE = "//label[text()='%s']";
    private static final String CATEGORY_FILTER = "//label[@for='left_travel' and text()='%s']";
    private static final String ALL_DISPLAYED_RESULTS = "//div[@class='cnn-search__results-list']/div";


    public CnnSearchResultPage(final WebDriver driver) {
        super(driver);
    }

    public void applyFilters(final CnnSearchFilterCriteriaDTO filter) {
        final String articleFullLocator = String.format(ARTICLE_TYPE, filter.getType());
        final String categoryFullLocator = String.format(CATEGORY_FILTER, filter.getCategory());
        findBy(articleFullLocator).then().click();
        findBy(categoryFullLocator).then().click();
    }


    public List<CnnSearchItemDTO> getDisplayedResults() {
        final List<CnnSearchItemDTO> displayedItems = new ArrayList<>();
        final List<WebElementFacade> allResults = findAll(ALL_DISPLAYED_RESULTS);
        for (final WebElementFacade item : allResults) {

            final CnnSearchItemDTO cnnSearchItemDTO = new CnnSearchItemDTO();

            waitFor("//div[@class='cnn-search__result-contents']//h3");
            waitFor("//div[@class='cnn-search__result-contents']//div[@class='cnn-search__result-body']");

            //withTimeoutOf(10, TimeUnit.SECONDS).waitFor(".//h3");
            //withTimeoutOf(10, TimeUnit.SECONDS).waitFor(".//div[@class='cnn-search__result-body']");

            final String headLine = item.then("//div[@class='cnn-search__result-contents']//h3").getText();
            final String body = item.then("//div[@class='cnn-search__result-contents']//div[@class='cnn-search__result-body']").getText();

            cnnSearchItemDTO.setHeadline(headLine);
            cnnSearchItemDTO.setBody(body);

            displayedItems.add(cnnSearchItemDTO);
        }
        return displayedItems;
    }
}
package pages;

import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    public boolean isResultFound() {
        String pageSource = getDriver().getPageSource();
        return !pageSource.contains("No results found.");
    }
}

package locators;

import org.openqa.selenium.By;

/**
 * The type Search results page locators.
 */
public class SearchResultsPageLocators {
    /**
     * The Result stats.
     */
    By resultStats = By.xpath("//*[@id='resultStats']");

    /**
     * Gets result stats.
     *
     * @return the result stats
     */
    public By getResultStats() {
        return resultStats;
    }

    /**
     * Sets result stats.
     *
     * @param resultStats the result stats
     */
    public void setResultStats(By resultStats) {
        this.resultStats = resultStats;
    }
}

package locators;

import org.openqa.selenium.By;

/**
 * The type Search page locators.
 */
public class SearchPageLocators {
    /**
     * The Search box.
     */
    By searchBox = By.xpath("//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input");
    /**
     * The Search btn.
     */
    By searchBtn = By.xpath("//*[@id='tsf']/div[2]/div/div[3]/center/input[1]");
    /**
     * The Search btn 2.
     */
    By searchBtn2 = By.xpath("//*[@id='tsf']/div[2]/div/div[2]/div[2]/div[2]/center/input[1]");

    /**
     * Gets search box.
     *
     * @return the search box
     */
    public By getSearchBox() {
        return searchBox;
    }

    /**
     * Sets search box.
     *
     * @param searchBox the search box
     */
    public void setSearchBox(By searchBox) {
        this.searchBox = searchBox;
    }

    /**
     * Gets search btn.
     *
     * @return the search btn
     */
    public By getSearchBtn() {
        return searchBtn;
    }

    /**
     * Sets search btn.
     *
     * @param searchBtn the search btn
     */
    public void setSearchBtn(By searchBtn) {
        this.searchBtn = searchBtn;
    }

    /**
     * Gets search btn 2.
     *
     * @return the search btn 2
     */
    public By getSearchBtn2() {
        return searchBtn2;
    }

    /**
     * Sets search btn 2.
     *
     * @param searchBtn2 the search btn 2
     */
    public void setSearchBtn2(By searchBtn2) {
        this.searchBtn2 = searchBtn2;
    }
}

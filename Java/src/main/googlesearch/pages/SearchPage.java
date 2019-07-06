package pages;

import elements.*;
import org.openqa.selenium.WebDriver;
import utils.ClickElement;

public class SearchPage extends BasePage {
    private SearchTextElement stEle;

    public SearchPage(WebDriver driver) {
        setDriver(driver);
        stEle = new SearchTextElement(this);
    }

    public SearchTextElement getStEle() {
        return stEle;
    }

    public void setStEle(SearchTextElement stEle) {
        this.stEle = stEle;
    }

    public void setValue(String value) {
        stEle.setValue(value);
    }

    public String getValue() {
        return stEle.getValue();
    }

    public boolean isTitleMatches() {
        return driver.getTitle().contains("Google");
    }

    public void clickSearchBtn() {
        ClickElement.clickByLocator(driver, stEle.getLocator());
    }
}

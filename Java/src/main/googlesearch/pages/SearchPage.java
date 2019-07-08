package pages;

import elements.*;
import org.openqa.selenium.WebDriver;
import utils.ClickElement;

public class SearchPage extends BasePage {
    private SearchTextElement stEle;
    private SearchBtn searchBtn;
    private SearchBtn2 searchBtn2;

    public SearchPage(WebDriver driver) {
        super(driver);
        stEle = new SearchTextElement(this);
        searchBtn = new SearchBtn(this);
        searchBtn2 = new SearchBtn2(this);
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
        ClickElement.clickByLocator(driver, searchBtn.getLocator());
    }

    public void clickSearchBtn2() {
        ClickElement.clickByLocator(driver, searchBtn2.getLocator());
    }
}

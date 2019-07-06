package elements;

import locators.*;
import org.openqa.selenium.By;
import pages.BasePage;

public class SearchTextElement extends BasePageElement {

    private LocatorFactory factory;
    private By locator;

    public SearchTextElement(BasePage page) {
        factory = SearchTextLocatorFactory.getFactory();
        locator = factory.createLocator("xpath", "//*[@id='tsf']/div[2]/div/div[1]/div/div[1]/input");
        this.page = page;
    }

    public LocatorFactory getFactory() {
        return factory;
    }

    public void setFactory(LocatorFactory factory) {
        this.factory = factory;
    }

    public By getLocator() {
        return locator;
    }

    public void setLocator(By locator) {
        this.locator = locator;
    }

    public BasePage getPage() {
        return page;
    }

    public void setPage(BasePage page) {
        this.page = page;
    }
}

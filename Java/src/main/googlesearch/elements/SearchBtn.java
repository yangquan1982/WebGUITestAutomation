package elements;

import locators.LocatorFactory;
import locators.SearchTextLocatorFactory;
import pages.BasePage;

public class SearchBtn extends BasePageElement{

    private LocatorFactory factory;

    public SearchBtn(BasePage page) {
        factory = SearchTextLocatorFactory.getFactory();
        locator = factory.createLocator("xpath", "//*[@id='tsf']/div[2]/div/div[3]/center/input[1]");
        this.page = page;
    }

    public LocatorFactory getFactory() {
        return factory;
    }

    public void setFactory(LocatorFactory factory) {
        this.factory = factory;
    }
}

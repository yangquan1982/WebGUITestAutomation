package elements;

import locators.LocatorFactory;
import locators.SearchTextLocatorFactory;
import pages.BasePage;

public class SearchBtn2 extends BasePageElement{

    private LocatorFactory factory;

    public SearchBtn2(BasePage page) {
        factory = SearchTextLocatorFactory.getFactory();
        locator = factory.createLocator("xpath", "//*[@id='tsf']/div[2]/div/div[2]/div[2]/div[2]/center/input[1]");
        this.page = page;
    }
}

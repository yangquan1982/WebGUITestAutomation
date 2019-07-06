package locators;

import org.openqa.selenium.By;

public class SearchTextLocatorFactory implements LocatorFactory {

    private static LocatorFactory factory = new SearchTextLocatorFactory();

    public SearchTextLocatorFactory() {}

    public static LocatorFactory getFactory() {
        return factory;
    }

    public static void setFactory(LocatorFactory factory) {
        SearchTextLocatorFactory.factory = factory;
    }

    public By createLocator(String type, String value) {
        By locator = null;

        if (type == "id") {
            locator = By.id(value);
        } else if (type == "name") {
            locator = By.name(value);
        } else if (type == "xpath") {
            locator = By.xpath(value);
        } else if (type == "linkText") {
            locator = By.linkText(value);
        } else if (type == "partialLinkText") {
            locator = By.partialLinkText(value);
        } else if (type == "tagName") {
            locator = By.tagName(value);
        } else if (type == "className") {
            locator = By.className(value);
        } else if (type == "cssSelector") {
            locator = By.cssSelector(value);
        }
        return locator;
    }
}

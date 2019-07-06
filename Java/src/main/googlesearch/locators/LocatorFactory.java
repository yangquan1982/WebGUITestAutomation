package locators;

import org.openqa.selenium.By;

public interface LocatorFactory {
    By createLocator(String type, String value);
}

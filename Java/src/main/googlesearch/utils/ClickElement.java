package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickElement {

    public static void clickByLocator(WebDriver driver, By locator) {
        Actions actions = new Actions(driver);
        actions.moveToElement(driver.findElement(locator)).click().build().perform();
    }
}

package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BasePage;

public abstract class BasePageElement {
    protected By locator;
    protected BasePage page;

    public void setValue(String value) {
        WebDriverWait wait = new WebDriverWait(page.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        page.getDriver().findElement(locator).clear();
        page.getDriver().findElement(locator).sendKeys(value);
    }
    public String getValue() {
        WebDriverWait wait = new WebDriverWait(page.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return page.getDriver().findElement(locator).getAttribute("value");
    }

    public By getLocator() {
        return locator;
    }

    public void setLocator(By locator) {
        this.locator = locator;
    }
}

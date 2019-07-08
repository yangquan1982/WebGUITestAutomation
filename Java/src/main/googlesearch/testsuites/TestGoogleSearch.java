package testsuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.Assert;
import pages.SearchPage;
import pages.SearchResultsPage;
import ru.stqa.selenium.factory.WebDriverPool;

public class TestGoogleSearch {

    WebDriver driver;

    @BeforeMethod
    public void startBrowser() {
        driver = WebDriverPool.DEFAULT.getDriver(DesiredCapabilities.chrome());
        driver.get("https://www.google.com/");
    }

    @AfterSuite
    public void stopAllBrowsers() {
        WebDriverPool.DEFAULT.dismissAll();
    }

    @Test
    public void testSearchSelenium() {
        SearchPage sp = new SearchPage(driver);
        sp.setValue("Selenium");
        Assert.assertTrue(sp.isTitleMatches());
        sp.clickSearchBtn2();
        SearchResultsPage srp = new SearchResultsPage(driver);
        Assert.assertTrue(srp.isResultFound());
    }
}

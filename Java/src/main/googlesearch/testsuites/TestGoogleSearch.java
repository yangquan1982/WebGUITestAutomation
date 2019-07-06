package testsuites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import ru.stqa.selenium.factory.WebDriverPool;

public class TestGoogleSearch {

    WebDriver driver;

    @BeforeMethod
    public void startBrowser() {
        driver = WebDriverPool.DEFAULT.getDriver(DesiredCapabilities.chrome());
    }

    @AfterSuite
    public void stopAllBrowsers() {
        WebDriverPool.DEFAULT.dismissAll();
    }

    @Test
    public void test1() {
//        doSomething();
    }
}

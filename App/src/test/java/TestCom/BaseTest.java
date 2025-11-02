package TestCom;

import PageObj.LandingPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.time.Duration;

/**
 * Base test class providing core test setup and teardown functionality
 */
public class BaseTest {
    protected static WebDriver driver;
    private static final String BASE_URL = "https://www.saucedemo.com/";
    private static final Duration IMPLICIT_WAIT = Duration.ofSeconds(10);

    @BeforeTest
    @Parameters({"browser"})
    public WebDriver init(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
            setupDriver();
            return driver;
        }
        return null;
    }

    /**
     * Sets up common driver configurations
     */
    private void setupDriver() {
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
    }

    /**
     * Initializes the application with base URL and waits
     */
    public static void app() {
        driver.get(BASE_URL);
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT);
        new LandingPage(driver);
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.manage().deleteAllCookies();
            driver.quit();
        }
    }
}

package AutomationTest.BrightTalkTest;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import java.text.MessageFormat;

public class BrowserSetup extends BasePage {

    public static String browser = null;
    private static final String CHROME_WIN = "src\\test\\java\\BrowserDirectory\\chromedriver.exe";
    private static final String EDGE = "src\\test\\java\\BrowserDirectory\\MicrosoftWebDriver.exe";
    private static final String FIREFOX_WIN = "src\\test\\java\\BrowserDirectory\\geckodriver.exe";
    private static final String CHROME_MAC = "src/test/java/BrowserDirectory/chromedriver";


    /**
     * Browser property location /src/test/java/TestData/TestData.properties
     */


    /**
     * Function for multi browser
     */
    public void selectBrowser() {
        browser = LoadProp.getproperty("Browser");

        if (browser.equalsIgnoreCase("Chrome")) {
            System.setProperty("webdriver.chrome.driver", CHROME_WIN);
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", EDGE);
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("Firefox")) {
            System.setProperty("webdriver.gecko.driver", FIREFOX_WIN);
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chromeMac")) {
            System.setProperty("webdriver.chrome.driver", CHROME_MAC);
            driver = new ChromeDriver();
        } else {
            Assert.fail(MessageFormat.format("Wrong Browser: {0}", browser));
        }
    }
}

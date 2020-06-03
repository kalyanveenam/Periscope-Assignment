package AutomationTest.BrightTalkTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hook extends BasePage {

    BrowserSetup browsersetup = new BrowserSetup();
    private static final int WAIT_SEC = 20;

    @Before
    public void initializeTest() {
        browsersetup.selectBrowser();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(WAIT_SEC, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(WAIT_SEC, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(WAIT_SEC, TimeUnit.SECONDS);
        new iniClass();
    }

    @After
    public void screenshot() {
        driver.close();
        driver.quit();
    }
}


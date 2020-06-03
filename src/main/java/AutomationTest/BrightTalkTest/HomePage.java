package AutomationTest.BrightTalkTest;

import static AutomationTest.BrightTalkTest.LoadProp.getproperty;



public class HomePage extends BasePage {


	
    public static void homePage() {
    	
    	
    	
    	
        driver.get(getproperty("url"));
    }
}



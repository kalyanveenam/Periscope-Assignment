package AutomationTest.BrightTalkTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp extends BasePage {

    static Properties prop;
    static FileInputStream input;
    public static String testData = "/src/test/java/TestData/TestData.properties";

    private static File currentDirectory = new File(new File("").getAbsolutePath());


    public static String getproperty(String key) {
        prop = new Properties();

        try {
            input = new FileInputStream(currentDirectory + testData);
            prop.load(input);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop.getProperty(key);
    }
}

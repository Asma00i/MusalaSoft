package base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {


    public static Properties getDriver = loadProperties(System.getProperty("src/main/config/config.properties"));
    public static Properties getURL = loadProperties(System.getProperty("src/main/config/config.properties"));


    private static Properties loadProperties(String filePath) {

        Properties pro = new Properties();

        try {
            FileInputStream stream = new FileInputStream(filePath);
            pro.load(stream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return pro;
    }

//        String url = LoadProperties.getURL.getProperty("url");
//        String browser = LoadProperties.getDriver.getProperty("browser");
//    private void startDriver(String browser) {
//
//
//        {
//            if (browser.equalsIgnoreCase(browser) {
//                String GettingChromePath = System.getProperty("user.dir") + "resources/chromedriver.exe"; //Get Driver location
//                System.setProperty("webdriver.chrome.driver", GettingChromePath);
//                driver = new ChromeDriver();
//            } else {
//                String GettingFirefoxPath = System.getProperty("user.dir") + "resources/geckodriver.exe";
//                System.setProperty("webdriver.gecko.driver", GettingFirefoxPath);
//                driver = new FirefoxDriver();
//            }
//        }


}


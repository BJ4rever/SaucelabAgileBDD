package SauceLabAgileBDD;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

/**
 * Created by Gamita on 19/05/2017.
 */
public class BrowserSelector extends BasePage {

    LoadProp loadProp = new LoadProp();
//    String browser = loadProp.getProperty("browser");
//
//    public void selectBrowser(){
//
//        if(browser.equalsIgnoreCase("firefox")){
//            driver = new FirefoxDriver();
//
//        }else if (browser.equalsIgnoreCase("chrome")){
//            System.setProperty("webdriver.chrome.driver","C:\\Users\\Gamita\\IdeaProjects\\SaucelabAgileBDD\\src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
//            DesiredCapabilities chromeCapablities = DesiredCapabilities.chrome();
//            ChromeOptions options = new ChromeOptions();
//            options.addArguments("--disable-extensions","--disable-infobars","--disable-save-password-bubble","--disable-notification");
//            chromeCapablities.setCapability(ChromeOptions.CAPABILITY, options);
//            driver = new ChromeDriver(options);
//
//        }else if (browser.equalsIgnoreCase("ie")){
//            System.setProperty("webdriver.ie.driver","C:\\Users\\Gamita\\IdeaProjects\\SaucelabAgileBDD\\src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
//            driver = new InternetExplorerDriver();
//
//        }else {
//            System.out.println("Browser name is wrong");
//        }
//
//    }


    public static final String USERNAME = "lotus7143";
    public static final String ACCESS_KEY = "2e41d680-4cb6-4418-bd3e-ac6cc8ef6eb2";
    public static final String URL = "http://" + USERNAME + ":" + ACCESS_KEY + "@ondemand.saucelabs.com:80/wd/hub";

    public static void selectBrowser()throws Exception{
        DesiredCapabilities caps = DesiredCapabilities.chrome();
        caps.setCapability("platform","Windows 10");
        caps.setCapability("version","43.0");
        driver = new RemoteWebDriver(new URL(URL), caps);
    }
}
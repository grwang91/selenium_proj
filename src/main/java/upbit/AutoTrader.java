package upbit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoTrader {

    private WebDriver driver;
    private JavascriptExecutor js;
    private static AutoTrader autoTrader = null;

    private AutoTrader() {

        System.setProperty("webdriver.chrome.driver","chromedriver2.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("debuggerAddress", "127.0.0.1:9222");

//        driver = new ChromeDriver(options);

        //System.setProperty("webdriver.gecko.driver","geckodriver.exe");
        //options.addArguments("user-agent=Mozilla/5.0 (Windows Phone 10.0; Android 4.2.1; Microsoft; Lumia 640 XL LTE) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/42.0.2311.135 Mobile Safari/537.36 Edge/12.10166");
        driver = new ChromeDriver(options);

        //driver.get("https://upbit.com");

        js = (JavascriptExecutor) driver;
    }

    public static AutoTrader getAutoTrader() {
        if(autoTrader==null) {
            autoTrader = new AutoTrader();
        }
        return autoTrader;
    }
}

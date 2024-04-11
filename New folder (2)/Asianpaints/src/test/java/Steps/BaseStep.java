package Steps;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class BaseStep 
{
public static WebDriver driver;
public static ChromeOptions options;
public static WebDriver setupDriver()
{
        System.out.println("Launching Chrome Browser");
        String userProfile ="C:\\Users\\SUMAHALI\\AppData\\Local\\Google\\Chrome\\User Data";
        //System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUMAHALI\\eclipse-workspace\\New folder\\Asianpaints\\src\\test\\resources\\driver\\chromedriver.exe");	 
        options = new ChromeOptions();
        options.addArguments("--user-data-dir="+userProfile);
        options.addArguments("--profile-directory=Default");
        options.addArguments("--start-maximized");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
        return driver;
    

    }
}




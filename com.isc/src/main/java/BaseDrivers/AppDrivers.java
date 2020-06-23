package BaseDrivers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppDrivers 
{
	 public static WebDriver driver = null;
     public static Properties config = new Properties();
     
    
     public void initialize() throws IOException
     {
    	 FileInputStream fis = new FileInputStream("C:\\Users\\bvikram\\eclipse-workspace\\com.isc\\src\\main\\java\\Property\\config.properties");
    	 config.load(fis);
    	 
    	 if(config.getProperty("BrowserName").equalsIgnoreCase("Chrome"))
    	 {
    		 System.setProperty("webdriver.chrome.driver", config.getProperty("ChromeDriver_Path"));
    		 driver = new ChromeDriver();
    	 }
    	 else
    	 {
    		 System.setProperty("webdriver.gecko.driver", config.getProperty("FirefoxDrive_Path"));
    		 driver = new FirefoxDriver();
    	 }
    	 driver.manage().window().maximize();
    	 driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
    	 driver.navigate().to(config.getProperty("URL"));
     }
}

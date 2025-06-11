package Utility;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import org.openqa.selenium.WebDriver;

//Here I should add the configurations of browser
public class BrowserDriver {

	public static ChromeOptions option;
	public static WebDriver driver;
    protected static Actions actions;
    protected static WebDriverWait wait;
	
	//example
	public BrowserDriver()
	{
		//configuration for example
		/*option = new ChromeOptions();
		 * More config can be added
		 * */
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	}
	public void close()
	{
		driver.close();
	}
}

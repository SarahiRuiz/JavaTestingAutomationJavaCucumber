package Utility;

import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;
import org.openqa.selenium.WebDriver;

//Here I should add the configurations of browser
public class BrowserDriver {

	protected static ChromeOptions option;
	protected static WebDriver driver;
	protected static Actions actions;
	protected static WebDriverWait wait;
	
	//example
	protected BrowserDriver()
	{
		//configuration for example
		/*option = new ChromeOptions();
		 * More config can be added
		 * */
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //Implicit wait config
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}
	protected void close()
	{
		driver.close();
	}
}

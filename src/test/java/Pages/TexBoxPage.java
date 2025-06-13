package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utility.BrowserDriver;

public class TexBoxPage extends BrowserDriver{
	public static String fullNameInput_Id = "userName";
	public static String emailInput_Id = "userEmail";
	
	public static void FillFullName(String FullName)
	{
		WebElement fullNameInput = driver.findElement(By.id(fullNameInput_Id));
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", fullNameInput);
		fullNameInput.sendKeys(FullName);
	}
	public static void FillEmail(String Email)
	{
		WebElement emailInput = driver.findElement(By.id(emailInput_Id));
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", emailInput);
		emailInput.sendKeys(Email);
	}
}

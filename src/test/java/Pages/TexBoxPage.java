package Pages;

import org.openqa.selenium.By;

import Utility.BrowserDriver;

public class TexBoxPage extends BrowserDriver{
	public static String fullNameInput_Id = "userName";
	public static String emailInput_Id = "userEmail";
	
	public static void Fill_Full_Name(String FullName)
	{
		driver.findElement(By.id(fullNameInput_Id)).sendKeys(FullName);
	}
	public static void Fill_Email(String Email)
	{
		driver.findElement(By.id(emailInput_Id)).sendKeys(Email);
	}
}

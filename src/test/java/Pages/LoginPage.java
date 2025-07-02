package Pages;

import org.openqa.selenium.By;

import Utility.BrowserDriver;

public class LoginPage extends BrowserDriver{
	public static String UserNameInput_Id = "user-name";
	public static String PasswordInput_Id = "password";
	public static String LoginButton_Id = "login-button";
	
	public static void FillUserName(String userName)
	{
		driver.findElement(By.id(UserNameInput_Id)).sendKeys(userName);
	}
	public static void FillPassword(String password)
	{
		driver.findElement(By.id(PasswordInput_Id)).sendKeys(password);
	}
	public static void ClickOnLoginButton()
	{
		driver.findElement(By.id(LoginButton_Id)).click();
	}
}

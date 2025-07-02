package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utility.BrowserDriver;

public class TexBoxPage extends BrowserDriver{
	public static String fullNameInput_Id = "userName";
	public static String emailInput_Id = "userEmail";
	public static String currentAddressInput_Id = "currentAddress";
	public static String permanentAddressInput_Id = "permanentAddress";
	public static String submitButton_Id = "submit";
	public static String ResultsBox_Id = "output";
	
	public static void FillFullName(String FullName)
	{
		WebElement fullNameInput = driver.findElement(By.id(fullNameInput_Id));
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", fullNameInput);
		fullNameInput.sendKeys(FullName);
	}
	public static void FillEmail(String email)
	{
		WebElement emailInput = driver.findElement(By.id(emailInput_Id));
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", emailInput);
		emailInput.sendKeys(email);
	}
	public static void FillCurrentAddress(String currentAddress)
	{
		WebElement currentAddressInput = driver.findElement(By.id(currentAddressInput_Id));
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", currentAddressInput);
		currentAddressInput.sendKeys(currentAddress);
	}
	public static void FillPermanentAddress(String permanentAddress)
	{
		WebElement permanentAddressInput = driver.findElement(By.id(permanentAddressInput_Id));
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", permanentAddressInput);
		permanentAddressInput.sendKeys(permanentAddress);
	}
	public static void ClickSubmitButton()
	{
		WebElement submitInput = driver.findElement(By.id(submitButton_Id));
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", submitInput);
		submitInput.click();
	}
	public static void VerifyBoxResultDisplayed()
	{
		WebElement resultsBox = driver.findElement(By.id(ResultsBox_Id));
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", resultsBox);
	}
}

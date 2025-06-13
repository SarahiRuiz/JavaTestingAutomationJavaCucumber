package Pages;

import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utility.BrowserDriver;
import Utility.Hooks;

public class RadioButonPage extends BrowserDriver{
	public static String yesRadioButton_Id = "yesRadio";
	public static String impressiveRadioButton_Id = "impressiveRadio";
	public static String message_xpath = "//span[@class='text-success']";
	public static String successYesMessage_xpath = "//p[text()='You have selected ']/span[text()='Yes']";
	
	public static void ClickYesButton()
	{
		WebElement radioYesButton = driver.findElement(By.id(yesRadioButton_Id));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", radioYesButton);
        actions.click(radioYesButton).perform();
	}
	public static void VerifySuccessfulYesButtonClicked()
	{
		WebElement successYesMessage = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath(successYesMessage_xpath)));
	}
	public static void ClickDynamicRadioButton(String radioButtonOption)
	{
		String radioButtonId = "";
		switch(radioButtonOption)
		{
		case "Yes":
			radioButtonId = yesRadioButton_Id;
			break;
		case "Impressive":
			radioButtonId = impressiveRadioButton_Id;
			break;
		}
		WebElement radioButton = driver.findElement(By.id(radioButtonId));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", radioButton);
        actions.click(radioButton).perform();
	}
	public static void VerifySuccessfulDynamicButtonClicked(String expectedResult)
	{
		WebElement successMessage = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath(message_xpath)));
		assertEquals(expectedResult, successMessage.getText());
	}

}

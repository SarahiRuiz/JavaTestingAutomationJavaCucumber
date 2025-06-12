package Pages;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utility.BrowserDriver;

public class RadioButonPage extends BrowserDriver{
	public static String yesRadioButton_Id = "yesRadio";
	public static String successYesMessage_xpath = "//p[text()='You have selected ']/span[text()='Yes']";
	
	public static void ClickYesButton()
	{
		WebElement radioYesButton = driver.findElement(By.id(yesRadioButton_Id));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", radioYesButton);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(yesRadioButton_Id)));
        actions.click(radioYesButton).perform();
	}
	public static void VerifySuccessfulYesButtonClicked()
	{
		WebElement successYesMessage = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath(successYesMessage_xpath)));
        //assertTrue("Verify success yes is displayed.", successYesMessage.isDisplayed());
	}

}

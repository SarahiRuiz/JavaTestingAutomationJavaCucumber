package stepsDefinitions;


import io.cucumber.java.en.*;
import io.cucumber.java.After;
import io.cucumber.java.Before;

import java.time.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import io.github.bonigarcia.wdm.WebDriverManager;
//import org.junit.Assert.assertTrue;

public class RadioButtonSteps {

    protected static WebDriver driver;
    protected static Actions actions;
    protected static WebDriverWait wait;

    @Before
    public void SetUpTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        actions = new Actions(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @After
    public void TearDownTest() {
        if (driver != null) {
            driver.quit();
        }
    }

    @When("Going To Page {string}")
    public void goingToPage(String urlPage) {
        driver.get(urlPage);
    }

    @And("Wait And Select Radio Button Yes")
    public void waitAndSelectRadioButtonYes() {
        WebElement radioYesButton = driver.findElement(By.id("yesRadio"));
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", radioYesButton);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("yesRadio")));
        actions.click(radioYesButton).perform();
    }

    @Then("Verify Radio Button Yes Selected")
    public void verifyRadioButtonYesSelected() {
        WebElement successYesMessage = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//p[text()='You have selected ']/span[text()='Yes']")));
       // assertTrue("Verify success yes is displayed.", successYesMessage.isDisplayed());
    }
}

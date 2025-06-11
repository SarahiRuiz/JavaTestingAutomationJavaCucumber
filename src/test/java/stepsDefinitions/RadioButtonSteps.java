package stepsDefinitions;


import io.cucumber.java.en.*;
import Utility.BrowserDriver;
import static Pages.RadioButonPage.*;

public class RadioButtonSteps extends BrowserDriver {


    @Given("Going To Page {string}")
    public void goingToPage(String urlPage) {
        driver.get(urlPage);
    }

    @When("Wait And Select Radio Button Yes")
    public void waitAndSelectRadioButtonYes() {
    	ClickYesButton();
    }

    @Then("Verify Radio Button Yes Selected")
    public void verifyRadioButtonYesSelected() {
    	VerifySuccessfulYesButtonClicked();
    }
}

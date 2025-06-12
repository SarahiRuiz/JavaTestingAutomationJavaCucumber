package stepsDefinitions;


import io.cucumber.java.en.*;
import Utility.BrowserDriver;
import static Pages.RadioButonPage.*;

public class RadioButtonSteps extends BrowserDriver {


    @Given("Going To Page {string}")
    public void Going_To_Page(String urlPage) {
        driver.get(urlPage);
    }

    @When("Wait And Select Radio Button Yes")
    public void Wait_And_Select_Radio_Button_Yes() {
    	ClickYesButton();
    }

    @Then("Verify Radio Button Yes Selected")
    public void Verify_Radio_Button_Yes_Selected() {
    	VerifySuccessfulYesButtonClicked();
    }
    
    @When("Click Dynamic Radio Button {string}")
    public void Click_Dynamic_Radio_Button(String radioButtonOption) {
    	ClickDynamicRadioButton(radioButtonOption);
    }
    
    @Then("Verify Radio Button {string} Selected")
    public void Verify_Radio_Button_Selected(String expectedResult) {
    	VerifySuccessfulDynamicButtonClicked(expectedResult);
    }
}

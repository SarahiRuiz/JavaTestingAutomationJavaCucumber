package stepsDefinitions;

import Utility.BrowserDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

public class TexBoxSteps extends BrowserDriver{
	/*@Given("Going To Page {string}")
    public void Going_To_Page(String urlPage) {
        driver.get(urlPage);
    }*/

    @When("Fill Full Name {string}")
    public void Fill_Full_Name(String FullName) {
    	Fill_Full_Name(FullName);
    }
    
    @And("Fill Email {string}")
    public void Fill_Email(String Email) {
    	Fill_Email(Email);
    }

    /*@Then("Verify Radio Button Yes Selected")
    public void Verify_Radio_Button_Yes_Selected() {
    	VerifySuccessfulYesButtonClicked();
    }*/
}

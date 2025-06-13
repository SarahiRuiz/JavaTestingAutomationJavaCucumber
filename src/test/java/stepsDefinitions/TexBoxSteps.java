package stepsDefinitions;

import Utility.BrowserDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;

import static Pages.TexBoxPage.*;

public class TexBoxSteps extends BrowserDriver{
	@Given("Going To Page Text Box")
    public void Going_To_Page() {
        driver.get("https://demoqa.com/text-box");
    }

    @When("Fill Full Name {string}")
    public void Fill_Full_Name(String FullName) {
    	FillFullName(FullName);
    }
    
    @And("Fill Email {string}")
    public void Fill_Email(String Email) {
    	FillEmail(Email);
    }

    /*@Then("Verify Radio Button Yes Selected")
    public void Verify_Radio_Button_Yes_Selected() {
    	VerifySuccessfulYesButtonClicked();
    }*/
}

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
    
    @And("Fill Current Address {string}")
    public void Fill_Current_Address(String currentAddress) {
    	FillCurrentAddress(currentAddress);
    }
    
    @And("Fill Permanent Address {string}")
    public void Fill_Permanent_Address(String permanentAddress) {
    	FillPermanentAddress(permanentAddress);
    }
    
    @And("Click Submit")
    public void Click_Submit_Button() {
    	ClickSubmitButton();
    }

    @Then("Verify Box Result Displayed")
    public void Verify_Box_Result_Displayed() {
    	VerifyBoxResultDisplayed();
    }
}

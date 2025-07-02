package stepsDefinitions;

import Utility.BrowserDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static Pages.LoginPage.*;
import static Pages.ProductsPage.*;


public class FilterProductsSteps extends BrowserDriver{

	@Given("Go To Page Sauce Demo")
	public void Go_To_Page_SauceDemo()
	{
		driver.get("https://www.saucedemo.com/");
	}
	@And("Fill User Name {string}")
	public void Fill_User_Name(String userName)
	{
		FillUserName(userName);
	}
	@And("Fill Password {string}")
	public void Fill_Password(String password)
	{
		FillPassword(password);
	}
	@And("Click on Login Button")
	public void Click_On_Login_Button()
	{
		ClickOnLoginButton();
	}
	@When("Select Prodcut Filter By Index {int}")
	public void Select_Prodcut_Filter_By_Index(int index)
	{
		FilterDropDownByIndex(index);
	}
	@When("Select Prodcut Filter By Value {string}")
	public void Select_Prodcut_Filter_By_Value(String value)
	{
		FilterDropDownByValue(value);
	}
	@When("Select Prodcut Filter By Element Visible {string}")
	public void Select_Prodcut_Filter_By_Element_Visible(String elementVisible)
	{
		FilterDropDownByElementVisible(elementVisible);
	}
	@Then("Verify First Title")
	public void Verify_First_Title()
	{
		FirstOptionShouldBe();
	}
}

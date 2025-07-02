package Pages;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import Utility.BrowserDriver;


public class ProductsPage extends BrowserDriver{

	public static String ProdcutFilterDropdown_Class = "product_sort_container";
	public static String FirstResultTitle_Class = "inventory_item_name ";
	
	public static void FilterDropDownByIndex(int index)
	{
		Select selectProductFilerDropdown = new Select(driver.findElement(By.className(ProdcutFilterDropdown_Class)));
		selectProductFilerDropdown.selectByIndex(index);
	}
	public static void FilterDropDownByValue(String value)
	{
		Select selectProductFilerDropdown = new Select(driver.findElement(By.className(ProdcutFilterDropdown_Class)));
		selectProductFilerDropdown.selectByValue(value);
	}
	public static void FilterDropDownByElementVisible(String visibleElement)
	{
		Select selectProductFilerDropdown = new Select(driver.findElement(By.className(ProdcutFilterDropdown_Class)));
		selectProductFilerDropdown.selectByVisibleText(visibleElement);
	}
	public static void FirstOptionShouldBe()
	{
		List<WebElement> firstOptionTitles = driver.findElements(By.className(FirstResultTitle_Class));
		String getTextfirstOptionTitle = firstOptionTitles.get(0).getText();
		Assert.assertEquals(getTextfirstOptionTitle, "Sauce Labs Onesie");
	}
}

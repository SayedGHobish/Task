package pageLayar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class MyAccount extends PageBais{

	public MyAccount(WebDriver driver) {
		super(driver);
		actions = new Actions(driver);
	}
	
	@FindBy(linkText = "Women")
	WebElement womenMenu;
	
	@FindBy(linkText = "Blouses")
	WebElement blouse;
	
	@FindBy(linkText = "Blouse")
	WebElement product;
	
	@FindBy(id = "add_to_cart")
	WebElement addChart;
	
		
	public void selectBlouseMenu()
	{
		womenMenu.click();
		blouse.click();
	}
	
	public void addingItem()
	{
		product.click();
		addChart.click();
	}

}

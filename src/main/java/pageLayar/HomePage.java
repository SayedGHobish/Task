package pageLayar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PageBais {

	public HomePage(WebDriver driver) {
		super(driver);
	}

	@FindBy(linkText = "Sign in")
	WebElement registerLink;

	public void openToRegister()
	{
		registerLink.click();
	}
}

package pageLayar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ValidationProduct extends PageBais{

	public ValidationProduct(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath = "//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	WebElement myUser;

	@FindBy(xpath = "//*[@id=\"center_column\"]/div/div[1]/ul/li[1]/a")
	WebElement myHistory;

	public void myHistoryOfOrder()
	{
		myUser.click();
		myHistory.click();

	}
}

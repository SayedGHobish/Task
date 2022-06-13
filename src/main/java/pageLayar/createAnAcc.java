package pageLayar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class createAnAcc extends PageBais{

	public createAnAcc(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(id ="email_create")
	WebElement writeEmail;
	
	@FindBy(id = "SubmitCreate")
	WebElement createAccount;
	
	public void creates(String email)
	{
		writeEmail.sendKeys(email);
		createAccount.click();
	}

}

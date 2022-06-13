package pageLayar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutProcedure extends PageBais {

	public CheckoutProcedure(WebDriver driver) {
		super(driver);
	}
	@FindBy(linkText= "Proceed to checkout")
	WebElement checkOut1;
	
	@FindBy(linkText= "Proceed to checkout")
	WebElement checkOut2;
	
	@FindBy(name = "processAddress")
	WebElement checkOut3;
	
	@FindBy(id="uniform-cgv")
	WebElement terms;
	
	@FindBy(name = "processCarrier")
	WebElement checkProceed;
	
	@FindBy(css = "a.bankwire")
	WebElement bankWire;
	
	@FindBy(className = "button btn btn-default button-medium")
	WebElement confirm;
	
	public void proceedCheckout()
	{
		
		checkOut1.click();
		checkOut2.click();
		checkOut3.click();
		terms.click();
		checkProceed.click();
		bankWire.click();
		confirm.click();
	}

	
}

package pageLayar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class PageBais {
	
	protected WebDriver driver;
	public Actions actions;

	
	public PageBais(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	

}

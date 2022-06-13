package pageLayar;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterPage extends PageBais{

	public UserRegisterPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id ="id_gender1")
	WebElement genderBtn;
	
	@FindBy(id = "customer_firstname")
	WebElement firstNameTxt;
	
	@FindBy(id= "customer_lastname")
	WebElement lastNameTxt;
	
	@FindBy(id="passwd")
	WebElement passwordTxt;
	
	@FindBy(id="uniform-newsletter")
	WebElement optionBtn;
	
	@FindBy(id="uniform-optin")
	WebElement optionsBtn;
	
	@FindBy(id="company")
	WebElement cmpanyName;

	@FindBy(id="address1")
	WebElement address;
	
	@FindBy(id="city")
	WebElement cityTxt;
	
	@FindBy(id="id_state")
	WebElement statelist;
	
	@FindBy(id="postcode")
	WebElement postalCodeTxt;
	
	@FindBy(id="id_country")
	WebElement contryList;
	
	@FindBy(id="other")
	WebElement info;
	
	@FindBy(id="phone_mobile")
	WebElement mobileNumTxt;
	
	
	@FindBy(id="submitAccount")
	WebElement registerBtn;
	
	@FindBy(css="p.info-account")
	public 
	WebElement RegisterDone;
	
	public void confirmRegister(String firstName,String lastName, String passwords, String companyNa, String addres, String cityies, 
			String state,String postal, String contry , String information,String number)
	{
		genderBtn.click();
		firstNameTxt.sendKeys(firstName);
		lastNameTxt.sendKeys(lastName);
		passwordTxt.sendKeys(passwords);
		optionBtn.click();
		optionsBtn.click();
		cmpanyName.sendKeys(companyNa);
		address.sendKeys(addres);
		cityTxt.sendKeys(cityies);
		statelist.sendKeys(state);
		postalCodeTxt.sendKeys(postal);
		contryList.sendKeys(contry);
		info.sendKeys(information);
		mobileNumTxt.sendKeys(number);
		registerBtn.click();	
	}
	
	
	
}

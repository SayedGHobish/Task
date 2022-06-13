package Vois.Task;

import java.io.IOException;

import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import data.ExcelReader;
import pageLayar.CheckoutProcedure;
import pageLayar.HomePage;
import pageLayar.MyAccount;
import pageLayar.UserRegisterPage;
import pageLayar.ValidationProduct;
import pageLayar.createAnAcc;

public class UserRegisterTest extends TestBais{
	
	@DataProvider( name="ExcelData")
	public Object [][] UserRegisterData() throws IOException
	{
		ExcelReader ER = new ExcelReader();

		return ER.getExcelData();
	}
	
	HomePage signObj;
	createAnAcc createObj;
	UserRegisterPage registerationObj;
	
	@Test(dataProvider = "ExcelData")
	public void userRegisterDone(String email,String firstName,String lastName, String passwords, String companyNa, String addres, String cityies, 
			String state,String postal, String contry ,String information,String number)
	{
		
		signObj = new HomePage(driver);
		signObj.openToRegister();
		
		createObj = new createAnAcc(driver);
		createObj.creates(email);
		
		registerationObj = new UserRegisterPage(driver);
		registerationObj.confirmRegister(firstName, lastName, passwords, companyNa, addres, cityies, state, 
											postal, contry, information, number);
		Assert.assertTrue(registerationObj.RegisterDone.getText().contains("Welcome to your account. Here you can manage all of your personal information and orders"));
	}
	
	MyAccount hoverObj;
	
	@Test(dependsOnMethods = {"userRegisterDone"})
	public void hovrblouses()
	{
		hoverObj = new MyAccount(driver);
		hoverObj.selectBlouseMenu();
		hoverObj.addingItem();
	}
	
	CheckoutProcedure checkObj;
	
	@Test(dependsOnMethods = {"hovrblouses"})
	public void checkOut()
	{
		checkObj = new CheckoutProcedure(driver);
		checkObj.proceedCheckout();
	}
	
	ValidationProduct validObj;
	
	@Test(dependsOnMethods = {"checkOut"})
	public void myCart()
	{
		validObj = new ValidationProduct(driver);
		validObj.myHistoryOfOrder();
		AssertJUnit.assertEquals(2, rows.size());
		
		for (WebElement row : rows)
		{
			java.util.List<WebElement> cols = row.findElements(By.tagName("td"));
			for(WebElement col : cols) {
				System.out.println(col.getText() + "\t");
			}
			System.out.println();
		}

	}
}

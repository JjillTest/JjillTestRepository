package com.JJill.testcases;

import java.awt.AWTException;

import org.sikuli.script.FindFailed;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginFunctionality;
import pojo.TestData;
import testbase.TestBase;
import utilities.Utility;

public class TestCases extends TestBase{
	private static Utility util; 
	private static LoginFunctionality loginpage;


	@BeforeMethod(alwaysRun=true)
	public void setup() {
		TestBase.testData.set(new TestData());
		Initialization();
		util = new Utility();
		loginpage=new LoginFunctionality();
	}
	
	@Test() 
	public void verifyLoginInFunctionality() throws InterruptedException{
		loginpage.JJill_Login()
		.ConnectingMethod()
		.JJill_Logout();
	}
//	
	@Test(groups= {"Staging"})
	public void verifyCheckoutFunctionality() throws InterruptedException, AWTException{
		loginpage.JJill_Login()
		.selectClothingDepartment()
		.selectItemDetails()
		.checkoutProcess()
		.savedaddress_paymentPage_addnewJjillCC()
		//.addnewAddress()
		//.newaddress_paymentPage_addnewJjillCC()
		.orderReview_PlaceOrder()
		.ReviewOrderDetails()
		.navigateToHomePage()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production","V9-16X"}) 
	public void verifyPDPFunctionality() throws InterruptedException, AWTException{
		loginpage.JJill_Login()
		.selectClothingDepartment()
		.ConnectingMethodLogin_PDP()
		.validatePdpPage()
		.navigateToHomePage()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production","V9-16X"}) 
	public void verifyPLPFunctionality() throws InterruptedException{
		loginpage.JJill_Login()
		.selectSaleDepartment()
		.ConnectingMethodLogin_PLP()
		.validatePlpPage()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production","V9-16X"})
	public void verifySearchFunctionality() throws InterruptedException{
		loginpage.JJill_Login()
		.ConnectingMethodLogin_PLP()
		.validateSearchFunctionality()
		.navigateToHomePage()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production","V9-16X"})
	public void verifyCompletetheLook() throws InterruptedException{
		loginpage.JJill_Login()
		.ConnectingMethodLogin_PLP()
		.validateCompletetheLook()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production","V9-16X"})
	public void verifyPDP_CompletetheLook() throws InterruptedException{
		loginpage.JJill_Login()
		.ConnectingMethodLogin_PLP()
		.validatePDPCompletetheLook()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production"}) 
	public void verifyShoptheLook() throws InterruptedException, FindFailed{
		loginpage.JJill_Login()
		.selectSTLDepartment()
		.ConnectingMethodLogin_PLP()
		.validateSTLPlpPage()
		.JJill_STLLogout();
	}
	
	@Test(groups={"SmokeTest","Production","V9-16X"}) 
	public void verifyMonetateBadging() throws InterruptedException{
		loginpage.JJill_Login()
		.selectSaleDepartment()
		.ConnectingMethodLogin_Pagination()
		.validateMonetateBadging()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest"}) 
	public void verifyremoveProductsShoppingbag() throws InterruptedException{
		loginpage.JJill_Login()
		.selectshoppingbag()
		.removeProductsShoppingbag()
		.navigateToHomePage()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production","V9-16X"}) 
	public void verifyPaginationFunctionality() throws InterruptedException, AWTException{
		loginpage.JJill_Login()
		.selectClothingDepartment()
		.ConnectingMethodLogin_Pagination()
		.selectPaginationOption()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production","V9-16X"}) 
	public void verifyHeaderFunctionality() throws InterruptedException{
		loginpage.JJill_Login()
		.ConnectingMethodLogin_Header()
		.validateHeader()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production","V9-16X"}) 
	public void verifyFooterFunctionality() throws InterruptedException{
		loginpage.JJill_Login()
		.ConnectingMethodLogin_Header()
		.validateFooter()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production"},priority=10) 
	public void verifyInventoryData() throws InterruptedException{
		loginpage.JJill_Login()
		.ConnectingMethodLogin_PDP()
		.validateOOSFunctionality()
		.validateLowInventoryFunctionality()
		.validateBackOrderedFunctionality()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production","V9-16X"},priority=11) 
	public void verifyQuickLookFunctionality() throws InterruptedException, AWTException{
		loginpage.JJill_Login()
		.selectClothingDepartment()
		.ConnectingMethodLogin_PDP()
		.validateQuickLookScreen()
		.navigateToHomePage()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest","Production"},priority=12) 
	public void verifyForgotPasswordFunctionality() throws InterruptedException{
		loginpage.
		JJillLogin_ForgotPassword()
		.JJill_ValidateForgotPassword_Yahoo();
	}
	
	@AfterMethod(alwaysRun=true)
	public void tearDown() {
		driver.close();
	}
	
	@AfterTest(alwaysRun=true)
	public void closeAll()
	{
	driver.quit();	
	}

}

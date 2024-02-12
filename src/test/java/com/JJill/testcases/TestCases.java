package com.JJill.testcases;

import java.awt.AWTException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import jdk.internal.org.objectweb.asm.commons.Method;
import pages.LoginFunctionality;
import pojo.TestData;
import testbase.TestBase;
import utilities.Utility;

public class TestCases extends TestBase{
	private static LoginFunctionality loginpage;
	private  static Utility util; 
	
	
	
	@BeforeMethod(alwaysRun=true)
	public void setup() {
		TestBase.testData.set(new TestData());
		Initialization();
		util = new Utility();
		loginpage=new LoginFunctionality();
	}
	
	
	@Test() 
	public void verifyLoginInFunctionality() throws InterruptedException{
		loginpage.JJill_Registered_Login()
		.ConnectingMethod()
		.JJill_Logout();
	}

	
	@Test(groups={"Preprod_SmokeTest"}) 
	public void verifyPDPFunctionality() throws InterruptedException, AWTException{
		loginpage.JJill_Registered_Login()
		.selectFinalSaleDepartment()
		//.selectSaleDepartment()
		//.selectClothingDepartment()
		.ConnectingMethodLogin_PDP()
		.validatePdpPage()
		.navigateToHomePage()
		.JJill_Logout();
	}
	
	@Test(groups={"Preprod_SmokeTest"}) 
	public void verifyPLPFunctionality() throws InterruptedException{
		loginpage.JJill_Registered_Login()
		.selectSaleDepartment()
		.ConnectingMethodLogin_PLP()
		.validatePlpPage()
		.JJill_Logout();
	}
	
	@Test(groups={"Preprod_SmokeTest"})
	public void verifySearchFunctionality() throws InterruptedException{
		loginpage.JJill_Registered_Login()
		.ConnectingMethodLogin_PLP()
		.validateSearchFunctionality()
		.navigateToHomePage()
		.JJill_Logout();
	}
	
	@Test(groups={"OOS"})
	public void verifyCompletetheLook() throws InterruptedException{
		loginpage.JJill_Registered_Login()
		.ConnectingMethodLogin_PLP()
		.validateCompletetheLook()
		.JJill_Logout();
	}
	
	@Test(groups={"OOS"})
	public void verifyPDP_CompletetheLook() throws InterruptedException{
		loginpage.JJill_Registered_Login()
		.ConnectingMethodLogin_PLP()
		.validatePDPCompletetheLook()
		.JJill_Logout();
	}
	
	@Test(groups={"Preprod_SmokeTest"}) 
	public void verifyShoptheLook() throws InterruptedException{
		loginpage.JJill_Registered_Login()
		.selectSTLProduct()
		//.selectSTLDepartment()
		.ConnectingMethodLogin_PLP()
		.validateSTLPlpPage()
		.JJill_STLLogout();
	}
	
	@Test(groups={"Preprod_SmokeTest"}) 
	public void verifyMonetateBadging() throws InterruptedException{
		loginpage.JJill_Registered_Login()
		.selectSaleDepartment()
		.ConnectingMethodLogin_Pagination()
		.validateMonetateBadging()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest"}) 
	public void verifyremoveProductsShoppingbag() throws InterruptedException{
		loginpage.JJill_Registered_Login()
		.selectshoppingbag()
		.removeProductsShoppingbag()
		.navigateToHomePage()
		.JJill_Logout();
	}
	
	@Test(groups={"Preprod_SmokeTest"}) 
	public void verifyPaginationFunctionality() throws InterruptedException, AWTException{
		loginpage.JJill_Registered_Login()
		.selectClothingDepartment()
		.ConnectingMethodLogin_Pagination()
		.selectPaginationOption()
		.JJill_Logout();
	}
	
	@Test(groups={"Preprod_SmokeTest"}) 
	public void verifyHeaderFunctionality() throws InterruptedException{
		loginpage.JJill_Registered_Login()
		.ConnectingMethodLogin_Header()
		.validateHeader()
		.JJill_Logout();
	}
	
	@Test(groups={"Preprod_SmokeTest"}) 
	public void verifyFooterFunctionality() throws InterruptedException{
		loginpage.JJill_Registered_Login()
		.ConnectingMethodLogin_Header()
		.validateFooter()
		.JJill_Logout();
	}
	
	@Test(groups={"Preprod_SmokeTest"},priority=10) 
	public void verifyInventoryData() throws InterruptedException{
		loginpage.JJill_Registered_Login()
		.selectSaleDepartment()
		.ConnectingMethodLogin_PDP()
		.validateOOSFunctionality()
		.validateLowInventoryFunctionality()
		.validateBackOrderedFunctionality()
		.JJill_Logout();
	}
	
	@Test(groups={"Preprod_SmokeTest"},priority=11) 
	public void verifyQuickLookFunctionality() throws InterruptedException, AWTException{
		loginpage.JJill_Registered_Login_QL()
		.selectFinalSaleDepartment()
		//.selectSaleDepartment()
		//.selectClothingDepartment()
		.ConnectingMethodLogin_PDP()
		.validateQuickLookScreen()
		.navigateToHomePage()
		.JJill_Logout();
	}
	
	@Test(groups={"Preprod_SmokeTest"}) 
	public void verifyPLP_PDP_navigation() throws InterruptedException{
		loginpage.JJill_Registered_Login()
		.selectNewArrivalsDepartment()
		.ConnectingMethodLogin_Pagination()
		.navigatefrom_PDPtoPLP()
		.navigatefromPLPToHomePage()
		.JJill_Logout();
	}
	
	@Test(groups={"SmokeTest"},priority=12) 
	public void verifyForgotPasswordFunctionality() throws InterruptedException{
		loginpage.
		JJillLogin_ForgotPassword()
		.JJill_ValidateForgotPassword_Yahoo();
	}
	
	//Staging
//	@Test(groups= {"Staging"})
//	public void verifyCheckoutFunctionality() throws InterruptedException, AWTException{
//		loginpage.JJill_Login()
//		.selectClothingDepartment()
//		.selectItemDetails()
//		.checkoutProcess()
//		.savedaddress_paymentPage_addnewJjillCC()
//		//.addnewAddress()
//		//.newaddress_paymentPage_addnewJjillCC()
//		.orderReview_PlaceOrder()
//		.ReviewOrderDetails()
//		.navigateToHomePage()
//		.JJill_Logout();
//	}
	
	@Test(groups= {"Checkout", "Fixed"})
	public void verify_Guest_MajorCC_CheckoutFunctionality() throws InterruptedException, AWTException{
		loginpage.JJill_GuestLogin()
		.selectClothingDepartment()
		.selectItemDetails()
		.checkoutProcess()
		.proceedtocheckoutasGuest()
		.addAddress()
		.enterMajorCCPaymentDetails()
		.orderReview_PlaceOrder()
		.ReviewOrderDetails()
		.navigateToHomePage()
		.JJill_GuestLogout();
	}
	
	@Test(groups= {"Checkout", "Fixed"})
	public void verify_Registered_AddnewMajorCC_ExistingPaymentcard_CheckoutFunctionality() throws InterruptedException, AWTException{
		loginpage.JJill_Registered_Login()
		.selectClothingDepartment()
		.selectItemDetails()
		.Registered_checkoutProcess()
		.savedaddress_paymentPage()
//		.proceedtocheckoutasGuest()
	//	.addAddress()
		.existingSavedCard_clickAddnewCreditCardLink()
		.Registered_enterMajorCCPaymentDetails()
		.clickProceedOrderReview()
		.orderReview_PlaceOrder()
		.ReviewOrderDetails()
		.navigateToHomePage()
		.JJill_Logout();
	}
	
	@Test(groups= {"Checkout1"})
	public void verify_Registered_AddnewJJCC_ExistingPaymentcard_CheckoutFunctionality() throws InterruptedException, AWTException{
		loginpage.JJill_Registered_Login()
		.selectClothingDepartment()
		.selectItemDetails()
		.Registered_checkoutProcess()
		.savedaddress_paymentPage()
//		.proceedtocheckoutasGuest()
	//	.addAddress()
		.existingSavedCard_clickAddnewCreditCardLink()
		.Registered_enterJJCCPaymentDetails()
		.clickProceedOrderReview()
		.orderReview_PlaceOrder()
		.ReviewOrderDetails()
		.navigateToHomePage()
		.JJill_Logout();
	}
	
	@Test(groups= {"Checkout"})
	public void verify_Registered_GiftCard_ExistingPaymentcard_CheckoutFunctionality() throws InterruptedException, AWTException{
		loginpage.JJill_Registered_Login()
		.selectClothingDepartment()
		.selectItemDetails()
		.Registered_checkoutProcess()
		.savedaddress_paymentPage()
//		.proceedtocheckoutasGuest()
	//	.addAddress()
		.registered_enterFullGiftcardasPaymentDetails()
		.clickProceedOrderReview()
		.orderReview_PlaceOrder()
		.ReviewOrderDetails()
		.navigateToHomePage()
		.JJill_Logout();
	}
	
	@Test(groups= {"Checkout"})
	public void verify_Registered_GiftCardandJJCC_ExistingPaymentcard_CheckoutFunctionality() throws InterruptedException, AWTException{
		loginpage.JJill_Registered_Login()
		.selectClothingDepartment()
		.selectItemDetails()
		.Registered_checkoutProcess()
		.savedaddress_paymentPage()
		.registered_enterPartialGiftcardasPaymentDetails()
		.existingSavedCard_clickAddnewCreditCardLink()
		.Registered_enterJJCCPaymentDetails()
		.clickProceedOrderReview()
		.orderReview_PlaceOrder()
		.ReviewOrderDetails()
		.navigateToHomePage()
		.JJill_Logout();
	}
	

	
	@Test(groups= {"Checkout"})
	public void verify_Guest_GiftcardasPayment_CheckoutFunctionality() throws InterruptedException, AWTException{
		loginpage.JJill_GuestLogin()
		.selectClothingDepartment()
		.selectItemDetails()
		.checkoutProcess()
		.proceedtocheckoutasGuest()
		.addAddress()
		.enterFullGiftcardasPaymentDetails()
		//.newaddress_paymentPage_addnewJjillCC()
		.orderReview_PlaceOrder()
		.ReviewOrderDetails()
		.navigateToHomePage()
		.JJill_GuestLogout();
	}
	
	@Test(groups= {"Checkout"})
	public void verify_Guest_GiftcardandMajorCCasPayment_CheckoutFunctionality() throws InterruptedException, AWTException{
		loginpage.JJill_GuestLogin()
//		loginpage.JJill_Login()
		.selectClothingDepartment()
		.selectItemDetails()
		.checkoutProcess()
		.proceedtocheckoutasGuest()
		//.savedaddress_paymentPage_addnewJjillCC();
		.addAddress()
		.enterPartialGiftcardasPaymentDetails()
		.enterMajorCCPaymentDetails()
//		//.newaddress_paymentPage_addnewJjillCC()
		.orderReview_PlaceOrder()
		.ReviewOrderDetails()
		.navigateToHomePage()
		.JJill_GuestLogout();
	}
	
	
	@Test(groups= {"Checkout", "Fixed"})
	public void verify_Guest_JJCCPayment_CheckoutFunctionality() throws InterruptedException, AWTException{
		loginpage.JJill_GuestLogin()
//		loginpage.JJill_Login()
		.selectClothingDepartment()
		.selectItemDetails()
		.checkoutProcess()
		.proceedtocheckoutasGuest()
		//.savedaddress_paymentPage_addnewJjillCC();
		.addAddress()
	//	.enterGiftcardasPaymentDetails()
		.enterJJCCPaymentDetails()
		//.enterMajorCCPaymentDetails()
//		//.newaddress_paymentPage_addnewJjillCC()
		.orderReview_PlaceOrder()
		.ReviewOrderDetails()
		.navigateToHomePage()
		.JJill_GuestLogout();
	}
	
	@Test(groups= {"Checkout"})
	public void verify_Guest_PayPalfromPaymentpage_CheckoutFunctionality() throws InterruptedException, AWTException{
		loginpage.JJill_GuestLogin()
//		loginpage.JJill_Login()
		.selectClothingDepartment()
		.selectItemDetails()
		.checkoutProcess()
		.proceedtocheckoutasGuest()
		//.savedaddress_paymentPage_addnewJjillCC();
		.addAddress()
	//	.enterGiftcardasPaymentDetails()
		.enterPaypalfromPaymentpage()
		//.enterMajorCCPaymentDetails()
//		//.newaddress_paymentPage_addnewJjillCC()
		.orderReview_PlaceOrder()
		.ReviewOrderDetails()
		.navigateToHomePage()
		.JJill_GuestLogout();
	}
	
	@Test(groups= {"Checkout"})
	public void verify_Guest_PaypalfromShoppingBagPage_CheckoutFunctionality() throws InterruptedException, AWTException{
		loginpage.JJill_GuestLogin()
//		loginpage.JJill_Login()
		.selectClothingDepartment()
		.selectItemDetails()
		.paypalfromShoppingBag()
		//.checkoutProcess()
		.proceedtocheckoutasGuest()
		//.savedaddress_paymentPage_addnewJjillCC();
		.addAddress()
	//	.enterGiftcardasPaymentDetails()
		.enterPaypalfromPaymentpage()
		//.enterMajorCCPaymentDetails()
//		//.newaddress_paymentPage_addnewJjillCC()
		.orderReview_PlaceOrder()
		.ReviewOrderDetails()
		.navigateToHomePage()
		.JJill_GuestLogout();
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

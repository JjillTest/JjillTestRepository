package pages;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import testbase.TestBase;
import utilities.ElementOperations;
import utilities.Utility;

public class Checkout extends ElementOperations{
	
	WebDriverWait expwait = new WebDriverWait(driver, sleephigh);
	static Utility util = new Utility();
	Actions action = new Actions(driver);
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	Select select;
	//Object Repository
	
	@FindBy(css = "button#start_checkout")
	WebElement btncheckout;
	
	@FindBy(xpath = "(//p[@class='prompt_button'])[2]")
	WebElement btnprompt;

	
	@FindBy(xpath = "//div[@id='paypal-button-order-summary-top']")
	WebElement btnpaypalShoppingbag;
	
	
	
	@FindBy(xpath = "(//div[@class='proceed-to-checkout-btn']/a)[2]")
	WebElement btnproceedCheckout;
	
	@FindBy(xpath = "(//a[@title='Add new card'])[1]")
	WebElement linkAddNewCard;
	
	
	@FindBy(css = "div[class*='new-address'] a")
	WebElement btnaddress;
	

	@FindBy(css = "input[name='firstName']")
	WebElement txtfirstName;

	@FindBy(css = "input[name='lastName']")
	WebElement txtlastName;

	@FindBy(css = "input[name='address1']")
	WebElement txtaddress;

	@FindBy(css = "input[name='zipCode']")
	WebElement txtzipCode;

	@FindBy(css = "input[name='city']")
	WebElement txtcity;

	@FindBy(css = "input[name='phone1']")
	WebElement txtPhoneNumber;
	
	@FindBy(css = "input[name='email1']")
	WebElement txtemailAddress;
	
	@FindBy(css = "input[aria-label*='CC number']")
	WebElement CCnumber;
	
	@FindBy(css = "input[aria-label*='* card number']")
	WebElement JJCCnumber;
	
	
	@FindBy(xpath = "(//label[@class='jjill-checkbox'])[2]/span")
	WebElement JJCCCheckbox;
	
	@FindBy(css = "p[class='dropdown reset-p']")
	WebElement Giftcardpayment;
	
	@FindBy(css = "input[name='cardnumber']")
	WebElement Giftcardnumber;

	@FindBy(xpath = "(//button[@id='redeem'])[1]")
	WebElement btnredeem;
	
	@FindBy(css = "input[id='cardHolderName']")
	WebElement cardname;
	
	@FindBy(css = "input[aria-label*='security']")
	WebElement securitycode;
	
	@FindBy(xpath = "//div[@class='sameasshipping show']/div/label/span")
	WebElement chkbox_billingaddress;
	
	@FindBy(xpath = "//button[@id='addCardButton']")
	WebElement btnAdd;
	
	@FindBy(xpath = "//input[@id='defaultPayment_card']/../span")
	WebElement btn_defaultcheckbox;
	
	
	@FindBy(xpath = "(//iframe[@frameborder='0'])[4]")
	WebElement promotionbox;
	

	@FindBy(xpath = "//button[@aria-label='Close Dialog']/span")
	WebElement btnclose;
	

	@FindBy(css = "button[id='buttoninspl']")
	WebElement btnaddAddress;
	
	@FindBy(css = "button[class='proceed-to-payment-button btn btn-primary']")
	WebElement btnPayment;
	
	@FindBy(css = "select[id*='state']")
	WebElement drpdownstate;
	
	@FindBy(xpath = "//button[contains(@aria-label,'PROCEED')]")
	WebElement btnpayment;


	@FindBy(xpath = "//label[@class='jjill-checkbox'] /input[@name='billingAddrChk'] /../span")
	WebElement chkboxbillingaddress;

	@FindBy(xpath = "//input[@id='savethiscard'] /../span")
	WebElement btndontsavecreditcard;
	
	@FindBy(xpath = "//h3[text()='CREDIT CARDS']/../div[4]/div")
	WebElement btnpaypal;
	
	@FindBy(xpath = "(//a[contains(text(),'Edit')])[2]")
	WebElement btnEdit;
	
	
	
	@FindBy(xpath = "//button[@id='payment-submit-btn']")
	WebElement btnpaypalrevieworder;
	
	
	
	@FindBy(xpath = "(//div[@data-id='ProductOptionSelector'])[1] /div//button")
	List<WebElement> pdpbtnsizetype;
	
	@FindBy(xpath = "//a[text()='Click to Continue']")
	WebElement linkContinue;
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement paypalemailID;
	
	@FindBy(xpath = "//button[@id='btnNext']")
	WebElement btnNext;
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement paypalpwd;
	
	@FindBy(xpath = "//button[@id='btnLogin']")
	WebElement btnLogin;
	
	@FindBy(xpath = "(//button[contains(@aria-label,'review')])[1]")
	WebElement btnReview;
	
	@FindBy(xpath = "//h2[contains(text(),'order review')]")
	WebElement txtreview;

	@FindBy(xpath = "(//button[contains(@id,'place_order')])[1]")
	WebElement btnplaceorder;

	@FindBy(xpath = "//div[contains(text(),'ORDER!')]")
	WebElement txtorder;

	@FindBy(xpath = "//div[contains(@class,'order-info')] /p/span")
	WebElement txtOrderNumber;

	@FindBy(xpath = "(//label[@class='jjill-checkbox'])[2] /span")
	WebElement chkjjillcc;

	@FindBy(xpath = "(//input[contains(@aria-label,'card number')])[2]")
	WebElement txtcardnumber;

	
	public Checkout() {
		PageFactory.initElements(driver, this);
	}
	
	public Checkout checkoutProcess() throws InterruptedException {
		Reporter.log("Checkout Process Started", true);
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(10);
		btncheckout.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Reporter.log("Checkout Process Completed", true);
		return new Checkout();
	}
	
	public Checkout Registered_checkoutProcess() throws InterruptedException {
		Reporter.log("Checkout Process Started", true);
		btnprompt.click();
		Thread.sleep(50);
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(10);
		btncheckout.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Reporter.log("Checkout Process Completed", true);
		return new Checkout();
	}
	public Checkout paypalfromShoppingBag() throws InterruptedException {
		Reporter.log("Paypal Payment Process from shopping bag started", true);
		jse.executeScript("window.scrollBy(0,550)");
		Thread.sleep(300);
		btnpaypalShoppingbag.click();
		Thread.sleep(5000);
			Set<String> windowhandles = driver.getWindowHandles();
			System.out.print(windowhandles.size());
			for(String wh:windowhandles)
			{
			driver.switchTo().window(wh);	
			}			
			paypalemailID.sendKeys(TestBase.testData.get().getUserEmail());
			btnNext.click();
			paypalpwd.sendKeys(TestBase.testData.get().getUserPassword());
			btnLogin.click();
			Thread.sleep(1000);
			jse.executeScript("window.scrollBy(0,400)");
			btnpaypalrevieworder.click();
			Thread.sleep(3000);
			Set<String> windowhandles1 = driver.getWindowHandles();
			for(String wh:windowhandles1)
			{
			driver.switchTo().window(wh);	
			}
			Thread.sleep(200);
			Reporter.log("Paypal Payment from shopping bag Completed", true);
		return new Checkout();
	}
	
	
	public Checkout existingSavedCard_clickAddnewCreditCardLink() throws InterruptedException {
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(100);
		jse.executeScript("window.scrollBy(0,400)");
	//	btnEdit.click();
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(150);
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(500);
		linkAddNewCard.click();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		//appendStrToFile("OrderNumber.txt","    Existingsavedcard in the account , Addnewcc");
		return new Checkout();
	}
	
	public Checkout proceedtocheckoutasGuest() throws InterruptedException {
		Reporter.log("Guest Checkout Started", true);
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(1000);
		btnproceedCheckout.click();
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		Reporter.log("Guest Checkout Completed", true);
		return new Checkout();
	}
	
	

	public AddProduct addnewAddress() throws InterruptedException {
		btnaddress.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		readValuesForAddress("Address_Fields", "Address");
		Thread.sleep(500);
		txtfirstName.sendKeys(TestBase.testData.get().getFirstName());
		Thread.sleep(500);
		txtlastName.sendKeys(TestBase.testData.get().getLastName());
		Thread.sleep(500);
		txtaddress.sendKeys(TestBase.testData.get().getstreetAddress());
		Thread.sleep(500);
		txtzipCode.sendKeys(TestBase.testData.get().getZipCode());
		Thread.sleep(500);
		txtcity.sendKeys(TestBase.testData.get().getCity());
		Thread.sleep(500);
		select = new Select(drpdownstate);
		select.selectByVisibleText("Ohio");
		Thread.sleep(500);
		chkboxbillingaddress.click();
		Thread.sleep(500);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		txtPhoneNumber.sendKeys(TestBase.testData.get().getPhoneNumber());
		Thread.sleep(500);
		btnaddAddress.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Reporter.log("Address added sucessfully", true);
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		return new AddProduct();
	}

	public Checkout addAddress() throws InterruptedException {
	//	btnaddress.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		readValuesForAddress("Address_Fields", "Address");
		Thread.sleep(500);
		txtfirstName.sendKeys(TestBase.testData.get().getFirstName());
		Thread.sleep(500);
		txtlastName.sendKeys(TestBase.testData.get().getLastName());
		Thread.sleep(500);
		txtaddress.sendKeys(TestBase.testData.get().getstreetAddress());
		Thread.sleep(500);
		txtzipCode.sendKeys(TestBase.testData.get().getZipCode());
		Thread.sleep(1000);
		txtcity.sendKeys(TestBase.testData.get().getCity());
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,200)");
		txtemailAddress.sendKeys(TestBase.testData.get().getUserEmail());
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,200)");
		txtPhoneNumber.sendKeys(TestBase.testData.get().getPhoneNumber());
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(500);
		try {
//			driver.navigate().back();
//			driver.navigate().forward();
		btnPayment.click();
		}
		catch (Exception e)
		{
//			System.out.println(e);
//			driver.navigate().back();
//			driver.navigate().forward();
		}
		finally
		{
		//	driver.navigate().refresh();
		btnPayment.click();
		}
		Thread.sleep(1000);		
		Reporter.log("Address added sucessfully", true);
		return new Checkout();
	}
	
	public Checkout enterMajorCCPaymentDetails() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Reporter.log("Major CC Payment Process Started", true);
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(20);
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(20);
		readValuesForcards("Cards", "Cards");
		Thread.sleep(1000);
		readValuesForAddress("Address_Fields", "Address");
		Thread.sleep(1000);
		System.out.println(TestBase.testData.get().getAMERICANEXPRESSCC());
		Thread.sleep(5000);
		String test = TestBase.testData.get().getAMERICANEXPRESSCC();
		String[] cardnumber = test.split("");
		for(int i=0;i<cardnumber.length;i++)
		{
			CCnumber.sendKeys(cardnumber[i]);
		}
		Thread.sleep(1000);
		cardname.sendKeys(TestBase.testData.get().getFirstName());
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,400)");
		securitycode.sendKeys(generateRandomnumber(4));
		Thread.sleep(200);
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(200);
		btnReview.click();
		Thread.sleep(500);
		Reporter.log("Major CC Payment Process Completed", true);
		appendStrToFile("OrderNumber.txt","       Major CC");
		return new Checkout();
	}
	
	public Checkout Registered_enterMajorCCPaymentDetails() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Reporter.log("Major CC Payment Process Started", true);
		readValuesForcards("Cards", "Cards");
		Thread.sleep(1000);
		readValuesForAddress("Address_Fields", "Address");
		Thread.sleep(1000);
		System.out.println(TestBase.testData.get().getAMERICANEXPRESSCC());
		Thread.sleep(5000);
		String test = TestBase.testData.get().getAMERICANEXPRESSCC();
		String[] cardnumber = test.split("");
		for(int i=0;i<cardnumber.length;i++)
		{
			CCnumber.sendKeys(cardnumber[i]);
		}
		Thread.sleep(1000);
		cardname.sendKeys(TestBase.testData.get().getFirstName());
		Thread.sleep(500);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		securitycode.sendKeys(generateRandomnumber(4));
		Thread.sleep(200);
		chkbox_billingaddress.click();
		Thread.sleep(500);
		btnAdd.click();
		Thread.sleep(100);
		for(int i=0;i<10;i++)
		{
			Thread.sleep(500);
		}
		Thread.sleep(200);
//		action.sendKeys(Keys.PAGE_DOWN).build().perform();
//		Thread.sleep(200);
//		action.sendKeys(Keys.PAGE_DOWN).build().perform();
//		Thread.sleep(200);
//		for(int i=0;i<6;i++)
//		{
//			action.sendKeys(Keys.TAB).build().perform();
//		}
//		action.sendKeys(Keys.ENTER).build().perform();
//		Thread.sleep(5000);
//		for(int i=0;i<4;i++)
//		{
//			Thread.sleep(300);
//			action.sendKeys(Keys.TAB).build().perform();
//		}
//		action.sendKeys(Keys.SPACE).build().perform();
		Thread.sleep(100);
		Reporter.log("Major CC Payment Process Completed", true);
		appendStrToFile("OrderNumber.txt","       Major CC");
		return new Checkout();
		
	}
	
	public Checkout Registered_enterJJCCPaymentDetails() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Reporter.log("JJCC Payment Process Started", true);
		Thread.sleep(500);
		JJCCCheckbox.click();
		Thread.sleep(200);
		readValuesForcards("Cards", "Cards");
		Thread.sleep(1000);
		readValuesForAddress("Address_Fields", "Address");
		Thread.sleep(1000);
		System.out.println(TestBase.testData.get().getJJILLCC());
		Thread.sleep(5000);
		String test = TestBase.testData.get().getJJILLCC();
		String[] cardnumber = test.split("");
		for(int i=0;i<cardnumber.length;i++)
		{
			JJCCnumber.sendKeys(cardnumber[i]);
		}
		Thread.sleep(1000);
	//	cardname.sendKeys(TestBase.testData.get().getFirstName());
	//	Thread.sleep(500);
//		action.sendKeys(Keys.PAGE_DOWN).build().perform();
//		securitycode.sendKeys(generateRandomnumber(3));
	//	Thread.sleep(200);
	//	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	//	Thread.sleep(200);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(200);
		chkbox_billingaddress.click();
		Thread.sleep(500);
		btn_defaultcheckbox.click();
		Thread.sleep(500);
		btnAdd.click();
		Thread.sleep(100);
		for(int i=0;i<10;i++)
		{
			Thread.sleep(1000);
		}
		Thread.sleep(200);
//		for(int i=0;i<5;i++)
//		{
//			action.sendKeys(Keys.TAB).build().perform();
//		}
//		action.sendKeys(Keys.ENTER).build().perform();
//		Thread.sleep(5000);
////		for(int i=0;i<1;i++)
////		{
////			Thread.sleep(300);
//			action.sendKeys(Keys.TAB).build().perform();
//	//	}
//		action.sendKeys(Keys.SPACE).build().perform();
//		Thread.sleep(100);
		Reporter.log("JJCC Payment Process Completed", true);
		appendStrToFile("OrderNumber.txt","           JJCC");
		return new Checkout();
		
	}

	
	
	
	
	public Checkout enterJJCCPaymentDetails() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Reporter.log("JJCC Payment Process Started", true);
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(20);
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(20);
		readValuesForcards("Cards", "Cards");
		Thread.sleep(1000);
		readValuesForAddress("Address_Fields", "Address");
		Thread.sleep(1000);
		JJCCCheckbox.click();
		Thread.sleep(500);
		System.out.println(TestBase.testData.get().getJJILLCC());
		JJCCnumber.sendKeys(TestBase.testData.get().getJJILLCC());
	//	cardname.sendKeys(TestBase.testData.get().getFirstName());
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,400)");
	//	securitycode.sendKeys(generateRandomnumber(3));
	//	Thread.sleep(200);
	//	jse.executeScript("window.scrollBy(0,400)");
		btnReview.click();
		Thread.sleep(800);
		Reporter.log("JJCC Payment Process Completed", true);
		appendStrToFile("OrderNumber.txt","        JJill CC");
		return new Checkout();
	}
	
	public Checkout enterPaypalfromPaymentpage() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Reporter.log("Paypal Payment Process Started", true);
		readValuesForLogin("Login_Data", "Paypal");
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,500)");
		Thread.sleep(500);
		btnpaypal.click();
//		int paypal= btnpaypal.size();
//		System.out.println(paypal);
//		for(int i=0;i<paypal;i++)
//		{
//			if(i==0)
//			{
//				btnpaypal.get(i).click();
//				Thread.sleep(50);
//			}
//		}		
		Thread.sleep(4000);
	//	linkContinue.click();
		Set<String> windowhandles = driver.getWindowHandles();
		for(String wh:windowhandles)
		{
		driver.switchTo().window(wh);	
		}
		paypalemailID.sendKeys(TestBase.testData.get().getUserEmail());
		btnNext.click();
		paypalpwd.sendKeys(TestBase.testData.get().getUserPassword());
		btnLogin.click();
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,400)");
		btnpaypalrevieworder.click();
		Thread.sleep(3000);
		Set<String> windowhandles1 = driver.getWindowHandles();
		for(String wh:windowhandles1)
		{
		driver.switchTo().window(wh);	
		}
		Thread.sleep(200);
		Reporter.log("Paypal Payment Process Completed", true);
		return new Checkout();
	}
	
	
	public Checkout enterFullGiftcardasPaymentDetails() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Reporter.log("GiftcardasPaymentDetails Payment Process Started", true);
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(50);
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(50);
		readValuesForcards("Cards", "Cards");
		Thread.sleep(1000);
		readValuesForAddress("Address_Fields", "Address");
		Thread.sleep(1000);
		Giftcardpayment.click();
		Giftcardnumber.click();
		System.out.println(TestBase.testData.get().getGiftcardasFullPayment());
		Giftcardnumber.sendKeys(TestBase.testData.get().getGiftcardasFullPayment());
		Thread.sleep(3000);
		btnredeem.click();
	//	btnredeem.click();
	//	cardname.sendKeys(TestBase.testData.get().getFirstName());
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,400)");
	//	securitycode.sendKeys(generateRandomnumber(3));
		Thread.sleep(2000);
	//	jse.executeScript("window.scrollBy(0,400)");
		btnReview.click();
		Thread.sleep(1200);
		Reporter.log("GiftcardasPaymentDetails Payment Process Completed", true);
		return new Checkout();
	}	
	
	public Checkout registered_enterFullGiftcardasPaymentDetails() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Reporter.log("GiftcardasPaymentDetails Payment Process Started", true);
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(50);
		readValuesForcards("Cards", "Cards");
		Thread.sleep(1000);
		readValuesForAddress("Address_Fields", "Address");
		Thread.sleep(1000);
		Giftcardpayment.click();
		Giftcardnumber.click();
		System.out.println(TestBase.testData.get().getGiftcardasFullPayment());
		Giftcardnumber.sendKeys(TestBase.testData.get().getGiftcardasFullPayment());
		Thread.sleep(3000);
		btnredeem.click();
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,400)");
		Reporter.log("GiftcardasPaymentDetails Payment Process Completed", true);
		return new Checkout();
	}	
	

	public Checkout enterPartialGiftcardasPaymentDetails() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Reporter.log("GiftcardasPaymentDetails Payment Process Started", true);
		jse.executeScript("window.scrollBy(0,400)");
		Thread.sleep(20);
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(20);
		readValuesForcards("Cards", "Cards");
		Thread.sleep(1000);
		readValuesForAddress("Address_Fields", "Address");
		Thread.sleep(1000);
		Giftcardpayment.click();
		Giftcardnumber.click();
		System.out.println(TestBase.testData.get().getGiftcardasPartialPayment());
		Giftcardnumber.sendKeys(TestBase.testData.get().getGiftcardasPartialPayment());
		Thread.sleep(3000);
		btnredeem.click();
		//Thread.sleep(2000);
	//	btnredeem.click();
	//	cardname.sendKeys(TestBase.testData.get().getFirstName());
		Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,400)");
	//	securitycode.sendKeys(generateRandomnumber(3));
		Thread.sleep(2000);
	//	jse.executeScript("window.scrollBy(0,400)");
		btnReview.click();
		Thread.sleep(1000);
		Reporter.log("GiftcardasPaymentDetails Payment Process Completed", true);
		return new Checkout();
	}	

	public Checkout registered_enterPartialGiftcardasPaymentDetails() throws InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Reporter.log("GiftcardasPaymentDetails Payment Process Started", true);
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(50);
		readValuesForcards("Cards", "Cards");
		Thread.sleep(1000);
		readValuesForAddress("Address_Fields", "Address");
		Thread.sleep(2000);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Giftcardpayment.click();
		Thread.sleep(50);
		Giftcardnumber.click();
		System.out.println(TestBase.testData.get().getGiftcardasPartialPayment());
		Giftcardnumber.sendKeys(TestBase.testData.get().getGiftcardasPartialPayment());
		Thread.sleep(3000);
		btnredeem.click();
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,400)");
		Reporter.log("GiftcardasPaymentDetails Payment Process Completed", true);
		return new Checkout();
	}	
	
	public Checkout savedaddress_paymentPage_addnewJjillCC() throws InterruptedException {
		Reporter.log("Payment Process Started", true);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		// jse.executeScript("window.scrollBy(0,600)");
		// remove all added cards.
		chkjjillcc.click();
	//	 btnaddnewcard.click();
		readValuesForcards("Cards", "Cards");
		txtcardnumber.sendKeys(TestBase.testData.get().getJJILLCC());
		Thread.sleep(500);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		btndontsavecreditcard.click();
		Thread.sleep(200);
		btnReview.click();
		Reporter.log("Payment Process Completed", true);
		return new Checkout();
	}
	
	public Checkout savedaddress_paymentPage() throws InterruptedException {
		Reporter.log("Add Address Process Started", true);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		Reporter.log("Address is already added to the account", true);
		return new Checkout();
	}

	public AddProduct newaddress_paymentPage_addnewJjillCC() throws InterruptedException {
		// jse.executeScript("window.scrollBy(0,600)");
		Reporter.log("Payment Process Started", true);
		btnpayment.click();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		jse.executeScript("window.scrollBy(0,600)");
		// btnaddnewcard.click();
		Thread.sleep(500);
		chkjjillcc.click();
		Thread.sleep(500);
		readValuesForcards("Cards", "Cards");
		txtcardnumber.click();
		txtcardnumber.sendKeys(TestBase.testData.get().getJJILLCC());
		Thread.sleep(50);
		// chkshippingAddress.click();
		Thread.sleep(500);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		// btnAdd.click();
		// Thread.sleep(500);
//					btnjillcard.click();
		// Thread.sleep(500);
		jse.executeScript("window.scrollBy(0,600)");
		btnReview.click();
		Reporter.log("Payment Process Completed", true);
		Thread.sleep(1000);
		return new AddProduct();
	}

	public Checkout orderReview_PlaceOrder() throws InterruptedException {
		Reporter.log("Review Page", true);
		if (txtreview.isDisplayed()) {
			jse.executeScript("window.scrollBy(0,900)");
			btnplaceorder.click();
		}
		Reporter.log("Order Placed Sucessfully ", true);
		return new Checkout();
	}
	
	public Checkout clickProceedOrderReview() throws InterruptedException {
		for(int i=0;i<2;i++)
		{
		Thread.sleep(50);
		jse.executeScript("window.scrollBy(0,300)");
		}
		Thread.sleep(50);
		btnReview.click();
		return new Checkout();
	}

	public AddProduct ReviewOrderDetails() throws InterruptedException {
		Reporter.log("Review Order Details Page", true);
		if (txtorder.isDisplayed()) {
			String ordernumber = txtOrderNumber.getText();
			System.out.println(ordernumber);
			appendStrToFile("OrderNumber.txt","        OrderNumber ->");
			appendStrToFile("OrderNumber.txt",ordernumber);
			appendStrToFile("OrderNumber.txt","\n");
		}
		Reporter.log("Order Placed Sucessfully ", true);
		return new AddProduct();
	}
	
	public static void readValuesForcards(String sheetName, String scenario) {
		Reporter.log("Fetch the Cards value from the test data sheet and set it", true);
		TestBase.testData.get().setJJILLCC(util.readCellValue(sheetName, scenario, "JJILLCC"));
		TestBase.testData.get().setVISACC(util.readCellValue(sheetName, scenario, "VISACC"));
		TestBase.testData.get().setMASTERCC(util.readCellValue(sheetName, scenario, "MASTERCC"));
		TestBase.testData.get().setAMERICANEXPRESSCC(util.readCellValue(sheetName, scenario, "AMERICANEXPRESSCC"));
		TestBase.testData.get().setDISCOVERCC(util.readCellValue(sheetName, scenario, "DISCOVERCC"));
		TestBase.testData.get().setGiftcardasFullPayment(util.readCellValue(sheetName, scenario, "GiftcardasFullPayment"));
		TestBase.testData.get().setGiftcardasPartialPayment(util.readCellValue(sheetName, scenario, "GiftcardasPartialPayment"));
		Reporter.log("Card values fetches sucessfully", true);
	}
	
	public static void readValuesForAddress(String sheetName, String scenario) {
		Reporter.log("Fetch the Address Fields from the test data sheet and set it", true);
		TestBase.testData.get().setStreetAddress(util.readCellValue(sheetName, scenario, "streetAddress"));
		TestBase.testData.get().setZipCode(util.readCellValue(sheetName, scenario, "zipCode"));
		TestBase.testData.get().setCity(util.readCellValue(sheetName, scenario, "city"));
		TestBase.testData.get().setFirstName(util.readCellValue(sheetName, scenario, "firstName"));
		TestBase.testData.get().setLastName(util.readCellValue(sheetName, scenario, "lastName"));
		TestBase.testData.get().setPhoneNumber(util.readCellValue(sheetName, scenario, "phoneNumber"));
		TestBase.testData.get().setUserEmail(util.readCellValue(sheetName, scenario, "email"));
		Reporter.log("Fetched the Address Fields from the test data sheet", true);
	}
	
	public static void readValuesForLogin(String sheetName, String scenario) {
		Reporter.log("Fetch the useremail and password from the test data sheet and set it", true);
		TestBase.testData.get().setUserEmail(util.readCellValue(sheetName, scenario, "UserEmail"));
		TestBase.testData.get().setUserPassword(util.readCellValue(sheetName, scenario, "Password"));
		Reporter.log("Fetched the useremail and password from the test data sheet successfully", true);

	}
	
	 public static void appendStrToFile(String fileName, String str)
	{
	try {
	BufferedWriter out = new BufferedWriter(
	new FileWriter(fileName, true));
	out.write(str);
	out.close();
	}
	catch (IOException e) {
	System.out.println("exception occurred" + e);
	}
	}
	
}

package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import testbase.TestBase;
import utilities.ElementOperations;
import utilities.Utility;

public class AddProduct extends ElementOperations {

	WebDriverWait expwait = new WebDriverWait(driver, sleephigh);
	static Utility util = new Utility();
	Actions action = new Actions(driver);
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	Select select;

	// Object Repository

	@FindBy(xpath = "//iframe[@frameborder='0']")
	WebElement promotionbox;

	@FindBy(css = "button[class*='offer-control close']")
	WebElement btnclose;
//	
//	@FindBy(xpath = "(//a[@href='/shop/womens-clothing'])[1]")
//	WebElement drpClothing;
	
	
//	@FindBy(css = "a[href='/shop/womens-clothing']")
//	WebElement drpClothing;
	
	
	
	@FindBy(css = "div[id='contentRecommendationWidget_Header_Clothing'] div div a")
	List<WebElement> drpClothing;
	
	
	@FindBy(css = "div[id='contentRecommendationWidget_Header_New_Arrivals'] div div a")
	List<WebElement> drpNewArrivals;

	
	@FindBy(xpath = "(//a[contains(text(),'Must-Have Outfits')])[5]")
	WebElement department_STL;

	@FindBy(css = "div[id='contentRecommendationWidget_Header_Sale'] div div a")
	List<WebElement> drpSale;
	
//	@FindBy(xpath = "(//a[@href='/sale'])[3]")
//	WebElement drpSale;

//	@FindBy(xpath = "(//a[contains(text(),'All Clothing')])[1]")
//	WebElement department_AllClothing;

	@FindBy(css = "a[data-link-attr*='Knit Tops Tees']")
	List<WebElement> department_knittops;

	@FindBy(css = "a[data-link-attr*='Final Sale']")
	List<WebElement> department_finalsale;
	
	@FindBy(xpath = "(//a[contains(@href,'/sale/final')])[3]")
	WebElement link_finalSale;
	

	@FindBy(xpath = "//span[contains(text(),'SHOP THIS LOOK')]")
	List<WebElement> link_STL;
	
	@FindBy(xpath = "//span[contains(text(),'Final Sale')]")
	WebElement finalsale_breadcrumb;
	
	@FindBy(xpath = "//div[text()='bag']")
	WebElement btn_headershoppingbag;

	@FindBy(xpath = "//div[contains(@id,'layout')]")
	List<WebElement> productcount;

	@FindBy(xpath = "//div[contains(@id,'layout')]/div[2]/div/div/div/div[1]/div/a[2]")
	List<WebElement> removebutton;

	@FindBy(xpath = "(//div[contains(@id,'product')])[1] /div /div[2]/a")
	WebElement selectitem;
	//(//div[contains(@id,'product')])[2] /div /div[1]
	
	@FindBy(xpath = "//span[contains(text(),'✖')]")
	WebElement feedbackclose;

	@FindBy(xpath = "//button[@title='2X']")
	WebElement btnsize;

	@FindBy(xpath = "//button[@type='submit'][@data-th='add-to-cart']")
	WebElement btnaddtobag;

	@FindBy(xpath = "//div[contains(@class,'MuiDialogContent-dividers')]/div/div/div[3]/p")
	WebElement txtEstimatedTotal;

	@FindBy(xpath = "//span[@id='totalPrice']")
	WebElement txtEstimatedTotalchkout;
	
	@FindBy(xpath = "//input[@name='searchTerm']")
	WebElement txtSearch;

	@FindBy(xpath = "//ul[@data-ui='thumbnails'] /li[1]")
	WebElement searchresults;
	

	@FindBy(css = "img#stylitics-jumplink")
	WebElement btnstylitics;
	
	@FindBy(xpath = "//h6[contains(text(),'SHOP THE LOOK')]")
	WebElement STLtitle;
	
	@FindBy(xpath = "//img[@alt='shopTheLookProduct3']")
	WebElement STLproduct;
	
	@FindBy(xpath = "(//span[contains(text(),'View Shopping Bag')])[1]")
	WebElement btnviewshoppingcart;
	
	@FindBy(css = "//input[contains(@aria-label,'standard')] /../span")
	WebElement btnstandard;

	@FindBy(css = "img[alt*='logo']")
	WebElement btnLogo;


	@FindBy(css = "a[aria-label='logo']")
	WebElement btnLogo_PLP;
	
	
	Robot robot;

	public AddProduct() {
		PageFactory.initElements(driver, this);
	}

	// Select Department
	public AddProduct selectClothingDepartment() throws InterruptedException, AWTException {
		Reporter.log("Select the department", true);
		Thread.sleep(4000);
//		try {
//			if (promotionbox.isDisplayed()) {
//				Thread.sleep(500);
//				driver.switchTo().frame(promotionbox);
//				btnclose.click();
//				driver.switchTo().parentFrame();
//				Thread.sleep(50);
//			}
//		} finally {
		
		Thread.sleep(2000);
		for(int i=0;i<drpClothing.size();i++)
		{
			if(i==0)
			{
				action.click(drpClothing.get(i)).perform();
//				for(int j=0;j<department_knittops.size();j++)
//				{
//					if(j==1)
//						action.click(department_knittops.get(j)).release().perform();
//				}
//				
//				
			}
		}
		//	robot = new Robot();
		//	robot.mouseMove(992,60);
		//	robot.mousePress(sleephigh);
		//	action.sendKeys("Hi");
		//	action.clickAndHold(drpClothing).moveToElement(department_knitTops).click(department_knitTops);		
		//	action.moveToElement(drpClothing).moveToElement(department_knitTops).click().perform();
		//	action.moveToElement(department_knitTops).perform();
		//	action.clickAndHold(department_AllClothing).release().perform();
		//	action.moveToElement(drpClothing[i]).moveToElement(department_knitTops).click().perform();
			Thread.sleep(1000);
			Reporter.log("Selected the department sucessfully", true);
		
		return this;
	}

	
		public AddProduct selectSaleDepartment() throws InterruptedException {
		Reporter.log("Select the department", true);
		Thread.sleep(3000);
//		try {
//			if (promotionbox.isDisplayed()) {
//				driver.switchTo().frame(promotionbox);
//				btnclose.click();
//				driver.switchTo().parentFrame();
//			}
//		} finally {
			Thread.sleep(2000);
			for(int i=0;i<drpSale.size();i++)
			{
				if(i==0)
				{
					action.click(drpSale.get(i)).perform();
//					for(int j=0;j<department_knittops.size();j++)
//					{
//						if(j==1)
//							action.click(department_knittops.get(j)).release().perform();
//					}
//					
//					
				}
					
			}
			Reporter.log("Selected the department sucessfully", true);
	//	}
		return this;
	}
		
		public AddProduct selectNewArrivalsDepartment() throws InterruptedException {
			Reporter.log("Select the department", true);
			Thread.sleep(3000);
				Thread.sleep(2000);
				for(int i=0;i<drpNewArrivals.size();i++)
				{
					if(i==0)
					{
						action.click(drpNewArrivals.get(i)).perform();
						break;
					}
						
				}
				Reporter.log("Selected the department sucessfully", true);
		
			return this;
		}


		public AddProduct selectFinalSaleDepartment() throws InterruptedException {
			Reporter.log("Select the Final sale department", true);
			Thread.sleep(3000);
				Thread.sleep(2000);
				for(int i=0;i<drpSale.size();i++)
				{
					if(i==0)
					{
						action.click(drpSale.get(i)).perform();
						Thread.sleep(1000);
						jse.executeScript("window.scrollBy(0,300)");
						Thread.sleep(500);
						link_finalSale.click();
						Thread.sleep(500);
						break;
						}
					if(finalsale_breadcrumb.isDisplayed())
					{
				Reporter.log("Selected the finalsale department sucessfully", true);
			}
				
				}
			return this;
		}
		
	public AddProduct selectSTLDepartment() throws InterruptedException {
		Reporter.log("Select the department", true);
		Thread.sleep(5000);
		for(int i=0;i<drpNewArrivals.size();i++)
		{
			if(i==0)
			{
				action.click(drpNewArrivals.get(i)).perform();
			}
		}
		Thread.sleep(50);
		for(int i=0;i<19;i++)
		{
			jse.executeScript("window.scrollBy(0,400)");
		}
		
			department_STL.click();
		
			Reporter.log("Selected the department sucessfully", true);
		return new AddProduct();
	}
	
	public AddProduct selectSTLProduct() throws InterruptedException {
		Reporter.log("Select the PDP with STL items", true);
		Thread.sleep(5000);
		txtSearch.click();
		readValuesForSearch("Search_Data", "STL");
		Reporter.log("Enter STL Data", true);
		txtSearch.sendKeys(TestBase.testData.get().getSearchData());
		Thread.sleep(500);
		searchresults.click();
		Thread.sleep(2000);
		btnstylitics.click();
		Thread.sleep(100);
		jse.executeScript("window.scrollBy(0,300)");
		int count=link_STL.size();
		if(count<=6)
		{
			Reporter.log("STL count is not greater than 6");
		}
		link_STL.get(1).click();
		Thread.sleep(500);
		if(STLtitle.isDisplayed())
		{
			STLproduct.click();
			Thread.sleep(5000);
			
		}
		return new AddProduct();
	}


	public Checkout selectItemDetails() throws InterruptedException {
		Reporter.log("Select the Item", true);
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		action.click(selectitem).perform();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		Thread.sleep(3000);
		//jse.executeScript("window.scrollBy(0,300)");
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
//		try {
//			Thread.sleep(1000);
//			feedbackclose.click();
//		}
//		catch (Exception e) 
//		{}
//		finally {
		btnsize.click();
		jse.executeScript("window.scrollBy(0,450)");
		btnaddtobag.click();
		String total = txtEstimatedTotal.getText();
		btnviewshoppingcart.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		String chkoutTotal = txtEstimatedTotalchkout.getText();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		Reporter.log("Selected the Item sucessfully", true);
		return new Checkout();
	}
	//}


	public LoginFunctionality navigateToHomePage() {
		Reporter.log("Navigate to Home Page", true);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		btnLogo.click();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		return new LoginFunctionality();
	}
	

	public LoginFunctionality navigatefromPLPToHomePage() {
		Reporter.log("Navigate to Home Page from PLP", true);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		btnLogo_PLP.click();
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		return new LoginFunctionality();
	}
	
	public LoginFunctionality ConnectingMethod() throws InterruptedException {

		try {
			if (promotionbox.isDisplayed()) {
				Thread.sleep(500);
				driver.switchTo().frame(promotionbox);
				btnclose.click();
				driver.switchTo().parentFrame();
				Thread.sleep(50);
			}
		} finally {
			Thread.sleep(1000);
		}
		return new LoginFunctionality();
	}

	public Header_Footer_Functionality ConnectingMethodLogin_Header() throws InterruptedException {
		Thread.sleep(1000);
		return new Header_Footer_Functionality();
	}

	public PDP_QuickLook_Functionality ConnectingMethodLogin_PDP() throws InterruptedException {
		Thread.sleep(1000);
		return new PDP_QuickLook_Functionality();
	}

	public PLP_Search_CLT_STL_Functionality ConnectingMethodLogin_PLP() throws InterruptedException {
		Thread.sleep(1000);
		return new PLP_Search_CLT_STL_Functionality();
	}

	public Pagination_Monetate ConnectingMethodLogin_Pagination() throws InterruptedException {
		Thread.sleep(1000);
		return new Pagination_Monetate();
	}


		public AddProduct selectshoppingbag() throws InterruptedException {
			Reporter.log("Select the shoppingbag", true);
			Thread.sleep(4000);
			try {
				if (promotionbox.isDisplayed()) {
					Thread.sleep(500);
					driver.switchTo().frame(promotionbox);
					btnclose.click();
					driver.switchTo().parentFrame();
					Thread.sleep(50);
				}
			} finally {
				btn_headershoppingbag.click();
				// action.moveToElement(drpClothing).moveToElement(department_knitTops).click().perform();
				Thread.sleep(1000);
				Reporter.log("Selected shopping bag", true);
			}
			return this;
		}

		public AddProduct removeProductsShoppingbag() throws InterruptedException {
				Reporter.log("Removing Items from shopping bag started", true);
				Thread.sleep(4000);
				jse.executeScript("window.scrollBy(0,300)");
				try {
					for (int j = 0; j < 5; j++) {
						for (int i = 0; i <= productcount.size(); i++) {
							removebutton.get(i).click();
							Thread.sleep(7000);
						}
						jse.executeScript("window.scrollBy(0,-700)");
					}
				} finally {
					if (productcount.size() != 0) {
						jse.executeScript("window.scrollBy(0,-900)");
						for (int i = 0; i <= productcount.size(); i++) {
							Thread.sleep(2000);
							removebutton.get(i).click();
							Thread.sleep(3000);
						}

					} else {
						Reporter.log("Removed all the products from shopping bag", true);
					}
				}
				
				return this;
			}

		public static void readValuesForSearch(String sheetName, String scenario) {
			Reporter.log("Fetch the search data", true);
			TestBase.testData.get().setSearchData(util.readCellValue(sheetName, scenario, "SearchData"));
			Reporter.log("Fetched search data from the test data sheet successfully", true);
		}

		public URL ConnectingMethodLogin_URL() throws InterruptedException {
			Thread.sleep(1000);
			return new URL();
		}
}

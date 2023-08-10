package pages;

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
import org.testng.Assert;
import org.testng.Reporter;

import testbase.TestBase;
import utilities.ElementOperations;
import utilities.Utility;

public class PDP_QuickLook_Functionality extends ElementOperations {

	WebDriverWait expwait = new WebDriverWait(driver, sleephigh);
	static Utility util = new Utility();
	Actions action = new Actions(driver);
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	Select select;

	// Object Repository

	@FindBy(xpath = "(//div[contains(@id,'product')])[1] /div /div[2] /a")
	WebElement selectitemdescription;

	@FindBy(xpath = "(//button/span[contains(text(),'Quick Look')])[3]")
	WebElement btnquicklook;

	@FindBy(xpath = "//h6[text()='Quick Look']")
	WebElement ql_txtQuickLook;

	@FindBy(xpath = "(//div[@id='carouselInnerWrapper'])[4]")
	WebElement ql_heroimg;

	@FindBy(xpath = "//div[contains(@class,'flexContainerVertical')] /button //img")
	WebElement ql_sideimg;

	@FindBy(xpath = "//h1[contains(@class,'MuiTypography-h6')]")
	WebElement ql_ItemDescription;

	@FindBy(xpath = "(//h1[contains(@class,'MuiTypography-h6')])[2]")
	WebElement pdp_ItemDescription;

	@FindBy(xpath = "//div[@class='bv_stars_component_container']")
	WebElement ql_bazaarvoice;

	@FindBy(xpath = "(//div[@class='bv_stars_component_container'])[2]")
	WebElement pdp_bazaarvoice;

	@FindBy(xpath = "(//div[@data-id='ProductOptionSelector'])[1] /div//button")
	WebElement ql_btnsizetype;

	@FindBy(xpath = "(//div[@data-id='ProductOptionSelector'])[1] /div//button")
	List<WebElement> pdpbtnsizetype;
	
	@FindBy(xpath = "//span[contains(text(),'✖')]")
	WebElement feedbackclose;
	

	@FindBy(xpath = "(//div[@data-id='ProductOptionSelector'])[2] /div//button/div/img")
	List<WebElement> PDP_btncolor;
	

	@FindBy(xpath = "(//div[@data-id='ProductOptionSelector'])[2]/../../../div[2]/div[2]/div/p")
	WebElement PDP_colortxt;

	
	@FindBy(xpath = "(//div[@data-id='ProductOptionSelector'])[3] /div//button")
	List<WebElement> PDP_size;

	@FindBy(xpath = "//h2[contains(text(),'1X IS NOW XL')]")
	WebElement pdp_1xpopup;
	
	@FindBy(xpath = "//button[@class='close']")
	WebElement pdp_1xpopupclose;
	
	@FindBy(xpath = "(//div[@data-id='ProductOptionSelector'])[2] /div//button")
	WebElement ql_btncolor;

	@FindBy(xpath = "(//p[contains(@class,'MuiTypography-body1')])[5]")
	WebElement txtbtnColorName;

	@FindBy(xpath = "(//p[contains(@class,'MuiTypography-body1')])[14]")
	WebElement ql_txtbtnColorName;

	@FindBy(xpath = "(//div[@data-id='ProductOptionSelector'])[3]/div/button/span[1]")
	List<WebElement> ql_btnsize;

	@FindBy(xpath = "//p[contains(text(),'Guide')]")
	WebElement ql_sizeguide;

	@FindBy(xpath = "(//h3[contains(text(),'Size Guide')])[1]")
	WebElement sizeguidepopup;

	@FindBy(css = "svg[width='1em'] path")
	WebElement btnsizepopupClose;

	@FindBy(xpath = "(//button[@aria-label='close'])[1]")
	WebElement ql_btnsizepopupClose;

	@FindBy(xpath = "(//div[@title='Fit Predictor'] /div)[1]")
	WebElement ql_fitpredicator;

	@FindBy(xpath = "(//div[@class='fp-logo'])[2]")
	WebElement fitpredicatorpopup;

	@FindBy(xpath = "//div[@aria-label='Close']")
	WebElement fitpredicatorclose;

	@FindBy(xpath = "(//input[@name='quantity'] /../button)[2]")
	WebElement ql_quantityadd;

	@FindBy(xpath = "(//input[@name='quantity'] /../button)[2]/../input")
	WebElement ql_quantityvalue;

	@FindBy(xpath = "(//input[@name='quantity'] /../button)[1]")
	WebElement ql_quantitysub;

	@FindBy(xpath = "//span[contains(text(),'Save for Later ')]")
	WebElement ql_saveforlater;

	@FindBy(xpath = "//p[contains(text(),'SAVED FOR LATER')]")
	WebElement ql_saveforlaterpopup;
	
	@FindBy(xpath = "//p[text()='SAVED FOR LATER']/../button[@aria-label='close']")
	WebElement ql_saveforlaterclose;	
	
	@FindBy(xpath = "(//button[@aria-label='close'])[4]/span[1]")
	WebElement ql_sizeguideclose;	
	
	@FindBy(xpath = "(//button[@aria-label='close'])[3]/span")
	WebElement pdp_sizeguideclose;	
	
	
	@FindBy(xpath = "//a[contains(text(),'Full Details')]")
	WebElement ql_fulldetails;

	@FindBy(xpath = "//h4[text()='Share This Product'] /../a")
	List<WebElement> pdp_Sharethisproduct;

//	@FindBy(xpath = "//button[@title='L']")
//	WebElement btnsize;

	@FindBy(xpath = "//button[@type='submit'][@data-th='add-to-cart']")
	WebElement btnaddtobag;

	@FindBy(xpath = "//div[contains(text(),'Style No')]")
	WebElement txtStyleNo;

	@FindBy(xpath = "//span[contains(text(),'RETURNS MADE EASY')]")
	WebElement txtdetailscare;

	@FindBy(xpath = "(//div[@role='tabpanel']/span)[1]")
	WebElement txtdetailscare_msg;

	@FindBy(xpath = "//span[contains(text(),'RETURNS MADE EASY')]")
	WebElement txtreturns;

	@FindBy(xpath = "(//div[@role='tabpanel']/span)[2]/p[2]")
	WebElement txtreturns_msg;

	@FindBy(xpath = "(//span[contains(text(),'View Shopping Bag')])[1]")
	WebElement btnviewshoppingcart;

	@FindBy(xpath = "//input[@id='searchInput']")
	WebElement txtSearch;

	@FindBy(xpath = "//p[contains(text(),'QTY')]/../../../../p")
	WebElement inventoryMessage;

	@FindBy(xpath = "//p[contains(text(),'QTY')]/../../../../p/span[1]")
	WebElement inventoryMessageBO;

	@FindBy(css = "path[class*='jjill-logo']")
	WebElement headerlogo;

	@FindBy(xpath = "//nav[contains(@aria-label,'pagination')]/ul/li[1]")
	List<WebElement> pagenavigation;

	@FindBy(xpath = "(//div[contains(@class,'MuiGrid-item')] //ul)[6] //li")
	WebElement pagecontent;

	@FindBy(xpath = "(//button[contains(@aria-label,'next')])[1]")
	WebElement btnnexttop;

	@FindBy(xpath = "//iframe[@frameborder='0']")
	WebElement promotionbox;

	@FindBy(css = "button[class*='offer-control close']")
	WebElement btnclose;
	
	@FindBy(xpath = "//span[contains(text(),'X')]")
	WebElement btnfeedbackclose;

	@FindBy(xpath = "//ul[@data-ui='thumbnails'] /li[1]")
	WebElement searchresults;

	public PDP_QuickLook_Functionality() {
		PageFactory.initElements(driver, this);
	}

	public AddProduct validatePdpPage() throws InterruptedException {
		Reporter.log("Validating the PDP Started", true);
		jse.executeScript("window.scrollBy(0,450)");
		Thread.sleep(1000);
		//jse.executeScript("window.scrollBy(0,750)");
		//Thread.sleep(1000);
		//jse.executeScript("window.scrollBy(0,600)");
		selectitemdescription.click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		for (int i = 0; i < 7; i++) {
			Thread.sleep(1000);
		}
		feedbackclose.click();
		Thread.sleep(30);
		Assert.assertEquals(ql_heroimg.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(ql_sideimg.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(pdp_ItemDescription.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(pdp_bazaarvoice.isDisplayed(), true);
		Thread.sleep(20);
		for (int i = 0; i < pdpbtnsizetype.size(); i++) {
			pdpbtnsizetype.get(i).click();
			String sizetype = pdpbtnsizetype.get(i).getAttribute("title");
			Reporter.log(sizetype);
			System.out.println(sizetype);
		}
		pdpbtnsizetype.get(0).click();
		Thread.sleep(20);
		jse.executeScript("window.scrollBy(0,150)");
		for (int i = 0; i < PDP_btncolor.size(); i++) {
			PDP_btncolor.get(i).click();
			Thread.sleep(5);
			String name = txtbtnColorName.getText();
			Reporter.log(name);
			System.out.println(name);
		}
		for (int i = 0; i < PDP_size.size(); i++) {
			PDP_size.get(i).click();
			Thread.sleep(5);
			String size = PDP_size.get(i).getAttribute("title");
			if(size.equals("1X"))
				try
			{
				if(pdp_1xpopup.isDisplayed())
				pdp_1xpopupclose.click();
			}
			catch(Exception e)
			{
				System.out.println("Real 1X items do not show 1x pop up");
			}
			Reporter.log(size);
			System.out.println(size);
		}
		PDP_size.get(2).click();
		jse.executeScript("window.scrollBy(0,200)");
//		Assert.assertEquals(btnsize.isDisplayed(), true);
//		Thread.sleep(20);
	//	jse.executeScript("window.scrollBy(0,100)");
	//	btnsize.click();
		Thread.sleep(50);
		Assert.assertEquals(ql_sizeguide.isDisplayed(), true);
		Thread.sleep(20);
		ql_sizeguide.click();
		Thread.sleep(500);
		if (sizeguidepopup.isDisplayed()) {
			Assert.assertEquals(sizeguidepopup.isDisplayed(), true);
			Thread.sleep(20);
			pdp_sizeguideclose.click();
			Thread.sleep(500);
		}
		Assert.assertEquals(ql_fitpredicator.isDisplayed(), true);
		Thread.sleep(50);
		ql_fitpredicator.click();
		if (fitpredicatorpopup.isDisplayed()) {
			Assert.assertEquals(fitpredicatorpopup.isDisplayed(), true);
			Thread.sleep(20);
			fitpredicatorclose.click();
			Thread.sleep(20);
		}
		jse.executeScript("window.scrollBy(0,100)");
		if (ql_quantityadd.isDisplayed()) {
			Thread.sleep(20);
			ql_quantityadd.click();
			String qty = ql_quantityvalue.getAttribute("value");
			Assert.assertEquals(qty, "2");
		}
		if (ql_quantitysub.isDisplayed()) {
			Thread.sleep(20);
			ql_quantitysub.click();
			String qty = ql_quantityvalue.getAttribute("value");
			Assert.assertEquals(qty, "1");
		}
		Assert.assertEquals(btnaddtobag.isDisplayed(), true);
		Thread.sleep(20);
		jse.executeScript("window.scrollBy(0,100)");
		if (ql_saveforlater.isDisplayed()) {
			ql_saveforlater.click();
			Thread.sleep(20);
			Assert.assertEquals(ql_saveforlaterpopup.isDisplayed(), true);
			Thread.sleep(20);
			btnsizepopupClose.click();
		}
		Assert.assertEquals(pdp_Sharethisproduct.size(), 3);
		for (int i = 0; i < 3; i++) {
			String parentwindow = driver.getWindowHandle();
			pdp_Sharethisproduct.get(i).click();
			Set<String> allWindowHandles = driver.getWindowHandles();
			if (i == 0) {
				for (String wh : allWindowHandles) {
					driver.switchTo().window(wh);
					String Title = driver.getTitle();
					if (Title.contentEquals("Facebook"))
						driver.close();
				}
			}
			if (i == 1) {
				for (String wh : allWindowHandles) {
					driver.switchTo().window(wh);
					String Title = driver.getTitle();
					System.out.println(Title);
					if (Title.contentEquals("Compose new Tweet / Twitter"))
						driver.close();
				}
			}
			if (i == 2) {
				for (String wh : allWindowHandles) {
					driver.switchTo().window(wh);
					String Title = driver.getTitle();
					System.out.println(Title);
					if (Title.contentEquals("Pinterest"))
						driver.close();
				}
			}
			driver.switchTo().window(parentwindow);
		}
		Thread.sleep(20);
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(50);
		Assert.assertEquals(txtStyleNo.isDisplayed(), true);
		Thread.sleep(40);
		Assert.assertEquals(txtdetailscare.isDisplayed(), true);
		Thread.sleep(40);
		Assert.assertNotNull(txtdetailscare_msg.getText());
		Thread.sleep(20);
		jse.executeScript("window.scrollBy(0,150)");
		Assert.assertEquals(txtreturns.isDisplayed(), true);
		txtreturns.click();
		Assert.assertNotNull(txtreturns_msg.getText());
		Thread.sleep(20);
		jse.executeScript("window.scrollBy(0,-500)");
		btnaddtobag.click();
		Thread.sleep(20);
		btnviewshoppingcart.click();
		Reporter.log("PDP Validation Sucessful", true);
		return new AddProduct();
	}

	public AddProduct validateQuickLookScreen() throws InterruptedException {
		Reporter.log("Validate quicklook screen", true);
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,300)");
		//only needed when item is third element
		Thread.sleep(300);
		//jse.executeScript("window.scrollBy(0,600)");
		Thread.sleep(1000);
		jse.executeScript("window.scrollBy(0,200)");
		Thread.sleep(7000);
		//only needed when item is third element
		action.moveToElement(btnquicklook);
		action.click(btnquicklook).build().perform();
		
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
		}
		
		Assert.assertEquals(ql_txtQuickLook.isDisplayed(), true);
		Thread.sleep(200);
		Assert.assertEquals(ql_heroimg.isDisplayed(), true);
		Thread.sleep(400);
		Assert.assertEquals(ql_sideimg.isDisplayed(), true);
		Thread.sleep(50);
		Assert.assertEquals(ql_ItemDescription.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(ql_bazaarvoice.isDisplayed(), true);
		Thread.sleep(20);
		try {
			ql_bazaarvoice.click();
		} catch (Exception e) {
			Reporter.log("QL Bazaarvoice is not clickable", true);
		}
		Assert.assertEquals(ql_btnsizetype.isDisplayed(), true);
		Thread.sleep(20);

		for (int i = 0; i < pdpbtnsizetype.size(); i++) {
			pdpbtnsizetype.get(i).click();
			String size = pdpbtnsizetype.get(i).getAttribute("title");
			System.out.println(size);
			Reporter.log(size);
		}
		//action.sendKeys(Keys.PAGE_DOWN).build().perform();
		pdpbtnsizetype.get(0).click();
		Thread.sleep(20);
		for (int i = 0; i < PDP_btncolor.size(); i++) {
			PDP_btncolor.get(i).click();
			Thread.sleep(5);
			String name = PDP_colortxt.getText();
			System.out.println(name);
		}
		Thread.sleep(500);
	//	action.sendKeys(Keys.PAGE_DOWN).build().perform();
	//	Assert.assertEquals(ql_btnsize.isDisplayed(), true);
		for (int i = 0; i < ql_btnsize.size(); i++) {
			Thread.sleep(20);
			ql_btnsize.get(i).click();
			String name = ql_btnsize.get(i).getText();
			System.out.println(name);
			Thread.sleep(5);
			if(name.equals("1X"))
				try
			{
				if(pdp_1xpopup.isDisplayed())
				pdp_1xpopupclose.click();
			}
			catch(Exception e)
			{
				System.out.println("Real 1X items do not show 1x pop up");
			}
			
		}
	
//		  
		  action.sendKeys(Keys.PAGE_DOWN).build().perform();
		jse.executeScript("window.scrollBy(0,100)");
		Assert.assertEquals(ql_fitpredicator.isDisplayed(), true);
		Thread.sleep(500);
		ql_fitpredicator.click();
		if (fitpredicatorpopup.isDisplayed()) {
			Assert.assertEquals(fitpredicatorpopup.isDisplayed(), true);
			Thread.sleep(20);
			fitpredicatorclose.click();
			Thread.sleep(20);
		}		
		
//		  Assert.assertEquals(ql_sizeguide.isDisplayed(), true);
//		  Thread.sleep(20);
//		  ql_sizeguide.click(); 
//		  if (sizeguidepopup.isDisplayed()) {
//		  Assert.assertEquals(sizeguidepopup.isDisplayed(), true);
//		  Thread.sleep(500);
//		  ql_sizeguideclose.click();
//		  Thread.sleep(5000);
//		  }
		
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		jse.executeScript("window.scrollBy(0,100)");
		if (ql_quantityadd.isDisplayed()) {
			Thread.sleep(40);
			ql_quantityadd.click();
			String qty = ql_quantityvalue.getAttribute("value");
			System.out.print(qty);
			Assert.assertEquals(qty, "2");
		}
		if (ql_quantitysub.isDisplayed()) {
			Thread.sleep(20);
			ql_quantitysub.click();
			String qty = ql_quantityvalue.getAttribute("value");
			System.out.print(qty);
			Assert.assertEquals(qty, "1");
		}
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
		//Assert.assertEquals(ql_saveforlater.isDisplayed(), true);
		if (ql_saveforlater.isDisplayed()) {
			ql_saveforlater.click();
			Thread.sleep(20);
			Assert.assertEquals(ql_saveforlaterpopup.isDisplayed(), true);
			Thread.sleep(20);
			ql_saveforlaterclose.click();
		}
		Assert.assertEquals(ql_fulldetails.isDisplayed(), true);
		Thread.sleep(20);
		Assert.assertEquals(btnaddtobag.isDisplayed(), true);
		Thread.sleep(20);
		btnaddtobag.click();
		btnviewshoppingcart.click();
		Reporter.log("quicklook validation successful", true);
		return new AddProduct();
	}

	public PDP_QuickLook_Functionality validateLowInventoryFunctionality() throws InterruptedException {
		Reporter.log("Validating the LowInventory Functionality Started", true);
		txtSearch.click();
		readValuesForSearch("Search_Data", "LowInventory");
		Reporter.log("Enter Sku Data", true);
		txtSearch.sendKeys(TestBase.testData.get().getSearchData());
		txtSearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		for (int i = 0; i < pdpbtnsizetype.size(); i++) {
			String SizeType = TestBase.testData.get().getSizeType();
			// System.out.println(SizeType);
			// System.out.println(pdpbtnsizetype.get(i).getAttribute("title"));
			if ((pdpbtnsizetype.get(i).getAttribute("title")).equalsIgnoreCase(SizeType)) {
				pdpbtnsizetype.get(i).click();
				break;
			} else
				continue;
		}

		Thread.sleep(20);
		jse.executeScript("window.scrollBy(0,100)");
		for (int i = 0; i < PDP_btncolor.size(); i++) {
			String color = TestBase.testData.get().getcolor();
			// System.out.println(color);
			// System.out.println(PDP_btncolor.get(i).getAttribute("title"));
			if ((PDP_btncolor.get(i).getAttribute("title")).equalsIgnoreCase(color)) {
				PDP_btncolor.get(i).click();
				break;
			} else
				continue;
		}
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(20);
		for (int i = 0; i < PDP_size.size(); i++) {
			String Size = TestBase.testData.get().getSize();
			System.out.println(Size);
			System.out.println(PDP_size.get(i).getAttribute("title"));
			if ((PDP_size.get(i).getAttribute("title")).equalsIgnoreCase(Size)) {
				PDP_size.get(i).click();
				break;
			} else
				continue;
		}

		//
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(500);
		String message = inventoryMessage.getText();
		System.out.print(message);
		Assert.assertEquals(message, "THIS IS ALMOST GONE, DON'T MISS OUT!");
		Reporter.log("LowInventory Validation Sucessful", true);
		jse.executeScript("window.scrollBy(0,-300)");
		action.click(headerlogo).perform();

		Thread.sleep(100);

		return new PDP_QuickLook_Functionality();
		// return new LoginFunctionality();

	}

	public LoginFunctionality validateBackOrderedFunctionality() throws InterruptedException {
		Reporter.log("Validating the Backordered Functionality Started", true);
		Thread.sleep(20);
		txtSearch.click();
		readValuesForSearch("Search_Data", "BackOrdered");
		Reporter.log("Enter Sku Data", true);
		txtSearch.sendKeys(TestBase.testData.get().getSearchData());
		txtSearch.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//
		for (int i = 0; i < pdpbtnsizetype.size(); i++) {
			String SizeType = TestBase.testData.get().getSizeType();
			// System.out.println(SizeType);
			// System.out.println(pdpbtnsizetype.get(i).getAttribute("title"));
			if ((pdpbtnsizetype.get(i).getAttribute("title")).equalsIgnoreCase(SizeType)) {
				pdpbtnsizetype.get(i).click();
				break;
			} else
				continue;
		}

		Thread.sleep(20);
		jse.executeScript("window.scrollBy(0,100)");
		for (int i = 0; i < PDP_btncolor.size(); i++) {
			String color = TestBase.testData.get().getcolor();
			// System.out.println(color);
			// System.out.println(PDP_btncolor.get(i).getAttribute("title"));
			if ((PDP_btncolor.get(i).getAttribute("title")).equalsIgnoreCase(color)) {
				PDP_btncolor.get(i).click();
				break;
			} else
				continue;
		}
		jse.executeScript("window.scrollBy(0,100)");
		Thread.sleep(20);
		for (int i = 0; i < PDP_size.size(); i++) {
			String Size = TestBase.testData.get().getSize();
			System.out.println(Size);
			System.out.println(PDP_size.get(i).getAttribute("title"));
			if ((PDP_size.get(i).getAttribute("title")).equalsIgnoreCase(Size)) {
				PDP_size.get(i).click();
				break;
			} else
				continue;
		}
		Thread.sleep(500);
		//
		jse.executeScript("window.scrollBy(0,300)");
		Thread.sleep(500);
		String message = inventoryMessageBO.getText();
		System.out.print(message);
		Assert.assertEquals(message, "BACKORDERED:");
		Reporter.log("Backordered Validation Sucessful", true);
		jse.executeScript("window.scrollBy(0,-300)");
		action.click(headerlogo).perform();
		Thread.sleep(100);
		return new LoginFunctionality();

	}

	public PDP_QuickLook_Functionality validateOOSFunctionality() throws InterruptedException {
		Reporter.log("Validating the Out of Stock Functionality Started", true);
//		try {
//			Thread.sleep(4000);
//			if (promotionbox.isDisplayed()) {
//				driver.switchTo().frame(promotionbox);
//				btnclose.click();
//				driver.switchTo().parentFrame();
//				Thread.sleep(500);
//			}
//		} finally {
			txtSearch.click();
			readValuesForSearch("Search_Data", "OOS");
			Reporter.log("Enter Sku Data", true);
			// System.out.println(TestBase.testData.get().getSearchData());
			txtSearch.sendKeys(TestBase.testData.get().getSearchData());
			Thread.sleep(600);
			txtSearch.sendKeys(Keys.ENTER);
			// searchresults.click();
			Thread.sleep(2000);
			for (int i = 0; i < pdpbtnsizetype.size(); i++) {
				String SizeType = TestBase.testData.get().getSizeType();
				// System.out.println(SizeType);
				// System.out.println(pdpbtnsizetype.get(i).getAttribute("title"));
				if ((pdpbtnsizetype.get(i).getAttribute("title")).equalsIgnoreCase(SizeType)) {
					pdpbtnsizetype.get(i).click();
					break;
				} else
					continue;
			}

			Thread.sleep(20);
			jse.executeScript("window.scrollBy(0,100)");
			for (int i = 0; i < PDP_btncolor.size(); i++) {
				String color = TestBase.testData.get().getcolor();
				// System.out.println(color);
				// System.out.println(PDP_btncolor.get(i).getAttribute("title"));
				if ((PDP_btncolor.get(i).getAttribute("title")).equalsIgnoreCase(color)) {
					PDP_btncolor.get(i).click();
					break;
				} else
					continue;
			}
			jse.executeScript("window.scrollBy(0,100)");
			Thread.sleep(20);
			for (int i = 0; i < PDP_size.size(); i++) {
				String Size = TestBase.testData.get().getSize();
				System.out.println(Size);
				System.out.println(PDP_size.get(i).getAttribute("title"));
				if ((PDP_size.get(i).getAttribute("title")).equalsIgnoreCase(Size)) {
					Thread.sleep(30);
					feedbackclose.click();
					Thread.sleep(30);
					PDP_size.get(i).click();
					break;
				} else
					continue;
			}
			Thread.sleep(500);
			jse.executeScript("window.scrollBy(0,100)");
			String message = inventoryMessage.getText();
			Assert.assertEquals(message, "SELECTEDCOLOR/SIZE UNAVAILABLE");
			Reporter.log("OOS Validation Sucessful", true);
			jse.executeScript("window.scrollBy(0,-300)");
			action.click(headerlogo).perform();
			Thread.sleep(100);
		//}
		return new PDP_QuickLook_Functionality();
	}

	public static void readValuesForSearch(String sheetName, String scenario) {
		Reporter.log("Fetch the search data", true);
		TestBase.testData.get().setSearchData(util.readCellValue(sheetName, scenario, "SearchData"));
		TestBase.testData.get().setSizeTypeData(util.readCellValue(sheetName, scenario, "SizeType"));
		TestBase.testData.get().setcolorData(util.readCellValue(sheetName, scenario, "Color"));
		TestBase.testData.get().setSizeData(util.readCellValue(sheetName, scenario, "Size"));
		Reporter.log("Fetched search data from the test data sheet successfully", true);
	}

}

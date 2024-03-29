package pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import utilities.ElementOperations;
import utilities.Utility;

public class Pagination_Monetate  extends ElementOperations {

		WebDriverWait expwait = new WebDriverWait(driver, sleephigh);
		static Utility util = new Utility();
		Actions action = new Actions(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		Select select;

		// Object Repository
		@FindBy(xpath = "//nav[contains(@aria-label,'pagination')]/ul/li")
		List<WebElement> pagenavigation;

		@FindBy(xpath = "(//div[contains(@class,'MuiGrid-item')] //ul)[6] //li")
		WebElement pagecontent;

		@FindBy(xpath = "(//button[contains(@aria-label,'next')])[1]")
		WebElement btnnexttop;

		
		@FindBy(xpath = "//div[contains(@class,'MuiGrid-root MuiGrid-item MuiGrid-grid')] /ul/li")
		List<WebElement> imgPLP;
		
		@FindBy(xpath = "//a[@id='oo_close_prompt']")
		WebElement btnClose;

		@FindBy(xpath = "(//div[contains(@id,'product')]) /div /div[1] /div[1]/img")
		List<WebElement> monetatebadge;

		@FindBy(xpath = "(//button[contains(@aria-label,'next')])[3]")
		WebElement btnnextbottom;
		
		@FindBy(xpath = "(//button[contains(@aria-label,'previous')])[3]")
		WebElement btnpreviousbottom;
		

		@FindBy(xpath = "(//div[contains(@id,'product')]) /div /div[1] /div[1]/img /../../../div[2]/a/h6")
		List<WebElement> txt_itemdesc;
		
		@FindBy(xpath = "(//div[contains(@id,'product')])")
		List<WebElement> item;
		
		@FindBy(xpath = "//span[contains(text(),'✖')]")
		WebElement feedbackclose;
		
		@FindBy(xpath = "//a[contains(text(),'Home')]/../../span[2]/a")
		WebElement breadcrumb;
		
		@FindBy(xpath = "//p[text()='SIGN UP FOR J.JILL EMAIL']")
		WebElement txtsignupforemail;
		
	public Pagination_Monetate() {
		PageFactory.initElements(driver, this);
	}

	
	public LoginFunctionality selectPaginationOption() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		jse.executeScript("window.scrollBy(0,450)");
		int i = (pagenavigation.size())/2;
	//	System.out.println(i);
		/*
		 * try { if(btnClose.isDisplayed()) btnClose.click(); } finally {
		 */
		for (int j = 0; j < i+1; j++) {
			try {
			//	System.out.println("Hi");
//				if (pagecontent.isDisplayed()) {
//					Thread.sleep(5000);
					if (btnnexttop.isDisplayed()) {
						Thread.sleep(5000);
						btnnexttop.click();
						System.out.println("NextButton is sucessfully clicked on page " + (Integer.valueOf(j) + 1));
					}
				//}
				Thread.sleep(2000);
			} catch (Exception e) {
				break;
			}
			Thread.sleep(5000);
			jse.executeScript("window.scrollBy(0,500)");
		}
	//	}
		Thread.sleep(5000);
		jse.executeScript("window.scrollBy(0,-500)");
		return new LoginFunctionality();
	}
	
	public AddProduct navigatefrom_PLPtoPDP() throws InterruptedException {
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		jse.executeScript("window.scrollBy(0,200)");
		for(int i=0;i<item.size();i++)
		{
		item.get(i).click();
		//System.out.println(item.get(i).getText());
		ElementOperations.waitforElementVisiblility(breadcrumb, 200);
		driver.navigate().back();
		try {
			if(feedbackclose.isDisplayed())

			feedbackclose.click();	
			}

			finally 
			{}
		}
		for(int j=0;j<10;j++)
		{
			Thread.sleep(300);
			jse.executeScript("window.scrollBy(0,-800)");
			Thread.sleep(300);
		}
		

			return new AddProduct();
	}

	public AddProduct navigatefrom_PLPtoPDP_allpages() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		int i = (pagenavigation.size())/2;
		for (int j = 0; j < i+1; j++) {
				jse.executeScript("window.scrollBy(0,200)");
				for(int x=0;x<item.size();x++)
				{
					System.out.println(x);
				item.get(x).click();
				ElementOperations.waitforElementVisiblility(breadcrumb, 200);
				jse.executeScript("arguments[0].scrollIntoView()",txtsignupforemail);
				driver.navigate().back();
				try {
					if(feedbackclose.isDisplayed())
					{
					feedbackclose.click();	
					}
				}
					finally 
					{}
				}
//				for(int k=0;k<10;k++)
//				{
//				//	Thread.sleep(300);
//					jse.executeScript("window.scrollBy(0,-800)");
//			//		Thread.sleep(300);
////				}
				jse.executeScript("window.scrollBy(0,150)");
				if (btnnextbottom.isDisplayed()) {
				Thread.sleep(5000);
				btnnextbottom.click();
			}
			}
				
			return new AddProduct();
	}

	public LoginFunctionality validateMonetateBadging() throws InterruptedException {
		Reporter.log("Validate the Monetate Badging", true);
		int count = 1;
		int pagecount = 1;
		try {
			while (btnnexttop.isDisplayed()) {
				btnnexttop.click();
				Thread.sleep(500);
				pagecount++;
				Thread.sleep(500);
			}
		} catch (Exception e) {
			System.out.println(pagecount);
		}
		/*
		 * try { if(btnClose.isDisplayed()) btnClose.click(); }
		 */
		finally
		{
		for (int j = 0; j < pagecount; j++) {
			jse.executeScript("window.scrollBy(0,400)");
			int size = imgPLP.size();
			for (int i = 0; i < monetatebadge.size(); i++) {
				System.out.println(monetatebadge.get(i));
				System.out.println(monetatebadge.size() + " akdjf" + i);
				System.out.println(txt_itemdesc.get(i).getText());
				Assert.assertEquals(monetatebadge.get(i).isDisplayed(), true);
				if (i < monetatebadge.size() - 1 && count % 3 == 0) {
					jse.executeScript("window.scrollBy(0,300)");
					Thread.sleep(1000);
					jse.executeScript("window.scrollBy(0,300)");
				}
				Thread.sleep(50);
				count++;
			}
			jse.executeScript("window.scrollBy(0,500)");
			try {
				// System.out.println(pagecount);
				jse.executeScript("window.scrollBy(0,-200)");
				Thread.sleep(500);
				btnpreviousbottom.click();
				Thread.sleep(1500);
			}
		
			catch (Exception e) 
			{
				Thread.sleep(1000);
			}
		}	
			
		}
		for (int i = 0; i < 20; i++) {
			Thread.sleep(1000);
			jse.executeScript("window.scrollBy(0,-700)");
		}
		Thread.sleep(1000);
		Reporter.log("Monetate Badging validated sucessfully", true);
		return new LoginFunctionality();
	}
	
}

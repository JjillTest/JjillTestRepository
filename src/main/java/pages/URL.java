package pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

import testbase.TestBase;
import utilities.ElementOperations;
import utilities.Utility;


public class URL extends ElementOperations {

	//WebDriverWait expwait = new WebDriverWait(driver, sleephigh);
	 static Utility util = new Utility();
	TestBase testbase = new TestBase();
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	public URL()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath = "//a[contains(text(),'Home')]/../../span[2]/a")
	WebElement breadcrumb;
	
	@FindBy(xpath = "//p[text()='Ratings & Reviews']")
	WebElement txtreview;
	
	@FindBy(xpath = "//p[text()='SIGN UP FOR J.JILL EMAIL']")
	WebElement txtsignupforemail;
	
	

	public AddProduct launch_PDP_URL() throws InterruptedException {
		Reporter.log("Launch URL's", true);
		Thread.sleep(100);
		readValuesForURL("URL", "Launch");
		String URL1 = TestBase.testData.get().getURL();
		System.out.println(URL1);
		String[] urls= URL1.split("\n");
		System.out.println(urls.length);
		for(int i=0;i<urls.length;i++)
		{
			driver.navigate().to(urls[i]);
			ElementOperations.waitforElementVisiblility(breadcrumb, 200);
			jse.executeScript("arguments[0].scrollIntoView()",txtsignupforemail);
		}
			
		for(int j=0;j<10;j++)
		{
			Thread.sleep(300);
			jse.executeScript("window.scrollBy(0,-800)");
			Thread.sleep(300);
		}
		return new AddProduct();
		
		}
	
	public String[] urlarray() throws InterruptedException {
		Reporter.log("Get URL array", true);
		Thread.sleep(200);
		readValuesForURL("URL", "Launch");
		String URL1 = TestBase.testData.get().getURL();
		System.out.println(URL1);
		String[] urls= URL1.split("\n");
		return urls;
		
		}

	public AddProduct dataprovider_url(String url) throws InterruptedException
	{
		System.out.println(url);
			driver.navigate().to(url);
			ElementOperations.waitforElementVisiblility(breadcrumb, 200);
			jse.executeScript("arguments[0].scrollIntoView()",txtsignupforemail);
			Thread.sleep(5000);
		return new AddProduct();
		
		}
	
//	 @DataProvider(name="hi")
//	 public String[] urldata() throws InterruptedException
//	 { 
//		 	Reporter.log("Get URL array", true);
//			Thread.sleep(200);
//			readValuesForURL("URL", "Launch");
//			String URL1 = TestBase.testData.get().getURL();
//			System.out.println(URL1);
//			String[] urls= URL1.split("\n");
//			int size=	urls.length;
//			String[] data= new String[size];
//			for(int i=0;i<size;i++)
//				data[i] = urls[i];
//	return data;
//}
	 
		public static void readValuesForURL(String sheetName, String scenario) {
			Reporter.log("Fetch URL", true);
			TestBase.testData.get().setURL(util.readCellValue(sheetName, scenario, "URLNAME"));
			Reporter.log("Fetched the url successfully", true);
		}


}

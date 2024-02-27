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


public class URLlist extends ElementOperations {

	//WebDriverWait expwait = new WebDriverWait(driver, sleephigh);
	 static Utility util = new Utility();
	TestBase testbase = new TestBase();
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	
	public URLlist()
	{
		PageFactory.initElements(driver, this);
	}

	 @DataProvider(name="datap")
	 public Object[] urls()
	 { 
		Object[] data= new Object[50];
		data[0] = "https://staging-ecomm.jjill.com/product/pure-jill-ballet-sleeve-tunic?color=780";		
		data[1] = "https://staging-ecomm.jjill.com/product/everyday-cotton-tee?color=6HA";			
		data[2] = "https://staging-ecomm.jjill.com/product/luxe-supima%C2%AE-pleat-back-tee?color=6TJ";
		data[3] = "https://staging-ecomm.jjill.com/product/fit-french-terry-hooded-tunic?color=6EJ";		
		data[4] = "https://staging-ecomm.jjill.com/product/pure-jill-embroidered-jersey-tunic?color=6EC";		
		data[5] = "https://staging-ecomm.jjill.com/product/pure-jill-affinity-blouse?color=3RS";			
		data[6] = "https://staging-ecomm.jjill.com/product/pure-jill-embroidered-a-line-top?color=5ZR";		
		data[7] = "https://staging-ecomm.jjill.com/product/smocked-square-neck-top?color=6HJ";		
		data[8] = "https://staging-ecomm.jjill.com/product/ponte-convertible-tie-top?color=EZL";		
		data[9] = "https://staging-ecomm.jjill.com/product/smocked-henley-top?color=AXX";
		data[10] = "https://staging-ecomm.jjill.com/product/mixed-florals-border-printed-top?color=6IH";
		data[11] ="https://staging-ecomm.jjill.com/product/geometrically-embroidered-v-neck-tunic?color=6CQ";
		data[12]= "https://staging-ecomm.jjill.com/product/long-sleeve-pima-crew-neck-tee?color=6ZV";
		data[13]= "https://staging-ecomm.jjill.com/product/fit-french-terry-seamed-sweatshirt?color=AZN";
		data[14]= "	https://staging-ecomm.jjill.com/product/fit-hooded-snap-front-tunic?color=6EI";
		data[15]= "https://staging-ecomm.jjill.com/product/fit-ultimate-fleece-collared-sweatshirt?color=871";
		data[16]= "https://staging-ecomm.jjill.com/product/essential-forward-seam-tee?color=6TD";
		data[17]= "https://staging-ecomm.jjill.com/product/twisted-hem-heathered-top?color=6SS";
		data[18]= "https://staging-ecomm.jjill.com/product/striped-a-line-halter-top?color=6CC";
		data[19]= "https://staging-ecomm.jjill.com/product/wearever-shirred-a-line-tunic?color=6DB";
		data[20]= "https://staging-ecomm.jjill.com/product/pure-jill-double-knit-seamed-tunic?color=6AW";
		data[21]= "https://staging-ecomm.jjill.com/product/fit-progress-pima-stretch-shirttail-te-132651s-1?color=67Q";
		data[22]= "https://staging-ecomm.jjill.com/product/pure-jill-ballet-sleeve-tunic?color=780";
		data[23]= "https://staging-ecomm.jjill.com/product/everyday-cotton-tee?color=6HA";
		data[24]= "https://staging-ecomm.jjill.com/product/luxe-supima%C2%AE-pleat-back-tee?color=6TJ";
		data[25]= "https://staging-ecomm.jjill.com/product/fit-french-terry-hooded-tunic?color=6EJ";
		data[26]= "https://staging-ecomm.jjill.com/product/pure-jill-embroidered-jersey-tunic?color=6EC";
		data[27]= "https://staging-ecomm.jjill.com/product/pure-jill-affinity-blouse?color=3RS";
		data[28]= "https://staging-ecomm.jjill.com/product/pure-jill-embroidered-a-line-top?color=5ZR";
		data[29]= "https://staging-ecomm.jjill.com/product/smocked-square-neck-top?color=6HJ";
		data[30]= "https://staging-ecomm.jjill.com/product/ponte-convertible-tie-top?color=EZL";
		data[31]= "https://staging-ecomm.jjill.com/product/smocked-henley-top?color=AXX";
		data[32]= "https://staging-ecomm.jjill.com/product/mixed-florals-border-printed-top?color=6IH";
		data[33]= "https://staging-ecomm.jjill.com/product/geometrically-embroidered-v-neck-tunic?color=6CQ";
		data[34]= "https://staging-ecomm.jjill.com/product/long-sleeve-pima-crew-neck-tee?color=6ZV";
		data[35]= "https://staging-ecomm.jjill.com/product/fit-french-terry-seamed-sweatshirt?color=AZN";
		data[36]= "https://staging-ecomm.jjill.com/product/fit-hooded-snap-front-tunic?color=6EI";
		data[37]= "https://staging-ecomm.jjill.com/product/fit-ultimate-fleece-collared-sweatshirt?color=871";
		data[38]= "https://staging-ecomm.jjill.com/product/essential-forward-seam-tee?color=6TD";
		data[39]= "https://staging-ecomm.jjill.com/product/twisted-hem-heathered-top?color=6SS";
		data[40]= "https://staging-ecomm.jjill.com/product/striped-a-line-halter-top?color=6CC";
		data[41]= "https://staging-ecomm.jjill.com/product/wearever-shirred-a-line-tunic?color=6DB";
		data[42]= "https://staging-ecomm.jjill.com/product/pure-jill-double-knit-seamed-tunic?color=6AW";
		data[43]= "https://staging-ecomm.jjill.com/product/fit-progress-pima-stretch-shirttail-te-132651s-1?color=67Q";
		data[44]= "https://staging-ecomm.jjill.com/product/pure-jill-ballet-sleeve-tunic?color=780";
		data[45]= "	https://staging-ecomm.jjill.com/product/everyday-cotton-tee?color=6HA";
		data[46]= "https://staging-ecomm.jjill.com/product/luxe-supima%C2%AE-pleat-back-tee?color=6TJ";
		data[47]= "	https://staging-ecomm.jjill.com/product/fit-french-terry-hooded-tunic?color=6EJ";
		data[48]= "	https://staging-ecomm.jjill.com/product/pure-jill-embroidered-jersey-tunic?color=6EC";
		data[49]= "	https://staging-ecomm.jjill.com/product/pure-jill-affinity-blouse?color=3RS";
	
		
	return data;
	 }
		

}

package ups.test;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ups.driversetup.UpsDriverSetUp;
import ups.pageaction.ActionPage;

public class UpsTest {
	
	public class UpsLoginTest extends UpsDriverSetUp {
		WebDriver driver = getChromeDriver ();
		ActionPage shippingAction = new ActionPage (this.driver);
		final String URL = "https://www.ups.com/ship/guided/origin?tx=6360868375345803&loc=en_US";
			
	}
	
	@BeforeMethod
	public void beforeMethod() {
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void shippingInputs () {
		shippingAction.inputUserName ();
		shippingAction.inputContactName ();
		shippingAction.inputUserAddress ();
		shippingAction.inputUserAddress2 ();
		shippingAction.inputUserZipCode ();
		shippingAction.inputUserName ();
		shippingAction.inputUserCity ();
		shippingAction.inputUserState ();
		shippingAction.inputUserEmail ();
		shippingAction.inputUserPhoneNumber ();
		shippingAction.inputUserExtension ();
		shippingAction.checkBox ();
		shippingAction.button ();
		
		
	}
	
	@AfterMethod
	public void afterMethod () {
		
		System.out.println("Finished");
		
		driver.close ();
	}
		

}
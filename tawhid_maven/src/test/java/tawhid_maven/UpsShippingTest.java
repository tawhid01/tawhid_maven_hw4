package tawhid_maven;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UpsShippingTest {

	WebDriver driver;

	@BeforeTest

	public void beforeTest() {

		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");

		driver.get("https://www.ups.com/ship/guided/origin?tx=8597121315182569&loc=en_US");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@Test
	public void shippingTest() {

		WebElement clscookie = driver.findElement(By.className("close_btn_thick"));
		clscookie.click();

		WebElement name = driver.findElement(By.id("originname"));
		name.sendKeys("Tawhid Islam");

		WebElement contactName = driver.findElement(By.id("origincontactName"));
		contactName.sendKeys("Tawhid Islam");

		WebElement address1 = driver.findElement(By.id("originaddress1"));
		address1.sendKeys("1265 Gerard Avenue");

		WebElement address2 = driver.findElement(By.id("originaddress2"));
		address2.sendKeys("2A");

		WebElement zipCode = driver.findElement(By.id("originpostal"));
		zipCode.sendKeys("10452");

		WebElement city = driver.findElement(By.id("origincity"));
		city.sendKeys("Bronx");

		Select mydrpdwn = new Select(driver.findElement(By.id("originstate")));
		mydrpdwn.selectByVisibleText("New York");

		WebElement email = driver.findElement(By.id("originemail"));
		email.sendKeys("mi.tawhid@gmail.com");

		WebElement phone = driver.findElement(By.id("originphone"));
		phone.sendKeys("9292477845");

		WebElement extension = driver.findElement(By.id("originextension"));
		extension.sendKeys("1234");

		WebElement checkbox = driver.findElement(By.className("ups-checkbox-custom-label"));
		checkbox.click();

		WebElement button = driver.findElement(By.id("nbsBackForwardNavigationContinueButton"));
		button.click();
		
		
WebElement confirmMsg = driver.findElement(By.className("ups-section"));
		
	
		
		String confirmText = confirmMsg.getText();

		boolean bool;

		if (confirmText.isEmpty()) {
			bool = false;

		} else {

			bool = true;
		}
		
		Assert.assertEquals(bool, true);
			
		
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
		

	

	}

}

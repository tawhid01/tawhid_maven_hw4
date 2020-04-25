package ups.pageaction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import ups.pageelement.PageElement;

public class ActionPage {
	PageElement upsPageElement;

	public ActionPage(WebDriver driver) {
		this.upsPageElement = new PageElement();
		PageFactory.initElements(driver, upsPageElement);

	}

	public void closebtn() {
		upsPageElement.closeBtn.click();

	}

	public void inputUserName() {
		upsPageElement.name.sendKeys("Tawhid Islam");

	}

	public void inputContactName() {
		upsPageElement.contactname.sendKeys("Tawhid Islam");

	}

	public void inputUserAddress() {
		upsPageElement.address.sendKeys("1265 Gerard Avenue");

	}

	public void inputUserAddress2() {
		upsPageElement.address2.sendKeys("2A");
	}

	public void inputUserZipCode() {
		upsPageElement.zipCode.sendKeys("10452");

	}

	public void inputUserCity() {
		upsPageElement.city.sendKeys("Bronx");

	}

	public void inputUserState() {

		// upsPageElement.state.selectByVisibleText("New York");

	}

	public void inputUserEmail() {
		upsPageElement.email.sendKeys("mi.tawhid@gmail.com");

	}
	
	
	public void inputUserPhoneNumber () {
		upsPageElement.phone.sendKeys("9192487845");

		
		
	}
	
	public void inputUserExtension () {
		upsPageElement.extension.sendKeys("1234");
		
		
	}
	
	public void checkBox () {
		upsPageElement.checkBox.click();
		
		
		
	}
	
	public void button () {
		upsPageElement.button.click();
		
	}

}

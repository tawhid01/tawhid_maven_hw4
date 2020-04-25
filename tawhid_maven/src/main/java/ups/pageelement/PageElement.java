package ups.pageelement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageElement {
	
	//close cookies
	
	@FindBy (className = "close_btn_thick")
	public WebElement closeBtn;
	
	// name
	@FindBy (id = "originname")
	public WebElement name;
	
	//contactName
	@FindBy (id = "rigincontactName")
	public WebElement contactname;
	
	
	//address
	@FindBy (id = "originaddress1")
	public WebElement address;
	
	//address2
	@FindBy (id = "originaddress2")
	public WebElement address2;
	
	//zipCode
	@FindBy (id = "originpostal")
	public WebElement zipCode;
	
	//city
	@FindBy (id = "origincity")
	public WebElement city;
	
	//state
	@FindBy (id = "originstate")
	public WebElement state;
	
	//email
	@FindBy (id = "originemail")
	public WebElement email;
	
	//phone
	@FindBy (id = "originphone")
	public WebElement phone;
	
	//extension
	@FindBy (id= "originextension")
	public WebElement extension;
	
	//checkBox
	
	@FindBy (className = "ups-checkbox-custom-label")
	public WebElement checkBox;
	
	//button
	@FindBy (id ="nbsBackForwardNavigationContinueButton")
	public WebElement button;
	
	
	
	
}

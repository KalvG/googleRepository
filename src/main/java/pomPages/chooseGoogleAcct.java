package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class chooseGoogleAcct {
	
	@FindBy(xpath="//input[@id='identifierId']")
	private WebElement email;	
	
public chooseGoogleAcct(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

	public void email()
	{
	   email.sendKeys("kalyaniv141@gmail.com");
	}

	
}

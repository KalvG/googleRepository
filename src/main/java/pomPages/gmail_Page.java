package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class gmail_Page {
	@FindBy(xpath="//div[text()='Compose']")
	private WebElement compose;
	
	public gmail_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void compose_click()
	{
		compose.click();
	}
}

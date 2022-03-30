package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleAccount {
	
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement password;
	
   public googleAccount(WebDriver driver)
   {
	   PageFactory.initElements(driver,this);
   }
   
   public void  password()
   {
	   password.sendKeys("RajasRajas@123");
	   password.click();
   }
   
   
}

package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class googleHomePage {

	@FindBy(xpath="//input[@name='q']")
	private WebElement searchtb;
	
	@FindBy(xpath="//b[text()='top deals']")
	private WebElement topdeals;
	
	@FindBy(xpath="//li[@class='sbct']")
	private WebElement search_list;
	
	@FindBy(xpath="//a[text()='Images']")
	private WebElement imageLink;
	
	@FindBy(xpath="//a[@class='gb_A']")
	private WebElement googleApps;
	
	@FindBy(xpath="(//span[@class='Rq5Gcb'])[11]")
	private WebElement driveIcon;
	
	@FindBy(xpath="(//span[@class='Rq5Gcb'])[4]")
	private WebElement calendarIcon;
	
	@FindBy(xpath="//a[@class='gb_A gb_Ka gb_f']")
	private WebElement user_login;
	
	@FindBy(xpath="//a[text()='Gmail']")
	private WebElement gmailLink;
	
	@FindBy(xpath="//a[text()='Sign in']")
	private WebElement signIn;
	@FindBy(xpath="//span[text()='Next']")
	private WebElement nextbtn;
	
	
	public googleHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void search_tb()
	{
		searchtb.sendKeys("lap");
	}
	public WebElement getSearch_list() {
		return search_list;
	}
	public WebElement getTopdeals() {
		return topdeals;
	}
	
	public void imageLink_Click()
	{
		imageLink.click();
	}
	
	public void googleApps_Click()
	{
		googleApps.click();
	}
	
	public void driveIcon_Click()
	{
		driveIcon.click();
	}
	public WebElement getDriveIcon() {
		return driveIcon;
	}
	public WebElement getCalendarIcon() {
		return calendarIcon;
	}
	public void calendarIcon_click()
	{
		calendarIcon.click();
	}
	public void userLogin_Click()
	{
		user_login.click();
	}
	
	public void gmailLink_Click()
	{
		gmailLink.click();
	}
	public void signIn_Click()
	{
		signIn.click();
	}
	public void nextbtnClick()
	{
		nextbtn.click();
	}
	
}

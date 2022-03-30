package testScripts;

import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.chooseGoogleAcct;
import pomPages.gmail_Page;
import pomPages.googleAccount;
import pomPages.googleHomePage;

public class gmailPage_compose extends BaseClass {
@Test
 public void tc5() throws InterruptedException
 {
	googleHomePage g=new googleHomePage(driver);
	chooseGoogleAcct cga=new chooseGoogleAcct(driver);
	googleAccount ga= new googleAccount(driver);
	//gmail_Page gp=new gmail_Page(driver);
	g.signIn_Click();
	//Thread.sleep(4000);
	cga.email();
	g.nextbtnClick();
	
	ga.password();
	g.nextbtnClick();
	g.gmailLink_Click();
	//gp.compose_click();
	Thread.sleep(4000);
 }
}

package testScripts;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.googleHomePage;

public class imageLink_Home extends BaseClass {
	@Test
	public void tc2() throws InterruptedException {
	googleHomePage g=new googleHomePage(driver);
  //  g.imageLink_Click();
  	//Thread.sleep(3000);
  	
	g.gmailLink_Click();    
	Thread.sleep(8000);
  	    
  }
}	
package testScripts;

import org.openqa.selenium.Point;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.googleHomePage;

public class calendarIcontest extends BaseClass {
	@Test
	public void tc3() throws InterruptedException
	{
	googleHomePage g=new googleHomePage(driver);
   // g.imageLink_Click();
  	//Thread.sleep(3000);
  //	g.userLogin_Click();
	g.googleApps_Click();
	Thread.sleep(3000);
	driverutilities.frames(driver);
	//g.getDriveIcon();
	g.getCalendarIcon();
    Thread.sleep(1000);

	//Point loc=g.getDriveIcon().getLocation();
    Point loc=g.getCalendarIcon().getLocation();
	int x=loc.getX();
	int y=loc.getY();
    driverutilities.scrollbar(driver, x, y);
    Thread.sleep(1000);
     g.driveIcon_Click();
    Thread.sleep(2000);
    driverutilities.switchback(driver);
	}
}

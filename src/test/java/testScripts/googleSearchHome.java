package testScripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import genericLib.BaseClass;
import pomPages.googleHomePage;

public class googleSearchHome extends BaseClass {
	@Test
	void tc1() throws InterruptedException {
		googleHomePage g=new googleHomePage(driver);
		g.search_tb();
		g.getTopdeals().click();;
		Thread.sleep(3000);
	}
}

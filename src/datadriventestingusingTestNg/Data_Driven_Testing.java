package datadriventestingusingTestNg;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import reusabilityscnreenshots.Reusabilty_Scnreenshots;
import utility.helper;

public class Data_Driven_Testing {
	public WebDriver driver;

	@Test(dataProvider = "EasyCalculation")
	public void Browser(String UserName, String Password) throws Exception {
		driver = helper.startBrowser("Chrome");
		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
		Reusabilty_Scnreenshots.capturedscreenshots(driver, "Step 1. Login to Easycalculation Application");

		driver.manage().window().maximize();
		driver.findElement(By.id("log_email")).sendKeys("9740673180");
		driver.findElement(By.id("log_password")).sendKeys("raghuBN@123");
		driver.findElement(By.xpath("//input[@name='log_submit']")).click();
		Reusabilty_Scnreenshots.capturedscreenshots(driver, "2. Launch the Application.");
	}

	@DataProvider(name = "EasyCalculation")

	public Object[][] passData() {
		Object[][] data = new Object[3][2];
		data[0][0] = "9740673180";
		data[0][1] = "raghubn";

		data[1][0] = "9740673180";
		data[1][1] = "pavitra";

		data[2][0] = "pavitra24";
		data[2][1] = "pavi";

		return data;

	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}

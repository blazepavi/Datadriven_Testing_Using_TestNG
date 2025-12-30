package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class helper {
	public static WebDriver startBrowser(String browser) {
		WebDriver driver = null;
		if (browser.equalsIgnoreCase("Chrome") || browser.equalsIgnoreCase("GC")
				|| browser.equalsIgnoreCase("Google Chrome")) {
			System.setProperty("C:\\Selenium_Complete_Programmes\\MouseiverMovement\\chromebrowser\\chromedriver.exe", browser);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("FF") || browser.equalsIgnoreCase("Firefox")
				|| browser.equalsIgnoreCase("Mozila")) {
			System.setProperty("C:\\Selenium_Complete_Programmes\\MouseiverMovement\\firefoxbrowser\\geckodriver.exe", browser);
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
		} else if (browser.equalsIgnoreCase("Edge") || browser.equalsIgnoreCase("EG")
				|| browser.equalsIgnoreCase("Microsoft Edge")) {
			System.setProperty("C:\\Selenium_Complete_Programmes\\MouseiverMovement\\edgebrowser\\msedgedriver.exe", browser);
			driver = new EdgeDriver();
			driver.manage().window().maximize();
		} else {
			System.out.println("Sorry we do not support this browser");
		}
		return driver;
	}
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}
}



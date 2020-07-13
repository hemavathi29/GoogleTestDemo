package practice_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Cross_Browser
{
	WebDriver driver;

	@BeforeTest
	@Parameters("browser")
	public void setup(String browser) throws Exception{

		if(browser.equalsIgnoreCase("firefox")){

			System.setProperty("webdriver.gecko.driver", "../GoogleMaven/src/main/resources/geckodriver.exe");
			driver = new FirefoxDriver();
		}

		else if(browser.equalsIgnoreCase("chrome")){

			System.setProperty("webdriver.chrome.driver","../GoogleMaven/src/main/resources/chromedriver.exe");

			driver = new ChromeDriver();
		}

		else{
			//If no browser passed throw exception
			throw new Exception("Browser is not correct");
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@Test
	public void testParameterWithXML() throws InterruptedException{
		driver.get("https://google.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.close();
	}
}

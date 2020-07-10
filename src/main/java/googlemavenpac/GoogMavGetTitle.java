package googlemavenpac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogMavGetTitle 
{
	@Test
	public void getTitle() 
	{
		System.setProperty("webdriver.chrome.driver", "../GoogleMaven/src/main/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
	}
}

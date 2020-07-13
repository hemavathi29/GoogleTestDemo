package practice_selenium;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Font_size 
{
	@Test
	
	public  void url()
	{
		System.setProperty("webdriver.chrome.driver", "../GoogleMaven/src/main/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		String url	=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
	}
	@Test
	public  void title()
	{
		System.setProperty("webdriver.chrome.driver", "../GoogleMaven/src/main/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();	
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
	}
	@Test
	public  void fontSize()
	{
		System.setProperty("webdriver.chrome.driver", "../GoogleMaven/src/main/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement a =driver.findElement(By.xpath("//input[@title='Search']"));
		String s=a.getCssValue("font-size");
		System.out.println(s);
		driver.close();
	}
}

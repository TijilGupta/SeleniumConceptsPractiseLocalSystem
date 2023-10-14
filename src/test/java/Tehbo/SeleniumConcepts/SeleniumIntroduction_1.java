package Tehbo.SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumIntroduction_1 {
	public static void main(String[]args)
	{
		String URL="https://www.youtube.com/";
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.manage().window().maximize();
		
		driver.get(URL);
		
		String pageTitle=driver.getTitle();
		System.out.println("the title of the page is"+pageTitle);
		
		String currentPageURL =driver.getCurrentUrl();
		
		System.out.println("The URL of the page opened is"+currentPageURL);
		
		if(URL.equalsIgnoreCase(currentPageURL))
		{
			System.out.println("Yes selenium opened the correct page");
			
		}
		else
		{
			System.out.println("Oops -The URL donot match");
		}
		driver.close();
		
	}
}

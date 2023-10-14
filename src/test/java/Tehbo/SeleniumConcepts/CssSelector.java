package Tehbo.SeleniumConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.google.com/");
		
		WebElement SearchBox=driver.findElement(By.cssSelector("textarea#APjFqb"));
         SearchBox.sendKeys("CssLocators");
         SearchBox.clear();
	}

}

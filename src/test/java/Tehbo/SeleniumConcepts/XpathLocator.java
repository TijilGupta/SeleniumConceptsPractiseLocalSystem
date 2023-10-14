package Tehbo.SeleniumConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com");
		
		WebElement fbEmail=driver.findElement(By.id("email"));
		WebElement fbPassword=driver.findElement(By.id("pass"));
		
		fbEmail.sendKeys("TijilGupta");
		fbPassword.sendKeys("Hello");
		
		
	}

}

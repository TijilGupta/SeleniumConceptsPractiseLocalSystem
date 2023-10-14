package Tehbo.SeleniumConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		driver.get("https://facebook.com/");
		
   
        driver.manage().window().maximize();
        
        driver.navigate().to("https://www.youtube.com/");
        
        
        
       driver.findElement(By.id("https://www.google.com/"));
       
       driver.findElement(By.name("")).sendKeys("");
       
       driver.findElement(By.className("")).sendKeys("");
       
       driver.findElement(By.linkText("")).click();
       
       driver.findElement(By.partialLinkText("")).click();
       
       System.out.println("title of the page"+driver.getTitle());
	}

}
